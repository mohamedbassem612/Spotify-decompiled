package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hty0 extends hab0 implements iu30 {
    public final /* synthetic */ ity0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hty0(ity0 ity0Var) {
        super(1);
        this.a = ity0Var;
    }

    public final Object invoke(Object obj) {
        fty0 fty0Var = this.a.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ety0 ety0Var = new ety0(fty0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(usy0.class), runSequentially.a(ety0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vsy0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cty0(fty0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tsy0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dty0(fty0Var)));
        return Mobius.d(bty0.a, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
