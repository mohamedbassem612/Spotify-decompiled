package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b0o0 implements Connectable {
    public final gqb0 a;
    public final svb0 b;
    public final q8n c;

    public b0o0(gqb0 gqb0Var, svb0 svb0Var, q8n q8nVar) {
        this.a = gqb0Var;
        this.b = svb0Var;
        this.c = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently runConcurrently = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently();
        yzn0 yzn0Var = new yzn0(this.a);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wzn0.class), runConcurrently.a(yzn0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vzn0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new a0o0(this.b)));
        return new a(this.c, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
