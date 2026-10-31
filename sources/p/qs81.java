package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qs81 implements Connectable {
    public final /* synthetic */ a a;

    public qs81(s631 s631Var, z9s0 z9s0Var, rok0 rok0Var, jpa0 jpa0Var, y281 y281Var, tym0 tym0Var, haa0 haa0Var, jxa jxaVar, yt91 yt91Var, q8n q8nVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ds81 ds81Var = new ds81(s631Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zr81.class), runSequentially.a(ds81Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yr81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new es81(z9s0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xr81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new gs81(rok0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wr81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new js81(jpa0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bs81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ls81(y281Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tr81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fs81(tym0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vr81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ns81(haa0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ur81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ps81()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(as81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new hs81(yt91Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
