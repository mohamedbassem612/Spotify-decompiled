package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class un8 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final pn8 c;

    public un8(String str, d8r0 d8r0Var, pn8 pn8Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = pn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un8)) {
            return false;
        }
        un8 un8Var = (un8) obj;
        return this.a.equals(un8Var.a) && this.b.equals(un8Var.b) && this.c.equals(un8Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
