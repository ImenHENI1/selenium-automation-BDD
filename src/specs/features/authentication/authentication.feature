Feature: Authentification - OrangeHRM
  ETQ utilisateur je souhaite m'authentifier

  @connexion
  Scenario: Connexion sur l'application OrangeHRM
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le nom d'utilisateur
    And Je saisie le mot de passe
    And Je clique sur le bouton login
    Then Je me redirige vers la page Home