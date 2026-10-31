package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nc2 extends hab0 implements vu30 {
    public final /* synthetic */ oc2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc2(oc2 oc2Var) {
        super(2);
        this.a = oc2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ic2 ic2Var = this.a.c.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gc2 gc2Var = new gc2(ic2Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tcw.class), runSequentially.a(gc2Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(raw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hc2(ic2Var)));
        return Mobius.d(lc2.a, new a(ic2Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
