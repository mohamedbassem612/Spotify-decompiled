package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c98 implements ez00 {
    public final x88 a;

    public c98(x88 x88Var) {
        this.a = x88Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c98) && this.a.equals(((c98) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
