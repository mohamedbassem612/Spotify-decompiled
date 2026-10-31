package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lbj1 {
    public final String a;
    public final jbj1 b;
    public final kbj1 c;
    public final iac0 d;

    public lbj1(String str, jbj1 jbj1Var, kbj1 kbj1Var, iac0 iac0Var) {
        this.a = str;
        this.b = jbj1Var;
        this.c = kbj1Var;
        this.d = iac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbj1)) {
            return false;
        }
        lbj1 lbj1Var = (lbj1) obj;
        return this.a.equals(lbj1Var.a) && this.b.equals(lbj1Var.b) && this.c.equals(lbj1Var.c) && this.d.equals(lbj1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
