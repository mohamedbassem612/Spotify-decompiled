package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tud1 extends hab0 implements vu30 {
    public final /* synthetic */ uud1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tud1(uud1 uud1Var) {
        super(2);
        this.a = uud1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        rud1 rud1Var = this.a.d;
        fud1 fud1Var = rud1Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        bud1 bud1Var = new bud1(fud1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(utd1.class), cancelPrevious.a(bud1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wtd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new dud1(fud1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vtd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ytd1(fud1Var)));
        return Mobius.d(oud1.a, new a(fud1Var.a, coroutinesSubtypeEffectHandlerBuilderI)).d(new pud1(rud1Var)).b(new qud1(rud1Var));
    }
}
