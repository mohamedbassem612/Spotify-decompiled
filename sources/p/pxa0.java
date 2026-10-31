package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pxa0 extends hab0 implements iu30 {
    public final /* synthetic */ qxa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxa0(qxa0 qxa0Var) {
        super(1);
        this.a = qxa0Var;
    }

    public final Object invoke(Object obj) {
        ivr0 ivr0Var = this.a.e.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        hvr0 hvr0Var = new hvr0(ivr0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zur0.class), runSequentially.a(hvr0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yur0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dvr0(ivr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(avr0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new evr0(ivr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bvr0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fvr0(ivr0Var)));
        return Mobius.d(qvr0.a, new a(ivr0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
