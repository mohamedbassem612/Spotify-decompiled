package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pll extends hab0 implements vu30 {
    public final /* synthetic */ qll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pll(qll qllVar) {
        super(2);
        this.a = qllVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        nll nllVar = this.a.b;
        jll jllVar = new jll();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        kll kllVar = new kll(nllVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pkl.class), runSequentially.a(kllVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rkl.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lll(nllVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qkl.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mll(nllVar)));
        return Mobius.d(jllVar, new a(nllVar.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
