package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class CompteBancaireTest {
    private CompteBancaire compte;
    private NotificationService notificationServiceMock;

    @BeforeEach
    public void setUp() {
        notificationServiceMock = mock(NotificationService.class);
        compte = new CompteBancaire(100, notificationServiceMock);
    }

    @Test
    public void testDeposer() {
        // Effectuer un dépôt
        compte.deposer(50);

        // Vérifier que la méthode envoyerNotification() a été appelée
        verify(notificationServiceMock).envoyerNotification("Dépôt de 50.0 effectué.");
    }

    @Test
    public void testRetirer() {
        // Effectuer un retrait
        compte.retirer(50);

        // Vérifier que la méthode envoyerNotification() a été appelée
        verify(notificationServiceMock).envoyerNotification("Retrait de 50.0 effectué.");
    }

    @Test
    public void testRetirerFondsInsuffisants() {
        // Tester un retrait supérieur au solde
        try {
            compte.retirer(200);
        } catch (IllegalArgumentException e) {
            // Vérifier que l'exception est levée
            verify(notificationServiceMock, never()).envoyerNotification(anyString());
        }
    }
}