binarysearch(a: int[], x: int,):int {
    n : int ;
    n = 6 ;
    l : int ;
    l = 0 ;
    r : int ;
    r = n - 1 ;

    while (l < r) {
        m : int ; 
        m = ( l + r ) / 2 ;
        h : int ;
        h = a [ m ] ;
        a[ m ] = 3 ;
        if ( h < x ) ( l = m + 1 ) else ( r = m ) ;
    };
    return n ;
}
main():int {
    b : int[] ;
    b = {1, 2, 3, 4, 6, 10,} ;
    return binarysearch( b , 4 , ) ;

}
