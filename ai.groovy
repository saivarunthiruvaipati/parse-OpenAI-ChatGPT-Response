def resp = new groovy.json.JsonSlurper().parseText(message.getBody(String))
def reply = resp.choices[0].message.content
message.setBody(reply)
return message
