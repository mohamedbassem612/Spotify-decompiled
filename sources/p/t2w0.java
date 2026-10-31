package p;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t2w0 {
    public final String a;
    public final j2w0 b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final Boolean j;
    public final Boolean k;
    public final boolean l;
    public final ljd0 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f43p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public t2w0(String str, j2w0 j2w0Var, List list, List list2, List list3, String str2, String str3, String str4, List list4, Boolean bool, Boolean bool2, boolean z, ljd0 ljd0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean zIsBefore;
        this.a = str;
        this.b = j2w0Var;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = list4;
        this.j = bool;
        this.k = bool2;
        this.l = z;
        this.m = ljd0Var;
        this.n = z2;
        this.o = z3;
        this.f43p = z4;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        try {
            zIsBefore = Instant.parse(j2w0Var.d).isBefore(Instant.now());
        } catch (Exception unused) {
            zIsBefore = false;
        }
        this.t = zIsBefore;
    }

    public static t2w0 a(t2w0 t2w0Var, j2w0 j2w0Var, ArrayList arrayList, Boolean bool, Boolean bool2, boolean z, int i) {
        String str = t2w0Var.a;
        j2w0 j2w0Var2 = (i & 2) != 0 ? t2w0Var.b : j2w0Var;
        List list = (i & 4) != 0 ? t2w0Var.c : arrayList;
        return new t2w0(str, j2w0Var2, list, t2w0Var.d, t2w0Var.e, t2w0Var.f, t2w0Var.g, t2w0Var.h, t2w0Var.i, (i & 512) != 0 ? t2w0Var.j : bool, (i & 1024) != 0 ? t2w0Var.k : bool2, t2w0Var.l, t2w0Var.m, t2w0Var.n, (i & 16384) != 0 ? t2w0Var.o : z, t2w0Var.f43p, t2w0Var.q, t2w0Var.r, t2w0Var.s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2w0)) {
            return false;
        }
        t2w0 t2w0Var = (t2w0) obj;
        return u890.j(this.a, t2w0Var.a) && this.b.equals(t2w0Var.b) && u890.j(this.c, t2w0Var.c) && this.d.equals(t2w0Var.d) && this.e.equals(t2w0Var.e) && this.f.equals(t2w0Var.f) && u890.j(this.g, t2w0Var.g) && this.h.equals(t2w0Var.h) && this.i.equals(t2w0Var.i) && u890.j(this.j, t2w0Var.j) && u890.j(this.k, t2w0Var.k) && this.l == t2w0Var.l && u890.j(this.m, t2w0Var.m) && this.n == t2w0Var.n && this.o == t2w0Var.o && this.f43p == t2w0Var.f43p && this.q == t2w0Var.q && this.r == t2w0Var.r && this.s == t2w0Var.s;
    }

    public final int hashCode() {
        int iD = cy30.d(f4i1.b(f4i1.b(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iB = f4i1.b(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i);
        Boolean bool = this.j;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iG = xcg1.g((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.l);
        ljd0 ljd0Var = this.m;
        return Boolean.hashCode(this.s) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (ljd0Var != null ? ljd0Var.hashCode() : 0)) * 31, 31, this.n), 31, this.o), 31, this.f43p), 31, this.q), 31, this.r);
    }
}
