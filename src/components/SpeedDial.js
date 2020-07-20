import React, { useState, useEffect } from 'react'
import { Text, StyleSheet, View, TextInput } from 'react-native'
import { number, string } from 'prop-types'
import AsyncStorage from '@react-native-community/async-storage'
import Cross from 'react-native-vector-icons/Entypo'
import Save from 'react-native-vector-icons/Feather'
import Check from 'react-native-vector-icons/EvilIcons'

import { showAlert } from '../lib/utils'

// RegEx for phone number validation
const phoneRegExp = /^[+]{0,1}[0-9]{1,4}[0-9]*/

const styles = StyleSheet.create( {
  container: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  name: {
    fontSize: 25,
    fontWeight: '700',
  },
  inputWrapper: {
    fontSize: 22,
    borderWidth: 1,
    borderRadius: 5,
    paddingLeft: 15,
    paddingVertical: 2,
    flexDirection: 'row',
    marginHorizontal: 20,
    borderColor: '#575252',
  },
  input: {
    flexGrow: 1,
    fontSize: 22,
    paddingVertical: 4,
  },
  iconWrapper: {
    marginTop: 'auto',
    marginLeft: 'auto',
    marginBottom: 'auto',
    paddingHorizontal: 5,
  },
  cross: {
    color: 'red',
  },
} )

const SpeedDial = ( { optionName, storageKey } ) => {
  const [ inputPhoneNum, setInputPhoneNum ] = useState( '' )
  const [ retrievedNum, setRetrievedNum ] = useState( '' )
  const [ valid, setValid ] = useState( false )

  // Load phone numbers from storage
  useEffect( () => {
    AsyncStorage.getItem( storageKey )
      .then( retrieve => {
        if ( retrieve !== 'null' ) {
          setRetrievedNum( retrieve )
          setInputPhoneNum( retrieve )
        }
      } )
      .catch( () => showAlert( 'Something went wrong while retrieving the number' ) )
  }, [] )

  // Validate input
  useEffect( () => {
    if ( inputPhoneNum < 1 ) return setValid( true )
    return inputPhoneNum.match( phoneRegExp ) ? setValid( true ) : setValid( false )
  }, [ inputPhoneNum ] )

  const storeNumber = async () => {
    try {
      setRetrievedNum( inputPhoneNum )
      return await AsyncStorage.setItem( storageKey, inputPhoneNum )
    } catch ( _ ) {
      return showAlert( 'Something went wrong while storing ' )
    }
  }

  const renderIcons = () => {
    if ( !valid ) return <Cross style={styles.cross} name="cross" size={25} />

    if ( retrievedNum !== inputPhoneNum ) return <Save name="save" size={25} onPress={storeNumber} />

    if ( inputPhoneNum > 1 ) return <Check name="check" size={30} color="#5ED32A" />

    return null
  }

  return (
    <View style={styles.container}>

      <Text style={styles.name}>{optionName}</Text>

      <View style={styles.inputWrapper}>

        <TextInput
          style={styles.input}
          returnKeyType="done"
          value={inputPhoneNum}
          onEndEditing={storeNumber}
          keyboardType="number-pad"
          autoCompleteType="cc-number"
          dataDetectorTypes="phoneNumber"
          textContentType="telephoneNumber"
          onChange={( { nativeEvent: { text } } ) => setInputPhoneNum( text )}
        />

        <View style={styles.iconWrapper}>
          {renderIcons()}
        </View>

      </View>

    </View>
  )
}

SpeedDial.propTypes = {
  optionName: number.isRequired,
  storageKey: string.isRequired,
}

export default SpeedDial
