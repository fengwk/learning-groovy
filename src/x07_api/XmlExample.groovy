package x07_api

import groovy.xml.XmlSlurper

def xml = '''\
<?xml version="1.0" encoding="UTF-8"?>
<note>
  <to>Tove</to>
  <from>Jani</from>
  <heading>Reminder</heading>
  <body>Don't forget me this weekend!</body>
</note>
'''

def note = new XmlSlurper().parseText(xml)
println note.getClass()
println note.from.text()