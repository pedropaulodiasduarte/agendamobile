Olá, seja bem vindo ao Projeto Agenda!

Projeto com intuito de aprendizado, no qual tem objetivo de desenvolver uma agenda de contatos.
Neste arquivo, como intuito é aprendizado, irei colocar trechos de códigos com maiores comentários, para de fato, aprender e quando necessário, contar com uma fonte de consulta.
Também, no código fonte, pode acontecer de ter comentários que em um mundo profissional não teria, mas, como dito anteriormente, aqui o foco é aprender.


Comentários:

Arquivo: activity.main.java

listaDeAlunos.setAdapter(new ArrayAdapter<>(
        this,
        android.R.layout.simple_list_item_1,
        alunos));
        //Se cria um adapter paravincular os dados da array em um listView
        //O método responsável por isto é o setAdapter
        //setAdapter espera uma interface para sua implementação, que é a ListAdapter, porém muito complexa por sua classe anônima, apesar de podermos criar regras conforme nosso listview
        //O Android Framework, para facilitar disponibiliza o arrayAdapter que é uma classe e sua implementação é mais simples
        //arrayAdapterencaminha os argumentos via construtor e vincula no listView
        //<>é para indicar o  diamond operator, o tipo genérico éde dados  automaticamente inferido conforme array
        //this - Neste contexto, "this" se refere à instância da classe atual, ou seja, à Activity em que o código está sendo executado. Ele é usado para fornecer o contexto da Activity para o ArrayAdapter
        //android.R.layout.simple_list_item_1: Este é o layout padrão fornecido pelo Android para exibir um único item em uma lista. Ele é usado para definir como cada item da lista será exibido na ListView. Aqui pode criar um layout, mas o Android já disponibiliza. Este argumento espera um resource do tipo int
        //alunos: Este é o array ou lista de dados que será exibido na ListView. O ArrayAdapter irá percorrer esse array e exibir cada item na ListView de acordo com o layout fornecido.

>Identificar view por identificador - Vincular dados à um view
ListView listaDeAlunos = findViewById(R.id.activity_main_list_view_alunos);

>Dependência para floating action button
implementation  ("com.android.support:design:28.0.0")
//Havia usado, mas na biblioteca Android X não é mais necessário, pois já tem equivalente, por meio da dependência material

<!-- android:src="@drawable/ic_add" -->

>Descrição para botão, floating action button:
android:contentDescription="@string/fab_adicionar_descricao" 
//No xml do layout se adiciona o código dentro do botão. Em values/string.xml se adiciona algo como o seguinte:
<string name="fab_adicionar_descricao">Adicionar</string>
//Isto, é devido a referência do valor ser carregada pelo arquivo string.xml