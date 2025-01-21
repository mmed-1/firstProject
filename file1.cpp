#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    static int var;
    int id;
    string name;
public:
    Employee(string);
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

int main() {
    cout << "Testing" << endl;
    Employee emp("mmed1");
    emp.EmployeeInfo();
    Employee emp2("Randy Orton");
}