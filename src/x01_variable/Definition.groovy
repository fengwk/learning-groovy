package x01_variable

// 强类型定义
int x = 1
println "x is " + x + ", type is " + x.class

// 使用def定义变量，编译器将自动推断类型
def y = 1
println "y is " + y + ", type is " + y.class

// 直接声明变量
z = 1
println "z is " + z + ", type is " + z.class
// 使用直接声明的方式会使得变量成为全局的，类比js
// 如果使用def定义变量，那么callZ中就无法引用到变量z
def callZ() {
    println "z is ${z}"
}
callZ()
