package greeter

import groovy.transform.CompileStatic

@CompileStatic
class GreetingFormatter {
    static String greeting(final String name) {
        "Salut, ${name.capitalize()}"
    }
}