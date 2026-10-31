package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vtr0 extends hab0 implements vu30 {
    public final /* synthetic */ wtr0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtr0(wtr0 wtr0Var) {
        super(2);
        this.a = wtr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ptr0 ptr0Var = this.a.e.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        mtr0 mtr0Var = new mtr0(ptr0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vcw.class), runSequentially.a(mtr0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ntr0(ptr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new otr0(ptr0Var)));
        return Mobius.d(ttr0.a, new a(ptr0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
