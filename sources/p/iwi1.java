package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iwi1 implements Connectable {
    public final /* synthetic */ a a;

    public iwi1(q8n q8nVar, lzn0 lzn0Var, utw0 utw0Var, f2g1 f2g1Var, y1t0 y1t0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ewi1 ewi1Var = new ewi1(lzn0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(awi1.class), runSequentially.a(ewi1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cwi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fwi1(lzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dwi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gwi1(y1t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bwi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hwi1(utw0Var, f2g1Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
