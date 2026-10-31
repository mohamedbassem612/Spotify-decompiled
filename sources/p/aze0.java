package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aze0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dze0 a;

    public aze0(dze0 dze0Var) {
        this.a = dze0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        byp bypVar = this.a.a;
        Object objY = fn31.Y((q8n) bypVar.i, new e9c0(bypVar, ((wye0) obj).c, (lnm) null, (byte) 19), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
