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
const Settings = () => (
  <Text style={styles.main}>Settings Screen</Text>
)

export default Settings
