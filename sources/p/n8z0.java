package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n8z0 extends z8z0 {
    public final ContextTrack a;
    public final int b;
    public final int c;
    public final boolean d;

    public n8z0(ContextTrack contextTrack, int i, int i2, boolean z) {
        this.a = contextTrack;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8z0)) {
            return false;
        }
        n8z0 n8z0Var = (n8z0) obj;
        return u890.j(this.a, n8z0Var.a) && this.b == n8z0Var.b && this.c == n8z0Var.c && this.d == n8z0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
