package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b910 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Integer f;

    public b910(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b910)) {
            return false;
        }
        b910 b910Var = (b910) obj;
        return this.a.equals(b910Var.a) && this.b == b910Var.b && this.c == b910Var.c && this.d == b910Var.d && this.e == b910Var.e && u890.j(this.f, b910Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
