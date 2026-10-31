package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bl20 extends hab0 implements iu30 {
    public final /* synthetic */ cl20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl20(cl20 cl20Var) {
        super(1);
        this.a = cl20Var;
    }

    public final Object invoke(Object obj) {
        zk20 zk20Var = this.a.b;
        wk20 wk20Var = new wk20();
        qk20 qk20Var = zk20Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        gal galVar = qk20Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(ok20.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pk20(galVar)));
        return Mobius.d(wk20Var, new a(qk20Var.b, coroutinesSubtypeEffectHandlerBuilderI)).d(new xk20(zk20Var)).b(new yk20(zk20Var));
    }
}
