
public class Person {
	String name='tom'
	def invokeMethod(String name,args) {
		println "unknown method $name(${args?.join(',')})"
	}
	def propertyMissing(String name,val){
		println 'set'
	}
	def propertyMissing(String name){
		println 'get'
	}
}

