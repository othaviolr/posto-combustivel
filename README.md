# Sistema de Abastecimento

> Desafio Técnico Júnior - Cadastro e consulta de abastecimentos em posto de combustível

## Tecnologias
Java 21 | Maven | Swing | H2 Database | Spark Java (REST)

## ⚙️ Funcionalidades
**Combustíveis** • Criar • Listar • Editar • Deletar  
**Bombas** • Criar • Listar • Editar • Deletar  
**Abastecimentos** • Registrar • Listar • Consultar por período  

## API REST
GET  /api/combustiveis    POST /api/combustiveis  
GET  /api/bombas          POST /api/bombas  
GET  /api/abastecimentos  POST /api/abastecimentos  

## Estrutura
src/main/java/com/othavio/posto-de-combustivel/  
├── model/      # Entidades  
├── dao/        # Persistência  
├── service/    # Regras de negócio  
├── controller/ # API REST  
└── view/       # Interface Swing  
