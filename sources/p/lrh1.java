package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lrh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ orh1 a;

    public lrh1(orh1 orh1Var) {
        this.a = orh1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        orh1 orh1Var = this.a;
        Object objY = fn31.Y(orh1Var.e, new vbc1(orh1Var, (lnm) null, (byte) 15), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
