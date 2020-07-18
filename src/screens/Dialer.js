import React from 'react'
import { FlatList, StyleSheet, View, StatusBar } from 'react-native'
import { shape, string, oneOfType, number } from 'prop-types'

import Layout from '../components/Layout'
import NumPadButton from '../components/NumPad'
import DialButton from '../components/DialButton'
import DialerInput from '../components/DialerInput'

import { BUTTONS_EN } from '../lib/consts'

const styles = StyleSheet.create( {
  container: {
    flex: 1,
    marginTop: 8,
    marginBottom: 5,
    marginHorizontal: 5,
    flexDirection: 'column',
    justifyContent: 'flex-end',
  },
} )

const DialerScreen = () => {
  const renderButton = ( { item: { name, value } } ) => <NumPadButton value={value} name={name} />

  renderButton.propTypes = {
    item: shape( {
      name: string.isRequired,
      value: oneOfType( [ number, string ] ).isRequired,
    } ),
  }

  renderButton.defaultProps = {
    item: undefined,
  }

  return (
    <Layout>
      <StatusBar hidden />
      <View style={styles.container}>
        <DialerInput />
        <View style={{ flex: 6 }}>
          <FlatList
            data={BUTTONS_EN}
            renderItem={renderButton}
            keyExtractor={item => item.name}
            numColumns={3}
            scrollEnabled={false}
          />
        </View>
        <DialButton />
      </View>
    </Layout>
  )
}

export default DialerScreen
