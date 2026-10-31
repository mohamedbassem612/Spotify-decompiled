package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class fz7 {
    public static a a(yo00 yo00Var, zjx0 zjx0Var, y6m0 y6m0Var, y6m0 y6m0Var2) {
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        dz7 dz7Var = new dz7(yo00Var, zjx0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ty7.class), runSequentially.a(dz7Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wy7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ez7(yo00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sy7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yy7(yo00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vy7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zy7(yo00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uy7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new az7(y6m0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ry7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bz7(y6m0Var2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xy7.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cz7(yo00Var)));
        return new a(bs50Var, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
