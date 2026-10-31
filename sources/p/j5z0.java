package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j5z0 extends ajo1 {
    public final ContextTrack d;

    public j5z0(ContextTrack contextTrack) {
        this.d = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5z0) && u890.j(this.d, ((j5z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
