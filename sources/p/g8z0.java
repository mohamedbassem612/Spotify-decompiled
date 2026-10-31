package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g8z0 extends z8z0 {
    public final int a;
    public final ContextTrack b;

    public g8z0(int i, ContextTrack contextTrack) {
        this.a = i;
        this.b = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8z0)) {
            return false;
        }
        g8z0 g8z0Var = (g8z0) obj;
        return this.a == g8z0Var.a && u890.j(this.b, g8z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
