package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s810 {
    public final PlayerState a;
    public final boolean b;

    public s810(PlayerState playerState, boolean z) {
        this.a = playerState;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s810)) {
            return false;
        }
        s810 s810Var = (s810) obj;
        return this.a.equals(s810Var.a) && this.b == s810Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
