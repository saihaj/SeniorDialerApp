import React, { useContext } from 'react'
import { Pressable, Text, StyleSheet, Alert, Vibration } from 'react-native'
import { RFValue } from 'react-native-responsive-fontsize'
import PhoneCall from 'react-native-immediate-phone-call'

import { DialerContext } from '../lib/contexts'

const styles = StyleSheet.create( {
  button: {
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#5ED32A',
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

  const initiateCall = () => {
    Vibration.vibrate( 50 )
    if ( phoneNumber.length > 3 && phoneNumber.length >= 10 ) {
      PhoneCall.immediatePhoneCall( phoneNumber )
      setPhoneNumber( '' )
    }
    Alert.alert( 'Enter a valid phone number' )
  }

  return (
    <Pressable style={styles.button} onPress={initiateCall}>
      <Text style={styles.text}>DIAL</Text>
    </Pressable>
  )
}

export default DialButton
