package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o2b1 a;

    public vq1(o2b1 o2b1Var) {
        this.a = o2b1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xp1 xp1Var = (xp1) obj;
        so1 so1Var = (so1) ((brh1) this.a.b).invoke(xp1Var.b);
        if (so1Var != null) {
            so1Var.V0.m((Object) null, xp1Var.a);
        }
        return rih1.a;
    }
}
