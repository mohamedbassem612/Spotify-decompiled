package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ba9 extends hab0 implements vu30 {
    public final /* synthetic */ ca9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba9(ca9 ca9Var) {
        super(2);
        this.a = ca9Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        z99 z99Var = this.a.c;
        s99 s99Var = new s99();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        t99 t99Var = new t99(z99Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i99.class), runSequentially.a(t99Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h99.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u99(z99Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j99.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v99(z99Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e99.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w99(z99Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f99.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x99(z99Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g99.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y99(z99Var)));
        return Mobius.d(s99Var, new a(z99Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
