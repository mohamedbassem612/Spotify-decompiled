package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kzm1 extends hab0 implements vu30 {
    public final /* synthetic */ qzm1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzm1(qzm1 qzm1Var) {
        super(2);
        this.a = qzm1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        gzm1 gzm1Var = this.a.c;
        zym1 zym1Var = new zym1();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        azm1 azm1Var = new azm1(gzm1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qym1.class), runSequentially.a(azm1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nym1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bzm1(gzm1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oym1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new czm1(gzm1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pym1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dzm1(gzm1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rym1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ezm1(gzm1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mym1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fzm1(gzm1Var)));
        return Mobius.d(zym1Var, new a(gzm1Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
