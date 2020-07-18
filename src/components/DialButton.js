import React from 'react'
import { Pressable, Text, StyleSheet } from 'react-native'
import { RFValue } from 'react-native-responsive-fontsize'

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

const DialButton = () => (
  <Pressable style={styles.button}>
    <Text style={styles.text}>DIAL</Text>
  </Pressable>
)

export default DialButton
