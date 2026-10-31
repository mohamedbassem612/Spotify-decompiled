package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lnj0 extends snj0 {
    public final afv0 b;

    public lnj0(afv0 afv0Var) {
        super(false);
        this.b = afv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnj0) && u890.j(this.b, ((lnj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
