package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pm50 implements Connectable {
    public final /* synthetic */ a a;

    public pm50(bfd bfdVar, ynb0 ynb0Var, add addVar, wq9 wq9Var, q8n q8nVar, s1q0 s1q0Var, q8n q8nVar2, gp0 gp0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        nm50 nm50Var = new nm50(gp0Var, q8nVar2, bfdVar, wq9Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z8w.class), runSequentially.a(nm50Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new om50(gp0Var, q8nVar2, addVar, bfdVar, s1q0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mm50(ynb0Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
