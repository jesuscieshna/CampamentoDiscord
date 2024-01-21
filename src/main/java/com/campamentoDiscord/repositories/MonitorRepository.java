package com.campamentoDiscord.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campamentoDiscord.entity.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Long>{

}
