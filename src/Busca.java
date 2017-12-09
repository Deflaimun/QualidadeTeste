public class Busca {

    private SearchResult searchResult;
    private Integer resultIndex;
    private Integer resultValue;

    public Busca() {

    }

    public ResultType busca(int key, int[] array, int size, boolean ascending, SearchType type){
        searchResult = SearchResult.NotFound;
        resultIndex = null;
        resultValue = null;
        ResultType retorno = new ResultType(searchResult, resultIndex, resultValue);
        if(ascending) {
            for (int i = 0; i < size; i++) {
                retorno.setResultIndex(i);
                retorno.setResultValue(key);

                if(type == SearchType.Equals){
                    if(key == array[i]) {
                        retorno.setSearchResult(SearchResult.FoundExact);
                        return retorno;
                    }
                }

                if (type == SearchType.GreaterThanEquals) {
                    if(key == array[i]){
                        retorno.setSearchResult(SearchResult.FoundExact);
                        return retorno;
                    }

                    else if(array[i] > key){
                            retorno.setResultValue(array[i]);
                            retorno.setSearchResult(SearchResult.FoundGreater);
                            return retorno;
                    }
                }

                if (type == SearchType.LessThanEquals) {
                    if (key >= array[0]) {
                        if (key == array[i]) {
                            retorno.setSearchResult(SearchResult.FoundExact);
                            return retorno;

                        } else if (array[i] > key) {
                            retorno.setResultIndex(i-1);
                            retorno.setResultValue(array[i-1]);
                            retorno.setSearchResult(SearchResult.FoundLess);
                            return retorno;
                        }
                    }
                }
                if (type== SearchType.LessThan){
                    if(array[i] < key) {
                        retorno.setResultIndex(i);
                        retorno.setResultValue(array[i]);
                        retorno.setSearchResult(SearchResult.FoundLess);
                        return retorno;
                    }
                }

                if (type== SearchType.GreaterThan) {

                    if(array[i] > key ){
                        retorno.setResultIndex(i);
                        retorno.setResultValue(array[i]);
                        retorno.setSearchResult(SearchResult.FoundGreater);
                        return retorno;
                    }
                }
            }
        } else{
            for (int i = size-1; i >= 0; i--) {
                retorno.setResultIndex(i);
                retorno.setResultValue(key);

                if(type == SearchType.Equals){
                    if(key == array[i]) {
                        retorno.setSearchResult(SearchResult.FoundExact);
                        return retorno;
                    }
                }

                if (type== SearchType.GreaterThanEquals) {
                    if(key == array[i]){
                        retorno.setSearchResult(SearchResult.FoundExact);
                        return retorno;
                    }

                    else if(array[i] > key){
                        retorno.setResultValue(array[i]);
                        retorno.setSearchResult(SearchResult.FoundGreater);
                        return retorno;
                    }
                }

                if (type == SearchType.LessThanEquals) {
                    if (key >= array[size-1]) {
                        if (key == array[i]) {
                            retorno.setSearchResult(SearchResult.FoundExact);
                            return retorno;

                        } else if (array[i] > key) {
                            retorno.setResultIndex(i+1);
                            retorno.setResultValue(array[i+1]);
                            retorno.setSearchResult(SearchResult.FoundLess);
                            return retorno;
                        }
                    }
                }
                if (type== SearchType.LessThan){
                    if(array[i] < key) {
                        retorno.setResultIndex(i);
                        retorno.setResultValue(array[i]);
                        retorno.setSearchResult(SearchResult.FoundLess);
                        return retorno;
                    }
                }

                if (type== SearchType.GreaterThan) {

                    if(array[i] > key ){
                        retorno.setResultIndex(i);
                        retorno.setResultValue(array[i]);
                        retorno.setSearchResult(SearchResult.FoundGreater);
                        return retorno;
                    }
                }
            }


        }

        retorno.setSearchResult(SearchResult.NotFound);
        retorno.setResultIndex(null);
        retorno.setResultValue(null);
        return retorno;
    }



}
