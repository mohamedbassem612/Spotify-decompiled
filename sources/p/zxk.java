package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zxk extends hab0 implements vu30 {
    public final /* synthetic */ ayk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxk(ayk aykVar) {
        super(2);
        this.a = aykVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        cir0 cir0Var = (cir0) obj2;
        czk czkVar = this.a.d;
        mzk mzkVar = new mzk(cir0Var, (byte) 1);
        xid xidVar = new xid(cir0Var);
        nxk nxkVar = new nxk(cir0Var, (byte) 1);
        nxk nxkVar2 = new nxk(cir0Var, (byte) 0);
        mzk mzkVar2 = new mzk(cir0Var, (byte) 0);
        yyk yykVar = czkVar.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        oyk oykVar = new oyk(yykVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hvk.class), runSequentially.a(oykVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new syk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eyk(xidVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ivk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new iyk(mzkVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jyk(mzkVar2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kyk(nxkVar2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ovk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lyk(nxkVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(svk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new myk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(evk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cyk(yykVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jvk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dyk(yykVar)));
        MobiusLoop.Builder builderD = Mobius.d(zyk.a, new a(yykVar.e, coroutinesSubtypeEffectHandlerBuilderI));
        jxk jxkVar = czkVar.d;
        mr20 mr20VarB = k4p1.B(mzkVar.a);
        mr20 mr20VarB2 = k4p1.B((bbc) xidVar.b);
        mr20 mr20VarB3 = k4p1.B(nxkVar.a);
        mr20 mr20VarB4 = k4p1.B(nxkVar2.a);
        mr20 mr20VarB5 = k4p1.B(mzkVar2.a);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = jxkVar.c;
        mr20[] mr20VarArr = {mr20VarB, new hxk(k4p1.B(jxkVar.a.a), (byte) 0), mr20VarB2, mr20VarB3, mr20VarB4, mr20VarB5, new nwd(jxkVar.b.d, (byte) 21)};
        companion.getClass();
        return builderD.h(new b(q8nVar, mr20VarArr)).d(new azk(czkVar)).b(new bzk(czkVar));
    }
}
