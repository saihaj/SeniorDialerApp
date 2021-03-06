const BUTTON_VALS = {
  1: 1,
  2: 2,
  3: 3,
  4: 4,
  5: 5,
  6: 6,
  7: 7,
  8: 8,
  9: 9,
  0: 0,
  star: '*',
  hash: '#',
}

export const BUTTONS_EN = [
  { name: '1', value: BUTTON_VALS[ 1 ] },
  { name: '2', value: BUTTON_VALS[ 2 ] },
  { name: '3', value: BUTTON_VALS[ 3 ] },
  { name: '4', value: BUTTON_VALS[ 4 ] },
  { name: '5', value: BUTTON_VALS[ 5 ] },
  { name: '6', value: BUTTON_VALS[ 6 ] },
  { name: '7', value: BUTTON_VALS[ 7 ] },
  { name: '8', value: BUTTON_VALS[ 8 ] },
  { name: '9', value: BUTTON_VALS[ 9 ] },
  { name: '*', value: BUTTON_VALS.star },
  { name: '0', value: BUTTON_VALS[ 0 ] },
  { name: '#', value: BUTTON_VALS.hash },
]

export const BUTTONS_PA = [
  { name: '੧', value: BUTTON_VALS[ 1 ] },
  { name: '੨', value: BUTTON_VALS[ 2 ] },
  { name: '੩', value: BUTTON_VALS[ 3 ] },
  { name: '੪', value: BUTTON_VALS[ 4 ] },
  { name: '੫', value: BUTTON_VALS[ 5 ] },
  { name: '੬', value: BUTTON_VALS[ 6 ] },
  { name: '੭', value: BUTTON_VALS[ 7 ] },
  { name: '੮', value: BUTTON_VALS[ 8 ] },
  { name: '੯', value: BUTTON_VALS[ 9 ] },
  { name: '*', value: BUTTON_VALS.star },
  { name: '੦', value: BUTTON_VALS[ 0 ] },
  { name: '#', value: BUTTON_VALS.hash },
]

export const SPEED_DIAL_OPTIONS = [
  { name: BUTTON_VALS[ 2 ], key: 'SPEED_DIAL_2' },
  { name: BUTTON_VALS[ 3 ], key: 'SPEED_DIAL_3' },
  { name: BUTTON_VALS[ 4 ], key: 'SPEED_DIAL_4' },
  { name: BUTTON_VALS[ 5 ], key: 'SPEED_DIAL_5' },
  { name: BUTTON_VALS[ 6 ], key: 'SPEED_DIAL_6' },
  { name: BUTTON_VALS[ 7 ], key: 'SPEED_DIAL_7' },
  { name: BUTTON_VALS[ 8 ], key: 'SPEED_DIAL_8' },
  { name: BUTTON_VALS[ 9 ], key: 'SPEED_DIAL_9' },
]

export const SETTINGS_OPTIONS = [
  {
    title: 'Speed Dial',
    data: SPEED_DIAL_OPTIONS,
  },
]
