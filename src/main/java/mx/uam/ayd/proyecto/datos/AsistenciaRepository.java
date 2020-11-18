package mx.uam.ayd.proyecto.datos;

import org.springframework.data.repository.CrudRepository;


import mx.uam.ayd.proyecto.negocio.modelo.Asistencia;

public interface AsistenciaRepository extends CrudRepository<Asistencia, Long> {
	
	public Asistencia findByHoraInicialAndHoraFinalAndFecha(String horaInicial,String horaFinal, String fecha);
	public Asistencia findByHoraInicial(String horaInicial);

}
