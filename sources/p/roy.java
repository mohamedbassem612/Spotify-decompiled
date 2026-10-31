package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class roy implements Connectable {
    public final /* synthetic */ xoy a;

    public roy(xoy xoyVar) {
        this.a = xoyVar;
    }

    public final Connection L(Consumer consumer) {
        p811 p811Var = new p811();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        xoy xoyVar = this.a;
        qoy qoyVar = new qoy(p811Var, xoyVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aoy.class), cancelPrevious.a(qoyVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(boy.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new noy(p811Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zny.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ooy(xoyVar)));
        return new rp(new a(xoyVar.i, coroutinesSubtypeEffectHandlerBuilderI).L(consumer), (byte) 25);
    }
}
