package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pvk1 implements Connectable {
    public final lzn0 a;
    public final dzp0 b;
    public final iyc0 c;
    public final jxk1 d;
    public final q8n e;
    public final a f;

    public pvk1(lzn0 lzn0Var, dzp0 dzp0Var, iyc0 iyc0Var, jxk1 jxk1Var, q8n q8nVar, q8n q8nVar2) {
        this.a = lzn0Var;
        this.b = dzp0Var;
        this.c = iyc0Var;
        this.d = jxk1Var;
        this.e = q8nVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ovk1 ovk1Var = new ovk1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jvk1.class), runSequentially.a(ovk1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ivk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lvk1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kvk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mvk1(this)));
        this.f = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.f.L(consumer);
    }
}
