package x05_datastruct

// 使用强类型定义数组
int[] arr1 = [1, 2, 3, 4]
println "arr1 is ${arr1}, type is ${arr1.class}"
// 使用弱类型定义数组
def arr2 = [1, 2, 3, 4] as int[]
println "arr2 is ${arr2}, type is ${arr2.class}"

// 定义列表
def list = [1, 2, 3 ,4]
println "list is ${list}, type is ${list.class}"

// 排序
list.sort({a, b -> b - a})
println "desc list is ${list}"

// 查找
println list.find({ item -> item % 2 == 0 })