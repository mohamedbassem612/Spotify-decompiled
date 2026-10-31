package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v6l implements e7l {
    public final ContextTrack a;

    public v6l(ContextTrack contextTrack) {
        this.a = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6l) && u890.j(this.a, ((v6l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
