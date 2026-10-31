package p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hjf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final ContextTrack h;
    public final ezf1 i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k4m f30p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final aak0 w;
    public final boolean x;

    public hjf1(String str, String str2, String str3, String str4, String str5, int i, boolean z, ContextTrack contextTrack, ezf1 ezf1Var, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, k4m k4mVar, List list, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, aak0 aak0Var, boolean z12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
        this.h = contextTrack;
        this.i = ezf1Var;
        this.j = z2;
        this.k = z3;
        this.l = i2;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.f30p = k4mVar;
        this.q = list;
        this.r = z7;
        this.s = z8;
        this.t = z9;
        this.u = z10;
        this.v = z11;
        this.w = aak0Var;
        this.x = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf1)) {
            return false;
        }
        hjf1 hjf1Var = (hjf1) obj;
        return this.a.equals(hjf1Var.a) && this.b.equals(hjf1Var.b) && this.c.equals(hjf1Var.c) && this.d.equals(hjf1Var.d) && u890.j(this.e, hjf1Var.e) && this.f == hjf1Var.f && this.g == hjf1Var.g && u890.j(this.h, hjf1Var.h) && this.i == hjf1Var.i && this.j == hjf1Var.j && this.k == hjf1Var.k && this.l == hjf1Var.l && this.m == hjf1Var.m && this.n == hjf1Var.n && this.o == hjf1Var.o && this.f30p == hjf1Var.f30p && u890.j(this.q, hjf1Var.q) && this.r == hjf1Var.r && this.s == hjf1Var.s && this.t == hjf1Var.t && this.u == hjf1Var.u && this.v == hjf1Var.v && u890.j(this.w, hjf1Var.w) && this.x == hjf1Var.x;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(p3d1.g(this.f30p, xcg1.g(xcg1.g(xcg1.g(ab80.k(this.l, xcg1.g(xcg1.g((this.i.hashCode() + ((this.h.hashCode() + xcg1.g(kaa0.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        aak0 aak0Var = this.w;
        return Boolean.hashCode(this.x) + ((iG + (aak0Var != null ? aak0Var.hashCode() : 0)) * 31);
    }
}
