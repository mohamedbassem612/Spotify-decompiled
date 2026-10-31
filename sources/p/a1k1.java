package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a1k1 extends hab0 implements vu30 {
    public final /* synthetic */ b1k1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1k1(b1k1 b1k1Var) {
        super(2);
        this.a = b1k1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        gp71 gp71Var = gp71.w;
        r0k1 r0k1Var = this.a.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        m0k1 m0k1Var = new m0k1(r0k1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h0k1.class), cancelPrevious.a(m0k1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g0k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new o0k1(r0k1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i0k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new q0k1(r0k1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j0k1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k0k1(r0k1Var)));
        return gvg.d("pam-video-settings", Mobius.d(gp71Var, new a(r0k1Var.d, coroutinesSubtypeEffectHandlerBuilderI)));
    }
}
