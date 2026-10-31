package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m4y implements Connectable {
    public final /* synthetic */ a a;

    public m4y(bm00 bm00Var, h0y h0yVar, ij01 ij01Var, bb01 bb01Var, ij01 ij01Var2, q8n q8nVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        j4y j4yVar = new j4y(bm00Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a4y.class), runSequentially.a(j4yVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b4y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l4y(h0yVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c4y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new g4y(bb01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d4y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new h4y(ij01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e4y.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f4y(ij01Var2)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
