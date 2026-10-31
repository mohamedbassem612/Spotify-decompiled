package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xrh1 extends hab0 implements iu30 {
    public final /* synthetic */ yrh1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrh1(yrh1 yrh1Var) {
        super(1);
        this.a = yrh1Var;
    }

    public final Object invoke(Object obj) {
        orh1 orh1Var = this.a.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        nrh1 nrh1Var = new nrh1(orh1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(krh1.class), runSequentially.a(nrh1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jrh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lrh1(orh1Var)));
        return Mobius.d(wrh1.a, new a(orh1Var.d, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
