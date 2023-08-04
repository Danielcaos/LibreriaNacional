#language:es
  Característica: Agregar libro al carrito de compras
    Yo como usuario quiero buscar un libro para comprarlo

  @BusquedaExitosa
  Escenario: Agregar al carrito de compras un libro de manera exitosa
    Dado que el usuario abre la pagina de la libreria nacional
    Cuando busque un libro y de clic aleatoriamente a un libro
      Y lo agregue al carrito de compras
    Entonces podra visualizar que el libro fue agregado con exito