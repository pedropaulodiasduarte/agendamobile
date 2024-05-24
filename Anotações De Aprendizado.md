Criei empty view activity posteriormente, para tela de formulário
Aqui usei empty view activity, que criou também o arquivo xml de layout;

Comentários de Códigos:



Arquivo: activity.main.java

Em vez de usar classe Activity, trocou para AppCompatActivity, para adicionar o app bar

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
//this - Neste con                      o, "this" se refere à instância da classe atual, ou seja, à Activity em que o código está sendo executado. Ele é usado para fornecer o contexto da Activity para o ArrayAdapter
        //android.R.    t.simple_list_item_1: Este é o layout padrão fornecido pelo Android para exibir um único item em uma lista. Ele é usado para definir como cada item da lista será exibido na ListView. Aqui pode criar um layout, mas o Android já disponibiliza. Este argumento espera um resource do tipo int
        //alunos: Este é o array ou lista de dados que será exibido na ListView. O ArrayAdapter irá percorrer esse array e exibir cada item na ListView de acordo com o layout fornecido.

>Identificar view por identificador - Vincular dados à um view
ListView listaDeAlunos = findViewById(R.id.activity_main_list_view_alunos);

Arquivo 

>Dependência para floating action button
implementation  ("com.android.support:design:28.0.0")
//Havia usado, mas na biblioteca Android X não é mais necessário, pois já tem equivalente, por meio da dependência material

Arquivo de layout:

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
//tipo de layout, moderno

Aqui se usa namespace android e app

>XMLNS 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//xmlns é um namespace que define como os atributos e elementos do xml se comportará quando antes do atributo tiver "android:";

>Altura e largura, atributos de ocupação, medidas na tela:

    android:orientation="vertical"  <!-- Define se o layout será vertical ou horizontal -->
    android:gravity="center"       <!-- Centraliza o conteúdo dentro do LinearLayout -->
    android:padding="16dp">        <!-- Adiciona um padding ao redor do LinearLayout -->

android:layout_width="match_parent"
android:layout_height="match_parent">
width: largura
height: altura
match_parent: Atingir o tamanho total do pai


    <ListView
        android:id="@+id/activity_main_list_view_alunos"
        android:layout_width="match_parent"
        //Cresce conforme o tamanho do objeto pai, devido usar match_parent
        android:layout_height="match_parent"
        android:layout_alignParentTop="true"
        android:layout_alignParentStart="true" />


>Floating Action Button
.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fabAdicionar"
        //identificador do fab
        android:src="@drawable/ic_action_novo_aluno"
        //Atributo para adicionar ícone
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        //wrap_content: tamanho é definido de acordo o conteúdo dentro do componente
        android:layout_alignParentBottom="true"
        //Botão fica na parte inferior da tela. Pode se usar "top" para fica superior
        android:layout_alignParentTop="true"
        android:layout_margin="16dp" 
        /*Usar dp no lugar de px. DP: Densidade por pixel, se adequa melhor nos dispositivos por causa da variedade de tamanhos de tela. O margin, por padrões de design definido na biblioteca material, se deixa 16dp; Automaticamente, ele se posiciona 16dp em relação ao lado direito e a parte inferior; */
            android:clickable="true"
            //Dá efeito de ondas ao clicar no botão
android:focusable="true"
//Emite visualmente um focu quando navega via teclado
        android:contentDescription="@string/fab_adicionar_descricao" 
        //Adiciona descrição para leitores de tela ao botão
        app:fabSize="normal"/>
        //Define tamanho do fab, tendo como atributo: mini, normal e auto. Auto = automático
/*No fab, não precisa usar o atributo: android:layout_width="wrap_content" e android:layout_height="wrap_content", as vezes melhor usar fabSize*/


>Descrição para botão, floating action button:
android:contentDescription="@string/fab_adicionar_descricao" 
//No xml do layout se adiciona o código dentro do botão. Em values/string.xml se adiciona algo como o seguinte:
<string name="fab_adicionar_descricao">Adicionar</string>
//Isto, é devido a referência do valor ser carregada pelo arquivo string.xml
