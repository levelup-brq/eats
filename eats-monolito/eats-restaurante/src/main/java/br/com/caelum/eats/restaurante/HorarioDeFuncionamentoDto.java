package br.com.caelum.eats.restaurante;

import java.time.DayOfWeek;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class HorarioDeFuncionamentoDto {

	private Long id;

	private DayOfWeek diaDaSemana;

	private LocalTime horarioDeAbertura;

	private LocalTime horarioDeFechamento;

	public HorarioDeFuncionamentoDto(HorarioDeFuncionamento horario) {
		this(horario.getId(), horario.getDiaDaSemana(), horario.getHorarioDeAbertura(), horario.getHorarioDeFechamento());
	}

	public HorarioDeFuncionamentoDto(Long id2, DayOfWeek diaDaSemana2, LocalTime horarioDeAbertura2,
			LocalTime horarioDeFechamento2) {
		
		this.diaDaSemana = diaDaSemana2;
		this.horarioDeAbertura = horarioDeAbertura2;
		this.horarioDeFechamento = horarioDeFechamento2;
		this.id = id2;
	}
}
