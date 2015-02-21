//name.cpp

#include <iostream>
using namespace std;

int color(){
    cout << "You are here looking for color";
    return 0;
}

int main(){
    string name;
    cout << "What is your name? ";
    cin >> name;

    //if first name starts with a-e
    if((name[0] < 70) || (name[0] > 96 && name[0] < 102)){
        cout << "Interesting...";
        color();
    }

    return 0;
}