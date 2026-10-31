package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gbh0 {
    public final dd8 a;

    public gbh0(dd8 dd8Var) {
        this.a = dd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbh0) && u890.j(this.a, ((gbh0) obj).a);
    }

    public final int hashCode() {
        dd8 dd8Var = this.a;
        if (dd8Var == null) {
            return 0;
        }
        return dd8Var.a.hashCode();
    }
}
