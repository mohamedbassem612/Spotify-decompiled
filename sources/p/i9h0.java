package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i9h0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9h0 a;
    public final /* synthetic */ Consumer b;

    public i9h0(l9h0 l9h0Var, Consumer consumer) {
        this.a = l9h0Var;
        this.b = consumer;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        l9h0 l9h0Var = this.a;
        kt91 kt91Var = l9h0Var.c;
        Context context = l9h0Var.a;
        kt91Var.k(new er91((fs91) null, context.getString(2131957286), (Integer) null, context.getString(2131957304), (Integer) null, new t230(this.b, (d9h0) obj, (byte) 13), (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
