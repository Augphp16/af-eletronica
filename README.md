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
