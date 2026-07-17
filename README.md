# 🚀 Sistema de Abastecimento

> Desafio Técnico Júnior - Cadastro e consulta de abastecimentos em posto de combustível

---

## 🛠️ Tecnologias

- Java 17 | Maven | Swing | H2 Database | Spark Java (REST)

---

## ⚙️ Funcionalidades

**Combustíveis** • Criar • Listar • Editar • Deletar  
**Bombas** • Criar • Listar • Editar • Deletar  
**Abastecimentos** • Registrar • Listar • Consultar por período  

---

GET  /api/combustiveis    POST /api/combustiveis
GET  /api/bombas          POST /api/bombas
GET  /api/abastecimentos  POST /api/abastecimentos

---

src/main/java/com/challenge/
├── model/      # Entidades
├── dao/        # Persistência
├── service/    # Regras de negócio
├── controller/ # API REST
└── view/       # Interface Swing
