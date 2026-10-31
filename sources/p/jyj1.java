package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jyj1 implements Function0 {
    public final q7r0 a;
    public final kt91 b;
    public final r8n0 c;
    public final u9c0 d;
    public final q8n e;
    public final q8n f;

    public jyj1(q7r0 q7r0Var, kt91 kt91Var, r8n0 r8n0Var, u9c0 u9c0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = q7r0Var;
        this.b = kt91Var;
        this.c = r8n0Var;
        this.d = u9c0Var;
        this.e = q8nVar;
        this.f = q8nVar2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a invoke() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        fyj1 fyj1Var = new fyj1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cyj1.class), runSequentially.a(fyj1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dyj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gyj1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(byj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new iyj1(this)));
        return new a(this.e, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
