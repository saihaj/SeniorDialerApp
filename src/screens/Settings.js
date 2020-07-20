import React from 'react'
import { View, StyleSheet, SectionList, Text } from 'react-native'
import { shape, string } from 'prop-types'

import SpeedDial from '../components/SpeedDial'
import Layout from '../components/Layout'
import { SETTINGS_OPTIONS } from '../lib/consts'

const styles = StyleSheet.create( {
  container: {
    flex: 1,
    marginHorizontal: 7,
    marginTop: 5,
  },
  sectionHeader: {
    fontSize: 32,
    marginTop: 2,
    marginBottom: 5,
    fontWeight: '600',
  },
  item: {
    padding: 15,
    borderBottomWidth: 1,
    borderBottomColor: '#575252',
  },
} )

const Settings = () => {
  const renderItem = ( { item: { name, key } } ) => (
    <View style={styles.item}>
      <SpeedDial optionName={name} storageKey={key} />
    </View>
  )

  renderItem.propTypes = {
    item: shape( { name: string.isRequired, key: string.isRequired } ),
  }

  renderItem.defaultProps = {
    item: undefined,
  }

  return (
    <Layout>
      <View style={styles.container}>
        <SectionList
          sections={SETTINGS_OPTIONS}
          renderItem={renderItem}
          renderSectionHeader={( { section: { title } } ) => (
            <Text style={styles.sectionHeader}>{title}</Text>
          )}
          keyExtractor={( { name } ) => name}
          scrollEnabled={false}
        />
      </View>
    </Layout>
  )
}

export default Settings
