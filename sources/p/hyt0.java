package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hyt0 implements jyt0 {
    public final y6b1 a;
    public final PlayerState b;

    public hyt0(y6b1 y6b1Var, PlayerState playerState) {
        this.a = y6b1Var;
        this.b = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyt0)) {
            return false;
        }
        hyt0 hyt0Var = (hyt0) obj;
        return this.a.equals(hyt0Var.a) && u890.j(this.b, hyt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
