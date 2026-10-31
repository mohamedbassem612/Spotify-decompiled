package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o8z0 extends z8z0 {
    public final ContextTrack a;
    public final boolean b;

    public o8z0(ContextTrack contextTrack, boolean z) {
        this.a = contextTrack;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8z0)) {
            return false;
        }
        o8z0 o8z0Var = (o8z0) obj;
        return u890.j(this.a, o8z0Var.a) && this.b == o8z0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
