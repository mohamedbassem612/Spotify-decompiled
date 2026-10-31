package p;

import com.spotify.player.model.PlayerState;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wxt0 implements zxt0 {
    public final y6b1 a;
    public final List b;
    public final long c;
    public final PlayerState d;
    public final PlayerState e;

    public wxt0(y6b1 y6b1Var, List list, long j, PlayerState playerState, PlayerState playerState2) {
        this.a = y6b1Var;
        this.b = list;
        this.c = j;
        this.d = playerState;
        this.e = playerState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxt0)) {
            return false;
        }
        wxt0 wxt0Var = (wxt0) obj;
        return this.a.equals(wxt0Var.a) && this.b.equals(wxt0Var.b) && this.c == wxt0Var.c && this.d.equals(wxt0Var.d) && u890.j(this.e, wxt0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.f(f4i1.b(this.a.hashCode() * 31, 31, this.b), this.c, 31)) * 31;
        PlayerState playerState = this.e;
        return iHashCode + (playerState == null ? 0 : playerState.hashCode());
    }
}
