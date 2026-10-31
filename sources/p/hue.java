package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hue implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jue a;
    public final /* synthetic */ tbr0 b;

    public hue(jue jueVar, tbr0 tbr0Var) {
        this.a = jueVar;
        this.b = tbr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a.d, new pid(this.b, (aue) obj, (lnm) null, (byte) 5), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
