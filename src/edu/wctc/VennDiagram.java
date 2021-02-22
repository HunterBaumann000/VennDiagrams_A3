package edu.wctc;
import java.util.*;

public class VennDiagram<T> {
    String label1;
    String label2;
    String label3;

    Set<T> first;
    Set<T> second;
    Set<T> third;

    public VennDiagram(String label1, String label2, String label3) {
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
    }

    private String getCircleForLabel(String label) {
        if (label1.equals(label))
        {
            return label1;
        }
        else if (label2.equals(label))
        {
            return label2;
        }
        else if(label3.equals(label))
        {
            return label3;
        }

    }

    public void add(T item, String... labels) {
        for (item : labels) {
            if (label1 != null) {
                first.add(item);
            }
            if (label2 != null) {
                second.add(item);
            }
            if (label2 != null) {
                third.add(item);
            }
        }
    }

    public Set<T> unionOf(String first, String second) {
        Set<String> union = new HashSet<>(first);
        union.addAll(second);

        return union;
    }

    public Set<T> intersectionOf(String first, String second) {
        Set<String> interSection = new HashSet<>(first);
        interSection.retainAll(second);

        return interSection;
    }

    public Set<T> complementOf(String first, String second) {
        Set<String> complement = new HashSet<>(first);
        complement.removeAll(second);

        return complement;
    }

    public Set<T> diagramCenter() {
        Set<String> center = new HashSet<>(first);
        center.retainAll(second);
        center.retainAll(third);

        return center;
    }

    public Set<T> exclusiveIntersectionOf(String first, String second, String third) {
        Set<String> exclusiveInterSection = new HashSet<>(first);
        exclusiveInterSection.retainAll(second);
        exclusiveInterSection.removeAll(third);

        return exclusiveInterSection;
    }

}
