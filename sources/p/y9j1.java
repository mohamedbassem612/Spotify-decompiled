package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y9j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ czs a;
    public final /* synthetic */ waj1 b;
    public final /* synthetic */ lr0 c;
    public final /* synthetic */ ruz d;

    public y9j1(czs czsVar, waj1 waj1Var, lr0 lr0Var, ruz ruzVar) {
        this.a = czsVar;
        this.b = waj1Var;
        this.c = lr0Var;
        this.d = ruzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        x9j1 x9j1Var;
        VideoSurfaceView videoSurfaceView;
        if (onmVar instanceof x9j1) {
            x9j1Var = (x9j1) onmVar;
            int i = x9j1Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                x9j1Var.b = i - os00.INVALID_ID;
            } else {
                x9j1Var = new x9j1(this, onmVar);
            }
        } else {
            x9j1Var = new x9j1(this, onmVar);
        }
        Object obj2 = x9j1Var.a;
        int i2 = x9j1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            avf avfVar = (avf) obj;
            czs czsVar = this.a;
            uoa uoaVarA = czsVar.a();
            if ((uoaVarA != null ? uoaVarA.e() : null) != null) {
                uoa uoaVarA2 = czsVar.a();
                if (uoaVarA2 != null && (videoSurfaceView = czsVar.b) != null) {
                    uoaVarA2.d(videoSurfaceView);
                }
                uoaVarA.l();
            } else {
                vu30 vu30Var = this.b.a.b;
                gq0 gq0Var = new gq0(avfVar.a.a());
                x9j1Var.b = 1;
                Object objInvoke = vu30Var.invoke(gq0Var, x9j1Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        this.c.b(this.d);
        return rih1.a;
    }
}
