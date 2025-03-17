package ihmsimple.services;

import ihmsimple.ctrl.Controller;

/**
 * Classe représentant le service de l'application MVC "IhmSimple".
 * 
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 1.0.0
 */
public class ServiceDevine {
    /**
     * Nombre maximum que l'utilisateur peut proposer.
     */
     public static final int NOMBRE_MAX = 100;
    
    /**
     * Nombre minimum que l'utilisateur peut proposer.
     */
     public static final int NOMBRE_MIN = 1;
    
    /**
     * Valeur retournée par la méthode lireValeurProposee() si ce qui a été saisi
     * par l'utilisateur n'est pas convertible
     * en un entier.
     */
     public static final int NOMBRE_INVALIDE = -1;

    /**
     * Référence au contrôleur de l'application.
     */
    private Controller refCtrl;

    /**
     * Constructeur du service.
     * Comme toujours, le travail N°1 consiste à initialiser TOUS nos attributs :-).
     * Pour la référence au contrôleur, vous devez à présent savoir quelle valeur
     * initiale donner.
     */
    public ServiceDevine() {
        this.refCtrl = null;
    }

    /**
     * Invente et retourne un nouveau nombre à deviner aléatoirement choisi entre
     * les limites tolérées pour ce jeu.
     *
     * @return le nombre à deviner aléatoirement choisi
     */
    public int penserAUnNombre() {
        int nombreAleatoir = (int) (Math.random()*(NOMBRE_MIN + NOMBRE_MAX)) - NOMBRE_MIN;
        return nombreAleatoir;
    };

    /**
     * Retourne la référence au contrôleur de l'application.
     *
     * @param refCtrl la référence au contrôleur de l'application
     */
    public void setRefCtrl(Controller refCtrl) {
        this.refCtrl = refCtrl;
    }

    /**
     * Retourne la référence au contrôleur de l'application.
     * 
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl() {
        return refCtrl;
    }

}
