# Santander Dev Week 2023
Java RESTful API criado para o Santander Dev Week 2023


## Diagrama de Classes
``` mermaid
classDiagram
  class Client {
    +String name
    +Account account
    +List<Feature> features
    +List<Card> cards
    +List<News> news
  }
  
  class Account {
    +String agency
    +String number
    +Number balance
    +Number limit
  }
  
  class Feature {
    +String icon
    +String description
  }
  
  class Card {
    +String number
    +Number limit
  }
  
  class News {
    +String icons
    +String description
  }
  
  Client "1" -- "1" Account
  Client "1" -- "0..*" Feature
  Client "1" -- "0..*" Card
  Client "1" -- "0..*" News

```
