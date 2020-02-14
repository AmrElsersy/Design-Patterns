#ifndef SINGLETON_H
#define SINGLETON_H
#include <iostream>
using namespace std;

class ray2
{
private:
    static ray2* oneObject;
    ray2()
    {
        cout << "new ray2 instance is created" << endl;
    }

public:
    static ray2* getInstance()
    {
        if (oneObject == 0)
            oneObject = new ray2();
        return oneObject;
    }
public:
    int x ;
    int getX()
    {
        return this->x;
    }
    void hello()
    {
        cout << "hello ya ray2" << endl;
    }


};
// ******************** IMPORTANT **********************
ray2* ray2::oneObject = 0;

class Singleton
{
public:
    Singleton()
    {
        ray2* x = ray2::getInstance();
        ray2* y = ray2::getInstance();
        ray2* z = ray2::getInstance();
        x->hello();
    }
};


#endif // SINGLETON_H
