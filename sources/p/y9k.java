package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y9k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rm5 a;
    public final /* synthetic */ kt91 b;
    public final /* synthetic */ Context c;

    public y9k(rm5 rm5Var, kt91 kt91Var, Context context) {
        this.a = rm5Var;
        this.b = kt91Var;
        this.c = context;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new qk3(obj, (lnm) null, this.a, this.b, this.c, (byte) 4)).collect(new z6f(r261Var, (byte) 16), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
