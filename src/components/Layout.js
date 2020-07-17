import React from 'react'
import { StyleSheet, SafeAreaView } from 'react-native'
import { node } from 'prop-types'

const styles = StyleSheet.create( {
  container: {
    flex: 1,
  },
} )

const Layout = ( { children } ) => (
  <SafeAreaView style={styles.container}>
    {children}
  </SafeAreaView>
)

Layout.propTypes = {
  children: node.isRequired,
}

export default Layout
