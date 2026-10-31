package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kl01 extends hab0 implements vu30 {
    public final /* synthetic */ ll01 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl01(ll01 ll01Var) {
        super(2);
        this.a = ll01Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ll01 ll01Var = this.a;
        mk01 mk01Var = ll01Var.c;
        jl01 jl01Var = new jl01(ll01Var);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        kk01 kk01Var = new kk01(mk01Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gk01.class), runSequentially.a(kk01Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hk01.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ik01(jl01Var)));
        return Mobius.d(il01.a, new a(mk01Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
