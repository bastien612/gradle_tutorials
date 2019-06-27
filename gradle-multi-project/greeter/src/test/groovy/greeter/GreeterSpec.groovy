package greeter

import spock.lang.Specification

class GreeterSpec extends Specification {
    def 'calling the entry point'() {

        setup: 'Re-route standard out'
        def buf = new ByteArrayOutputStream(1024)
        System.out = new PrintStream(buf)

        when: 'The entrypoint is executed'
        Greeter.main('gradlephant')

        then: 'The correct greeting is output'
        buf.toString() == "Salut, Gradlephant\n".denormalize()
    }
}