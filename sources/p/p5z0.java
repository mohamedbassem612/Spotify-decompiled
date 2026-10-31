package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p5z0 extends ajo1 {
    public final dn90 d;

    public p5z0(dn90 dn90Var) {
        this.d = dn90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5z0) && this.d.equals(((p5z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
