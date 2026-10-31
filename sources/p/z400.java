package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z400 implements b500 {
    public final ContextTrack a;
    public final Throwable b;

    public z400(ContextTrack contextTrack, Throwable th) {
        this.a = contextTrack;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z400)) {
            return false;
        }
        z400 z400Var = (z400) obj;
        return this.a.equals(z400Var.a) && this.b.equals(z400Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
