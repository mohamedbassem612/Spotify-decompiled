package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jph1 extends hab0 implements vu30 {
    public final /* synthetic */ kph1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jph1(kph1 kph1Var) {
        super(2);
        this.a = kph1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        yoh1 yoh1Var = this.a.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        uoh1 uoh1Var = new uoh1(yoh1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(noh1.class), runSequentially.a(uoh1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(moh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new woh1(yoh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(koh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qoh1(yoh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(loh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new roh1(yoh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(joh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new soh1(yoh1Var)));
        return Mobius.d(iph1.a, new a(yoh1Var.f, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
