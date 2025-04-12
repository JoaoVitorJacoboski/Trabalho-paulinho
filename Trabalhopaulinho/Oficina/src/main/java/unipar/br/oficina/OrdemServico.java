/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.oficina;

/**
 *
 * @author jjoao
 */


import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    private Cliente cliente;
    private Veiculo veiculo;
    private String sintomas;
    private List<Servico> servicos = new ArrayList<>();
    private List<Peca> pecas = new ArrayList<>();

    // Getters e Setters
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
    public String getSintomas() { return sintomas; }
    public void setSintomas(String sintomas) { this.sintomas = sintomas; }
    public List<Servico> getServicos() { return servicos; }
    public List<Peca> getPecas() { return pecas; }
}
