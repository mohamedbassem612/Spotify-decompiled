package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l93 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final tf3 d;

    public l93(String str, d8r0 d8r0Var, int i, tf3 tf3Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = tf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l93)) {
            return false;
        }
        l93 l93Var = (l93) obj;
        return this.a.equals(l93Var.a) && this.b.equals(l93Var.b) && this.c == l93Var.c && this.d.equals(l93Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
