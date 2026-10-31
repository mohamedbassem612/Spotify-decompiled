package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qt30 extends ut30 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final llw0 e;
    public final List f;
    public final cuu0 g;

    public qt30(String str, String str2, String str3, int i, llw0 llw0Var, List list, cuu0 cuu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = llw0Var;
        this.f = list;
        this.g = cuu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt30)) {
            return false;
        }
        qt30 qt30Var = (qt30) obj;
        return u890.j(this.a, qt30Var.a) && u890.j(this.b, qt30Var.b) && u890.j(this.c, qt30Var.c) && this.d == qt30Var.d && this.e.equals(qt30Var.e) && this.f.equals(qt30Var.f) && u890.j(this.g, qt30Var.g);
    }

    public final int hashCode() {
        int iB = f4i1.b((this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f);
        cuu0 cuu0Var = this.g;
        return iB + (cuu0Var == null ? 0 : cuu0Var.hashCode());
    }
}
