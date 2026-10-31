package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bua extends hab0 implements vu30 {
    public final /* synthetic */ dua a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bua(dua duaVar) {
        super(2);
        this.a = duaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        zta ztaVar = this.a.b;
        uta utaVar = new uta();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        vta vtaVar = new vta(ztaVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dta.class), runSequentially.a(vtaVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eta.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wta(ztaVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bta.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xta(ztaVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cta.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yta(ztaVar)));
        return Mobius.d(utaVar, new a(ztaVar.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
