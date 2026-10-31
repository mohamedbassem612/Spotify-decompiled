package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q6g0 {
    public final a6g0 a;

    public q6g0(a6g0 a6g0Var) {
        this.a = a6g0Var;
    }

    public final MobiusLoop.Factory a() {
        p6g0 p6g0Var = new p6g0();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently runConcurrently = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently();
        a6g0 a6g0Var = this.a;
        r5g0 r5g0Var = new r5g0(a6g0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g5g0.class), runConcurrently.a(r5g0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a5g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new t5g0(a6g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b5g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new z5g0(a6g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f5g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new v5g0(a6g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e5g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m5g0(a6g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d5g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new x5g0(a6g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c5g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n5g0(a6g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z4g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o5g0(a6g0Var)));
        return Mobius.d(p6g0Var, new a(a6g0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
