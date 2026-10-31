package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f2c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ j2c0 a;

    public f2c0(j2c0 j2c0Var) {
        this.a = j2c0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ur00 ur00Var = this.a.a;
        Object objY = fn31.Y((q8n) ur00Var.f, new c2c0(ur00Var, ((hcw) obj).a, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
