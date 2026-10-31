package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lh11 {
    public final hh11 a;

    public lh11(hh11 hh11Var) {
        this.a = hh11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh11) && this.a.equals(((lh11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
