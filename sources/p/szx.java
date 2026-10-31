package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class szx {
    public final PlayerState a;
    public final e090 b;

    public szx(PlayerState playerState, e090 e090Var) {
        this.a = playerState;
        this.b = e090Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szx)) {
            return false;
        }
        szx szxVar = (szx) obj;
        return this.a.equals(szxVar.a) && this.b.equals(szxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
