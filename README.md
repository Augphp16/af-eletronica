<h1>API REST PARA ASSISTÊNCIA TÉCNICA DE APARELHOS ELETRÔNICOS</h1>

<h2>Tecnologias utilizadas:</h2>
<ul>
    <li>Java</li>
    <li>SpringBoot</li>
    <li>MySQL</li>
</ul>

<h2>Descrição</h2>

<p>
    Aplicação back end para gerenciamento de dados de clientes e equipamentos eletrônicos para dar reparo.
    <a>
        O app recolhe os dados do cliente e do respectivo aparelho que o cliente deixou para orçamento.
    </a>
    <a>
        Os atributos para o cliente são: id, nome, telefone e endereço. Todos os atributos são obrigatórios.
    </a>    
    <a>
        Já para o aparelho os atributos são: nome, marca, sintomas, obs, diagnóstico, orçamento, data de entrada e data de saída. Os atributos nome, marca, sintomas e data de entrada são obrigatórios.
    </a>
</p>

<p>Relacionamento entre entidades usado foi o OneToMany.</p>

<h2>Testes:</h2>

<hr>

<p>
    <h4>Cadastrando aparelho</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (4).png">
</p>

<hr>

<p>
    <h4>Validação dos dados do aparelho</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (3).png">
</p>

<hr>

<p>
    <h4>Listando aparelhos cadastrados</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (5).png">
</p>

<hr>

<p>
    <h4>Cadastrando clientes</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (7).png">
</p>

<hr>

<p>
    <h4>Validação dos dados do cliente</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (6).png">
</p>

<hr>

<p>
    <h4>Listando clientes e seus aparelhos</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (8).png">
</p>

<hr>

<p>
    <h4>Atualização do status de serviço do aparelho</h4>
    <img src="./src/main/resources/static/img/Captura de Tela (9).png">
</p>



