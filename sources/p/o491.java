package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o491 {
    public final PlayerState a;
    public final fvf1 b;

    public o491(PlayerState playerState, fvf1 fvf1Var) {
        this.a = playerState;
        this.b = fvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o491)) {
            return false;
        }
        o491 o491Var = (o491) obj;
        return this.a.equals(o491Var.a) && this.b.equals(o491Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
