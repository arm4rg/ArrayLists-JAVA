# Proyecto de Gestión de Productos

Este proyecto está desarrollado en Java y proporciona una interfaz de consola para gestionar una lista de productos haciendo el uso de `ArrayList`. El programa permite agregar, mostrar, eliminar, buscar y ordenar productos dentro de una lista de productos.

## Requisitos

- JDK instalado en máquina (puede ser OpenJDK 21 o posteriores).
- Un editor de texto o un IDE (por ejemplo, Visual Studio Code, Eclipse, etc.)

## Ejecución
1. Clona este repositorio:
```bash
git clone https://github.com/arm4rg/ArrayLists-JAVA.git
cd ArrayLists-JAVA
```

2. Compila el archivo `App.java`:
```bash
javac App.java
```

2. Ejecuta el programa:
```bash
java App
```

## Descripción del Programa

El programa tiene un menú interactivo que ofrece las siguientes opciones:

1. **Agregar un producto a la lista**
2. **Mostrar la lista de compras**
3. **Eliminar un producto de la lista**
4. **Buscar un producto en la lista**
5. **Ordenar la lista de productos alfabéticamente**
6. **Salir**

### Funcionalidades

- **Agregar Productos**: Permite agregar productos a la lista de productos hasta que el usuario ingrese "0" para salir.
- **Mostrar la Lista**: Muestra todos los productos ingresados.
- **Eliminar Productos**: El usuario puede eliminar productos de la lista ingresando su nombre hasta que el usuario ingrese "0" para salir.
- **Buscar Productos**: Permite buscar un producto específico en la lista y muestra si el producto está presente o no.
- **Ordenar Lista**: Ordena alfabéticamente los productos en la lista.
  
## Instrucciones

### Cómo ejecutar el programa

1. **Agregar localmente esta carpeta**:
   - Descargarla desde el repositorio.

2. **Abrir la carpeta**:
   - Abrir editor de código y navega para abrir la carpeta `EJ2_ARRAYLIST`, dentro de la subcarpeta `src` que contiene el archivo `App.java`.
    
3. **Ejecutar el programa**:
   - Presionar Ejecutar Java

#### Clases y Métodos

1. **Clase `App`**:
   - La clase principal contiene el flujo del programa y los métodos interactivos con el usuario.

2. **Métodos**:
   - **`LimpiarC()`**: Limpia la consola para mejorar la visibilidad.
   - **`AgregarP()`**: Permite agregar productos a la lista.
   - **`MostrarList()`**: Muestra todos los productos en la lista.
   - **`EliminarP()`**: Elimina productos de la lista.
   - **`BuscarP()`**: Busca un producto en la lista y muestra si está presente.
   - **`OrdenarList()`**: Ordena la lista de productos alfabéticamente.
   - **`menu()`**: Muestra el menú y captura la opción seleccionada por el usuario.

### Manejo de Errores

El programa permite el manejo de errores haciendo uso de `try-catch`, si el usuario ingresa caracteres no válidos en lugar de números en las opciones del menú, el programa imprimirá un mensaje de error y solicitará la opción nuevamente.

### Autor
Luis Armando Reyes Argueta.

### Uso
Este programa es realizado con fines educativos. 