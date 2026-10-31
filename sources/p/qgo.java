package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qgo implements piw {
    public final String a;
    public final boolean b;
    public final tv80 c;

    public qgo(String str, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgo)) {
            return false;
        }
        qgo qgoVar = (qgo) obj;
        return u890.j(this.a, qgoVar.a) && this.b == qgoVar.b && u890.j(this.c, qgoVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
