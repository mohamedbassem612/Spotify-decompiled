package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zzi1 extends hab0 implements vu30 {
    public final /* synthetic */ a0j1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi1(a0j1 a0j1Var) {
        super(2);
        this.a = a0j1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kzi1 kzi1Var = this.a.b.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        fzi1 fzi1Var = new fzi1(kzi1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(czi1.class), runSequentially.a(fzi1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bzi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gzi1(kzi1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dzi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hzi1(kzi1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ezi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new izi1(kzi1Var)));
        return Mobius.d(qzi1.a, new a(kzi1Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
