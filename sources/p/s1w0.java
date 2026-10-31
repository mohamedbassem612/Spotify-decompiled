package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s1w0 extends h2w0 {
    public final String a;
    public final boolean b;
    public final tv80 c;

    public s1w0(String str, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1w0)) {
            return false;
        }
        s1w0 s1w0Var = (s1w0) obj;
        return u890.j(this.a, s1w0Var.a) && this.b == s1w0Var.b && u890.j(this.c, s1w0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
