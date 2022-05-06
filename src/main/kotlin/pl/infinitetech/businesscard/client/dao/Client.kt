package pl.infinitetech.businesscard.client.dao

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "employee")
data class Client (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(name = "first_name", nullable = false)
    var firstName: String,
    @Column(name = "last_name", nullable = false)
    var lastName: String,
    @Column(name = "email_address", nullable = false)
    var emailId: String,
    @Column(name = "phone_number", nullable = false)
    var phoneNumber: Number
)