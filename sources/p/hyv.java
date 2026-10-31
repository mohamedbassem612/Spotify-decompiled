package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hyv extends hab0 implements vu30 {
    public final /* synthetic */ iyv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyv(iyv iyvVar) {
        super(2);
        this.a = iyvVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        dyv dyvVar = this.a.e;
        nbc nbcVar = dyvVar.a;
        ayv ayvVar = new ayv();
        ixv ixvVar = dyvVar.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        jpa0 jpa0Var = ixvVar.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gxv gxvVar = new gxv(jpa0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(exv.class), runSequentially.a(gxvVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fxv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hxv(ixvVar.b)));
        MobiusLoop.Builder builderD = Mobius.d(ayvVar, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
        txv txvVar = dyvVar.c;
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = txvVar.d;
        mr20 x3sVar = new x3s(txvVar.a.b, (byte) 19);
        cxv cxvVar = txvVar.c;
        mr20[] mr20VarArr = {x3sVar, rqt0.u(new x010(new dwv(cxvVar.a, (byte) 3), new dwv(cxvVar.b, (byte) 4), new ce2(3, (lnm) null, (byte) 16), (byte) 1)), new x3s(rqt0.u(txvVar.b.a("publish-playlist", true)), (byte) 20)};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr))).b(new byv(dyvVar)).d(new cyv(dyvVar));
    }
}
