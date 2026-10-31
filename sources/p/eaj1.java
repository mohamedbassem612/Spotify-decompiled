package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eaj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ waj1 a;
    public final /* synthetic */ czs b;

    public eaj1(waj1 waj1Var, czs czsVar) {
        this.a = waj1Var;
        this.b = czsVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        uoa uoaVar = this.a.c;
        if (uoaVar != null) {
            this.b.a.setValue(uoaVar);
        }
        return rih1.a;
    }
}
