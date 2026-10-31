package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q9j1 implements Connectable {
    public final /* synthetic */ a a;

    public q9j1(qaj1 qaj1Var, bzs bzsVar, q8n q8nVar, ruz ruzVar, pxc pxcVar, ao0 ao0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        j9j1 j9j1Var = new j9j1(qaj1Var, ao0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(feu.class), runSequentially.a(j9j1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hc80.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k9j1(qaj1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hwo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f9j1(ruzVar, qaj1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kjb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l9j1(pxcVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ekb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m9j1(qaj1Var, ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pf21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n9j1(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cm21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o9j1(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fm21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new p9j1(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gas0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g9j1(bzsVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w631.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h9j1(bzsVar)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
