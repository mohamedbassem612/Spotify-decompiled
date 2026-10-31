package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gd3 {
    public final s7n0 a;
    public final PlayerState b;
    public final boolean c;
    public final e3q0 d;

    public gd3(s7n0 s7n0Var, PlayerState playerState, boolean z, e3q0 e3q0Var) {
        this.a = s7n0Var;
        this.b = playerState;
        this.c = z;
        this.d = e3q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd3)) {
            return false;
        }
        gd3 gd3Var = (gd3) obj;
        return this.a == gd3Var.a && u890.j(this.b, gd3Var.b) && this.c == gd3Var.c && u890.j(this.d, gd3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
