package x07_api

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

// 对象转json
def userList = [
    ["name" : "fengwk"],
    ["name": "xiaoming"]
]
def json = JsonOutput.toJson(userList)
println JsonOutput.prettyPrint(json)

// json转对象
def obj = new JsonSlurper().parseText(json);
println obj + " type is " + obj.class