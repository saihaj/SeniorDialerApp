import React from 'react'
import { Pressable, StyleSheet, View } from 'react-native'
import { shape, func } from 'prop-types'

import Phone from 'react-native-vector-icons/FontAwesome5'
import Settings from 'react-native-vector-icons/Fontisto'

import Layout from '../components/Layout'

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

const Home = ( { navigation: { navigate } } ) => {
  const phoneButton = () => navigate( 'Dialer' )
  const settingsButton = () => navigate( 'Settings' )

  return (
    <Layout>
      <View style={styles.container}>
        <Pressable onPress={phoneButton}>
          <Phone name="phone-alt" style={styles.phoneIcon} />
        </Pressable>
        <Pressable onPress={settingsButton}>
          <Settings name="player-settings" style={styles.settingsIcon} />
        </Pressable>
      </View>
    </Layout>
  )
}

Home.propTypes = {
  navigation: shape( { navigate: func.isRequired } ).isRequired,
}

export default Home
