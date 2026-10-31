package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dkf1 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;

    public dkf1(PlayerState playerState, boolean z, boolean z2) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkf1)) {
            return false;
        }
        dkf1 dkf1Var = (dkf1) obj;
        return this.a.equals(dkf1Var.a) && this.b == dkf1Var.b && this.c == dkf1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
