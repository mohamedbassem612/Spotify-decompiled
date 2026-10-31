package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yg5 {
    public final ppv0 a;
    public final ccy0 b;
    public final a c;

    public yg5(q8n q8nVar, ppv0 ppv0Var, ccy0 ccy0Var) {
        this.a = ppv0Var;
        this.b = ccy0Var;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xg5 xg5Var = new xg5();
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sg5.class), runSequentially.a(xg5Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qg5.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ug5(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rg5.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vg5(this)));
        this.c = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
