# Sistema de autenticação

## Task 01: Cadastro de novo usuário

### Requisitos:

- Necessário saber nome, sobrenome, e-mail, senha, instante do cadastro e se registro foi excluído ou não

### Restrições:

- Nome obrigatório
- Sobrenome obrigatório
- E-mail obrigatório
- Senha obrigatória e precisa ter um mínino de 6 caracteres
- Instante de cadastro obrigatório e não pode ser no futuro

### Resultado esperado:

- O usuário precisa estar cadastrado no sistema
- Cliente que fez a requisição precisa saber se houve sucesso (statuscode 200)

## Task 02: Pesquisa de usuários

### Requisitos:

- Necessário filtrar por nome, sobrenome e e-mail.

### Restrições:

- Os filtros por nome e sobrenome devem ser por busca aproximada
- O filtro por e-mail deve ser por busca exata

### Resultado esperado:

- Deve retornar os registros de usuário de forma paginada e o statuscode 200
- Pesquisa sem filtros deve retornar todos os registros paginados
