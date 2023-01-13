import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import java.util.*;

public class Mechanic <M extends transport>{
    protected String mecName;
    protected String mecSurname;
    protected String company;
    //вот тут мап

    private static Map<Mechanic, Set<transport>> serviceMachin = new HashMap<>();

    public static String getServiceMachin() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Mechanic, Set<transport>> mechanicSetEntry : serviceMachin.entrySet()) {
            builder.append(mechanicSetEntry.getKey().getMecName()).append("-->");
            for (transport value : mechanicSetEntry.getValue()) {
                builder.append(value.getModel());
            }
        }
        return builder.toString();
    }
    public Mechanic(String mecName, String mecSurname, String company) {
        this.mecName = mecName;
        this.mecSurname = mecSurname;
        this.company = company;


    }
    public void SerTr (M avto) {
        Set<transport> transportSet = serviceMachin.getOrDefault(this, new HashSet<>());
        transportSet.add(avto);
        serviceMachin.put(this,transportSet);

    }

    public String getMecName() {
        return mecName;
    }

    public String getMecSurname() {
        return mecSurname;
    }

    public String getCompany() {
        return company;
    }



    @Override
    public String toString() {
        return "Mechanic{" +
                "mecName='" + mecName + '\'' +
                ", mecSurname='" + mecSurname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public boolean diagnostika(M m) {
        return m.diagostika();
    }
    public void fixed(M m) {
        m.fixed();

    }
}
