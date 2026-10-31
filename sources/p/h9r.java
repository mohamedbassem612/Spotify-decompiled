package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h9r extends i9r {
    public final j851 a;

    public h9r(j851 j851Var) {
        this.a = j851Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9r) && u890.j(this.a, ((h9r) obj).a);
    }

    public final int hashCode() {
        j851 j851Var = this.a;
        if (j851Var == null) {
            return 0;
        }
        return j851Var.hashCode();
    }
}
