package pl.infinitetech.businesscard.client.controller

import org.springframework.web.bind.annotation.*
import pl.infinitetech.businesscard.client.dao.Client
import pl.infinitetech.businesscard.client.service.ClientService

@RestController
@CrossOrigin("http://localhost:8080/")
class ClientController(private val clientService: ClientService) {

    @GetMapping("/clients")
    fun getAllEmployees(): List<Client> = clientService.getAllEmployees()

    @GetMapping("/client/{id}")
    fun getEmployeesById(@PathVariable("id") employeeId: Long): Client =
        clientService.getEmployeesById(employeeId)

    @PostMapping("/client")
    fun createEmployee(@RequestBody payload: Client): Client = clientService.createEmployee(payload)

    @PutMapping("/client/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody payload: Client): Client =
        clientService.updateEmployeeById(employeeId, payload)

    @DeleteMapping("/client/{id}")
    fun deleteEmployeesById(@PathVariable("id") employeeId: Long): Unit =
        clientService.deleteEmployeesById(employeeId)
}