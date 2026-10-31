package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class thu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yhu a;

    public thu(yhu yhuVar) {
        this.a = yhuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gc80 gc80Var = (gc80) obj;
        yhu yhuVar = this.a;
        yhuVar.c.a(gc80Var.a.a, null);
        piu piuVar = yhuVar.a;
        String str = gc80Var.a.a;
        piu piuVar2 = new piu((qiu) piuVar.d, (rzo0) piuVar.c, onmVar, (byte) 0);
        piuVar2.b = str;
        rih1 rih1Var = rih1.a;
        piuVar2.invokeSuspend(rih1Var);
        return rih1Var;
    }
}
