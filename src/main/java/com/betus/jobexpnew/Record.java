package com.betus.jobexpnew;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "record")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "time_stamp")
    private Timestamp createdAtTimestamp;

    @Column(name = "date")
    private Date createdAt;


    public Record() {
    }

    public Record(String tableName, Timestamp createdAtTimestamp, Date createdAt) {
        this.name = tableName;
        this.createdAtTimestamp = createdAtTimestamp;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "CreatingTable{" +
                "id=" + id +
                ", tableName='" + name + '\'' +
                ", createdAtTimestamp=" + createdAtTimestamp +
                ", createdAt=" + createdAt +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreatedAtTimestamp() {
        return createdAtTimestamp;
    }

    public void setCreatedAtTimestamp(Timestamp createdAtTimestamp) {
        this.createdAtTimestamp = createdAtTimestamp;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
