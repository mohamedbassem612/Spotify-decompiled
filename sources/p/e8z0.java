package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e8z0 extends z8z0 {
    public final ContextTrack a;

    public e8z0(ContextTrack contextTrack) {
        this.a = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8z0) && u890.j(this.a, ((e8z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
