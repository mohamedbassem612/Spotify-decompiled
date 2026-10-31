package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fnf1 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final iyf1 d;

    public fnf1(String str, d8r0 d8r0Var, int i, iyf1 iyf1Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = iyf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnf1)) {
            return false;
        }
        fnf1 fnf1Var = (fnf1) obj;
        return this.a.equals(fnf1Var.a) && this.b.equals(fnf1Var.b) && this.c == fnf1Var.c && this.d.equals(fnf1Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
