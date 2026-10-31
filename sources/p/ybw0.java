package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ybw0 implements pcw0 {
    public final String a;
    public final long b;
    public final tv80 c;

    public ybw0(long j, String str, tv80 tv80Var) {
        this.a = str;
        this.b = j;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybw0)) {
            return false;
        }
        ybw0 ybw0Var = (ybw0) obj;
        return this.a.equals(ybw0Var.a) && this.b == ybw0Var.b && u890.j(this.c, ybw0Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        tv80 tv80Var = this.c;
        return iF + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
