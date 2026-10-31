package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pd40 implements Connectable {
    public final lc20 a;
    public final wp20 b;
    public final x1i1 c;
    public final ced0 d;

    public pd40(lc20 lc20Var, wp20 wp20Var, x1i1 x1i1Var, ced0 ced0Var) {
        this.a = lc20Var;
        this.b = wp20Var;
        this.c = x1i1Var;
        this.d = ced0Var;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        od40 od40Var = new od40(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qd40.class), runSequentially.a(od40Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rd40.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new md40(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sd40.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ld40(this)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
