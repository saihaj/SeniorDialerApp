import React, { useContext } from 'react'
import { Pressable, Text, StyleSheet } from 'react-native'
import { RFValue } from 'react-native-responsive-fontsize'

import { DialerContext } from '../lib/contexts'
import { initiateCall } from '../lib/utils'

const styles = StyleSheet.create( {
  button: {
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 25,
    height: RFValue( 70, 650 ),
  },
  text: {
    color: '#575252',
    fontSize: RFValue( 60, 650 ),
    fontWeight: 'bold',
  },
} )

const DialButton = () => {
  const { phoneNumber, setPhoneNumber } = useContext( DialerContext )

  return (
    <Pressable
      style={( { pressed } ) => [
        {
          backgroundColor: pressed ? '#55bf26' : '#5ED32A',
        },
        styles.button,
      ]}
      onPress={() => {
        initiateCall( phoneNumber )
        setPhoneNumber( '' )
      }}
    >
      <Text style={styles.text}>DIAL</Text>
    </Pressable>
  )
}

export default DialButton
