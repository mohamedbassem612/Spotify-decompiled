package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i3m implements Connectable {
    public final /* synthetic */ a a;

    public i3m(q8n q8nVar, q8n q8nVar2, g931 g931Var, g2z g2zVar, tn01 tn01Var, tcy tcyVar, xwb xwbVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        b3m b3mVar = new b3m(tcyVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w1m.class), runSequentially.a(b3mVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y1m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d3m(g2zVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x1m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f3m(tn01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a2m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new z2m(g931Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b2m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v2m(q8nVar, xwbVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z1m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x2m(tn01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v1m.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h3m(tn01Var)));
        this.a = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
