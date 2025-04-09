# Exercício: Sistema de Gestão Hospitalar

## Objetivo
Desenvolver um sistema simples de gestão hospitalar que demonstre os conceitos de abstração, herança e polimorfismo em Java, implementando diferentes tipos de profissionais e cálculos de salário.

## Enunciado

Crie um sistema de gestão hospitalar com as seguintes classes:

1. **Profissional** (classe base):
   - Atributos: nome (String), horasTrabalhadas (int)
   - Métodos: calcularSalario() [abstrato]

2. **Medico** (subclasse de Profissional):
   - Atributos adicionais: especialidade (String), bonusPorPlantao (double)
   - calcularSalario(): horas * 150 + bonusPorPlantao

3. **Enfermeiro** (subclasse de Profissional):
   - Atributos adicionais: nivel (String - "Junior", "Pleno", "Sênior")
   - calcularSalario(): horas * 75 + bônus baseado no nível (Junior: +5%, Pleno: +10%, Sênior: +20%)

4. **TecnicoLaboratorio** (subclasse de Profissional):
   - Atributos adicionais: laboratorio (String)
   - calcularSalario(): horas * 50

5. Implementar uma classe **GestaoHospitalar** que armazene os profissionais e calcule o total de salários.

## Requisitos

1. Utilize uma classe abstrata para Profissional
2. Implemente corretamente a herança
3. Utilize polimorfismo ao calcular o salário total
4. Adicione validações apropriadas nos construtores e métodos

## Dicas
- Lembre-se de usar o modificador de acesso protected para os atributos da classe base
- Use @Override ao sobrescrever métodos
- Adicione getters para acessar os atributos privados

## Prazo
Até o próximo encontro de monitoria.

## Critérios de Avaliação
- Funcionamento correto: 40%
- Implementação adequada dos conceitos de POO: 40%
- Organização e legibilidade do código: 20%