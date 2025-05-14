# 🔧 Tutorial: Como Instalar o WindowBuilder no Eclipse

O WindowBuilder é uma poderosa ferramenta para desenvolvimento de interfaces gráficas em Java, permitindo criar aplicações com Swing ou SWT através de uma interface visual drag-and-drop. Este tutorial mostra como instalar esse plugin no Eclipse.

## 📋 Pré-requisitos

- Eclipse IDE instalado (recomendado Eclipse IDE for Java Developers)
- Conexão à internet
- Java JDK 8 ou superior

## 📥 Passo a Passo para Instalação

### 1. Abrir o Eclipse IDE

Inicie o Eclipse e aguarde o carregamento completo da IDE.

![Tela inicial do Eclipse](imagens/windowbuilder/01.tela_inicial_eclipse.jpeg)

### 2. Acessar o Marketplace

Existem duas maneiras de acessar o Eclipse Marketplace:

**Menu Help**
1. Clique no menu **Help**
2. Selecione **Eclipse Marketplace...**

![Acessando o Marketplace pelo menu Help](imagens/windowbuilder/02.menu_ajuda_eclipse_marketplace.jpeg)

### 3. Buscar o WindowBuilder

1. Na janela do Eclipse Marketplace, digite **"WindowBuilder"** na caixa de pesquisa
2. Clique no botão **Go** ou pressione Enter

![Pesquisando WindowBuilder no Marketplace](imagens/windowbuilder/03.procura_windowbuilder.jpeg)

### 4. Instalar o WindowBuilder

1. Localize **WindowBuilder** nos resultados da pesquisa
2. Clique no botão **Install** ao lado de "WindowBuilder"

![Resultado da pesquisa e botão Install](imagens/windowbuilder/04.aceitar_a_instalacao.jpeg)

### 7. Reiniciar o Eclipse

1. Após a conclusão da instalação, o Eclipse solicitará reinicialização
2. Clique em **Restart Now** para reiniciar o Eclipse

## ✅ Verificando a Instalação

Para verificar se o WindowBuilder foi instalado corretamente:

1. Crie um novo projeto Java (**File > New > Java Project**)
2. Dê um nome ao projeto e clique em **Finish**
3. Clique com o botão direito no projeto > **New > Other**
4. Na caixa de diálogo "Select a wizard", expanda a pasta **WindowBuilder**
5. Você deve ver opções como "Swing Designer" e "SWT Designer"

![Verificando a instalação](imagens/windowbuilder/05.wizard_windowbuilder.png)


## ❓ Resolução de Problemas Comuns

### O Eclipse Marketplace não abre
- Verifique sua conexão com a internet
- Tente reiniciar o Eclipse com a opção `-clean`: `eclipse -clean`

### Erro durante a instalação
- Verifique se você tem permissões suficientes no sistema
- Tente instalar uma versão específica do WindowBuilder compatível com sua versão do Eclipse

### WindowBuilder não aparece após instalação
- Verifique se o Eclipse foi reiniciado corretamente
- Vá para **Help > About Eclipse IDE > Installation Details** para confirmar que WindowBuilder está listado nos plugins instalados

## 📚 Recursos Adicionais

- [Documentação oficial do WindowBuilder](https://www.eclipse.org/windowbuilder/)
- [Tutoriais para WindowBuilder](https://www.eclipse.org/windowbuilder/documentation.php)
- [Fórum de suporte do Eclipse](https://www.eclipse.org/forums/index.php/f/89/)

---

## 📁 Organização das Capturas de Tela no Repositório

Para este tutorial, todas as capturas de tela devem ser organizadas na seguinte estrutura:

```
java-monitoria/
├── tutoriais/
│   └── windowbuilder-instalacao.md
└── imagens/
    └── windowbuilder/
        ├── 01_eclipse_inicial.png
        ├── 02_menu_help.png
        ├── 03_icone_marketplace.png
        └── ... outras imagens
```
