package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mvk1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pvk1 a;

    public mvk1(pvk1 pvk1Var) {
        this.a = pvk1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str = ((kvk1) obj).a;
        pvk1 pvk1Var = this.a;
        Object objY = fn31.Y(pvk1Var.e, new k53(pvk1Var, str, (lnm) null, (byte) 28), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
