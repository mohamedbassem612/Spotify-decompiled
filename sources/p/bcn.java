package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bcn implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jcn a;

    public bcn(jcn jcnVar) {
        this.a = jcnVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        k9k k9kVar = (k9k) this.a.c.b;
        Object objY = fn31.Y((q8n) k9kVar.c, new hzb(k9kVar, (lnm) null, (byte) 25), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
