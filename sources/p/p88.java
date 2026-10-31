package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p88 extends hab0 implements vu30 {
    public final /* synthetic */ q88 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p88(q88 q88Var) {
        super(2);
        this.a = q88Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = this.a.b;
        k88 k88Var = new k88();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        l88 l88Var = new l88(n88Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g88.class), runSequentially.a(l88Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f88.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m88(n88Var)));
        return Mobius.d(k88Var, new a(n88Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
