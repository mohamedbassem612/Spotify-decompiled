package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l2g1 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final d2g1 c;

    public l2g1(String str, d8r0 d8r0Var, d2g1 d2g1Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = d2g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2g1)) {
            return false;
        }
        l2g1 l2g1Var = (l2g1) obj;
        return this.a.equals(l2g1Var.a) && this.b.equals(l2g1Var.b) && this.c.equals(l2g1Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
