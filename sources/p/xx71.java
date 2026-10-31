package p;

import android.os.Parcelable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xx71 {
    public final String a;
    public final String b;
    public final dw71 c;
    public final List d;
    public final boolean e;
    public final ew71 f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final ew71 j;
    public final mw71 k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f42p;
    public final Set q;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public xx71(String str, String str2, dw71 dw71Var, List list, boolean z, ew71 ew71Var, boolean z2, boolean z3, String str3, ew71 ew71Var2, mw71 mw71Var, long j, long j2, boolean z4, boolean z5, Set set, Set set2) {
        this.a = str;
        this.b = str2;
        this.c = dw71Var;
        this.d = list;
        this.e = z;
        this.f = ew71Var;
        this.g = z2;
        this.h = z3;
        this.i = str3;
        this.j = ew71Var2;
        this.k = mw71Var;
        this.l = j;
        this.m = j2;
        this.n = z4;
        this.o = z5;
        this.f42p = set;
        this.q = set2;
    }

    public static xx71 a(xx71 xx71Var, String str, String str2, dw71 dw71Var, List list, boolean z, ew71 ew71Var, boolean z2, boolean z3, String str3, ew71 ew71Var2, mw71 mw71Var, long j, long j2, boolean z4, boolean z5, Set set, Set set2, int i) {
        String str4 = (i & 1) != 0 ? xx71Var.a : str;
        String str5 = (i & 2) != 0 ? xx71Var.b : str2;
        dw71 dw71Var2 = (i & 4) != 0 ? xx71Var.c : dw71Var;
        List list2 = (i & 8) != 0 ? xx71Var.d : list;
        boolean z6 = (i & 16) != 0 ? xx71Var.e : z;
        ew71 ew71Var3 = (i & 32) != 0 ? xx71Var.f : ew71Var;
        boolean z7 = (i & 64) != 0 ? xx71Var.g : z2;
        boolean z8 = (i & 128) != 0 ? xx71Var.h : z3;
        String str6 = (i & 256) != 0 ? xx71Var.i : str3;
        ew71 ew71Var4 = (i & 512) != 0 ? xx71Var.j : ew71Var2;
        mw71 mw71Var2 = (i & 1024) != 0 ? xx71Var.k : mw71Var;
        long j3 = (i & 2048) != 0 ? xx71Var.l : j;
        String str7 = str4;
        String str8 = str5;
        long j4 = (i & 4096) != 0 ? xx71Var.m : j2;
        boolean z9 = (i & 8192) != 0 ? xx71Var.n : z4;
        long j5 = j4;
        boolean z10 = (i & 16384) != 0 ? xx71Var.o : z5;
        Set set3 = (32768 & i) != 0 ? xx71Var.f42p : set;
        Set set4 = (i & 65536) != 0 ? xx71Var.q : set2;
        xx71Var.getClass();
        return new xx71(str7, str8, dw71Var2, list2, z6, ew71Var3, z7, z8, str6, ew71Var4, mw71Var2, j3, j5, z9, z10, set3, set4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx71)) {
            return false;
        }
        xx71 xx71Var = (xx71) obj;
        return this.a.equals(xx71Var.a) && this.b.equals(xx71Var.b) && this.c.equals(xx71Var.c) && u890.j(this.d, xx71Var.d) && this.e == xx71Var.e && this.f == xx71Var.f && this.g == xx71Var.g && this.h == xx71Var.h && u890.j(this.i, xx71Var.i) && this.j == xx71Var.j && this.k == xx71Var.k && this.l == xx71Var.l && this.m == xx71Var.m && this.n == xx71Var.n && this.o == xx71Var.o && u890.j(this.f42p, xx71Var.f42p) && u890.j(this.q, xx71Var.q);
    }

    public final int hashCode() {
        int iG = xcg1.g(f4i1.b((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        ew71 ew71Var = this.f;
        int iG2 = xcg1.g(xcg1.g((iG + (ew71Var == null ? 0 : ew71Var.hashCode())) * 31, 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        ew71 ew71Var2 = this.j;
        return this.q.hashCode() + gvg.c(xcg1.g(xcg1.g(cy30.f(cy30.f((this.k.hashCode() + ((iHashCode + (ew71Var2 != null ? ew71Var2.hashCode() : 0)) * 31)) * 31, this.l, 31), this.m, 31), 31, this.n), 31, this.o), 31, this.f42p);
    }
}
