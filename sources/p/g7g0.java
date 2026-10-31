package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g7g0 {
    public final String a;
    public final iyr0 b;
    public final i7g0 c;
    public final boolean d;
    public final boolean e;
    public final ArrayList f;
    public final boolean g;
    public final boolean h;
    public final ArrayList i;

    public g7g0(String str, iyr0 iyr0Var, i7g0 i7g0Var, boolean z, boolean z2, ArrayList arrayList, boolean z3, boolean z4, ArrayList arrayList2) {
        this.a = str;
        this.b = iyr0Var;
        this.c = i7g0Var;
        this.d = z;
        this.e = z2;
        this.f = arrayList;
        this.g = z3;
        this.h = z4;
        this.i = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7g0)) {
            return false;
        }
        g7g0 g7g0Var = (g7g0) obj;
        return u890.j(this.a, g7g0Var.a) && this.b == g7g0Var.b && this.c == g7g0Var.c && this.d == g7g0Var.d && this.e == g7g0Var.e && this.f.equals(g7g0Var.f) && this.g == g7g0Var.g && this.h == g7g0Var.h && this.i.equals(g7g0Var.i);
    }

    public final int hashCode() {
        return Integer.hashCode(2131958080) + kaa0.f(2131958081, kaa0.f(2131958063, kaa0.f(2131958064, p3d1.f(this.i, xcg1.g(xcg1.g(p3d1.f(this.f, xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31), 31), 31), 31);
    }
}
