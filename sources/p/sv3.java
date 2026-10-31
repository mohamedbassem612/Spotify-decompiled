package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sv3 extends hab0 implements vu30 {
    public final /* synthetic */ tv3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv3(tv3 tv3Var) {
        super(2);
        this.a = tv3Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        pv3 pv3Var = this.a.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        nv3 nv3Var = new nv3(pv3Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(su3.class), runSequentially.a(nv3Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tu3.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ov3(pv3Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ru3.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lv3(pv3Var)));
        return Mobius.d(kv3.a, new a(pv3Var.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
