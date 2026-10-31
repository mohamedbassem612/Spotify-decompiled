package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ac41 {
    public final dd8 a;

    public ac41(dd8 dd8Var) {
        this.a = dd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac41) && u890.j(this.a, ((ac41) obj).a);
    }

    public final int hashCode() {
        dd8 dd8Var = this.a;
        if (dd8Var == null) {
            return 0;
        }
        return dd8Var.a.hashCode();
    }
}
