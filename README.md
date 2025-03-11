# Introduction
Ce travail consiste à créer une application Java simple qui gère un compte bancaire. L'application permet de déposer et retirer de l'argent d'un compte tout en envoyant des notifications à chaque opération. Les tests unitaires sont effectués en utilisant JUnit 5 et les dépendances sont simulées à l'aide de Mockito. La couverture de code est mesurée avec JaCoCo pour s'assurer que le code est bien testé.

Le travail est structuré de manière à permettre une gestion simple des opérations bancaires et à tester les différentes fonctionnalités avec des cas d'usage spécifiques : 
**-CompteBancaire.java** : Gère les opérations bancaires comme le dépôt et le retrait d'argent.
**-NotificationService.java** : Simule l'envoi de notifications après chaque opération bancaire.
**-CompteBancaireTest.java** : Contient les tests unitaires pour vérifier le bon fonctionnement des opérations bancaires et l'envoi des notifications.

# Fonctionnalités principales

**Gestion d'un compte bancaire :**
Le solde initial du compte est spécifié lors de la création du compte bancaire.
Les utilisateurs peuvent déposer ou retirer de l'argent à tout moment, tant que le solde est suffisant pour les retraits.

**Envoi de notifications :**
Chaque opération bancaire (dépôt ou retrait) entraîne l'envoi d'une notification via un service simulé (NotificationService).

**Tests unitaires avec JUnit et Mockito :**
Des tests unitaires sont créés pour tester les fonctionnalités principales : dépôt, retrait, et gestion des exceptions (par exemple, retrait supérieur au solde).
Mockito est utilisé pour simuler la dépendance NotificationService afin de vérifier que les notifications sont envoyées correctement.

**Mesure de la couverture de code avec JaCoCo :**
JaCoCo est configuré pour mesurer la couverture du code. Il génère un rapport détaillant les parties du code couvertes par les tests.

# Explication détaillée
**NotificationService**
La classe NotificationService est responsable de l'envoi de notifications après chaque opération bancaire. Actuellement, elle affiche simplement un message dans la console, mais elle pourrait facilement être étendue pour envoyer des emails ou des messages SMS dans une version réelle de l'application.

**CompteBancaire**
La classe CompteBancaire gère les opérations bancaires. Elle prend un solde initial et un NotificationService pour envoyer des notifications à chaque opération.

- Dépôt : Ajouter de l'argent au compte et envoyer une notification.
- Retrait : Retirer de l'argent du compte, avec vérification que le solde est suffisant avant l'opération, et envoi d'une notification.

**Tests unitaires avec JUnit et Mockito**
Les tests unitaires sont réalisés avec JUnit 5 pour vérifier que les méthodes de CompteBancaire fonctionnent comme prévu. Mockito est utilisé pour simuler le service de notification.

**Couverture de code avec JaCoCo**
JaCoCo est configuré dans le fichier pom.xml pour mesurer la couverture des tests. Le rapport généré après l'exécution des tests indique quelles parties du code ont été couvertes et lesquelles ne l'ont pas été.

La commande suivante génère le rapport JaCoCo : **mvn clean verify**
