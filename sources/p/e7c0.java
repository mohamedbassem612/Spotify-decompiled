package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e7c0 {
    public final b7c0 a;
    public final lax b;

    public e7c0(b7c0 b7c0Var, lax laxVar) {
        this.a = b7c0Var;
        this.b = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7c0)) {
            return false;
        }
        e7c0 e7c0Var = (e7c0) obj;
        return this.a == e7c0Var.a && this.b.equals(e7c0Var.b);
    }

    public final int hashCode() {
        b7c0 b7c0Var = this.a;
        return this.b.hashCode() + ((b7c0Var == null ? 0 : b7c0Var.hashCode()) * 31);
    }
}
