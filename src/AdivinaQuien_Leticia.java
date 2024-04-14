/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Leticia
 */
public class AdivinaQuien_Leticia {
    public static void main(String[] args) {
        
        boolean real = pregunta("Tu personaje es una persona real?");
        if (real) {
            
        //Historia
        boolean muerto = pregunta("¿Esta muerto");
        if (muerto) {
            boolean sovietico = pregunta("¿Goberno la Union Sovietica?");
            if (sovietico) {
               boolean bigote = pregunta("¿Tiene bigote?");
               if(bigote){
                  boolean ww2 = pregunta("¿Participo en la WW2?");
                   if(ww2){
                     boolean urss = pregunta("¿Promovió la colectivización de la agricultura?");
                        if(urss){
                          JOptionPane.showMessageDialog(null,"Es Iosif Stalin!");
                        System.exit(0);
                        }
                   }
               }
            } 
            boolean mexico = pregunta("¿Fue gobernante de mexico?");
            if(mexico){
                boolean pais = pregunta("¿Mejoro la eocnomia del pais?");
                if(pais){
                    boolean general = pregunta("¿Fue general?");
                    if(general){
                        boolean nueve = pregunta("¿Se reeligio 9 veces?");
                        if(nueve){
                            boolean diaz = pregunta("¿Tuvo un periodo con su nombre?");
                            if(diaz){
                                JOptionPane.showMessageDialog(null,"Es Porfirio Diaz");
                             System.exit(0);
                            }
                        }
                    }
                }
            } //comediante
            boolean come = pregunta("¿Es comediante?");
            if(come){
                boolean esposo = pregunta("¿Es esposo de Florinda Mesa?");
                    if(esposo){
                        boolean personaje = pregunta("¿Su personaje es el Chavo del 8?");
                        if(personaje){
                        JOptionPane.showMessageDialog(null, "Es Roberto Gomez Bolaños");
                       System.exit(0); 
                    }
                }
            }
           //artista
           boolean artista = pregunta("¿Es compositor y cantante?");
           if(artista){
               boolean britanico = pregunta("¿Es un artista britanico?");
               if(britanico){
                   boolean rock = pregunta("¿Es conocido como el rey del Rock?");
                   if(rock){
                       JOptionPane.showMessageDialog(null, "Es Freddie Mercury");
                       System.exit(0); 
                   }
               }
           }
        }
      }
        if (real) {//Historia
        boolean mujer = pregunta("¿Es mujer?");
        if(mujer){
           boolean Usa = pregunta ("¿Es estadounidense?");
           if(Usa){
               boolean cel = pregunta("¿Es una celebridad?");
               if(cel){
                    boolean ex = pregunta("¿Es la Ex primera dama de Estados Unidos?");
                    if(ex){
                        JOptionPane.showMessageDialog(null, "Es Michelle Obama");
                       System.exit(0);
                    }//artistas
                    boolean arts = pregunta("¿Es cantante y compositor?"); 
                    if(arts){
                        boolean pelo = pregunta("¿Es rubia?");
                        if(pelo){
                            boolean tour = pregunta("¿Se relaciona con “The Eras Tour”?");
                            if(tour){
                                JOptionPane.showMessageDialog(null, "	Taylor Swift");
                              System.exit(0);
                            }
                        }
                    }
                    boolean cola = pregunta("¿Su peinado Caracteristico es una Coleta Alta?");
                    if(cola){
                        boolean act = pregunta("¿Participó en “Victorius” y en “Sam y Cat”?");
                        if(act){
                            JOptionPane.showMessageDialog(null, " Ariana Grande");
                              System.exit(0);
                        }
                    }
               }
           } 
        }
       }
        if (real) {//Comediante 
        boolean mexicano = pregunta("¿Es Mexicano?");
        if(mexicano){
            boolean comediante = pregunta("¿Es comediante?");
            if(comediante){
                {
                  boolean chaparro = pregunta("¿Es Chaparro?");
                   if(chaparro){
                        JOptionPane.showMessageDialog(null, "ES Omar Chaparro");
                       System.exit(0); 
                    }
                    
                }
            }
        }//artista
       boolean USA = pregunta ("¿Es estadounidense?");
           if(USA){
               boolean cele = pregunta("¿Es una celebridad?");
               if(cele){
                   boolean actor = pregunta("¿Es Actor?");
                   if(actor){
                       boolean ala = pregunta("¿Interpretó al genio de “Aladdin”?");
                       if(ala){
                           JOptionPane.showMessageDialog(null, "Es Will Smith");
                       System.exit(0);
                       }
                   }
                   boolean tic = pregunta ("¿Protagonista del Titanic?");
                   if(tic){
                        boolean oscar = pregunta("¿Ganador al Oscar por la película “El renacido”?");
                        if(oscar){
                           JOptionPane.showMessageDialog(null, "Es Leonardo DiCaprio");
                           System.exit(0);
                        }
                   }
               }
        }
       } 
    }

    private static boolean pregunta(String la_pregunta) {
        int respuesta = JOptionPane.showConfirmDialog(null, la_pregunta, "Akinator", JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }
    
    public static Image redimensionarImagen(String rutaImagenOriginal, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(rutaImagenOriginal);
        Image imagenOriginal = icono.getImage();
        return imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    }
}
