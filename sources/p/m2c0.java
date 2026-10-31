package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m2c0 {
    public final j2c0 a;

    public m2c0(j2c0 j2c0Var) {
        this.a = j2c0Var;
    }

    public final MobiusLoop.Factory a() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        j2c0 j2c0Var = this.a;
        f2c0 f2c0Var = new f2c0(j2c0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hcw.class), runSequentially.a(f2c0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g2c0(j2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(edw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h2c0(j2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i2c0(j2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d2c0(j2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y8w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e2c0(j2c0Var)));
        return Mobius.d(l2c0.a, new a(j2c0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
