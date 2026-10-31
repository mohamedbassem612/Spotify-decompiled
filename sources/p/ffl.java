package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ffl implements Connectable {
    public final /* synthetic */ a a;

    public ffl(bel belVar, q8n q8nVar, mzk mzkVar, tbr0 tbr0Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        bfl bflVar = new bfl(mzkVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fel.class), runSequentially.a(bflVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hel.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cfl(tbr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gel.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new efl(belVar)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
