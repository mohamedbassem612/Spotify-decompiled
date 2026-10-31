package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class spk1 extends hab0 implements vu30 {
    public final /* synthetic */ upk1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spk1(upk1 upk1Var) {
        super(2);
        this.a = upk1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        pqk1 pqk1Var = this.a.c;
        tbr0 tbr0VarC = ((cir0) obj2).c();
        lqk1 lqk1Var = pqk1Var.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(bqk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kqk1(tbr0VarC)));
        return Mobius.d(mqk1.a, new a(lqk1Var.a, coroutinesSubtypeEffectHandlerBuilderI)).d(new nqk1(pqk1Var)).b(new oqk1(pqk1Var));
    }
}
