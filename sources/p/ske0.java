package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ske0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ im01 a;
    public final /* synthetic */ cir0 b;

    public ske0(im01 im01Var, cir0 cir0Var) {
        this.a = im01Var;
        this.b = cir0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cke0 cke0Var = (cke0) obj;
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new v4e0(this.a, cke0Var, this.b, (lnm) null, (byte) 3), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
