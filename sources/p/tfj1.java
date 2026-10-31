package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tfj1 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final pfj1 c;

    public tfj1(String str, d8r0 d8r0Var, pfj1 pfj1Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = pfj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfj1)) {
            return false;
        }
        tfj1 tfj1Var = (tfj1) obj;
        return this.a.equals(tfj1Var.a) && this.b.equals(tfj1Var.b) && this.c.equals(tfj1Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
