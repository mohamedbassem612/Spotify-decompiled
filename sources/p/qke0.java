package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qke0 implements Connectable {
    public final /* synthetic */ a a;

    public qke0(bb01 bb01Var, nl51 nl51Var, esg esgVar, rzo0 rzo0Var, in01 in01Var, qes qesVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        pke0 pke0Var = new pke0(bb01Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ake0.class), cancelPrevious.a(pke0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bke0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ike0(nl51Var, esgVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fke0(esgVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new nke0(rzo0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jke0(in01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kke0(in01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lke0(qesVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mje0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gke0(qesVar)));
        fns fnsVar = igu.a;
        this.a = new a(pyf0.a, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
