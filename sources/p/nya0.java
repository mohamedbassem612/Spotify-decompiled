package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nya0 extends hab0 implements vu30 {
    public final /* synthetic */ oya0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nya0(oya0 oya0Var) {
        super(2);
        this.a = oya0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        rhg1 rhg1Var = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        nhg1 nhg1Var = new nhg1(rhg1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bya0.class), runSequentially.a(nhg1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cya0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ohg1(rhg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dya0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new phg1(rhg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aya0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qhg1(rhg1Var)));
        return Mobius.d(kya0.a, new a(rhg1Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
