import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createStackNavigator } from '@react-navigation/stack'

import HomeScreen from './screens/Home'
import DialerScreen from './screens/Dialer'
import SettingScreen from './screens/Settings'

const { Navigator, Screen } = createStackNavigator()

const App = () => (
  <NavigationContainer>
    <Navigator>
      <Screen name="Home" component={HomeScreen} options={{ headerShown: false }} />
      <Screen name="Dialer" component={DialerScreen} options={{ headerShown: false }} />
      <Screen name="Settings" component={SettingScreen} options={{ title: 'Settings' }} />
    </Navigator>
  </NavigationContainer>
)

export default App
