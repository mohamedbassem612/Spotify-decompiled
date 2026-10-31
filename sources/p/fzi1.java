package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzi1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kzi1 a;

    public fzi1(kzi1 kzi1Var) {
        this.a = kzi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kzi1 kzi1Var = this.a;
        Object objY = fn31.Y(kzi1Var.b, new vbc1(kzi1Var, (lnm) null, (byte) 17), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
