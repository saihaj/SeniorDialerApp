import React from 'react'
import { StyleSheet, TextInput, View } from 'react-native'
import { RFValue } from 'react-native-responsive-fontsize'
import Cross from 'react-native-vector-icons/Entypo'

const styles = StyleSheet.create( {
  wrapper: {
    flex: 0.7,
    flexDirection: 'row',
    borderWidth: 1,
    borderRadius: 20,
    borderColor: '#000000',
    height: RFValue( 50, 650 ),
    marginBottom: 15,
  },
  input: {
    paddingLeft: 10,
    color: '#575252',
    marginTop: 'auto',
    marginBottom: 'auto',
    height: RFValue( 50, 650 ),
    fontSize: RFValue( 30, 650 ),
  },
  clearBtn: {
    color: '#575252',
    marginTop: 'auto',
    paddingRight: 10,
    marginLeft: 'auto',
    marginBottom: 'auto',
    fontSize: RFValue( 35, 650 ),
  },
} )

const DialButton = () => {
  const test = ''
  return (
    <View style={styles.wrapper}>
      <TextInput
        style={styles.input}
        editable={false}
        defaultValue="9915478960"
        keyboardType="number-pad"
        autoCompleteType="cc-number"
        dataDetectorTypes="phoneNumber"
        textContentType="telephoneNumber"
      />
      <Cross name="cross" style={styles.clearBtn} />
    </View>
  )
}

export default DialButton
