package x02_string

// 使用单引号定义String
name = 'fengwk'
println name

// 使用三引号定义String，这种方式可以换行，与python一致
name = '''\
<h1>
fengwk
</h1>
'''
println name

// 使用双引号定义普通String
name = "fengwk"
println name + ", type is " + name.class

// 使用双引号定义String，该字符串是可扩展字符串，可以执行${}中的内容，类似于shell脚本
// 使用了扩展字符串后类型将变为GString
s = "my name is ${name}, 1+2=${1+2}"
println s + ", type is " + s.class

// 不用刻意区分String和GString，它们之间可以自动转换
// 下例展示了GString强制转换为String
String s_to_string = s
println s_to_string + ", type is " + s_to_string.class
// 下例展示了使用GString调用入参为String的函数echo
echo s

// echo函数接收一个String入参，并且将其打印在控制台上
void echo(String str) {
    println str
}

// 另外Groovy对java原生的String做了一些扩展
// 一部分来自DefaultGroovyMethods，对于所有Object的扩展
// 另一部分来自StringGroovyMethods,对于String的扩展
// 以下是一些扩展常用方法的示例

// 将str放在中心位置，总长度为3,不足处用#填充
str = "a"
println str.center(3, "#")

// 比较字符串，等价于a.compareTo(b)
a = "a"
b = "b"
println a > b

// 遍历字符串字符
str = "my name is fengwk"
for (int i = 0; i < str.length(); i++) {
    print str[i]
}
print '\n'

// substring
println str[3..-1]

// 减掉字符串
str = "hi tom, hi jerry"
println str - "hi"
println str - "hi" - "hi"

// 反向
println str.reverse()

// 首字母大写
println str.capitalize()

// 检查是否为数字
println "123".isNumber()

// ${}中如果是函数将直接执行
def getNumber() {
    123
}
println "${getNumber()}"