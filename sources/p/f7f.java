package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f7f implements Connectable {
    public final /* synthetic */ a a;

    public f7f(q8n q8nVar, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, vu30 vu30Var, cce cceVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        a7f a7fVar = new a7f(ynb0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q5f.class), cancelPrevious.a(a7fVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r5f.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new c7f(ynb0Var2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n5f.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new e7f(ynb0Var3)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o5f.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x6f(cceVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p5f.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y6f(vu30Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
