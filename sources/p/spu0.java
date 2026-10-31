package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class spu0 implements fny {
    public final fza1 a;
    public final q98 b;
    public final boolean c;
    public final uw81 d = new uw81(new qpu0(this, (byte) 0), new qpu0(this, (byte) 1), rku0.e1);

    public spu0(fza1 fza1Var, q98 q98Var, boolean z) {
        this.a = fza1Var;
        this.b = q98Var;
        this.c = z;
    }

    public final hx21 a(PlayerState playerState) {
        hx21 hx21VarA = this.d.a(playerState);
        String strC = c(playerState);
        return strC == null ? hx21VarA : hx21.a(this.b.a(playerState), strC, strC, hx21VarA);
    }

    public final mr20 b(PlayerState playerState) {
        hx21 hx21VarA = this.d.a(playerState);
        String strC = c(playerState);
        return strC == null ? new huz(hx21VarA, (byte) 10) : new qsc0(this.b.b(playerState), strC, hx21VarA, (byte) 24);
    }

    public final String c(PlayerState playerState) {
        String str;
        Long lD0;
        ContextTrack contextTrack;
        if (!this.c || !this.b.b.a() || (str = (String) playerState.contextMetadata().get("duration")) == null || (lD0 = nhc1.d0(10, str)) == null || lD0.longValue() <= 0 || (contextTrack = (ContextTrack) playerState.track().h()) == null) {
            return null;
        }
        return l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_URI);
    }
}
