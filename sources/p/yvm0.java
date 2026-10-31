package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yvm0 {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;
    public final int e;
    public final String f;
    public final String g;
    public final w4g0 h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f25p;
    public final String q;

    public yvm0(String str, String str2, int i, ArrayList arrayList, int i2, String str3, String str4, w4g0 w4g0Var, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = arrayList;
        this.e = i2;
        this.f = str3;
        this.g = str4;
        this.h = w4g0Var;
        this.i = z;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.f25p = str10;
        this.q = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvm0)) {
            return false;
        }
        yvm0 yvm0Var = (yvm0) obj;
        return this.a.equals(yvm0Var.a) && u890.j(this.b, yvm0Var.b) && this.c == yvm0Var.c && this.d.equals(yvm0Var.d) && this.e == yvm0Var.e && this.f.equals(yvm0Var.f) && this.g.equals(yvm0Var.g) && this.h.equals(yvm0Var.h) && this.i == yvm0Var.i && this.j.equals(yvm0Var.j) && this.k.equals(yvm0Var.k) && this.l.equals(yvm0Var.l) && this.m.equals(yvm0Var.m) && this.n.equals(yvm0Var.n) && this.o.equals(yvm0Var.o) && this.f25p.equals(yvm0Var.f25p) && this.q.equals(yvm0Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(xcg1.g((this.h.hashCode() + cy30.d(cy30.d(kaa0.f(this.e, p3d1.f(this.d, cy30.f(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 0L, 961), 31), 31), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f25p);
    }
}
