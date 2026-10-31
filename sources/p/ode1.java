package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ode1 {
    public final nde1 a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final fde1 f;
    public final List g;
    public final String h;

    public ode1(nde1 nde1Var, List list, List list2, boolean z, int i, fde1 fde1Var, List list3, String str) {
        this.a = nde1Var;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = i;
        this.f = fde1Var;
        this.g = list3;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ode1)) {
            return false;
        }
        ode1 ode1Var = (ode1) obj;
        return this.a.equals(ode1Var.a) && u890.j(this.b, ode1Var.b) && u890.j(this.c, ode1Var.c) && this.d == ode1Var.d && this.e == ode1Var.e && this.f == ode1Var.f && u890.j(this.g, ode1Var.g) && u890.j(this.h, ode1Var.h);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, xcg1.g(f4i1.b(f4i1.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        fde1 fde1Var = this.f;
        int iB = f4i1.b((iF + (fde1Var == null ? 0 : fde1Var.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return iB + (str != null ? str.hashCode() : 0);
    }
}
