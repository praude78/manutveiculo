package model.entities;

import java.util.ArrayList;

import java.util.ArrayList;

public class Manutencao {
    private ArrayList<ItemManutencao> itens;

    public Manutencao() {
        itens = new ArrayList<ItemManutencao>();
        // adiciona itens predefinidos
        itens.add(new ItemManutencao("Inspeçao Anual", 12));
        itens.add(new ItemManutencao("Imposto Anual IUC", 12));
        itens.add(new ItemManutencao("Seguro Anual", 12));
        itens.add(new ItemManutencao("Filtro de combustivel", 10000));
        itens.add(new ItemManutencao("Filtro de oleo", 10000));
    }

    public void adicionarItem(ItemManutencao item) {
        itens.add(item);
    }

    public ArrayList<ItemManutencao> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemManutencao> itens) {
        this.itens = itens;
    }

    public void exibirRelatorio() {
        for (ItemManutencao item : itens) {
            System.out.println("Tipo de manutenção: " + item.getTipo());
            System.out.println("Quantidade a ser cumprida: " + item.getQuantidade());
        }
    }
}

