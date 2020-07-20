import { Alert, Vibration } from 'react-native'
import PhoneCall from 'react-native-immediate-phone-call'

/**
 *
 * @param {String} err Message to display for alert
 */
export const showAlert = err => Alert.alert( err )

/**
 *
 * @param {String} phoneNumber To make call
 *
 */
export const initiateCall = phoneNumber => {
  Vibration.vibrate( 50 )
  if ( phoneNumber.length > 3 && phoneNumber.length >= 10 ) {
    PhoneCall.immediatePhoneCall( phoneNumber )
  }
  showAlert( 'Enter a valid phone number' )
}
