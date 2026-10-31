package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mlp0 implements Connectable {
    public final /* synthetic */ a a;

    public mlp0(bfd bfdVar, ynb0 ynb0Var, wq9 wq9Var, q8n q8nVar, s1q0 s1q0Var, q8n q8nVar2, gp0 gp0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        jlp0 jlp0Var = new jlp0(gp0Var, q8nVar2, bfdVar, wq9Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a9w.class), runSequentially.a(jlp0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aaw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new llp0(s1q0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ilp0(ynb0Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
