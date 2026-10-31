package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x5d1 implements Connectable {
    public final /* synthetic */ a a;

    public x5d1(c6d1 c6d1Var, esa1 esa1Var, cof0 cof0Var, hp91 hp91Var, il0 il0Var, q8n q8nVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        h5d1 h5d1Var = new h5d1(cof0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d5d1.class), runSequentially.a(h5d1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x4d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i5d1(esa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w4d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j5d1(esa1Var, c6d1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e5d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q5d1(cof0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v4d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s5d1(il0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y4d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k5d1(cof0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z4d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l5d1(hp91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a5d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m5d1(cof0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c5d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n5d1(cof0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f5d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o5d1(esa1Var, cof0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b5d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u5d1(il0Var, c6d1Var, esa1Var, cof0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u4d1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w5d1(c6d1Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
