package dslish.examples.employee

data class Employee(var name: String = "", var salary: Double = 0.0, var designation: Designation? = null)

data class Designation(var post: String = "", var domain: Domain? = null)

data class Domain(var domainName: String = "", var subDomainName: String = "")

fun employee(block: Employee.() -> Unit): Employee = Employee().apply(block)
fun designation(block: Designation.() -> Unit): Designation = Designation().apply(block)
fun domain(block: Domain.() -> Unit): Domain = Domain().apply(block)

fun main() {
    val empl = employee {
        name = "Sayan Porya"
        salary = 10.0
        designation = designation {
            post = "SDE 2"
            domain = domain {
                domainName = "Mobile App Developer"
                subDomainName = "Android Mobile Application Developer"
            }
        }
    }

    print(empl)
}