package x05_datastruct

// 定义map
def person = [
        "name": "fengwk",
        age: 18
]
// map必须使用getClass()方法获取类型，否则会认为是person['class']
println "${person} type is ${person.getClass()}"
println "${person.name} is ${person['age']} years old"

// 迭代map
def students = [
        1: [ name: 'xiaoming', age: 12 ],
        2: [ name: 'xiaohua', age: 12 ],
        3: [ name: 'xiaohong', age: 12 ]
]
students.each { stu -> println stu.value }
students.eachWithIndex { stu, i -> println i + " " + stu.value }

// 不会出现空指针
def m = [
        a: [ a: "a" ]
]
println m['a']['a']