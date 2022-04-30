package pl.infinitetech.businesscard.client.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pl.infinitetech.businesscard.client.dao.Client


@Repository
interface ClientRepository : JpaRepository<Client, Long>