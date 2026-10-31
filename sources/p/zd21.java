package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zd21 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PlayerState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd21(PlayerState playerState, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = playerState;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        PlayerState playerState = this.c;
        switch (b) {
            case 0:
                zd21 zd21Var = new zd21(playerState, lnmVar, (byte) 0);
                zd21Var.b = obj;
                return zd21Var;
            default:
                zd21 zd21Var2 = new zd21(playerState, lnmVar, (byte) 1);
                zd21Var2.b = obj;
                return zd21Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        PlayerState playerState = (PlayerState) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(playerState, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        PlayerState playerState = this.c;
        PlayerState playerState2 = (PlayerState) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.valueOf(playerState2 != playerState);
            default:
                hm5.M(obj);
                return Boolean.valueOf(playerState2 != playerState);
        }
    }
}
