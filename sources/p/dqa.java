package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dqa extends iqa {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final llw0 e;
    public final String f;
    public final List g;
    public final cuu0 h;

    public dqa(String str, String str2, String str3, int i, llw0 llw0Var, String str4, List list, cuu0 cuu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = llw0Var;
        this.f = str4;
        this.g = list;
        this.h = cuu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqa)) {
            return false;
        }
        dqa dqaVar = (dqa) obj;
        return u890.j(this.a, dqaVar.a) && u890.j(this.b, dqaVar.b) && u890.j(this.c, dqaVar.c) && this.d == dqaVar.d && u890.j(this.e, dqaVar.e) && u890.j(this.f, dqaVar.f) && this.g.equals(dqaVar.g) && u890.j(this.h, dqaVar.h);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d((this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f), 31, this.g);
        cuu0 cuu0Var = this.h;
        return iB + (cuu0Var == null ? 0 : cuu0Var.hashCode());
    }
}
