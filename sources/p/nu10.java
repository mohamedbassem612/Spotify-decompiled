package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nu10 implements rv10 {
    public final uv10 a;

    public nu10(uv10 uv10Var) {
        this.a = uv10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nu10) && u890.j(this.a, ((nu10) obj).a);
    }

    public final int hashCode() {
        uv10 uv10Var = this.a;
        if (uv10Var == null) {
            return 0;
        }
        return uv10Var.hashCode();
    }
}
