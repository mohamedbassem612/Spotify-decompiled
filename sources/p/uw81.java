package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uw81 implements fny {
    public final iu30 a;
    public final iu30 b;
    public final iu30 c;

    public uw81(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = iu30Var3;
    }

    @Override // p.fny
    public final hx21 a(PlayerState playerState) {
        return new hx21((zw21) this.a.invoke(playerState), (zw21) this.b.invoke(playerState), (String) this.c.invoke(playerState), (ynb) null, 120);
    }

    public /* synthetic */ uw81(iu30 iu30Var, iu30 iu30Var2) {
        this(iu30Var, iu30Var2, er81.e);
    }
}
