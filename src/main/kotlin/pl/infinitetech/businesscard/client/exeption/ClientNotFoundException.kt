package pl.infinitetech.businesscard.client.exeption

import org.springframework.http.HttpStatus

class ClientNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()