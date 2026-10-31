package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zv31 {
    public final String a;
    public final uzd1 b;
    public final qk70 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final List h;
    public final List i;
    public final Object j;

    public zv31(String str, uzd1 uzd1Var, qk70 qk70Var, boolean z, boolean z2, List list, List list2, ArrayList arrayList, Object obj, int i) {
        boolean z3 = (i & 32) == 0;
        list = (i & 64) != 0 ? z6x.a : list;
        list2 = (i & 128) != 0 ? null : list2;
        arrayList = (i & 256) != 0 ? null : arrayList;
        this.a = str;
        this.b = uzd1Var;
        this.c = qk70Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = list;
        this.h = list2;
        this.i = arrayList;
        this.j = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv31)) {
            return false;
        }
        zv31 zv31Var = (zv31) obj;
        return u890.j(this.a, zv31Var.a) && this.b.equals(zv31Var.b) && this.c.equals(zv31Var.c) && this.d == zv31Var.d && this.e == zv31Var.e && this.f == zv31Var.f && this.g.equals(zv31Var.g) && u890.j(this.h, zv31Var.h) && u890.j(this.i, zv31Var.i) && this.j.equals(zv31Var.j);
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        List list = this.h;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        return this.j.hashCode() + ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }
}
