package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class deg0 extends hab0 implements vu30 {
    public final /* synthetic */ eeg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deg0(eeg0 eeg0Var) {
        super(2);
        this.a = eeg0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        xxb0 xxb0Var = xxb0.q;
        xdg0 xdg0Var = this.a.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        wdg0 wdg0Var = new wdg0(xdg0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sdg0.class), runSequentially.a(wdg0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tdg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new udg0(xdg0Var)));
        return Mobius.d(xxb0Var, new a(xdg0Var.d, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
