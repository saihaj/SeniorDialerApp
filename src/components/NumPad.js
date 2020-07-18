import React from 'react'
import { Pressable, Text, StyleSheet, Dimensions } from 'react-native'
import { string, oneOfType, number } from 'prop-types'
import { RFValue } from 'react-native-responsive-fontsize'

const { width } = Dimensions.get( 'window' )

const styles = StyleSheet.create( {
  button: {
    flex: 1,
    margin: 4,
    height: width / 3,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 45,
  },
  name: {
    color: '#575252',
    fontSize: RFValue( 85, 650 ),
    fontWeight: 'bold',
  },
} )

const NumPadButton = ( { name, value } ) => {
  const clickTest = () => console.log( value )

  return (
    <Pressable
      style={( { pressed } ) => [
        {
          backgroundColor: pressed ? '#b1b1b5' : '#D4D4D9',
        },
        styles.button,
      ]}
      onPress={clickTest}
    >
      <Text style={styles.name}>{name}</Text>
    </Pressable>
  )
}

NumPadButton.propTypes = {
  name: string.isRequired,
  value: oneOfType( [ string, number ] ).isRequired,
}

export default NumPadButton
