package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c9g0 extends hab0 implements vu30 {
    public final /* synthetic */ d9g0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9g0(d9g0 d9g0Var) {
        super(2);
        this.a = d9g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        z8g0 z8g0Var = this.a.c;
        y8g0 y8g0Var = new y8g0();
        q8g0 q8g0Var = z8g0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently runConcurrently = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently();
        m8g0 m8g0Var = new m8g0(q8g0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w7g0.class), runConcurrently.a(m8g0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x7g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new o8g0(q8g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b8g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f8g0(q8g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z7g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g8g0(q8g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d8g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h8g0(q8g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a8g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i8g0(q8g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c8g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j8g0(q8g0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y7g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k8g0(q8g0Var)));
        return Mobius.d(y8g0Var, new a(q8g0Var.c, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
