package p;

import android.content.Context;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dak implements Connectable {
    public final /* synthetic */ a a;

    public dak(q8n q8nVar, q8n q8nVar2, rm5 rm5Var, uu00 uu00Var, kt91 kt91Var, Context context, yqg yqgVar, xrk xrkVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        aak aakVar = new aak(xrkVar, uu00Var, q8nVar2);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s9k.class), cancelPrevious.a(aakVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r9k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x9k(uu00Var, q8nVar2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q9k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y9k(rm5Var, kt91Var, context)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t9k.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new cak(yqgVar, rm5Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
