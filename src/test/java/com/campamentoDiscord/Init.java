package com.campamentoDiscord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.campamentoDiscord.entity.Cabana;
import com.campamentoDiscord.entity.EGB;
import com.campamentoDiscord.entity.ESO;
import com.campamentoDiscord.entity.Monitor;
import com.campamentoDiscord.entity.Ninio;
import com.campamentoDiscord.entity.Tienda;
import com.campamentoDiscord.repositories.ActividadMonitorGrupoRepository;
import com.campamentoDiscord.repositories.ActividadRepository;
import com.campamentoDiscord.repositories.CabanaRepository;
import com.campamentoDiscord.repositories.EGBRepository;
import com.campamentoDiscord.repositories.ESORepository;
import com.campamentoDiscord.repositories.MonitorRepository;
import com.campamentoDiscord.repositories.TiendaRepository;
@SpringBootTest
class Init {
	@Autowired
	EGBRepository egbRepository;
	@Autowired
	ESORepository esoRepository;
	@Autowired
	ActividadRepository actividadRepository;
	@Autowired
	ActividadMonitorGrupoRepository actividadMonitorGrupoRepository;
	@Autowired
	MonitorRepository monitorRepository;
	@Autowired
	CabanaRepository cabanaRepository;
	@Autowired
	TiendaRepository tiendaRepository;
	
	@Test
	void test() {
		Monitor monitor = new Monitor(1L, "13212313", "Antonio","Gomez" , "jsdf");
		monitorRepository.save(monitor);
	}

}
