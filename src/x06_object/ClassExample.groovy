package x06_object

// 1. groovy中类、方法、成员变量默认都是public的
// 2. 所有groovy类都继承了GroovyObject
class Person implements PersonInterface, TraitExample {

    String name
    int age

    def incAge() {
        age++;
    }

    def getAge() {
        print 'age is '
        age
    }

    @Override
    void eat() {
        println "eat"
    }

    @Override
    def drink() {
        println "drink"
    }


    // 找不到方法时的替代方法
    def invokeMethod(String name, Object args) {
        println "invokeMethod the method is ${name}, the args is ${args}"
    }

    def methodMissing(String name, Object args) {
        println "methodMissing the method is ${name}, the args is ${args}"
    }
}

def person = new Person(name: 'xiaoming', age: 10)
println person.incAge()

// 通过.操作符获取age和getAge()调用等价
println person.age
println person.getAge()

person.eat()
person.drink()
person.play()

// 运行时方法重写
person.cry(1)

// 使元编程全局可用
ExpandoMetaClass.enableGlobally();
// 元编程
// 指定sex后，对于之后创建的Person类都会包含该属性
Person.metaClass.sex = 'male'
println new Person().sex
// 添加方法
Person.metaClass.saySex = { println "${sex}" }
new Person().saySex()
// 添加静态方法
new Person().getClass().metaClass.static.newInstance = { new Person(name: "n", age: 12) }
println Person.newInstance()