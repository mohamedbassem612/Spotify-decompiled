package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a2n0 implements fny {
    @Override // p.fny
    public final hx21 a(PlayerState playerState) {
        String strContextUri = playerState.contextUri();
        strContextUri.getClass();
        String strE = jxa.D(strContextUri) ? jxa.E(strContextUri) : poo1.z(playerState);
        if (ihc1.y0(poo1.A(playerState))) {
            bx21 bx21Var = new bx21(2131954515);
            ugc1 ugc1Var = new ugc1("");
            strE.getClass();
            return new hx21(bx21Var, ugc1Var, strE, (ynb) null, 120);
        }
        bx21 bx21Var2 = new bx21(2131954514);
        ugc1 ugc1Var2 = new ugc1(poo1.A(playerState));
        strE.getClass();
        return new hx21(bx21Var2, ugc1Var2, strE, (ynb) null, 120);
    }
}
