package p;

import android.content.Context;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8k implements Connectable {
    public final /* synthetic */ a a;

    public e8k(q8n q8nVar, rm5 rm5Var, dg8 dg8Var, kt91 kt91Var, lzn0 lzn0Var, x5j1 x5j1Var, yqg yqgVar, uu00 uu00Var, Context context, xrk xrkVar, y1t0 y1t0Var, hpd0 hpd0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        v7k v7kVar = new v7k(rm5Var, xrkVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z6k.class), cancelPrevious.a(v7kVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y6k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new p7k(dg8Var, rm5Var, xrkVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x6k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q7k(rm5Var, xrkVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m7k(kt91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new x7k(dg8Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r7k(dg8Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new z7k(dg8Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s7k(dg8Var, context)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n7k(x5j1Var, lzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new b8k(yqgVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t7k(uu00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new d8k(hpd0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f7k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o7k(y1t0Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
