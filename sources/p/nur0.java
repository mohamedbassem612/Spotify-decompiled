package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nur0 extends hab0 implements vu30 {
    public final /* synthetic */ our0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nur0(our0 our0Var) {
        super(2);
        this.a = our0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        iur0 iur0Var = this.a.d.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        dur0 dur0Var = new dur0(iur0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zcw.class), runSequentially.a(dur0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eur0(iur0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hur0(iur0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fur0(iur0Var)));
        return Mobius.d(lur0.a, new a(iur0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
