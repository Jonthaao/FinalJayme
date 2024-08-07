package com.br.FinalJayme.dto;

import java.util.Date;
import java.util.List;

import com.br.FinalJayme.entities.Prontuario;

public class ProntuarioDto {

    private String paciente;
    private List<ConvenioDto> convenios;
    private String diagnostico;
    private String registros;
    private Date dataEntrada;
    private Date dataAlta;

    public ProntuarioDto(Prontuario prontuario) {
        this.registros = prontuario.getRegistros();
        this.convenios = prontuario.getConvenios().stream().map(x -> new ConvenioDto(x)).toList();
        this.dataEntrada = prontuario.getDataEntrada();
        this.dataAlta = prontuario.getDataAlta();
        this.diagnostico = prontuario.getDiagnostico();
        this.paciente = prontuario.getPaciente().getNome();
    }

    public String getRegistros() {
        return registros;
    }

    public void setRegistros(String registros) {
        this.registros = registros;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public List<ConvenioDto> getConvenios() {
        return convenios;
    }

    public void setConvenios(List<ConvenioDto> convenios) {
        this.convenios = convenios;
    }

}
