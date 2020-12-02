package com.lmelo.algafood.di.notificacao;

import com.lmelo.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}