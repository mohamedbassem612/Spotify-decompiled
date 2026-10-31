package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rzf extends hab0 implements iu30 {
    public final /* synthetic */ szf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzf(szf szfVar) {
        super(1);
        this.a = szfVar;
    }

    public final Object invoke(Object obj) {
        pzf pzfVar = this.a.b;
        ozf ozfVar = new ozf();
        lzf lzfVar = pzfVar.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(hzf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kzf(lzfVar)));
        return Mobius.d(ozfVar, new a(lzfVar.a, coroutinesSubtypeEffectHandlerBuilderI)).f(pzfVar.b);
    }
}
