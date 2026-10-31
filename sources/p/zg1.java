package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zg1 extends hab0 implements vu30 {
    public final /* synthetic */ bh1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg1(bh1 bh1Var) {
        super(2);
        this.a = bh1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        xg1 xg1Var = this.a.c;
        rg1 rg1Var = new rg1();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        sg1 sg1Var = new sg1(xg1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gg1.class), runSequentially.a(sg1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kg1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tg1(xg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jg1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ug1(xg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ig1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vg1(xg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hg1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wg1(xg1Var)));
        return Mobius.d(rg1Var, new a(xg1Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
