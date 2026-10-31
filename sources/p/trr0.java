package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trr0 extends hab0 implements vu30 {
    public final /* synthetic */ urr0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trr0(urr0 urr0Var) {
        super(2);
        this.a = urr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        qrr0 qrr0Var = this.a.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        prr0 prr0Var = new prr0(qrr0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c9w.class), runSequentially.a(prr0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ycw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lrr0(qrr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nrr0(qrr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mrr0(qrr0Var)));
        return Mobius.d(srr0.a, new a(qrr0Var.e, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
