package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vsi1 {
    public final ysi1 a;

    public vsi1(ysi1 ysi1Var) {
        this.a = ysi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsi1) && this.a.equals(((vsi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
