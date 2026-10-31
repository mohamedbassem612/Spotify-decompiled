package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tcf1 {
    public final int a;
    public final tob1 b;
    public final tob1 c;
    public final tob1 d;
    public final tob1 e;
    public final tob1 f;
    public final tob1 g;

    public tcf1(int i, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, tob1 tob1Var) {
        this.a = i;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.e = ven0Var4;
        this.f = ven0Var5;
        this.g = tob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcf1)) {
            return false;
        }
        tcf1 tcf1Var = (tcf1) obj;
        return this.a == tcf1Var.a && this.b.equals(tcf1Var.b) && this.c.equals(tcf1Var.c) && this.d.equals(tcf1Var.d) && this.e.equals(tcf1Var.e) && this.f.equals(tcf1Var.f) && u890.j(this.g, tcf1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
