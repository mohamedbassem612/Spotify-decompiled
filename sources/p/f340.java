package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f340 extends hab0 implements vu30 {
    public final /* synthetic */ g340 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f340(g340 g340Var) {
        super(2);
        this.a = g340Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        b340 b340Var = this.a.d;
        y240 y240Var = new y240();
        q240 q240Var = b340Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        l240 l240Var = new l240(q240Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e240.class), runSequentially.a(l240Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d240.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m240(q240Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h240.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j240(q240Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g240.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new p240()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f240.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n240(q240Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c240.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k240(q240Var)));
        return l1d.g(Mobius.d(y240Var, new a(q240Var.a, coroutinesSubtypeEffectHandlerBuilderI)).d(new z240(b340Var)).b(new a340(b340Var)));
    }
}
