package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class suy {
    public final long a;
    public final PlayerState b;

    public suy(long j, PlayerState playerState) {
        this.a = j;
        this.b = playerState;
    }

    public final String a() {
        ContextTrack contextTrack = (ContextTrack) this.b.track().h();
        if (contextTrack != null) {
            return contextTrack.uri();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suy)) {
            return false;
        }
        suy suyVar = (suy) obj;
        return this.a == suyVar.a && this.b.equals(suyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
