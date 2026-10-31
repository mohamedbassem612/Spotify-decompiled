package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kd3 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd3(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                kd3 kd3Var = new kd3(i, lnmVar, (byte) 0);
                kd3Var.c = vr20Var;
                kd3Var.d = th;
                return kd3Var.invokeSuspend(rih1Var);
            default:
                kd3 kd3Var2 = new kd3(i, lnmVar, (byte) 1);
                kd3Var2.c = vr20Var;
                kd3Var2.d = th;
                return kd3Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e331 e331Var = new e331(new m231(th));
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit(e331Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.d("Error observing playerState", th2);
                PlayerState playerState = PlayerState.EMPTY;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(playerState, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
