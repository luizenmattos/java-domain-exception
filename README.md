#Java Domain Exception
##Motivação

Em aplicações server-side, especialmente aquelas que processam formulários grandes e complexos, é comum receber muitos dados em lote que precisam ser validados simultaneamente. Nessas situações, validar e acumular várias ações de negócio em massa torna-se necessário para garantir a integridade e consistência dos dados.

##Objetivo

Este projeto tem como objetivo oferecer uma forma simples e eficiente de manter a pureza do domínio, encapsulando a validação de múltiplas operações através de um mecanismo de wrapping de métodos que lançam exceções específicas de domínio (DomainException).

Assim, é possível executar várias operações de validação, acumular os erros gerados e, ao final, tratar todos eles de forma centralizada, mantendo o código limpo e organizado.
