import java.util.Scanner;
import java.util.Date;
class Producto {
    private int seccion_Almacen;
    private int stock;
    private VentaProductos ventaProductos;
    public Producto(){}
    public Producto(int seccion_Almacen,int stock,VentaProductos ventaProductos){
        this.seccion_Almacen=seccion_Almacen;
        this.stock=stock;
        this.ventaProductos=ventaProductos;
    }
    public void setSeccion_Almacen(int seccion_Almacen){
        this.seccion_Almacen=seccion_Almacen;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public int getSeccion_Almacen(){
        return seccion_Almacen;
    }
    public int getStock() {
        return stock;
    }
    public void setVentaProductos(VentaProductos ventaProductos) {
        this.ventaProductos = ventaProductos;
    }
    public VentaProductos getVentaProductos() {
        return ventaProductos;
    }
    public double calcularDescuento(double precio, int cantidad) {
        if (precio >= 1000 && cantidad >= 10) {
            return precio * 0.1;
        } else {
            return precio * 0.05;
        }
    }
    public double calcularPrecioFinal(double precio, int cantidad) {
        double descuento = calcularDescuento(precio, cantidad);
        return precio - descuento;
    }
    @Override
    public String toString() {
        return "DATOS DEL PRODUCTO" +
                "\nNumero de Almacen= " + seccion_Almacen +
                "\nNumero de Stock= " + stock +
                "\nDATOS DE LA VENTA " + ventaProductos +
                '.';
    }
}
class VentaProductos {
    private Date fecha_venta;
    private String nombre;
    private String descripcion;
    public VentaProductos() {}
    public VentaProductos( String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public void calcularFecha_Venta(){
        this.fecha_venta=new Date();
    }
    public Date getFecha_Venta() {
        return fecha_venta;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String toString() {
        return "\nfecha y Hora de la venta= " + fecha_venta +
                "\nNombre del Producto= " + nombre +
                "\nDescripcion del Producto= " + descripcion +
                '.';
    }
}
public class ejecutor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        Producto producto = new Producto();
        double descuento = producto.calcularDescuento(precio, cantidad);
        System.out.println("El descuento aplicado es de $" + descuento);
        double precioFinal = producto.calcularPrecioFinal(precio, cantidad);
        System.out.println("El precio final de la compra es de $" + precioFinal);
        VentaProductos ventaProductos1=new VentaProductos("Computadora","computadora gaiming con grafica integrada 8 gb de ram");
        ventaProductos1.calcularFecha_Venta();
        Producto producto1=new Producto(14,10,ventaProductos1);
        System.out.println(producto1);
    }
}
