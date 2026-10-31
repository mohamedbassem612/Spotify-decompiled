package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r910 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Integer l;
    public final px3 m;

    public r910(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Integer num, px3 px3Var) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = num;
        this.m = px3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r910)) {
            return false;
        }
        r910 r910Var = (r910) obj;
        return this.a.equals(r910Var.a) && this.b == r910Var.b && this.c == r910Var.c && this.d == r910Var.d && this.e == r910Var.e && this.f == r910Var.f && this.g == r910Var.g && this.h == r910Var.h && this.i == r910Var.i && this.j == r910Var.j && this.k == r910Var.k && u890.j(this.l, r910Var.l) && this.m == r910Var.m;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Integer num = this.l;
        return this.m.hashCode() + ((iG + (num == null ? 0 : num.hashCode())) * 31);
    }
}
