package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yb40 extends hab0 implements vu30 {
    public final /* synthetic */ zb40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb40(zb40 zb40Var) {
        super(2);
        this.a = zb40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        zb40 zb40Var = this.a;
        vb40 vb40Var = zb40Var.e;
        String str = zb40Var.c.d;
        ub40 ub40Var = new ub40();
        ib40 ib40Var = vb40Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        bb40 bb40Var = new bb40(ib40Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wa40.class), runSequentially.a(bb40Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(za40.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cb40(ib40Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ya40.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new db40(ib40Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xa40.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eb40(ib40Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ab40.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gb40(ib40Var)));
        return Mobius.d(ub40Var, new a(ib40Var.e, coroutinesSubtypeEffectHandlerBuilderI)).f(new tb40(str, u1n0.z(((cjp) vb40Var.b.a.b).a)));
    }
}
