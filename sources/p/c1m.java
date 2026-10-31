package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c1m implements Connectable {
    public final /* synthetic */ a a;
    public final cs40 b;

    public c1m(xwb xwbVar, q8n q8nVar, q8n q8nVar2, cs40 cs40Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        x0m x0mVar = new x0m(q8nVar2, xwbVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m0m.class), runSequentially.a(x0mVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l0m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new z0m(cs40Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k0m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b1m(cs40Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
        this.b = cs40Var;
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
