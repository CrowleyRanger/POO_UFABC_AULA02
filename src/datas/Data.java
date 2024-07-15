package datas;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        if (dia < 1 || dia  > 31) {
            throw new IllegalArgumentException("Dia deve estar entre (1, 31)");
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes deve estar entre (1, 12)");
        }
        if (ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("Ano deve estar entre (0, 2999)");
        }
                
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    boolean bissexto(int ano) {
        if (ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("Ano deve ser estar entre (0, 2999)");
        }
        if (ano % 4 != 0) {
            return false;
        }
        if (ano % 100 != 0) {
            return true;
        }
        return false;
    }

    
}
