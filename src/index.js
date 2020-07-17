import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createStackNavigator } from '@react-navigation/stack'

import HomeScreen from './screens/Home'
import DialerScreen from './screens/Dialer'
import SettingScreen from './screens/Settings'

const { Navigator, Screen } = createStackNavigator()

const App = () => (
  <NavigationContainer>
    <Navigator headerMode={null}>
      <Screen name="Home" component={HomeScreen} />
      <Screen name="Dialer" component={DialerScreen} />
      <Screen name="Settings" component={SettingScreen} />
    </Navigator>
  </NavigationContainer>
)

export default App
