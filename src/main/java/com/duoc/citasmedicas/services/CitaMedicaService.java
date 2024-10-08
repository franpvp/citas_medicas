package com.duoc.citasmedicas.services;

import com.duoc.citasmedicas.dto.CitaMedicaDTO;
import com.duoc.citasmedicas.dto.HorarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CitaMedicaService {

    List<CitaMedicaDTO> obtenerCitasMedicas();

    CitaMedicaDTO obtenerCitaMedicaById(int id);

    List<HorarioDTO> obtenerDisponibilidadHorarios();

    CitaMedicaDTO crearCitaMedica(CitaMedicaDTO citaMedicaDTO);

    CitaMedicaDTO modificarCitaMedica(int id_cita, CitaMedicaDTO citaMedicaDTO);

    void eliminarCitaMedicaById(int id_cita);

}
