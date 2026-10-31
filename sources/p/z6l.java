package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z6l implements e7l {
    public final ContextTrack a;
    public final ji0 b;

    public z6l(ContextTrack contextTrack, ji0 ji0Var) {
        this.a = contextTrack;
        this.b = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6l)) {
            return false;
        }
        z6l z6lVar = (z6l) obj;
        return u890.j(this.a, z6lVar.a) && u890.j(this.b, z6lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
