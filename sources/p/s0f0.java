package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s0f0 extends hab0 implements vu30 {
    public final /* synthetic */ t0f0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0f0(t0f0 t0f0Var) {
        super(2);
        this.a = t0f0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0f0 m0f0Var = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        o3e0 o3e0Var = m0f0Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(k0f0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l0f0(o3e0Var)));
        return Mobius.d(p0f0.a, new a(m0f0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
