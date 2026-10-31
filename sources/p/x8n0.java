package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x8n0 {
    public final y2u0 a;

    public x8n0(y2u0 y2u0Var) {
        this.a = y2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8n0) && u890.j(this.a, ((x8n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
