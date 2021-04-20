# Solos-Arquitetura
Repositório para as atividades da disciplina de Arquitetura de Software 2020-02
#
Desenvolvimento de uma Arquitetura para o Projeto Solos, uma ferramenta para Equilíbrio e Correção de Solos

# Relatório de melhorias no código da arquitetura do software

## Código antes das melhorias

### Resultado da execução do `cloc`:

      21 text files.
      16 unique files.
      49 files ignored.

      -------------------------------------------------------------------------------
      Language                     files          blank        comment           code
      -------------------------------------------------------------------------------
      Java                            10            110            110            441
      XML                              2              0              0             56
      Maven                            1              0              0             13
      INI                              2              0              0             11
      -------------------------------------------------------------------------------
      SUM:                            15            110            110            521
      -------------------------------------------------------------------------------

Estruturas condicionais no código: ***5***

### Problemas encontrados:

- Métodos não utilizados;
- Pacote e classes não utilizadas;
- Estruturas das classes `Enum` sem inicialização de valores;
- Estruturas `switch()` extensas.

### Soluções:

- Exclusão de métodos não utilizados;
- Exclusão de pacote e classes não utilizadas;
- Melhor utilização de Enums, link de referência: [Tipos Enum no Java](https://www.devmedia.com.br/tipos-enum-no-java/25729)


### Propostas de melhorias:

- Exclusão de pacote, classes e métodos não utilizados:
  - A solução fez com que a quantidade de linhas de código fosse reduzida, pois existiam vários métodos `get()` e `set()` não utilizados, assim como o pacote `com.solos.arquitetura.calciomagnesio` junto com suas classes também não utilizadas.
  - Link para o *commit* da proposta de solução: [*Commit*](https://github.com/silveiralh/Solos-Arquitetura/commit/839eccbdce1b44fbaa753505d023233c65bc0ac1).

- Alterações da estrutura da classe `Enum`:
  - As melhorias na estrutura das classes `Enum` permitiram uma diminuição das linhas de código e a remoção de quatro estruturas switch extensas.
  - Estas melhorias foram feitas em 3 *commits*, pois ao longo da implementação foram observadas outras formas de mehorar a estrutura do código tornando-o mais simples.
  - Link para os *commits* da proposta de solução: [*Commit 1*](https://github.com/silveiralh/Solos-Arquitetura/commit/46cb070206ab46774c49dc96c8c659e48b2826ad), [*Commit 2*](https://github.com/silveiralh/Solos-Arquitetura/commit/6b60a6101a051336457d1cf1e426b30e96be85e3), [*Commit 3*](https://github.com/silveiralh/Solos-Arquitetura/commit/0f37815a5321b00d3490c73a75468150c47cc4f3).

## Código antes das melhorias

### Resultado da execução do `cloc`:

      18 text files.
      13 unique files.
      50 files ignored.
      -------------------------------------------------------------------------------
      Language                     files          blank        comment           code
      -------------------------------------------------------------------------------
      Java                             7             53              5            237
      XML                              2              0              0             56
      Maven                            1              0              0             13
      INI                              2              0              0             11
      -------------------------------------------------------------------------------
      SUM:                            12             53              5            317
      -------------------------------------------------------------------------------

Estruturas condicionais no código: ***5***

Houve uma diminuição de 204 linhas de código e 5 estruturas condicionais.
