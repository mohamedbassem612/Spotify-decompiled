package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qnr0 implements dbr0 {
    public final pnr0 a;

    public qnr0(pnr0 pnr0Var) {
        this.a = pnr0Var;
    }

    public final pnr0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnr0) && this.a.equals(((qnr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
