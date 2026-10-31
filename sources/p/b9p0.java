package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class b9p0 {
    public static final a a(w9u0 w9u0Var, klm1 klm1Var, q8n q8nVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        u8p0 u8p0Var = new u8p0(w9u0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qlm1.class), runSequentially.a(u8p0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rlm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v8p0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nlm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w8p0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mlm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x8p0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(plm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y8p0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(olm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z8p0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(llm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a9p0(q8nVar, klm1Var)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
