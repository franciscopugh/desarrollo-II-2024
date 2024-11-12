package proyectoPokemon;

public abstract class Pokemon {
	private String nombre;
	private int nivel;
	private int vida;
	private int ataque;
	private int experiencia;
	private String estado;
	private String tipo;
	private int experienciaPorNivel = 100;

    public Pokemon(String nombre, int nivel, int vida, int ataque, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida * nivel;
        this.ataque = ataque * nivel;
        this.tipo = tipo;
        this.estado = "Normal";
        this.experiencia = 0;
        
    }

    public void recibirDaño(int daño) {
        this.vida -= daño; 
        
        if (getVida() <= 0) {
        	System.out.println(getNombre() + " recibió " + daño + " puntos de daño y ha sido derrotado");
        } else {
        	System.out.println(getNombre() + " recibió " + daño + " puntos de daño. Vida restante: " + getVida());
        }
    }

    public void ataqueBase(Pokemon enemigo) {
        System.out.println(getNombre() + " usa ataque base.");
        enemigo.recibirDaño(getAtaque());
    }
    
    public void ganarExperiencia(int puntos) {
        experiencia += puntos;
        System.out.println(nombre + " ha ganado " + puntos + " puntos de experiencia.");

        // Calcular cuántos niveles pueden subirse
        int nivelesSubidos = getExperiencia() / experienciaPorNivel;

        // Si se pueden subir niveles, se llama al método para subir de nivel
        for (int i = 0; i < nivelesSubidos; i++) {
            subirNivel();
        }
    }

    private void subirNivel() {
        nivel++;
        experiencia -= experienciaPorNivel; // Restamos la experiencia necesaria para subir de nivel
        System.out.println(getNombre() + " ha subido al nivel " + getNivel());

        vida += vida * 2; 
        ataque += ataque * 2; 

        System.out.println("Los atributos vida y ataque base de " + getNombre() + " han aumentado el doble");
   
    }
    
    public boolean estaVivo() {
    	return getVida() > 0;
    }
    
    public abstract void atacar(Pokemon enemigo, String ataque);
    
    public abstract String elegirAtaque();
    
    public abstract void aplicarEfecto(Pokemon enemigo, int probabilidad);
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getExperiencia() {
        return experiencia;
    }

    public void setTipo(int experiencia) {
        this.experiencia = experiencia;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
	
}