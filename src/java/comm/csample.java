/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comm;

/**
 *
 * @author miracle
 */
public class csample {
    public static void main(String args[])
    {
    int x=add(12,12);
    System.out.println("addition of two values:"+x);
    }

    private static int add(int a, int b) {
        com.Service_Service service = new com.Service_Service();
        com.Service port = service.getServicePort();
        return port.add(a, b);
    }
    
}
