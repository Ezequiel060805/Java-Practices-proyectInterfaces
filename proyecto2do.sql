DROP DATABASE IF EXISTS Proyecto2do;
Create database Proyecto2do; 
use Proyecto2do; 
CREATE TABLE usuarios (
  IdUsuarios INT PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(50),
  Celular VARCHAR(48),
  Email VARCHAR(255),
  Contraseña VARCHAR(25) default '123456' ,
  Rol VARCHAR(20),
  Status ENUM('activo', 'inactivo') default 'activo'
);

INSERT INTO usuarios (Nombre, Celular, Email, Contraseña, Rol, Status)
VALUES ('Juan', '6531202147', 'juan@gmail.com', '123456', 'Venta', 'activo');


CREATE TABLE productos (
  idProducto INT PRIMARY KEY AUTO_INCREMENT,
  nombreProducto VARCHAR(50),
  Categoria VARCHAR(50),
  precio FLOAT,
  stockMin int, -- se cambio a entero 
  stockMax int, -- se cambio a entero
 -- PrecioUnidad FLOAT, se quita del srs y de la tabla 
  status ENUM('activo', 'inactivo')
);

INSERT INTO productos (NombreProducto, Categoria, Precio, StockMin, StockMax, Status)
VALUES ('Producto 1', 'Mesas', 50, 10, 100, 'activo');

CREATE TABLE clientes (
  IdCliente INT PRIMARY KEY AUTO_INCREMENT,
  NombreCliente VARCHAR(60),
  Direccion VARCHAR(120),
  Ciudad VARCHAR(30),
  Telefono VARCHAR(48),
  Celular VARCHAR(48),
  RFC VARCHAR(13),
  Status ENUM('activo', 'inactivo')
);

INSERT INTO clientes (NombreCliente, Direccion, Ciudad, Telefono, Celular, RFC, Status)
VALUES ('Fulanito', 'Av. Guerrero y 9', 'San Luis ', '6535364609', '6531316589', 'ABC123456789', 'activo');


CREATE TABLE venta (
  IdVenta INT PRIMARY KEY AUTO_INCREMENT,
  IdCliente INT,
  IdUsuarios INT,
  FechaVenta DATE,
  HoraVenta TIME,
  Status ENUM('activo', 'inactivo'),
  FOREIGN KEY (IdCliente) REFERENCES clientes(IdCliente),
  FOREIGN KEY (IdUsuarios) REFERENCES usuarios(IdUsuarios)
);

CREATE TABLE detalle_venta (
  IdVenta INT,
  IdProducto INT,
  Precio FLOAT,
  Cantidad INT,
  FOREIGN KEY (IdVenta) REFERENCES venta(IdVenta),
  FOREIGN KEY (IdProducto) REFERENCES productos(IdProducto)
);

