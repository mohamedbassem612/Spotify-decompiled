package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hif implements Connectable {
    public final /* synthetic */ a a;

    public hif(r630 r630Var, bfd bfdVar, ynb0 ynb0Var, wq9 wq9Var, q8n q8nVar, s1q0 s1q0Var, q8n q8nVar2, gp0 gp0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        eif eifVar = new eif(gp0Var, q8nVar2, bfdVar, wq9Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b9w.class), runSequentially.a(eifVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(new.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fif(gp0Var, q8nVar2, bfdVar, s1q0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gif(r630Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ldw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dif(ynb0Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
