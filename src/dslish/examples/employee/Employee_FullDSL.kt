package dslish.examples.employee

/**
 * Excuse me for this naming
 */

data class Employee_FD(var name: String = "", var salary: Double = 0.0) {
    lateinit var designation: Designation_FD


    override fun toString(): String {
        return "Employee_FD(name='$name', salary=$salary, designation=$designation)"
    }
}

data class Designation_FD(var post: String = "") {
    lateinit var domainFd: Domain_FD


    override fun toString(): String {
        return "Designation_FD(post='$post', domainFd=$domainFd)"
    }
}

data class Domain_FD(var domainName: String = "", var subDomainName: String = "")

fun employee_FD(block: Employee_FD.() -> Unit): Employee_FD = Employee_FD().apply(block)

fun Employee_FD.designation(block: Designation_FD.() -> Unit) {
    designation = Designation_FD().apply(block)
}
fun Designation_FD.domain(block: Domain_FD.() -> Unit) {
    domainFd = Domain_FD().apply(block)
}

fun main() {
    val empl = employee_FD {
        name = "Sayan Porya"
        salary = 10.0
        designation {
            post = "SDE 2"
            domain {
                domainName = "Mobile Application Developer"
                subDomainName = "Android Mobile Application developer"
            }
        }
    }

    print(empl)
}