package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fq31 {
    public final yqg a;
    public final iu30 b;
    public final iu30 c;
    public final a d;

    public fq31(q8n q8nVar, yqg yqgVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = yqgVar;
        this.b = iu30Var;
        this.c = iu30Var2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        eq31 eq31Var = new eq31(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aq31.class), runSequentially.a(eq31Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zp31.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bq31(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yp31.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cq31(this)));
        this.d = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
