package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class adi1 extends hab0 implements iu30 {
    public final /* synthetic */ bdi1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adi1(bdi1 bdi1Var) {
        super(1);
        this.a = bdi1Var;
    }

    public final Object invoke(Object obj) {
        mci1 mci1Var = this.a.c.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        lci1 lci1Var = new lci1(mci1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aci1.class), runSequentially.a(lci1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dci1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hci1(mci1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zbi1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fci1(mci1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eci1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ici1(mci1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cci1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gci1(mci1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bci1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jci1(mci1Var)));
        return Mobius.d(xci1.a, new a(mci1Var.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
