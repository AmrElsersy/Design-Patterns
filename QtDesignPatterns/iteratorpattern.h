#ifndef ITERATORPATTERN_H
#define ITERATORPATTERN_H
#include <bits/stdc++.h>
using namespace std;
class menuItem
{
public:
    string name;
    int value;
};

class iteratorr
{
public:
    virtual bool hasNext()  = 0;
    virtual menuItem next() = 0;
};

class ray2Iterator : public iteratorr
{
public:
    ray2Iterator()
    {

    }

    bool hasNext()
    {

    }
    menuItem next()
    {

    }
};




#endif // ITERATORPATTERN_H
