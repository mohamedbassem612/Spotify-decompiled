package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dg7 {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final sfu0 h;
    public final me7 i;
    public final sd7 j;

    public dg7(boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, boolean z6, sfu0 sfu0Var, me7 me7Var, sd7 sd7Var) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = sfu0Var;
        this.i = me7Var;
        this.j = sd7Var;
    }

    public static dg7 a(dg7 dg7Var, boolean z, boolean z2, ArrayList arrayList, boolean z3, boolean z4, boolean z5, boolean z6, sfu0 sfu0Var, sd7 sd7Var, int i) {
        if ((i & 1) != 0) {
            z = dg7Var.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = dg7Var.b;
        }
        boolean z8 = z2;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = dg7Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z3 = dg7Var.d;
        }
        return new dg7(z7, z8, list2, z3, (i & 16) != 0 ? dg7Var.e : z4, (i & 32) != 0 ? dg7Var.f : z5, (i & 64) != 0 ? dg7Var.g : z6, (i & 128) != 0 ? dg7Var.h : sfu0Var, dg7Var.i, (i & 512) != 0 ? dg7Var.j : sd7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg7)) {
            return false;
        }
        dg7 dg7Var = (dg7) obj;
        return this.a == dg7Var.a && this.b == dg7Var.b && u890.j(this.c, dg7Var.c) && this.d == dg7Var.d && this.e == dg7Var.e && this.f == dg7Var.f && this.g == dg7Var.g && u890.j(this.h, dg7Var.h) && this.i == dg7Var.i && this.j.equals(dg7Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31);
    }
}
