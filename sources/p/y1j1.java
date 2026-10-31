package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y1j1 extends hab0 implements vu30 {
    public final /* synthetic */ z1j1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1j1(z1j1 z1j1Var) {
        super(2);
        this.a = z1j1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        n1j1 n1j1Var = this.a.c.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        j1j1 j1j1Var = new j1j1(n1j1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f1j1.class), runSequentially.a(j1j1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e1j1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k1j1(n1j1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g1j1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l1j1(n1j1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h1j1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m1j1(n1j1Var)));
        return Mobius.d(t1j1.a, new a(n1j1Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
