package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jr11 implements kr11 {
    public final id2 a;

    public jr11(id2 id2Var) {
        this.a = id2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr11) && u890.j(this.a, ((jr11) obj).a);
    }

    public final int hashCode() {
        id2 id2Var = this.a;
        if (id2Var == null) {
            return 0;
        }
        return id2Var.hashCode();
    }
}
