class Pesquisa {

    public Nodo sequencial(Nodo[] lista, int key) {
        Nodo result = null;

        for(int i = 0; i < lista.length; i++) {
            Nodo currentNode = lista[i];

            if(currentNode.getNumber() > key) {
                break;
            }
            if(currentNode.getNumber() == key) {
                result = currentNode;
                break;
            }
        }
        return result;
    }

    public Nodo binaria(Nodo[] lista, int key) {
        int esq = 0;
        int dir = lista.length -1;
        int meio = (esq + dir)/2;
        Nodo result = null;

        while (esq <= dir) {
            if (key == lista[meio].getNumber()) {
                result = lista[meio];
                break;
            } else if (key < lista[meio].getNumber()) {
                dir = meio - 1;
                meio = (esq + dir)/2;
            } else {
                esq = meio + 1;
                meio = (esq + dir)/2;
            }
        }
        return result;
    }
    
    public Nodo binariaRecursiva(Nodo[] lista, int key) {
    	int dir = lista.length - 1;
    	
    	return binariaRecursiva(lista, key, 0, dir);
	}
    
    private Nodo binariaRecursiva(Nodo[] lista, int key, int esq, int dir) {
    	
    	int meio = (esq + dir)/2;
    	
    	if (esq > dir) {
			return null;
		} else if (lista[meio].getNumber() == key) {
			return lista[meio];
		} else if (key < lista[meio].getNumber()) {
			dir = meio - 1;
			meio = (esq + dir)/2;
			
			return this.binariaRecursiva(lista, key, esq, dir);
		} else {
			esq = meio + 1;
			meio = (esq + dir)/2;
			
			return this.binariaRecursiva(lista, key, esq, dir);
		}
    	
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}