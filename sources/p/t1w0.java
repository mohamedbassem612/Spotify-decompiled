package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t1w0 extends h2w0 {
    public final String a;
    public final int b;
    public final String c;
    public final tv80 d;

    public t1w0(int i, String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1w0)) {
            return false;
        }
        t1w0 t1w0Var = (t1w0) obj;
        return this.a.equals(t1w0Var.a) && this.b == t1w0Var.b && this.c.equals(t1w0Var.c) && u890.j(this.d, t1w0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        tv80 tv80Var = this.d;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
