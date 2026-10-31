package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xb21 extends hab0 implements vu30 {
    public final /* synthetic */ yb21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb21(yb21 yb21Var) {
        super(2);
        this.a = yb21Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ob21 ob21Var = this.a.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        lb21 lb21Var = new lb21(ob21Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eb21.class), runSequentially.a(lb21Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ab21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gb21(ob21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bb21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hb21(ob21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(db21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ib21(ob21Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cb21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jb21(ob21Var)));
        return Mobius.d(wb21.a, new a(ob21Var.f, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
