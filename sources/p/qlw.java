package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qlw {
    public final oj3 a;
    public final qut0 b;
    public final hku0 c;
    public final dp5 d;
    public final qpj1 e;
    public final il00 f;
    public final y1t0 g;
    public final ffe1 h;
    public final cp70 i;
    public final q8n j;

    public qlw(oj3 oj3Var, qut0 qut0Var, hku0 hku0Var, dp5 dp5Var, qpj1 qpj1Var, il00 il00Var, y1t0 y1t0Var, ffe1 ffe1Var, cp70 cp70Var, q8n q8nVar) {
        this.a = oj3Var;
        this.b = qut0Var;
        this.c = hku0Var;
        this.d = dp5Var;
        this.e = qpj1Var;
        this.f = il00Var;
        this.g = y1t0Var;
        this.h = ffe1Var;
        this.i = cp70Var;
        this.j = q8nVar;
    }

    public final a a(String str, iu30 iu30Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        nlw nlwVar = new nlw(this, str, iu30Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gip0.class), cancelPrevious.a(nlwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qgo.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new klw(this, str)));
        return new a(this.j, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
