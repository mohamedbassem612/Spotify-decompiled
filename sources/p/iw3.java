package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iw3 extends hab0 implements vu30 {
    public final /* synthetic */ jw3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw3(jw3 jw3Var) {
        super(2);
        this.a = jw3Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        gx3 gx3Var = this.a.e;
        fx3 fx3Var = new fx3();
        ax3 ax3Var = gx3Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xw3 xw3Var = new xw3(ax3Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rw3.class), runSequentially.a(xw3Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tw3.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uw3(ax3Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sw3.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vw3(ax3Var)));
        return Mobius.d(fx3Var, new a(ax3Var.i, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
