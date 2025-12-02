### 1. Expresiones Lambda (Interfaces Funcionales)

| Interfaz Funcional | Descripción (Qué Hace) | Parámetros (Entrada) | Retorno (Salida) |
| :--- | :--- | :--- | :--- |
| **Consumer** | Recibe un valor y realiza una acción con él. | 1 valor (T) | Nada (`void`) |
| **BiConsumer** | Recibe dos valores y realiza una acción con ambos. | 2 valores (T, U) | Nada (`void`) |
| **Supplier** | No recibe ningún valor, solo genera un resultado. | Nada | 1 valor (T) |
| **Function** | Recibe un valor y lo transforma, retornando un valor (posiblemente de otro tipo). | 1 valor (T) | 1 valor (R) |
| **BiFunction** | Recibe dos valores y retorna un resultado. | 2 valores (T, U) | 1 valor (R) |
| **Predicate** | Recibe un valor y evalúa una condición lógica. | 1 valor (T) | Booleano (`boolean`) |
| **BiPredicate** | Recibe dos valores y evalúa una condición lógica. | 2 valores (T, U) | Booleano (`boolean`) |
| **UnaryOperator** | Recibe un valor y retorna un valor del *mismo tipo*. | 1 valor (T) | 1 valor (T) |
| **BinaryOperator** | Recibe dos valores y retorna un valor del *mismo tipo*. | 2 valores (T, T) | 1 valor (T) |
| **Runnable** | Ejecuta una tarea sin recibir ni retornar nada (usado en concurrencia). | Nada | Nada (`void`) |
| **Callable** | Ejecuta una tarea, puede retornar un resultado y lanzar excepciones (usado en concurrencia). | Nada | 1 valor (V) |
