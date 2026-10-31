package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xc1 extends hab0 implements vu30 {
    public final /* synthetic */ yc1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(yc1 yc1Var) {
        super(2);
        this.a = yc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        vc1 vc1Var = this.a.c;
        qc1 qc1Var = new qc1();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        uc1 uc1Var = new uc1(vc1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ic1.class), runSequentially.a(uc1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gc1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rc1(vc1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hc1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new sc1(vc1Var)));
        return Mobius.d(qc1Var, new a(vc1Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
