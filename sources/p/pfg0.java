package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pfg0 extends hab0 implements vu30 {
    public final /* synthetic */ qfg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfg0(qfg0 qfg0Var) {
        super(2);
        this.a = qfg0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        xxb0 xxb0Var = xxb0.r;
        hfg0 hfg0Var = this.a.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xeg0 xeg0Var = new xeg0(hfg0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(seg0.class), runSequentially.a(xeg0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ueg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new afg0(hfg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(teg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new cfg0(hfg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(veg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new efg0(hfg0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(weg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yeg0(hfg0Var)));
        return Mobius.d(xxb0Var, new a(hfg0Var.e, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
