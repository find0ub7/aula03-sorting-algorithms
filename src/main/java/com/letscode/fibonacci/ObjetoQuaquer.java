package com.letscode.fibonacci;

import java.util.Objects;

public class ObjetoQuaquer implements Comparable<ObjetoQuaquer> {

    private int id;
    private String qualquer;

    public ObjetoQuaquer(int id, String qualquer) {
        this.id = id;
        this.qualquer = qualquer;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoQuaquer that = (ObjetoQuaquer) o;
        return id == that.id && Objects.equals(qualquer, that.qualquer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qualquer);
    }

    @Override
    public String toString() {
        return "ObjetoQuaquer{" +
                "id=" + id +
                ", qualquer='" + qualquer + '\'' +
                '}';
    }

    @Override
    public int compareTo(ObjetoQuaquer o) {
        return id - o.getId();
    }
}
