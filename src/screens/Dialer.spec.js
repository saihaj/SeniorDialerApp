import 'react-native'
import React from 'react'
import renderer from 'react-test-renderer'

import Dialer from './Dialer'

describe( 'Dialer Screen', () => {
  it( 'Renders Correctly', () => {
    renderer.create( <Dialer /> )
  } )
} )
