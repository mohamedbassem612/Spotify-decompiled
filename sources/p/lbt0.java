package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lbt0 {
    public final d7t0 a;
    public final nk b;
    public final Map c;
    public final String d;
    public final String e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final kvm0 j;

    public lbt0(d7t0 d7t0Var, nk nkVar, Map map, String str, String str2, List list, boolean z, boolean z2, boolean z3, kvm0 kvm0Var) {
        this.a = d7t0Var;
        this.b = nkVar;
        this.c = map;
        this.d = str;
        this.e = str2;
        this.f = list;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = kvm0Var;
    }

    public static lbt0 a(lbt0 lbt0Var, boolean z, boolean z2, int i) {
        d7t0 d7t0Var = lbt0Var.a;
        nk nkVar = lbt0Var.b;
        Map map = lbt0Var.c;
        String str = lbt0Var.d;
        String str2 = lbt0Var.e;
        List list = lbt0Var.f;
        if ((i & 256) != 0) {
            z2 = lbt0Var.h;
        }
        return new lbt0(d7t0Var, nkVar, map, str, str2, list, z, z2, lbt0Var.i, lbt0Var.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbt0)) {
            return false;
        }
        lbt0 lbt0Var = (lbt0) obj;
        return this.a.equals(lbt0Var.a) && this.b.equals(lbt0Var.b) && this.c.equals(lbt0Var.c) && this.d.equals(lbt0Var.d) && this.e.equals(lbt0Var.e) && u890.j(this.f, lbt0Var.f) && this.g == lbt0Var.g && this.h == lbt0Var.h && this.i == lbt0Var.i && u890.j(this.j, lbt0Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(cy30.d(cy30.d(cy30.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, false), 31, this.g), 31, this.h), 31, this.i);
        kvm0 kvm0Var = this.j;
        return iG + (kvm0Var != null ? kvm0Var.hashCode() : 0);
    }
}
