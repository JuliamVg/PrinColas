public class ObjCR {

    private String Producto;
    private Double Price;
    private int Cantidad;
    private String Cliente;


    public ObjCR(String producto, Double price, int cantidad, String cliente) {
        Producto = producto;
        Price = price;
        Cantidad = cantidad;
        Cliente = cliente;
    }

    public ObjCR() {
    }

    public ObjCR(ObjCR o) {

        Producto = o.Producto;
        Price = o.Price;
        Cantidad = o.Cantidad;
        Cliente = o.Cliente;
    }
    public String getProducto() {
        return Producto;
    }
    public void setProducto(String producto) {
        Producto = producto;
    }
    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        Price = price;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    

}