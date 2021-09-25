package x05_datastruct

// 定义范围
def range = 1..10
println "range is ${range}, from is ${range.from}, to is ${range.to}, type is ${range.class}"

// 定义[1, 10)的范围
def range2 = 1..<10
range2.each {i -> print "${i} "}
print('\n')