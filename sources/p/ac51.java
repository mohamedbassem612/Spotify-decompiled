package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ac51 {
    public final int a;
    public final long b;
    public final int c;
    public final cc51 d;
    public final Long e;
    public final long f;
    public final int g;
    public final List h;
    public final int i;
    public final Long j;
    public final bc51 k;

    public ac51(int i, long j, int i2, cc51 cc51Var, Long l, long j2, int i3, List list, int i4, Long l2, bc51 bc51Var) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = cc51Var;
        this.e = l;
        this.f = j2;
        this.g = i3;
        this.h = list;
        this.i = i4;
        this.j = l2;
        this.k = bc51Var;
    }

    public static ac51 a(ac51 ac51Var, cc51 cc51Var, Long l, long j, int i, ArrayList arrayList, int i2, Long l2, bc51 bc51Var, int i3) {
        int i4 = ac51Var.a;
        long j2 = ac51Var.b;
        int i5 = ac51Var.c;
        cc51 cc51Var2 = (i3 & 8) != 0 ? ac51Var.d : cc51Var;
        Long l3 = (i3 & 16) != 0 ? ac51Var.e : l;
        long j3 = (i3 & 32) != 0 ? ac51Var.f : j;
        int i6 = (i3 & 64) != 0 ? ac51Var.g : i;
        List list = (i3 & 128) != 0 ? ac51Var.h : arrayList;
        int i7 = (i3 & 256) != 0 ? ac51Var.i : i2;
        Long l4 = (i3 & 512) != 0 ? ac51Var.j : l2;
        bc51 bc51Var2 = (i3 & 1024) != 0 ? ac51Var.k : bc51Var;
        ac51Var.getClass();
        return new ac51(i4, j2, i5, cc51Var2, l3, j3, i6, list, i7, l4, bc51Var2);
    }

    public final ac51 b(long j, cc51 cc51Var) {
        List list = this.h;
        String str = this.d.a;
        if (str != null) {
            return a(this, cc51Var, null, 0L, 0, o7h.O0(new dc51(this.f, j, str), list), 0, null, null, 1911);
        }
        eg.m("Required value was null.");
        return null;
    }

    public final zb51 c(int i, long j) {
        Long l = this.e;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = this.j;
        if (l2 != null) {
            return a(this, null, null, 0L, 0, null, 0, null, null, 1535).c(1, l2.longValue());
        }
        String str = this.d.a;
        List listO0 = this.h;
        if (str != null) {
            listO0 = o7h.O0(new dc51(this.f, j, str), listO0);
        }
        int i2 = this.c;
        bc51 bc51Var = this.k;
        return new zb51(this.a, i2, jLongValue, j, listO0, i, bc51Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac51)) {
            return false;
        }
        ac51 ac51Var = (ac51) obj;
        return this.a == ac51Var.a && this.b == ac51Var.b && this.c == ac51Var.c && this.d == ac51Var.d && u890.j(this.e, ac51Var.e) && this.f == ac51Var.f && this.g == ac51Var.g && u890.j(this.h, ac51Var.h) && this.i == ac51Var.i && u890.j(this.j, ac51Var.j) && u890.j(this.k, ac51Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ab80.k(this.c, cy30.f(l1d.C(this.a) * 31, this.b, 31), 31)) * 31;
        Long l = this.e;
        int iK = ab80.k(this.i, f4i1.b(kaa0.f(this.g, cy30.f((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.f, 31), 31), 31, this.h), 31);
        Long l2 = this.j;
        int iHashCode2 = (iK + (l2 == null ? 0 : l2.hashCode())) * 31;
        bc51 bc51Var = this.k;
        return iHashCode2 + (bc51Var != null ? bc51Var.hashCode() : 0);
    }
}
