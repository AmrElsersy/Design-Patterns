#ifndef FACTORY_H
#define FACTORY_H

#include <iostream>
using namespace std;

class pizza{public: virtual void p()=0;  };
class NYcheesepizza:public pizza {public: void p(){cout <<"NewYork Cheese"<<endl;} };
class Chigagocheesepizza:public pizza {public: void p(){cout <<"Chigago Cheese"<<endl;} };
//class Caleforniacheesepizza:public pizza {public: void p(){cout <<"Calefornia Cheese"<<endl;} };

class store
{
public:
    void orderPizza(string name)
    {
          this->createPizza(name);
    }
    virtual void createPizza(string name) = 0;
};
class NY_Store : public store
{
    void createPizza(string name)
    {
        pizza* Pizza;
        if(name == "cheese")
            Pizza = new NYcheesepizza();
        Pizza->p();
    }
};
class ChigagoStore : public store
{
    void createPizza(string name)
    {
        pizza* Pizza;
        if(name == "cheese")
            Pizza = new Chigagocheesepizza();
        Pizza->p();
    }
};


class factory
{
public:
    factory()
    {
        store* Store1 = new NY_Store;
        Store1->orderPizza("cheese");

        store* Store2 = new ChigagoStore;
        Store2->orderPizza("cheese");

    }
};

#endif // FACTORY_H
