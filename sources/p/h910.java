package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h910 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final an01 h;
    public final mfk i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Integer m;
    public final boolean n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9p;

    public h910(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, an01 an01Var, mfk mfkVar, boolean z7, boolean z8, boolean z9, Integer num, boolean z10, Integer num2, boolean z11) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = an01Var;
        this.i = mfkVar;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = num;
        this.n = z10;
        this.o = num2;
        this.f9p = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h910)) {
            return false;
        }
        h910 h910Var = (h910) obj;
        return this.a.equals(h910Var.a) && this.b == h910Var.b && this.c == h910Var.c && this.d == h910Var.d && this.e == h910Var.e && this.f == h910Var.f && this.g == h910Var.g && this.h.equals(h910Var.h) && this.i.equals(h910Var.i) && this.j == h910Var.j && this.k == h910Var.k && this.l == h910Var.l && u890.j(this.m, h910Var.m) && this.n == h910Var.n && u890.j(this.o, h910Var.o) && this.f9p == h910Var.f9p;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.i.hashCode() + ((this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
        Integer num = this.m;
        int iG2 = xcg1.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.n);
        Integer num2 = this.o;
        return Boolean.hashCode(this.f9p) + ((iG2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
