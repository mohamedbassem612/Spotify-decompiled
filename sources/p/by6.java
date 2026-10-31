package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class by6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y1t0 a;
    public final /* synthetic */ y1x0 b;
    public final /* synthetic */ em3 c;

    public by6(y1t0 y1t0Var, y1x0 y1x0Var, em3 em3Var) {
        this.a = y1t0Var;
        this.b = y1x0Var;
        this.c = em3Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nn6 nn6Var = (nn6) obj;
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new sr1(nn6Var, this.a, this.b, this.c, (lnm) null, (byte) 2), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
