package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kkf1 {
    public final ContextTrack a;
    public final boolean b;
    public final boolean c;

    public kkf1(ContextTrack contextTrack, boolean z, boolean z2) {
        this.a = contextTrack;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkf1)) {
            return false;
        }
        kkf1 kkf1Var = (kkf1) obj;
        return u890.j(this.a, kkf1Var.a) && this.b == kkf1Var.b && this.c == kkf1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
