package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nsu implements Function0 {
    public final f1n0 a;
    public final lmw b;
    public final fey c;
    public final q8n d;

    public nsu(f1n0 f1n0Var, lmw lmwVar, fey feyVar, q8n q8nVar) {
        this.a = f1n0Var;
        this.b = lmwVar;
        this.c = feyVar;
        this.d = q8nVar;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a invoke() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        jsu jsuVar = new jsu(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(asu.class), cancelPrevious.a(jsuVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bsu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fsu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dsu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gsu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(csu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hsu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(esu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new lsu()));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
