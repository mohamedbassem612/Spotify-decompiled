package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9n0 {
    public final z8n0 a;
    public final y2u0 b;

    public b9n0(z8n0 z8n0Var, y2u0 y2u0Var) {
        this.a = z8n0Var;
        this.b = y2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9n0)) {
            return false;
        }
        b9n0 b9n0Var = (b9n0) obj;
        return this.a.equals(b9n0Var.a) && u890.j(this.b, b9n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
