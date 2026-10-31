package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xlf1 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final plf1 c;

    public xlf1(String str, d8r0 d8r0Var, plf1 plf1Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = plf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlf1)) {
            return false;
        }
        xlf1 xlf1Var = (xlf1) obj;
        return this.a.equals(xlf1Var.a) && this.b.equals(xlf1Var.b) && this.c.equals(xlf1Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
