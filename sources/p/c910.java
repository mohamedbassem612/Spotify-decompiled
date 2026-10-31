package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c910 {
    public final q4r a;
    public final PlayerState b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final an01 h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final px3 l;
    public final bm20 m;
    public final int n;
    public final Integer o;

    public c910(q4r q4rVar, PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, an01 an01Var, int i, boolean z6, boolean z7, px3 px3Var, bm20 bm20Var, int i2, Integer num) {
        this.a = q4rVar;
        this.b = playerState;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = an01Var;
        this.i = i;
        this.j = z6;
        this.k = z7;
        this.l = px3Var;
        this.m = bm20Var;
        this.n = i2;
        this.o = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c910)) {
            return false;
        }
        c910 c910Var = (c910) obj;
        return this.a.equals(c910Var.a) && this.b.equals(c910Var.b) && this.c == c910Var.c && this.d == c910Var.d && this.e == c910Var.e && this.f == c910Var.f && this.g == c910Var.g && this.h.equals(c910Var.h) && this.i == c910Var.i && this.j == c910Var.j && this.k == c910Var.k && this.l == c910Var.l && this.m.equals(c910Var.m) && this.n == c910Var.n && u890.j(this.o, c910Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
        int i = this.i;
        int iK = ab80.k(this.n, (this.m.hashCode() + ((this.l.hashCode() + xcg1.g(xcg1.g((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.j), 31, this.k)) * 31)) * 31, 31);
        Integer num = this.o;
        return iK + (num != null ? num.hashCode() : 0);
    }
}
