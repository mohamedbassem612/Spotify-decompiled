package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class stf extends hab0 implements iu30 {
    public final /* synthetic */ ttf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stf(ttf ttfVar) {
        super(1);
        this.a = ttfVar;
    }

    public final Object invoke(Object obj) {
        k9m0 k9m0Var = this.a.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        h9m0 h9m0Var = new h9m0(k9m0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(duf.class), runSequentially.a(h9m0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(buf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a9m0(k9m0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cuf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b9m0(k9m0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fuf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new d9m0(k9m0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(euf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new f9m0(k9m0Var)));
        return Mobius.d(z8m0.a, new a(k9m0Var.h, coroutinesSubtypeEffectHandlerBuilderI)).c(k9m0Var.e, new EventSource[]{k9m0Var.f, k9m0Var.g});
    }
}
