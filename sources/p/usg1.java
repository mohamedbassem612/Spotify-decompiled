package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class usg1 extends hab0 implements vu30 {
    public final /* synthetic */ vsg1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usg1(vsg1 vsg1Var) {
        super(2);
        this.a = vsg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        tsg1 tsg1Var = this.a.b;
        psg1 psg1Var = tsg1Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        nsg1 nsg1Var = new nsg1(psg1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hdw.class), runSequentially.a(nsg1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new osg1(psg1Var)));
        return Mobius.d(qsg1.a, new a(tsg1Var.b, coroutinesSubtypeEffectHandlerBuilderI)).d(new rsg1(tsg1Var)).b(new ssg1(tsg1Var));
    }
}
