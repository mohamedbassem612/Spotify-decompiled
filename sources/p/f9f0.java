package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f9f0 extends hab0 implements iu30 {
    public final /* synthetic */ g9f0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9f0(g9f0 g9f0Var) {
        super(1);
        this.a = g9f0Var;
    }

    public final Object invoke(Object obj) {
        d9f0 d9f0Var = this.a.b;
        c9f0 c9f0Var = new c9f0();
        v8f0 v8f0Var = d9f0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        wmy wmyVar = v8f0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        r8f0 r8f0Var = new r8f0(wmyVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m8f0.class), runSequentially.a(r8f0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n8f0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s8f0(wmyVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p8f0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t8f0(wmyVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o8f0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u8f0(wmyVar)));
        return Mobius.d(c9f0Var, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI)).f(CompositeLogger.g(new SLF4JLogger("lossless-mobius-onboarding"), d9f0Var.b));
    }
}
