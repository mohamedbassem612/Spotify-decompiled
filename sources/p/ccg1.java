package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ccg1 {
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final tcd1 e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public ccg1(String str, String str2, List list, int i, tcd1 tcd1Var, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = tcd1Var;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
    }

    public static ccg1 a(ccg1 ccg1Var, String str, String str2, ArrayList arrayList, int i, tcd1 tcd1Var, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        String str3 = (i5 & 1) != 0 ? ccg1Var.a : str;
        String str4 = (i5 & 2) != 0 ? ccg1Var.b : str2;
        List list = (i5 & 4) != 0 ? ccg1Var.c : arrayList;
        int i6 = (i5 & 8) != 0 ? ccg1Var.d : i;
        tcd1 tcd1Var2 = (i5 & 16) != 0 ? ccg1Var.e : tcd1Var;
        boolean z8 = (i5 & 32) != 0 ? ccg1Var.f : z;
        boolean z9 = (i5 & 64) != 0 ? ccg1Var.g : z2;
        int i7 = (i5 & 128) != 0 ? ccg1Var.h : i2;
        int i8 = (i5 & 256) != 0 ? ccg1Var.i : i3;
        int i9 = (i5 & 512) != 0 ? ccg1Var.j : i4;
        boolean z10 = (i5 & 1024) != 0 ? ccg1Var.k : z3;
        boolean z11 = (i5 & 2048) != 0 ? ccg1Var.l : z4;
        boolean z12 = (i5 & 4096) != 0 ? ccg1Var.m : z5;
        boolean z13 = (i5 & 8192) != 0 ? ccg1Var.n : z6;
        boolean z14 = (i5 & 16384) != 0 ? ccg1Var.o : z7;
        ccg1Var.getClass();
        return new ccg1(str3, str4, list, i6, tcd1Var2, z8, z9, i7, i8, i9, z10, z11, z12, z13, z14);
    }

    public final boolean b() {
        int i = this.d;
        int i2 = this.h;
        if (i != 1) {
            i2++;
        }
        return this.i <= i2 && i2 <= this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccg1)) {
            return false;
        }
        ccg1 ccg1Var = (ccg1) obj;
        return this.a.equals(ccg1Var.a) && this.b.equals(ccg1Var.b) && u890.j(this.c, ccg1Var.c) && this.d == ccg1Var.d && this.e == ccg1Var.e && this.f == ccg1Var.f && this.g == ccg1Var.g && this.h == ccg1Var.h && this.i == ccg1Var.i && this.j == ccg1Var.j && this.k == ccg1Var.k && this.l == ccg1Var.l && this.m == ccg1Var.m && this.n == ccg1Var.n && this.o == ccg1Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, xcg1.g(xcg1.g((this.e.hashCode() + ab80.k(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f), 31, this.g), 31), 31), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }
}
