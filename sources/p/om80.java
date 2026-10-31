package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class om80 {
    public final jc9 a;
    public final lzn0 b;
    public final q8n c;
    public final a d;

    public om80(jc9 jc9Var, lzn0 lzn0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = jc9Var;
        this.b = lzn0Var;
        this.c = q8nVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        nm80 nm80Var = new nm80(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jm80.class), runSequentially.a(nm80Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(km80.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lm80(this)));
        this.d = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
