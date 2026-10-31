package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vym implements wym {
    public final xlk1 a;

    public vym(xlk1 xlk1Var) {
        this.a = xlk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vym) && this.a == ((vym) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
