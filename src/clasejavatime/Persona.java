
package clasejavatime;

/**
 *
 * @author Miguel
 */
public class Persona {
    private String first_name;
    private String last_name;
    private String mother_last_name;

    public Persona(String first_name, String last_name, String mother_last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.mother_last_name = mother_last_name;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the mother_last_name
     */
    public String getMother_last_name() {
        return mother_last_name;
    }

    /**
     * @param mother_last_name the mother_last_name to set
     */
    public void setMother_last_name(String mother_last_name) {
        this.mother_last_name = mother_last_name;
    }

    @Override
    public String toString() {
        return "Persona{" + "first_name=" + first_name + ", last_name=" + last_name + ", mother_last_name=" + mother_last_name + '}';
    }
    
    
    
}
