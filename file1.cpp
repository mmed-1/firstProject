#include <iostream>
#include <string>
using namespace std;

class Employee {
protected:
    static int var;
    int id;
    string name;
public:
    Employee(string);
    void EmployeeInfo();
};

class Develloper : public Employee{
private:
    string favLanguage;
public:
    Develloper(string, string);
    void EmployeeInfo();
};

int Employee::var = 123;

Employee::Employee(string argName) {
    id = (++var + 23) + 5;
    name = argName;
}

void Employee::EmployeeInfo() {
    cout << "My id: " << id << endl;
    cout << "My name: " << name << endl;
}

Develloper::Develloper(string x, string y) : Employee(x) {
    favLanguage = y;
}

void Develloper::EmployeeInfo() {
    Employee::EmployeeInfo();
    cout << "My favourite language is: " << favLanguage << endl;
}

int main() {
    cout << "Testing" << endl;
    Employee emp("mmed1");
    emp.EmployeeInfo();
    // Employee emp2("Randy Orton");

    Develloper dev("mmed1", "C++");
    dev.EmployeeInfo();
}