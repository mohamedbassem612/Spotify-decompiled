package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q531 extends hab0 implements vu30 {
    public final /* synthetic */ r531 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q531(r531 r531Var) {
        super(2);
        this.a = r531Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        m531 m531Var = this.a.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        k531 k531Var = new k531(m531Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a531.class), runSequentially.a(k531Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b531.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l531(m531Var)));
        return Mobius.d(j531.a, new a(m531Var.c, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
