package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bc31 implements Connectable {
    public final /* synthetic */ a a;

    public bc31(String str, String str2, r0x r0xVar, x390 x390Var, ccq ccqVar, q8n q8nVar, y48 y48Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        wb31 wb31Var = new wb31(r0xVar, str);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wa31.class), cancelPrevious.a(wb31Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xa31.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yb31(str, y48Var, str2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ya31.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ac31(ccqVar, str, x390Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(za31.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ub31(ccqVar, str)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
