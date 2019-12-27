package dslish.examples.employee

data class Employee_P(val name: String, val salary: Double, val designation: Designation_P)

data class Designation_P(val post: String, val domain: Domain_P)

data class Domain_P(val domainName: String, val subDomainName: String)

fun main() {
    val empl = Employee_P(
        name = "Sayann Porya",
        salary = 10.0,
        designation = Designation_P(
            post = "SDE 2",
            domain = Domain_P(
                domainName = "Mobile Development",
                subDomainName = "Android Mobile Application Development"
            )
        )
    )
    print(empl)
}