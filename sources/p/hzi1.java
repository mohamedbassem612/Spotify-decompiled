package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzi1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kzi1 a;

    public hzi1(kzi1 kzi1Var) {
        this.a = kzi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str = ((dzi1) obj).a;
        kzi1 kzi1Var = this.a;
        Object objY = fn31.Y(kzi1Var.b, new kwb1(kzi1Var, str, (lnm) null, (byte) 28), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
