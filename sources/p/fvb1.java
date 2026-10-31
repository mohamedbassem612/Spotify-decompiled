package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fvb1 {
    public final String a;
    public final int b;
    public final db30 c;
    public final mhm0 d;
    public final List e;
    public final boolean f;
    public final vzq0 g;

    public fvb1(String str, int i, db30 db30Var, mhm0 mhm0Var, List list, boolean z) {
        zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
        this.a = str;
        this.b = i;
        this.c = db30Var;
        this.d = mhm0Var;
        this.e = list;
        this.f = z;
        this.g = zzq0VarH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvb1)) {
            return false;
        }
        fvb1 fvb1Var = (fvb1) obj;
        return this.a.equals(fvb1Var.a) && this.b == fvb1Var.b && u890.j(this.c, fvb1Var.c) && u890.j(this.d, fvb1Var.d) && u890.j(this.e, fvb1Var.e) && this.f == fvb1Var.f && this.g.equals(fvb1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(f4i1.b((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }
}
