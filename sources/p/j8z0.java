package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8z0 extends z8z0 {
    public final int a;
    public final ContextTrack b;
    public final adz0 c;

    public j8z0(int i, ContextTrack contextTrack, adz0 adz0Var) {
        this.a = i;
        this.b = contextTrack;
        this.c = adz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8z0)) {
            return false;
        }
        j8z0 j8z0Var = (j8z0) obj;
        return this.a == j8z0Var.a && u890.j(this.b, j8z0Var.b) && this.c.equals(j8z0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
