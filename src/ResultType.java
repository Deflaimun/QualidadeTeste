public class ResultType {
    private SearchResult searchResult;
    private Integer resultIndex;
    private Integer resultValue;

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }

    public Integer getResultIndex() {
        return resultIndex;
    }

    public void setResultIndex(Integer resultIndex) {
        this.resultIndex = resultIndex;
    }

    public Integer getResultValue() {
        return resultValue;
    }

    public void setResultValue(Integer resultValue) {
        this.resultValue = resultValue;
    }

    public ResultType(SearchResult searchResult, Integer resultIndex, Integer resultValue) {
            this.searchResult = searchResult;
            this.resultIndex = resultIndex;
            this.resultValue = resultValue;
        }
    }


