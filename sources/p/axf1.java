package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class axf1 {
    public final String a;
    public final boolean b;
    public final cky c;
    public final uez0 d;

    public axf1(String str, boolean z, cky ckyVar, uez0 uez0Var) {
        this.a = str;
        this.b = z;
        this.c = ckyVar;
        this.d = uez0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axf1)) {
            return false;
        }
        axf1 axf1Var = (axf1) obj;
        return u890.j(this.a, axf1Var.a) && this.b == axf1Var.b && this.c.equals(axf1Var.c) && this.d.equals(axf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
