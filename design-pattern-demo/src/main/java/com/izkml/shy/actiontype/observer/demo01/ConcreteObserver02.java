package com.izkml.shy.actiontype.observer.demo01;

/**
 * @author: shy
 * @description: 具体观察者实现02
 * @create: 2019-06-10 15:42
 **/

//具体观察者1
class ConcreteObserver02 implements Observer {
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}