package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uvf0 extends hab0 implements vu30 {
    public final /* synthetic */ vvf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvf0(vvf0 vvf0Var) {
        super(2);
        this.a = vvf0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kvf0 kvf0Var = this.a.d.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        p410 p410Var = kvf0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        fvf0 fvf0Var = new fvf0(p410Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(avf0.class), runSequentially.a(fvf0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cvf0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hvf0(kvf0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bvf0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jvf0(kvf0Var)));
        return Mobius.d(rvf0.a, new a(kvf0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
