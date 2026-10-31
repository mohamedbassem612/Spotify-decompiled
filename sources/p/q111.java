package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q111 {
    public final String a;
    public final String b;
    public final String c;
    public final ben d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ArrayList k;
    public final fbp1 l;
    public final boolean m;

    public q111(String str, String str2, String str3, ben benVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ArrayList arrayList, fbp1 fbp1Var, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = benVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = arrayList;
        this.l = fbp1Var;
        this.m = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q111)) {
            return false;
        }
        q111 q111Var = (q111) obj;
        return this.a.equals(q111Var.a) && this.b.equals(q111Var.b) && this.c.equals(q111Var.c) && this.d.equals(q111Var.d) && this.e == q111Var.e && this.f == q111Var.f && this.g == q111Var.g && this.h == q111Var.h && this.i == q111Var.i && this.j == q111Var.j && this.k.equals(q111Var.k) && this.l.equals(q111Var.l) && this.m == q111Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + p3d1.f(this.k, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31)) * 31);
    }
}
