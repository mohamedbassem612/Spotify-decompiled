package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg8 a;
    public final /* synthetic */ Context b;

    public s7k(dg8 dg8Var, Context context) {
        this.a = dg8Var;
        this.b = context;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new nx(obj, (lnm) null, this.a, this.b, (byte) 6)).collect(new z6f(r261Var, (byte) 8), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
