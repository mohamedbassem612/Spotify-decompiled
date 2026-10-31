package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h7g0 {
    public final String a;
    public final String b;
    public final iyr0 c;
    public final i7g0 d;
    public final smc0 e;
    public final boolean f;
    public final ArrayList g;
    public final ArrayList h;

    public h7g0(String str, String str2, iyr0 iyr0Var, i7g0 i7g0Var, smc0 smc0Var, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = iyr0Var;
        this.d = i7g0Var;
        this.e = smc0Var;
        this.f = z;
        this.g = arrayList;
        this.h = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7g0)) {
            return false;
        }
        h7g0 h7g0Var = (h7g0) obj;
        return u890.j(this.a, h7g0Var.a) && u890.j(this.b, h7g0Var.b) && this.c == h7g0Var.c && this.d == h7g0Var.d && this.e.equals(h7g0Var.e) && this.f == h7g0Var.f && this.g.equals(h7g0Var.g) && this.h.equals(h7g0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + p3d1.f(this.g, xcg1.g((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f), 31);
    }
}
