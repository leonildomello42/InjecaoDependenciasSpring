# Injeção de dependência e @Autowired
##### No Spring as formas mais comum de injeção de depedências se dão:


```Java
/* No construtor: */
	@Autowired
	public AtivacaoClienteService(Notificador notificador) {
	    this.notificador = notificador;
	}
```
```Java
/* No  método Set():*/
	@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
```

```Java
/* No atibuto: /*
	@Autowired
	private Notificador notificador;
```
### As formas mais comum são no construtor e no atributo(AtivacaoClienteService.java).
