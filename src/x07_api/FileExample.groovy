package x07_api

// 读取文件
def file = new File('../../README.md')
file.eachLine { line -> line }

println file.getText()