import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuscaBinariaTest {

    @Test
    public void testeBusca0() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = -1;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.LessThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null, null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca1() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 0;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.LessThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null, null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca2() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 0;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.Equals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundExact, 0, 0);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca3() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 1;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.Equals;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null, null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca4() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 2;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.GreaterThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundExact, 1, 2);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca5() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 3;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.GreaterThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundGreater, 2,4);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }
    @Test
    public void testeBusca6() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 2;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.GreaterThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundGreater, 2,4);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca7() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 2;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.LessThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundExact, 1,2);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca8() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 1;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.LessThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundLess, 0,0);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBusca9() throws Exception {

        int[] teste = {0, 2, 4, 6, 8};
        int key = 2;
        int size = teste.length;
        boolean ascending = true;
        SearchType sType = SearchType.LessThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundLess, 0,0);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }



}