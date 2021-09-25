package x04_closure

// 闭包概念
// 闭包定义
// 闭包调用

// 闭包参数
// 普通参数
// 隐式参数

// 闭包返回值
// 总是有返回值

// 定义闭包变量
def closure = { println("hello closure") }
// 调用
closure.call()
closure()

// 定义带参数的闭包
//closure = { String name -> println "hello ${name}" }
closure = name -> println "hello ${name}"
closure("fengwk")

// 使用闭包的默认参数it
closure = { println "hello ${it}" }
closure("haha")

// factorial函数用于求数字n的阶乘
int factorial(int n) {
    int res = 1;
    // 从数字1上升到n,每次都执行闭包函数
    1.upto(n, { curNum -> res *= curNum })
    // return res
    // 可以忽略return
    res
}
println "factorial 5 is ${factorial(5)}"

// 自增10次
int i = 0
10.times {i++ }
println(i)

// 使用闭包遍历字符串
"closure str".each {c -> print c }
print '\n'

// 查找第一个符合条件的字符
println "is number 2".find {c -> c.isNumber() }

// 查找所有符合条件的字符
println "numbers 1, 2, 3".findAll { c -> c.isNumber() }

// 闭包的三个重要变量
// this:     代表闭包定义处的类
// owner:    代表闭包定义处的类或对象
// delegate: 任意对象，默认值为owner指向的对象

def closureInScript = {
    println "closureInScript this is" + this
    println "closureInScript owner is" + owner
    println "closureInScript delegate is" + delegate
}

class InnerClass {

    def closureInInnerClass = {
        println "closureInInnerClass this is" + this
        println "closureInInnerClass owner is" + owner
        println "closureInInnerClass delegate is" + delegate
    }

    def closureInInnerClassMethod() {
        def closureInInnerClassMethodStatic = {
            println "closureInInnerClassMethod this is" + this
            println "closureInInnerClassMethod owner is" + owner
            println "closureInInnerClassMethod delegate is" + delegate
        }
    }

    static def closureInInnerClassStatic = {
        println "closureInInnerClassStatic this is" + this
        println "closureInInnerClassStatic owner is" + owner
        println "closureInInnerClassStatic delegate is" + delegate
    }

    static closureInInnerClassMethodStatic() {
        def closureInInnerClassMethodStatic = {
            println "closureInInnerClassMethodStatic this is" + this
            println "closureInInnerClassMethodStatic owner is" + owner
            println "closureInInnerClassMethodStatic delegate is" + delegate
        }
    }

}

println "closureInScript".padRight(50, "-")
closureInScript()
println "closureInInnerClass".padRight(50, "-")
new InnerClass().closureInInnerClass()
println "closureInInnerClassMethod".padRight(50, "-")
new InnerClass().closureInInnerClassMethod()()
println "closureInInnerClassStatic".padRight(50, "-")
InnerClass.closureInInnerClassStatic()
println "closureInInnerClassMethodStatic".padRight(50, "-")
InnerClass.closureInInnerClassMethodStatic()()

// 在闭包中定义闭包
def nestedClosure = {
    def innerClosure = {
        println "nestedInnerClosure this is " + this
        println "nestedInnerClosure owner is " + owner
        println "nestedInnerClosure delegate is " + delegate
    }
}
println "nestedInnerClosure".padRight(50, "-")
nestedClosure()()

// 修改闭包的委托策略
class Student {
    def name
    def hello = { "hello ${name}" }
}
class Teacher {
    def name
}
def stu = new Student(name: 'stu')
def tea = new Teacher(name: 'tea')
stu.hello.delegate = tea
stu.hello.resolveStrategy = Closure.DELEGATE_FIRST
println stu.hello()