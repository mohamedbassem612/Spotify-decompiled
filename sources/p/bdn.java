package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bdn extends hab0 implements vu30 {
    public final /* synthetic */ cdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdn(cdn cdnVar) {
        super(2);
        this.a = cdnVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        cqz0 cqz0Var = dqz0.a;
        drm1 drm1Var = new drm1();
        jcn jcnVar = this.a.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        gcn gcnVar = new gcn(jcnVar.a);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wbn.class), cancelPrevious.a(gcnVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ybn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new icn()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vbn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new dcn(jcnVar.b)));
        tz01 tz01Var = jcnVar.e;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xbn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ecn(tz01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zbn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bcn(jcnVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ubn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ccn(jcnVar)));
        return Mobius.d(drm1Var, new a(jcnVar.f, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
