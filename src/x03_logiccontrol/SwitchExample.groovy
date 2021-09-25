package x03_logiccontrol

// java中的switch case只支持固定数据类型，并且只支持byte、short、char、int、Enum、String
// 以下示例展示了groovy对于switch的强大扩展
void execute(x) {
    switch (x) {
        // 直接作为字符串
        case 'x':
            println "x"
            break
        // 匹配数组中任一
        case [1, 2, 3]:
            println "x is number ${x}"
            break
        // 在[5, 10]范围内的任一
        case 5..10:
            println "x '${x}' in range [5..10]"
            break
        case Double:
            println "x '${x}' is Double type"
            break
        default:
            println "default"
    }
}

execute('x');
execute(1);
execute(10)
execute(66.6d)
execute("default")