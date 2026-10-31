package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m671 {
    public final PlayerState a;
    public final boolean b;

    public m671(PlayerState playerState, boolean z) {
        this.a = playerState;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m671)) {
            return false;
        }
        m671 m671Var = (m671) obj;
        return this.a.equals(m671Var.a) && this.b == m671Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
