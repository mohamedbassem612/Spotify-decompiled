package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lhb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ur00 a;

    public lhb0(ur00 ur00Var) {
        this.a = ur00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str = ((ehb0) obj).a;
        ur00 ur00Var = this.a;
        Object objY = fn31.Y((q8n) ur00Var.b, new y160(ur00Var, str, (lnm) null, (byte) 20), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
