import React from 'react'
import { Alert, Pressable, StyleSheet, SafeAreaView } from 'react-native'
import Phone from 'react-native-vector-icons/FontAwesome5'
import Settings from 'react-native-vector-icons/Fontisto'

const styles = StyleSheet.create( {
  container: {
    flex: 1,
    flexDirection: 'column',
    justifyContent: 'space-around',
    alignItems: 'center',
  },
  phoneIcon: {
    fontSize: 180,
    color: '#190DA2',
    transform: [ { rotate: '11deg' } ],
  },
  settingsIcon: {
    fontSize: 130,
    color: '#575252',
    marginTop: -100,
  },
} )

const App = () => {
  const phoneButton = () => Alert.alert( 'You clicked phone button' )
  const settingsButton = () => Alert.alert( 'You clicked settings button' )

  return (
    <SafeAreaView style={styles.container}>
      <Pressable onPress={phoneButton}>
        <Phone name="phone-alt" style={styles.phoneIcon} />
      </Pressable>
      <Pressable onPress={settingsButton}>
        <Settings name="player-settings" style={styles.settingsIcon} />
      </Pressable>
    </SafeAreaView>
  )
}

export default App
