//
//  md5-main.c
//  
//
//  Created by Patrick Charlton on 5/1/19.
//

/* run with: g++ md5-main.cpp md5.cpp -o md5_sample && ./md5_sample */

#include <iostream>
#include "md5.h"

using std::cout; using std::endl;

int main(int argc, char *argv[])
{
    cout << "md5 of 'grape': " << md5("grape") << endl;
    return 0;
}
