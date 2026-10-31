package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sde extends hab0 implements iu30 {
    public final /* synthetic */ tde a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sde(tde tdeVar) {
        super(1);
        this.a = tdeVar;
    }

    public final Object invoke(Object obj) {
        kde kdeVar = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        jde jdeVar = new jde(kdeVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ede.class), runSequentially.a(jdeVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dde.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gde(kdeVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cde.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hde(kdeVar)));
        return Mobius.d(pde.a, new a(kdeVar.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
