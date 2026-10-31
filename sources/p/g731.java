package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g731 implements b731 {
    public final q8n a;
    public final v1k b;

    public g731(q8n q8nVar, q731 q731Var, n6r0 n6r0Var) {
        this.a = q8nVar;
        this.b = q731Var.a(n6r0Var);
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious();
        e731 e731Var = new e731(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y631.class), coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious.a(e731Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z631.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new c731(this)));
        return new com.spotify.mobius.coroutines.a(this.a, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
