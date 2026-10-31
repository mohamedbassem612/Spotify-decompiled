package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c1t0 extends hab0 implements iu30 {
    public final /* synthetic */ d1t0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1t0(d1t0 d1t0Var) {
        super(1);
        this.a = d1t0Var;
    }

    public final Object invoke(Object obj) {
        l0t0 l0t0Var = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        i0t0 i0t0Var = new i0t0(l0t0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uzs0.class), runSequentially.a(i0t0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(szs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g0t0(l0t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nzs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k0t0(l0t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ozs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d0t0(l0t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tzs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e0t0(l0t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qzs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a0t0(l0t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rzs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b0t0(l0t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pzs0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c0t0(l0t0Var)));
        return Mobius.d(z0t0.a, new a(l0t0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
