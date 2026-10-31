package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m8t0 extends hab0 implements vu30 {
    public final /* synthetic */ n8t0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8t0(n8t0 n8t0Var) {
        super(2);
        this.a = n8t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        j8t0 j8t0Var = this.a.b;
        e8t0 e8t0Var = new e8t0();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        f8t0 f8t0Var = new f8t0();
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w7t0.class), runSequentially.a(f8t0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z7t0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g8t0(j8t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y7t0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h8t0(j8t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x7t0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i8t0(j8t0Var)));
        return Mobius.d(e8t0Var, new a(j8t0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
