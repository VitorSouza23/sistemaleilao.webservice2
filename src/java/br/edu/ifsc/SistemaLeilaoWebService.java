/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import produto.Produto;

/**
 *
 * @author Vitor
 */
@WebService(serviceName = "SistemaLeilaoWebService")
public class SistemaLeilaoWebService {

    /**
     * Operação de Web service
     * @return 
     */
    @WebMethod(operationName = "obterTodosOsProdutos")
    public List<Produto> obterTodosOsProdutos() {
        List<Produto> listaProdutos = new ArrayList<>();
        
        Produto produto = new Produto("Negocio de um bagulho muito doido", "Jureg", 10, true);
        listaProdutos.add(produto);
        produto = new Produto("Margelino", "Magbaldo", 20, true);
        listaProdutos.add(produto);
        produto = new Produto("Gureice", "Potatoe", 30, true);
        listaProdutos.add(produto);
        produto = new Produto("Tula Luana", "Clodovil", 40, true);
        listaProdutos.add(produto);
        produto = new Produto("Não vai ter copa", "Xablau", 50, true);
        listaProdutos.add(produto);
        return listaProdutos;
    }
}
