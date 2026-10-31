package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lpf {
    public final bfd a;
    public final kt91 b;
    public final q8n c;
    public final a d;

    public lpf(bfd bfdVar, kt91 kt91Var, q8n q8nVar, q8n q8nVar2) {
        this.a = bfdVar;
        this.b = kt91Var;
        this.c = q8nVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        kpf kpfVar = new kpf(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gpf.class), runSequentially.a(kpfVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hpf.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ipf(this)));
        this.d = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
