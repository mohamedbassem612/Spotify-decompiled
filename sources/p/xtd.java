package p;

import com.spotify.player.model.BitrateLevel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xtd {
    public final ual a;
    public final u6o0 b;
    public final boolean c;
    public final BitrateLevel d;
    public final BitrateLevel e;
    public final boolean f;
    public final i9f0 g;
    public final r690 h;
    public final boolean i;
    public final x7f0 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f89p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    public xtd(ual ualVar, u6o0 u6o0Var, boolean z, BitrateLevel bitrateLevel, BitrateLevel bitrateLevel2, boolean z2, i9f0 i9f0Var, r690 r690Var, boolean z3, x7f0 x7f0Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = ualVar;
        this.b = u6o0Var;
        this.c = z;
        this.d = bitrateLevel;
        this.e = bitrateLevel2;
        this.f = z2;
        this.g = i9f0Var;
        this.h = r690Var;
        this.i = z3;
        this.j = x7f0Var;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.f89p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtd)) {
            return false;
        }
        xtd xtdVar = (xtd) obj;
        return this.a == xtdVar.a && this.b == xtdVar.b && this.c == xtdVar.c && this.d == xtdVar.d && this.e == xtdVar.e && this.f == xtdVar.f && this.g == xtdVar.g && this.h == xtdVar.h && this.i == xtdVar.i && this.j == xtdVar.j && this.k == xtdVar.k && this.l == xtdVar.l && this.m == xtdVar.m && this.n == xtdVar.n && this.o == xtdVar.o && this.f89p == xtdVar.f89p && this.q == xtdVar.q && this.r == xtdVar.r && this.s == xtdVar.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.j.hashCode() + xcg1.g((this.h.hashCode() + ((this.g.hashCode() + xcg1.g((this.e.hashCode() + ((this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31, 31, this.f)) * 31)) * 31, 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f89p), 31, this.q), 31, this.r);
    }
}
