package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class blm extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ PlayerState b;
    public /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ blm(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        PlayerState playerState = (PlayerState) obj;
        Boolean bool = (Boolean) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                blm blmVar = new blm(i, lnmVar, (byte) 0);
                blmVar.b = playerState;
                blmVar.c = bool;
                return blmVar.invokeSuspend(rih1Var);
            default:
                blm blmVar2 = new blm(i, lnmVar, (byte) 1);
                blmVar2.b = playerState;
                blmVar2.c = bool;
                return blmVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                PlayerState playerState = this.b;
                Boolean bool = this.c;
                hm5.M(obj);
                String strContextUri = playerState.contextUri();
                spq0 spq0VarTrack = playerState.track();
                String strUri = spq0VarTrack.c() ? ((ContextTrack) spq0VarTrack.b()).uri() : null;
                bool.getClass();
                return new zkm(strContextUri, bool.booleanValue(), strUri, !playerState.isPaused() && playerState.isPlaying());
            default:
                PlayerState playerState2 = this.b;
                Boolean bool2 = this.c;
                hm5.M(obj);
                ContextTrack contextTrack = (ContextTrack) playerState2.track().h();
                if ((contextTrack != null ? l4o1.f0(contextTrack) : null) == null) {
                    return null;
                }
                return bool2.booleanValue() ? q0p0.b : q0p0.a;
        }
    }
}
