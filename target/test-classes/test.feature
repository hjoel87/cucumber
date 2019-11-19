Feature: test
  @important
  Scenario: test1
    When user bereit
    Then seite laden
    Then email eingeben

  Scenario: test2
    When user bereit amazon
    Then seite laden amazon
    Then suche eingeben gladiator
    Then ergebnisse ausgeben