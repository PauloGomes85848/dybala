/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saferus.backend.model;

/**
 *
 * @author lucasbrito
 */
import java.io.Serializable;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class VerificationToken implements Serializable {
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_VERIFIED = "VERIFIED";

    private Long id;
    private String token;
    private String status;
    private LocalDateTime expiredDateTime;
    private LocalDateTime issuedDateTime;
    private LocalDateTime confirmedDateTime;
    private User user;

    public VerificationToken(){
        this.token = UUID.randomUUID().toString();
        this.issuedDateTime = LocalDateTime.now();
        this.expiredDateTime = this.issuedDateTime.plusDays(1);
        this.status = STATUS_PENDING;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getExpiredDateTime() {
        return expiredDateTime;
    }

    public void setExpiredDateTime(LocalDateTime expiredDateTime) {
        this.expiredDateTime = expiredDateTime;
    }

    public LocalDateTime getIssuedDateTime() {
        return issuedDateTime;
    }

    public void setIssuedDateTime(LocalDateTime issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }

    public LocalDateTime getConfirmedDateTime() {
        return confirmedDateTime;
    }

    public void setConfirmedDateTime(LocalDateTime confirmedDateTime) {
        this.confirmedDateTime = confirmedDateTime;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nif")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
