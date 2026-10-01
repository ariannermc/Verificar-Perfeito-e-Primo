# Verificar número perfeito e número primo
> Dois programas que verificam se um número é **perfeito** ou **primo**, desenvolvidos separadamente para cada conceito matemático.

---

## Conceitos 
**Número Perfeito:** é aquele cuja soma de seus divisores (excluindo ele mesmo) é igual a ele próprio.
> Exemplo: 6 → divisores: 1, 2, 3 → 1+2+3 = 6 ✅
 
**Número Primo:** é aquele que só é divisível por 1 e por ele mesmo.
> Exemplo: 7 → só divide por 1 e 7 ✅ | Exemplo: 9 → divide por 1, 3 e 9 ❌

---

## Funcionalidades
 
- Verifica se um número digitado é **perfeito**
- Verifica se um número digitado é **primo**
- Exibe mensagem clara no terminal informando o resultado
- Cada verificação é um programa independente
---
 
## Como executar
 
**Pré-requisito:** Java instalado. </br>
Verifique com:
```bash
java -version
```
 
1. Clone o repositório:
```bash
git clone https://github.com/ariannermc/Verificar-Perfeito-e-Primo.git
cd Verificar-Perfeito-e-Primo
```
 
2. Para verificar se um número é **perfeito**:
```bash
javac VerificarPerfeito.java
java VerificarPerfeito
```
 
3. Para verificar se um número é **primo**:
```bash
javac VerificarPrimo.java
java VerificarPrimo
```
 
---
 
## Estrutura do projeto
 
```
Verificar-Perfeito-e-Primo/
├── VerificarPerfeito.java   # Verifica se o número é perfeito
└── VerificarPrimo.java      # Verifica se o número é primo
```
 
---
 
## Tecnologias utilizadas
 
| Tecnologia | Uso |
|---|---|
| Java 8 | Linguagem principal |
| `Scanner` | Leitura do número digitado pelo usuário |
 
Nenhuma biblioteca externa necessária.
 
---
 
## Autora
 
Feito por [**ariannermc**](https://github.com/ariannermc)
 
---
