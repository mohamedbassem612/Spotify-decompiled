package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class byq extends hab0 implements vu30 {
    public final /* synthetic */ cyq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byq(cyq cyqVar) {
        super(2);
        this.a = cyqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        zxq zxqVar = this.a.b;
        yxq yxqVar = new yxq();
        nxq nxqVar = zxqVar.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gxq gxqVar = new gxq(nxqVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bxq.class), runSequentially.a(gxqVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(axq.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hxq(nxqVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zwq.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ixq(nxqVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dxq.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kxq(nxqVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cxq.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mxq(nxqVar)));
        return Mobius.d(yxqVar, new a(nxqVar.b, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
