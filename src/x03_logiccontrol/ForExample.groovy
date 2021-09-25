package x03_logiccontrol

// 使用for循环迭代range
for (i in 0..9) {
    print "${i} "
}
print '\n'

// 使用for循环迭代List
for (i in [1, 2, 3]) {
    print "${i} "
}
print '\n'

// 使用for循环迭代Map
for (e in [ "name": "fengwk", "age": 18 ]) {
    print "${e.key}=${e.value} "
}
print '\n'