package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class na31 extends hab0 implements vu30 {
    public final /* synthetic */ oa31 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na31(oa31 oa31Var) {
        super(2);
        this.a = oa31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ca31 ca31Var = this.a.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        v931 v931Var = new v931(ca31Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q931.class), runSequentially.a(v931Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r931.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w931(ca31Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t931.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x931(ca31Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s931.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y931(ca31Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p931.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z931(ca31Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u931.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aa31(ca31Var)));
        return Mobius.d(ma31.a, new a(ca31Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
