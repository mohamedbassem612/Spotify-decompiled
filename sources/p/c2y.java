package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c2y implements Connectable {
    public final /* synthetic */ a a;

    public c2y(ov20 ov20Var, r241 r241Var, h1y h1yVar, kt91 kt91Var, otu otuVar, q8n q8nVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        z1y z1yVar = new z1y(ov20Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n1y.class), runSequentially.a(z1yVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r1y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b2y(r241Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q1y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new v1y(h1yVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p1y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w1y(otuVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o1y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x1y(otuVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s1y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u1y(kt91Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
