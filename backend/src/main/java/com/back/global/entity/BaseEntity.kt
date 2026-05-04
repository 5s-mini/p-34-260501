package com.back.global.entity

import jakarta.persistence.*
import lombok.AccessLevel
import lombok.Setter
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {
    @JvmField
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PROTECTED)
    val id: Int? = null

    @JvmField
    @CreatedDate
    val createDate: LocalDateTime? = null

    @JvmField
    @LastModifiedDate
    val modifyDate: LocalDateTime? = null
}