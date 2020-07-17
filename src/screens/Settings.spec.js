import 'react-native'
import React from 'react'
import renderer from 'react-test-renderer'

import Settings from './Settings'

describe( 'Setting Screen', () => {
  it( 'Renders Correctly', () => {
    renderer.create( <Settings /> )
  } )
} )
