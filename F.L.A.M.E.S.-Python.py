# This script is the result of me getting bored at 3:00

def flames_meaning(result):

    switcher = {
        'F': 'Friendship',
        'L': 'Love',
        'A': 'Affection',
        'M': 'Marriage',
        'E': 'Enemy',
        'S': 'Sweetheart'
    }
    
    return switcher.get(result)


def flames(name1, name2):

    flames = 'FLAMES'

    for x in name1:
        if x in name2:
            name2 = name2.replace(x, '', 1)
            name1 = name1.replace(x, '', 1)

    flamed_name = name1 + name2

    print('\nFlamed name >>> ' + flamed_name)

    flamed_name_length = len(flamed_name)

    print('\nComputing FLAMES...')

    print('\nNow ' + flames)

    while len(flames) != 1:

        if len(flames) >= flamed_name_length:
            striked_out_char = flames[flamed_name_length - 1]
            flames = flames.replace(striked_out_char, '', 1)

        else:
            striked_out_char = flames[(flamed_name_length % len(flames)) - 1]
            flames = flames.replace(striked_out_char, '', 1)

        print('Now ' + flames + ', striked out ' + striked_out_char)

    print('\nFLAMES result: ' + flames_meaning(flames))

print('*** WELCOME TO THE FLAMES GAME ***\n')
name1 = input('Enter first name >>> ').upper()
name2 = input('Enter second name >>> ').upper()
flames(name1, name2)
