package pl.infinitetech.businesscard.client.service

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import pl.infinitetech.businesscard.client.dao.Client
import pl.infinitetech.businesscard.client.exeption.ClientNotFoundException
import pl.infinitetech.businesscard.client.repository.ClientRepository

@Service
class ClientService(private val clientRepository: ClientRepository) {

    fun getAllEmployees(): List<Client> = clientRepository.findAll()

    fun getEmployeesById(employeeId: Long): Client = clientRepository.findById(employeeId)
        .orElseThrow { ClientNotFoundException(HttpStatus.NOT_FOUND, "No matching employee was found") }

    fun createEmployee(employee: Client): Client = clientRepository.save(employee)

    fun updateEmployeeById(employeeId: Long, employee: Client): Client {
         if (clientRepository.existsById(employeeId)) {
            var updateClient = clientRepository.getById(employeeId)
            updateClient.firstName = employee.firstName;
            updateClient.lastName = employee.lastName;
            updateClient.phoneNumber = employee.phoneNumber
            updateClient.emailId = employee.emailId
            return clientRepository.save(
               updateClient
            )
        } else throw ClientNotFoundException(HttpStatus.NOT_FOUND, "No matching client was found")
    }

    fun deleteEmployeesById(employeeId: Long) {
        return if (clientRepository.existsById(employeeId)) {
            clientRepository.deleteById(employeeId)
        } else throw ClientNotFoundException(HttpStatus.NOT_FOUND, "No matching client was found")
    }
}