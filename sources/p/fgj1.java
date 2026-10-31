package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fgj1 {
    public final ufj1 a;

    public fgj1(ufj1 ufj1Var) {
        this.a = ufj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgj1) && this.a.equals(((fgj1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
