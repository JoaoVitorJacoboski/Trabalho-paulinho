package unipar.br.oficina;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jjoao
 */


public class Servico {
    private String descricao;
    private double custo;

    public Servico(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    // Getters
    public String getDescricao() { return descricao; }
    public double getCusto() { return custo; }
}
