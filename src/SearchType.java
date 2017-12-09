public enum SearchType {

    LessThan(0),
    LessThanEquals(1),
    Equals(2),
    GreaterThanEquals(3),
    GreaterThan(4);

    public int searchValue;
    SearchType(int valor){
        searchValue = valor;

    }

}