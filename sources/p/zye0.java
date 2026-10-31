package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zye0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ byp a;

    public zye0(byp bypVar) {
        this.a = bypVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        byp bypVar = this.a;
        Object objY = fn31.Y((q8n) bypVar.i, new p6d0(bypVar, (lnm) null, (byte) 15), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
