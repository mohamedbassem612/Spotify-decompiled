package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kx80 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kge b;
    public final /* synthetic */ PlayerState c;

    public /* synthetic */ kx80(kge kgeVar, PlayerState playerState, byte b) {
        this.a = b;
        this.b = kgeVar;
        this.c = playerState;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        PlayerState playerState = this.c;
        kge kgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = kgeVar.collect(new jx80(vr20Var, playerState, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = kgeVar.collect(new jx80(vr20Var, playerState, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
