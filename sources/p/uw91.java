package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uw91 extends hab0 implements iu30 {
    public final /* synthetic */ vw91 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw91(vw91 vw91Var) {
        super(1);
        this.a = vw91Var;
    }

    public final Object invoke(Object obj) {
        irs irsVar = this.a.d;
        zqs zqsVar = irsVar.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(lw91.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yqs(zqsVar)));
        return Mobius.d(frs.a, new a(zqsVar.a, coroutinesSubtypeEffectHandlerBuilderI)).d(new grs(irsVar)).b(new hrs(irsVar));
    }
}
