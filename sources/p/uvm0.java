package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uvm0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final ArrayList f;
    public final int g;
    public final String h;
    public final String i;
    public final w4g0 j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f17p = "";

    public uvm0(String str, int i, int i2, int i3, long j, ArrayList arrayList, int i4, String str2, String str3, w4g0 w4g0Var, boolean z, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = arrayList;
        this.g = i4;
        this.h = str2;
        this.i = str3;
        this.j = w4g0Var;
        this.k = z;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvm0)) {
            return false;
        }
        uvm0 uvm0Var = (uvm0) obj;
        return this.a.equals(uvm0Var.a) && this.b == uvm0Var.b && this.c == uvm0Var.c && this.d == uvm0Var.d && this.e == uvm0Var.e && this.f.equals(uvm0Var.f) && this.g == uvm0Var.g && this.h.equals(uvm0Var.h) && this.i.equals(uvm0Var.i) && this.j.equals(uvm0Var.j) && this.k == uvm0Var.k && this.l.equals(uvm0Var.l) && this.m.equals(uvm0Var.m) && this.n.equals(uvm0Var.n) && this.o.equals(uvm0Var.o) && this.f17p.equals(uvm0Var.f17p);
    }

    public final int hashCode() {
        return this.f17p.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(xcg1.g((this.j.hashCode() + cy30.d(cy30.d(kaa0.f(this.g, p3d1.f(this.f, cy30.f(ab80.k(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31), this.e, 31), 31), 31), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
