package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pml1 extends hab0 implements vu30 {
    public final /* synthetic */ qml1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pml1(qml1 qml1Var) {
        super(2);
        this.a = qml1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kml1 kml1Var = this.a.e.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        iml1 iml1Var = new iml1(kml1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(scw.class), runSequentially.a(iml1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jml1(kml1Var)));
        return Mobius.d(nml1.a, new a(kml1Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
