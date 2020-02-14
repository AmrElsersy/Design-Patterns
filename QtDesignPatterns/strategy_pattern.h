#ifndef STRATEGY_PATTERN_H
#define STRATEGY_PATTERN_H

#include <iostream>
using namespace std;

class FlyBehavior
{
public:
    virtual void fly() = 0;
};
class Fly : public FlyBehavior
{
   void fly()
   {
        cout << "I can Flyyyyyyyyyyyy" << endl;
   }
};
class noFly : public FlyBehavior
{
   void fly()
   {
        cout << "I can not fly" << endl;
   }
};



class QuackBehavior
{
public:
    virtual void quack() = 0;
};
class Quack : public QuackBehavior
{
    void quack()
    {
        cout << "wak wakkkk" << endl;
    }
};

class Squeak : public QuackBehavior
{
    void quack()
    {
        cout << "squeaaaaak" << endl;
    }
};




class Duck
{
private:
    QuackBehavior* quack;
    FlyBehavior* fly;
public:

    void performFly()
    {
        fly->fly();
    }
    void performQuack()
    {
        quack->quack();
    }
    void setFly(FlyBehavior* flyBehavior)
    {
        this->fly = flyBehavior;
    }
    void setQuack(QuackBehavior* quackBehavior)
    {
        this->quack = quackBehavior;
    }

};
class MorrolDuck : public Duck
{
public:
  MorrolDuck()
  {
    cout << "iam morrol Duck" << endl;
  }
};
class birdDuck : public Duck
{
public:
  birdDuck ()
  {
    cout << "iam bird Duck" << endl;
  }

};






class Strategy_Pattern
{
private:
    Duck* morral;
    Duck* bird;
public:
    Strategy_Pattern()
    {
        this->morral = new MorrolDuck;
        this->morral->setFly(new Fly);
        this->morral->setQuack(new Squeak);

        this->morral->performFly();
        this->morral->performQuack();

        cout << ".........." << endl;

        this->bird = new birdDuck;
        this->bird->setFly(new noFly);
        this->bird->setQuack(new Quack);

        this->bird->performFly();
        this->bird->performQuack();

    }
};

#endif // STRATEGY_PATTERN_H
