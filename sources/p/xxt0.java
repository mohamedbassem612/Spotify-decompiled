package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xxt0 implements zxt0 {
    public final y6b1 a;
    public final long b;
    public final PlayerState c;
    public final PlayerState d;

    public xxt0(long j, PlayerState playerState, PlayerState playerState2, y6b1 y6b1Var) {
        this.a = y6b1Var;
        this.b = j;
        this.c = playerState;
        this.d = playerState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxt0)) {
            return false;
        }
        xxt0 xxt0Var = (xxt0) obj;
        return this.a.equals(xxt0Var.a) && this.b == xxt0Var.b && this.c.equals(xxt0Var.c) && u890.j(this.d, xxt0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31;
        PlayerState playerState = this.d;
        return iHashCode + (playerState == null ? 0 : playerState.hashCode());
    }
}
