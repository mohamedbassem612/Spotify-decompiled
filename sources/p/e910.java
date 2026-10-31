package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e910 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final px3 k;

    public e910(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Integer num, px3 px3Var) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = num;
        this.k = px3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e910)) {
            return false;
        }
        e910 e910Var = (e910) obj;
        return this.a.equals(e910Var.a) && this.b == e910Var.b && this.c == e910Var.c && this.d == e910Var.d && this.e == e910Var.e && this.f == e910Var.f && this.g == e910Var.g && this.h == e910Var.h && this.i == e910Var.i && u890.j(this.j, e910Var.j) && this.k == e910Var.k;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        return this.k.hashCode() + ((iG + (num == null ? 0 : num.hashCode())) * 31);
    }
}
