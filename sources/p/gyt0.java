package p;

import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gyt0 implements jyt0 {
    public final y6b1 a;
    public final PlayerState b;
    public final PlayerState c;
    public final List d;

    public gyt0(y6b1 y6b1Var, PlayerState playerState, PlayerState playerState2, List list) {
        this.a = y6b1Var;
        this.b = playerState;
        this.c = playerState2;
        this.d = list;
    }

    public static gyt0 a(gyt0 gyt0Var, PlayerState playerState, PlayerState playerState2, ArrayList arrayList, int i) {
        y6b1 y6b1Var = gyt0Var.a;
        if ((i & 2) != 0) {
            playerState = gyt0Var.b;
        }
        if ((i & 4) != 0) {
            playerState2 = gyt0Var.c;
        }
        List list = arrayList;
        if ((i & 8) != 0) {
            list = gyt0Var.d;
        }
        return new gyt0(y6b1Var, playerState, playerState2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyt0)) {
            return false;
        }
        gyt0 gyt0Var = (gyt0) obj;
        return this.a.equals(gyt0Var.a) && this.b.equals(gyt0Var.b) && u890.j(this.c, gyt0Var.c) && u890.j(this.d, gyt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
