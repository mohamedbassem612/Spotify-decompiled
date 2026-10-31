package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dyd0 implements azd0 {
    public final String a;
    public final boolean b;
    public final tv80 c;

    public dyd0(String str, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyd0)) {
            return false;
        }
        dyd0 dyd0Var = (dyd0) obj;
        return this.a.equals(dyd0Var.a) && this.b == dyd0Var.b && u890.j(this.c, dyd0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
