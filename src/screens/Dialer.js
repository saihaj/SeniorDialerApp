import React from 'react'
import { Text, StyleSheet } from 'react-native'

const styles = StyleSheet.create( {
  main: {
    paddingVertical: 100,
    marginLeft: 'auto',
    marginRight: 'auto',
    fontWeight: '800',
    fontSize: 50,
  },

} )
const Dialer = () => (
  <Text style={styles.main}>Dialer Screen</Text>
)

export default Dialer
