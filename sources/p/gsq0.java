package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gsq0 {
    public final iix0 a;

    public gsq0(iix0 iix0Var) {
        this.a = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsq0) && this.a.equals(((gsq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
