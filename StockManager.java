import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     * Reciba una entrega de un producto particular. Aumente la cantidad del producto por la cantidad dada.
     *
     */
    public void delivery(int id, int amount)
    {
        //Recorre los productos , compara si el producto tiene esa id, e invoca el metodo de incremetar la cantida.Si no hay producto muestra por pantalla que la id que ha puesto el usuario
        //no se corresponde con ningun producto.
        for(Product producto : stock){
           if(producto.getID() == id){
               producto.increaseQuantity(amount);
               System.out.println("Se ha aumentado la cantidad al producto: " + id + " | " +  amount) ;
            }
           else{
               System.out.println("No se encuentra el producto con la ID: " + id) ;
            }
        }
        
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     *         Trate de encontrar un producto en la acción con el dado id.
     devuelva el producto identificado, o la inutilidad si no hay ninguno con una correspondencia ID.
     */
    public Product findProduct(int id)
    {
        //Recorre los productos , compara si el producto tiene esa id, y añade el producto a la variable creada al principio del metodo para luego devolverla.
        Product produccto = null;
        for(Product producto : stock){
           if(producto.getID() == id){
               produccto = producto;
               
            }
        }
        return produccto;
    }
     /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     *         Trate de encontrar un producto en la acción con el dado id.
     devuelva el producto identificado, o la inutilidad si no hay ninguno con una correspondencia ID.
     */
    public Product findProduct2(int id)
    {
        //Recorre los productos , compara si el producto tiene esa id, y añade el producto a la variable creada al principio del metodo para luego devolverla.
        Product produccto = null;
        for(int index = 0; index < stock.size()&&produccto==null; index++){
           if(stock.get(index).getID() == id){
               produccto = stock.get(index);
               
            }
        }
        return produccto;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     * Localice un producto con el dado ID, y la vuelta cuantos de este artículo está en la acción. 
     * Si el ID no empareja ningún producto, el cero de vuelta. param id el ID del producto. devuelva la cantidad del producto dado en la acción
     */
    
    public int numberInStock(int id)
    {
        //Recorre los productos , compara si el producto tiene esa id, y añade el producto a la variable creada la cantidad invocando el metodo de la cantidad de productos en el stock y lo devuelve.
        int cantidad = 0;
        for(Product producto : stock){
           if(producto.getID() == id){
               cantidad = producto.getQuantity();
            }
        }
        return cantidad;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for(Product producto : stock){
            //La clase producto al contener el método toString no es necesario hacer referencia a este para
            //imprimir los productos (Java lo hace por defecto)
            System.out.println(producto);
        }
    }
}
