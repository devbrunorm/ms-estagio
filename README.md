# Tasks

### 1.Criar API de Crud

Incluir um CRUD de usuários no microsserviços de estágio incluindo também uma operação de bloquear e desbloquear.

Suplementação TI
```
Contexto: /exemplo
Controller: UserController ("/v1/users")

GET / - list all
GET /{id}             - detalhe
POST /                - incluir
PUT /{id}             - alterar
DELETE /{id}          - excluir (inativar)
PATCH /{id}/bloquear
GET /{id}/desbloquear
```