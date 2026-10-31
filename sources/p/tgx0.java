package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tgx0 {
    public final iix0 a;

    public tgx0(iix0 iix0Var) {
        this.a = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgx0) && this.a.equals(((tgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
