package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ka21 extends hab0 implements vu30 {
    public final /* synthetic */ la21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka21(la21 la21Var) {
        super(2);
        this.a = la21Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ba21 ba21Var = this.a.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        z921 z921Var = new z921(ba21Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t921.class), runSequentially.a(z921Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q921.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v921(ba21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s921.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w921(ba21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r921.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x921(ba21Var)));
        return Mobius.d(ja21.a, new a(ba21Var.e, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
