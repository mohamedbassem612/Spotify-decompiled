package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f910 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final o841 e;
    public final boolean f;

    public f910(PlayerState playerState, boolean z, boolean z2, boolean z3, o841 o841Var, boolean z4) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = o841Var;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f910)) {
            return false;
        }
        f910 f910Var = (f910) obj;
        return this.a.equals(f910Var.a) && this.b == f910Var.b && this.c == f910Var.c && this.d == f910Var.d && this.e == f910Var.e && this.f == f910Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
