import React, { useContext } from 'react'
import { Pressable, Text, StyleSheet, Dimensions } from 'react-native'
import { string, oneOfType, number } from 'prop-types'
import { RFValue } from 'react-native-responsive-fontsize'
import find from 'lodash.find'
import AsyncStorage from '@react-native-community/async-storage'

import { DialerContext } from '../lib/contexts'
import { SPEED_DIAL_OPTIONS } from '../lib/consts'
import { showAlert, initiateCall } from '../lib/utils'

const { width } = Dimensions.get( 'window' )

const styles = StyleSheet.create( {
  button: {
    flex: 1,
    margin: 4,
    height: width / 3,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 45,
  },
  name: {
    color: '#575252',
    fontSize: RFValue( 85, 650 ),
    fontWeight: 'bold',
  },
} )

const NumPadButton = ( { name, value } ) => {
  const { phoneNumber, setPhoneNumber } = useContext( DialerContext )

  const speedDial = () => {
    const { key } = find( SPEED_DIAL_OPTIONS, ( { name: sdName } ) => sdName === value ) || {}

    if ( key === undefined ) return

    AsyncStorage.getItem( key )
      .then( number => {
        if ( number === null ) return showAlert( `Nothing set for speed dial for ${name}` )
        return initiateCall( number )
      } )
      .catch( () => showAlert( 'Something went wrong ' ) )
  }

  return (
    <Pressable
      style={( { pressed } ) => [
        {
          backgroundColor: pressed ? '#b1b1b5' : '#D4D4D9',
        },
        styles.button,
      ]}
      onPress={() => { setPhoneNumber( () => phoneNumber + value ) }}
      onLongPress={speedDial}
    >
      <Text style={styles.name}>{name}</Text>
    </Pressable>
  )
}

NumPadButton.propTypes = {
  name: string.isRequired,
  value: oneOfType( [ string, number ] ).isRequired,
}

export default NumPadButton
