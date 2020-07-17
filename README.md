[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/saihaj/SeniorDialerApp.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/saihaj/SeniorDialerApp/context:java)
<a href="https://github.com/saihaj/SeniorDialerApp/releases">![StableVersion](https://img.shields.io/badge/Stable%20Version-1.0-yellowgreen)</a>
<a href="https://play.google.com/store/apps/details?id=com.sps.seniordialer">![GooglePlayStoreAvailablity](https://img.shields.io/badge/Available-GooglePlayStore-brightgreen)</a>
<a href="https://github.com/saihaj/SeniorDialerApp/blob/master/LICENSE">![GitHub](https://img.shields.io/github/license/saihaj/SeniorDialerApp)</a>
[![Total alerts](https://img.shields.io/lgtm/alerts/g/saihaj/SeniorDialerApp.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/saihaj/SeniorDialerApp/alerts/)

# SeniorDialerApp V2

This app is designed for people who want to use a smartphone for basic features. This is formulated for someone who has difficulty using smartphone. This app provides a big font dialer and a speed dial feature.

## Currently WIP

## Features
* Localization
* Dark mode support
* Settings menu
* Better way to set speed dial options
* iOS support

## Mockups
![dialer-light](mockups/dialer-light.png)
![dialer-dark](mockups/dialer-dark.png)


# Installation
Go check out [releases](https://github.com/saihaj/SeniorDialerApp/releases)

# Development Setup

This is a `react-native init` project. That has eslint and other add-ons that are preset for my projects.

Soon will also add github actions for deployment.

## Prerequisites
* Follow React Native [docs] to install all the dependencies (https://reactnative.dev/docs/environment-setup)
* Once you get to "Creating New Application". Clone this project.
* Install this project's dependencies
  ```
  npm install
  ```

## Available Scripts

`npm run <command>`

#### `Commands`
```
start:android   Start the Android emulator
start:ios       Start the iOS emulator
start-sims      Start Android and iOS emulators

clean           react-native-clean-project
clean:android   Clean Android build files
clean:ios       Clean iOS build files

lint            ESLint and checks code style
test            Unit + integration tests in watcher mode

install-assets 	Install any changed files in the "assets/" directory
install-pods    Install all the pods for ios
```

## Helpful

* Rename this project:  [`react-native-rename`](https://www.npmjs.com/package/react-native-rename) makes it easy to change it with just one command.
* Checkout [Fastlane](https://docs.fastlane.tools/getting-started/cross-platform/react-native/) for releasing apps
* Cleans React Native project by purging caches and modules, and reinstalling them again.[`react-native-clean-project`](https://github.com/pmadruga/react-native-clean-project)


## Credits
Eslint configurations and npm scripts are inspired from [@ShabadOS/mobile](https://github.com/ShabadOS/mobile)

# License

    Copyright (C) 2020 Saihajpreet Singh

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>
    or contact the author of this repository. 
