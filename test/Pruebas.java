/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor Vix
 */
public class Pruebas {
    /*
    
    this.emf = Persistence.createEntityManagerFactory("PatrimoniNaturalPersistenciaPU");
    
    */
    /*
    
      public boolean loginControl(String username, String password) {
        try {
            EntityManager em = getEntityManager();
            TypedQuery<UsuarioT> consulta = em.createNamedQuery("Usuario.login", UsuarioT.class);
            consulta.setParameter("nombre", username).setParameter("contrasena", password);
            List<UsuarioT> lista = consulta.getResultList();
         //   for (Usuario a : lista) {
         //       System.out.println(a.getNombre() + "," + a.getContrasena());
         //   }

            // System.out.println("tamano"+lista.size());
            em.close();
            System.out.println("good");
            if (lista.size() == 1) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error loginControl");
            return false;
        }

    }
    
    
    
    
    
    */
    
}
