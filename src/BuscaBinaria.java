public class BuscaBinaria {

    private static int busca(int[] array, int chave) {
        System.out.println("");
        return buscaBinariaRecursiva(array, 0, array.length - 1, chave);

    }

    private static int buscaBinariaRecursiva(int[] array, int menor, int maior,
                                             int chave) {
        int media = (maior + menor) / 2;
        int valorMeio = array[media];

        if (menor > maior)
            return -1;
        else if(valorMeio == chave)
            return media;
        else if (valorMeio < chave)
            return buscaBinariaRecursiva(array, media+1, maior, chave);
        else
            return buscaBinariaRecursiva(array, menor, media-1, chave);
    }
}
