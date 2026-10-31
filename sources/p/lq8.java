package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lq8 implements oq8 {
    public final jm70 a;

    public lq8(jm70 jm70Var) {
        this.a = jm70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq8) && u890.j(this.a, ((lq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
