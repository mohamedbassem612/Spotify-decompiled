package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vxk1 implements Connectable {
    public final lzn0 a;
    public final xh71 b;
    public final dzp0 c;
    public final q8n d;

    public vxk1(lzn0 lzn0Var, xh71 xh71Var, dzp0 dzp0Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = xh71Var;
        this.c = dzp0Var;
        this.d = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        sxk1 sxk1Var = new sxk1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pxk1.class), runSequentially.a(sxk1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rxk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new txk1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qxk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uxk1(this)));
        return new a(this.d, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
