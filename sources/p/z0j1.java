package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z0j1 extends hab0 implements vu30 {
    public final /* synthetic */ a1j1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0j1(a1j1 a1j1Var) {
        super(2);
        this.a = a1j1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        l0j1 l0j1Var = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        g0j1 g0j1Var = new g0j1(l0j1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d0j1.class), runSequentially.a(g0j1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e0j1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new i0j1()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c0j1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k0j1(l0j1Var)));
        return Mobius.d(s0j1.a, new a(l0j1Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
