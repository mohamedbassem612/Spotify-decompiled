package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eff1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gff1 a;

    public eff1(gff1 gff1Var) {
        this.a = gff1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mff1 mff1Var = (mff1) obj;
        String str = mff1Var.a;
        tv80 tv80Var = mff1Var.b;
        gff1 gff1Var = this.a;
        Object objY = fn31.Y(gff1Var.d, new ku91(gff1Var, str, tv80Var, (lnm) null, (byte) 15), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
