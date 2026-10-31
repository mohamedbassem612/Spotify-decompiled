package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m8z0 extends z8z0 {
    public final ContextTrack a;
    public final int b;

    public m8z0(int i, ContextTrack contextTrack) {
        this.a = contextTrack;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8z0)) {
            return false;
        }
        m8z0 m8z0Var = (m8z0) obj;
        return u890.j(this.a, m8z0Var.a) && this.b == m8z0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
