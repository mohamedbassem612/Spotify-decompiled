package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jpx0 {
    public final ContextTrack a;

    public jpx0(ContextTrack contextTrack) {
        this.a = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpx0) && u890.j(this.a, ((jpx0) obj).a);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.a;
        if (contextTrack == null) {
            return 0;
        }
        return contextTrack.hashCode();
    }
}
