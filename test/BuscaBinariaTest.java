import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuscaBinariaTest {

    @Test
    public void testeBuscaAsc0() throws Exception {

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
    public void testeBuscaAsc1() throws Exception {

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
    public void testeBuscaAsc2() throws Exception {

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
    public void testeBuscaAsc3() throws Exception {

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
    public void testeBuscaAsc4() throws Exception {

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
    public void testeBuscaAsc5() throws Exception {

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
    public void testeBuscaAsc6() throws Exception {

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
    public void testeBuscaAsc7() throws Exception {

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
    public void testeBuscaAsc8() throws Exception {

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
    public void testeBuscaAsc9() throws Exception {

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

    @Test
    public void testeBuscaDesc0() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = -1;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.LessThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null, null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc1() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 4;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.LessThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundExact, 2, 4);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc2() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 8;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.Equals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundExact, 0, 8);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc3() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 5;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.GreaterThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundGreater, 1, 6);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc4() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 2;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.GreaterThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundExact, 3, 2);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc5() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 9;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.GreaterThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null,null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }
    @Test
    public void testeBuscaDesc6() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 3;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.Equals;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null,null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc7() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = -1;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.LessThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.NotFound, null,null);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc8() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 7;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.GreaterThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundGreater, 0,8);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc9() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 1;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.LessThanEquals;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundLess, 4,0);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }

    @Test
    public void testeBuscaDesc10() throws Exception {

        int[] teste = {8, 6, 4, 2, 0};
        int key = 4;
        int size = teste.length;
        boolean ascending = false;
        SearchType sType = SearchType.LessThan;
        ResultType resultadoEsperado = new ResultType(SearchResult.FoundLess, 4,0);
        Busca busca = new Busca();
        ResultType buscaResultado = busca.busca(key,teste,size,ascending,sType);

        assertEquals(resultadoEsperado.getSearchResult(),buscaResultado.getSearchResult());
        assertEquals(resultadoEsperado.getResultIndex(),buscaResultado.getResultIndex());
        assertEquals(resultadoEsperado.getResultValue(),buscaResultado.getResultValue());
    }



}