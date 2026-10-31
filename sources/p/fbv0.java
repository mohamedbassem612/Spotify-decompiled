package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fbv0 implements gbv0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ArrayList e;
    public final b290 f;
    public final boolean g;
    public final int h;
    public final String i;
    public final boolean j;
    public final List k = z6x.a;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final boolean o;

    public fbv0(String str, String str2, String str3, int i, ArrayList arrayList, b290 b290Var, boolean z, int i2, String str4, boolean z2, boolean z3, boolean z4, int i3, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = arrayList;
        this.f = b290Var;
        this.g = z;
        this.h = i2;
        this.i = str4;
        this.j = z2;
        this.l = z3;
        this.m = z4;
        this.n = i3;
        this.o = z5;
    }

    @Override // p.gbv0
    public final boolean a() {
        return this.o;
    }

    @Override // p.gbv0
    public final int b() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbv0)) {
            return false;
        }
        fbv0 fbv0Var = (fbv0) obj;
        return this.a.equals(fbv0Var.a) && this.b.equals(fbv0Var.b) && this.c.equals(fbv0Var.c) && this.d == fbv0Var.d && this.e.equals(fbv0Var.e) && this.f.equals(fbv0Var.f) && this.g == fbv0Var.g && this.h == fbv0Var.h && this.i.equals(fbv0Var.i) && this.j == fbv0Var.j && this.k.equals(fbv0Var.k) && this.l == fbv0Var.l && this.m == fbv0Var.m && this.n == fbv0Var.n && this.o == fbv0Var.o;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = this.d;
        int iG = xcg1.g(xcg1.g(f4i1.b(xcg1.g(cy30.d(kaa0.f(this.h, xcg1.g((this.f.hashCode() + p3d1.f(this.e, (iD + (i == 0 ? 0 : l1d.C(i))) * 31, 31)) * 31, 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        int i2 = this.n;
        return Boolean.hashCode(this.o) + ((iG + (i2 != 0 ? l1d.C(i2) : 0)) * 31);
    }
}
