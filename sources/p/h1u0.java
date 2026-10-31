package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h1u0 {
    public final PlayerState a;
    public final spq0 b;
    public final spq0 c;

    public h1u0(PlayerState playerState, spq0 spq0Var, spq0 spq0Var2) {
        this.a = playerState;
        this.b = spq0Var;
        this.c = spq0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1u0)) {
            return false;
        }
        h1u0 h1u0Var = (h1u0) obj;
        return this.a.equals(h1u0Var.a) && this.b.equals(h1u0Var.b) && this.c.equals(h1u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
