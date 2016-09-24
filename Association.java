
/**
 * Clase Asociation, se tomo como referncia la clase de la pagina
 * https://github.com/sliuu/post_script/blob/master/structure5/Association.java
 */
import java.util.Map;



public class Association<K,V> implements Map.Entry<K,V>
{

    protected K tKey; 
    protected V tValor; 
    
    public Association(K key, V valor)
    {
        tKey = key;
        tValor = valor;
    }

 
    public Association(K key)
    {
        this(key,null);
    }


    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }
    

    public int hashCode()
    {
        return getKey().hashCode();
    }
    

    public V getValue()
    {
        return tValor;
    }


    public K getKey()
    {
        return tKey;
    }


    public V setValue(V value)
    {
        V oldValue = tValor;
        tValor = value;
        return oldValue;
    }


    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }

}