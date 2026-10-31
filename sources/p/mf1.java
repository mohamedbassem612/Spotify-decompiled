package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mf1 extends hab0 implements vu30 {
    public final /* synthetic */ nf1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(nf1 nf1Var) {
        super(2);
        this.a = nf1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kf1 kf1Var = this.a.b;
        hf1 hf1Var = new hf1();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        if1 if1Var = new if1(kf1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(df1.class), runSequentially.a(if1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cf1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jf1(kf1Var)));
        return Mobius.d(hf1Var, new a(kf1Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
