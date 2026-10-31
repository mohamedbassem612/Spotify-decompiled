package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aq3 extends hr3 {
    public final String a;
    public final String b;
    public final n6c0 c;
    public final tv80 d;

    public aq3(String str, String str2, n6c0 n6c0Var, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = n6c0Var;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3)) {
            return false;
        }
        aq3 aq3Var = (aq3) obj;
        return u890.j(this.a, aq3Var.a) && this.b.equals(aq3Var.b) && u890.j(this.c, aq3Var.c) && this.d.equals(aq3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
