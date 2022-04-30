package pl.infinitetech.businesscard.client.dao

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "employee")
data class Client (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(name = "first_name", nullable = false)
    val firstName: String,
    @Column(name = "last_name", nullable = false)
    val lastName: String,
    @Column(name = "email_address", nullable = false)
    val emailId: String,
    @Column(name = "phone_number", nullable = false)
    val phoneNumber: Number
)