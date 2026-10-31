package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qpu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ spu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpu0(spu0 spu0Var, byte b) {
        super(1);
        this.a = b;
        this.b = spu0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        spu0 spu0Var = this.b;
        switch (b) {
            case 0:
                PlayerState playerState = (PlayerState) obj;
                return spu0Var.a.b(playerState.contextUri()) ? new ugc1(poo1.A(playerState)) : new bx21(2131954503);
            default:
                PlayerState playerState2 = (PlayerState) obj;
                fza1 fza1Var = spu0Var.a;
                if (!fza1Var.b(playerState2.contextUri())) {
                    return new ugc1(poo1.A(playerState2));
                }
                String strA = fza1Var.a(playerState2.contextUri());
                if (strA == null) {
                    strA = "";
                }
                return new qe30(2131954511, strA);
        }
    }
}
