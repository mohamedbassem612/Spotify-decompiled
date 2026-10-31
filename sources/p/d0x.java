package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d0x implements Connectable {
    public final /* synthetic */ a a;
    public final List b;

    public d0x(List list, q8n q8nVar, wen0 wen0Var, sen0 sen0Var, z1x z1xVar, d1x d1xVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        yzw yzwVar = new yzw();
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gju.class), cancelPrevious.a(yzwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(veu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new a0x()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o4w0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c0x(list)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tn0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rzw(wen0Var, z1xVar, sen0Var, d1xVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uc21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new szw(d1xVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tc21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tzw(d1xVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fr0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uzw(d1xVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(byd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vzw(d1xVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wik1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wzw(d1xVar)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
        this.b = list;
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
