package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c8z0 extends z8z0 {
    public final int a;
    public final ContextTrack b;

    public c8z0(int i, ContextTrack contextTrack) {
        this.a = i;
        this.b = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8z0)) {
            return false;
        }
        c8z0 c8z0Var = (c8z0) obj;
        return this.a == c8z0Var.a && u890.j(this.b, c8z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
