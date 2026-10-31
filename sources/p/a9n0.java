package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9n0 {
    public final z8n0 a;

    public a9n0(z8n0 z8n0Var) {
        this.a = z8n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9n0) && this.a.equals(((a9n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
