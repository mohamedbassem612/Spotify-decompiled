package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hqw0 {
    public final boolean a;
    public final pp90 b;
    public final l0l c;
    public final PlayerState d;

    public hqw0(boolean z, pp90 pp90Var, l0l l0lVar, PlayerState playerState) {
        this.a = z;
        this.b = pp90Var;
        this.c = l0lVar;
        this.d = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqw0)) {
            return false;
        }
        hqw0 hqw0Var = (hqw0) obj;
        return this.a == hqw0Var.a && u890.j(this.b, hqw0Var.b) && u890.j(this.c, hqw0Var.c) && u890.j(this.d, hqw0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        pp90 pp90Var = this.b;
        int iHashCode2 = (iHashCode + (pp90Var == null ? 0 : pp90Var.hashCode())) * 31;
        l0l l0lVar = this.c;
        return this.d.hashCode() + ((iHashCode2 + (l0lVar != null ? l0lVar.hashCode() : 0)) * 31);
    }
}
