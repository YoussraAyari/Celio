Feature: page jeans 
Scenario: utilisateur clique sur un produit 
Given utilisateur est sur la page jeans 
When utilisateur clique sur le produit "Jean barrel 100% coton - bleu brut"
Then la page produit est affiché "Jean barrel 100% coton - bleu brut"