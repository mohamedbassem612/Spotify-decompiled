package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pxi1 extends sxi1 {
    public final p5k a;
    public final int b;

    public pxi1(p5k p5kVar, int i) {
        this.a = p5kVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxi1)) {
            return false;
        }
        pxi1 pxi1Var = (pxi1) obj;
        return u890.j(this.a, pxi1Var.a) && this.b == pxi1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
