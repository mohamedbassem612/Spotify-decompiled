package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rzl1 {
    public final nzl1 a;
    public final PlayerState b;
    public final boolean c;

    public rzl1(nzl1 nzl1Var, PlayerState playerState, boolean z) {
        this.a = nzl1Var;
        this.b = playerState;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzl1)) {
            return false;
        }
        rzl1 rzl1Var = (rzl1) obj;
        return this.a.equals(rzl1Var.a) && this.b.equals(rzl1Var.b) && this.c == rzl1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
