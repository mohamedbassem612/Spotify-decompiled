package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f800 implements Connectable {
    public final lzn0 a;
    public final u9u0 b;

    public f800(lzn0 lzn0Var, u9u0 u9u0Var) {
        this.a = lzn0Var;
        this.b = u9u0Var;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        c800 c800Var = new c800(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z700.class), runSequentially.a(c800Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b800.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d800(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a800.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e800(this)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
