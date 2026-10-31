package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lg11 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ArrayList i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public lg11(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, boolean z5, String str4, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = arrayList;
        this.j = z5;
        this.k = str4;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg11)) {
            return false;
        }
        lg11 lg11Var = (lg11) obj;
        return this.a.equals(lg11Var.a) && this.b.equals(lg11Var.b) && this.c.equals(lg11Var.c) && this.d == lg11Var.d && this.e == lg11Var.e && this.f == lg11Var.f && this.g == lg11Var.g && this.h == lg11Var.h && this.i.equals(lg11Var.i) && this.j == lg11Var.j && this.k.equals(lg11Var.k) && this.l == lg11Var.l && this.m == lg11Var.m && this.n == lg11Var.n && this.o == lg11Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(p3d1.f(this.i, xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }
}
