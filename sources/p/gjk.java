package p;

import android.content.Context;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gjk extends hab0 implements vu30 {
    public final /* synthetic */ hjk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjk(hjk hjkVar) {
        super(2);
        this.a = hjkVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        djk djkVar = this.a.b;
        lzn0 lzn0Var = djkVar.a;
        y1t0 y1t0Var = djkVar.b;
        bhk bhkVar = djkVar.c;
        ero eroVar = djkVar.d;
        g341 g341Var = djkVar.e;
        u9u0 u9u0Var = djkVar.f;
        gr6 gr6Var = djkVar.g;
        Context context = djkVar.h;
        dg30 dg30Var = djkVar.i;
        qfl1 qfl1Var = djkVar.j;
        sd41 sd41Var = djkVar.k;
        wmy wmyVar = djkVar.l;
        qnv0 qnv0Var = djkVar.n;
        sw9 sw9Var = djkVar.o;
        dto0 dto0Var = djkVar.f10p;
        rm5 rm5Var = djkVar.q;
        kba kbaVar = djkVar.r;
        dg8 dg8Var = djkVar.s;
        kt91 kt91Var = djkVar.t;
        qa00 qa00Var = djkVar.u;
        yqg yqgVar = djkVar.x;
        boolean z = djkVar.v.p;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        jhk jhkVar = new jhk(lzn0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qfk.class), runSequentially.a(jhkVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new khk(lzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lhk(bhkVar, dg30Var, context, kt91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cgk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mhk(y1t0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(egk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vhk(sd41Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nhk(eroVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new whk(eroVar, g341Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ofk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ohk(context)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new phk(dg30Var, context, kt91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ufk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xhk(u9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qhk(gr6Var, qfl1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(agk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rhk(wmyVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ggk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ihk(wmyVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dgk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zhk(qnv0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fgk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aik(qnv0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hgk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bik(new ew0(sw9Var, (lnm) null, (byte) 11))));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bgk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cik(dg30Var, dto0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dik(qa00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eik(kbaVar, dg8Var, yqgVar, z)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new thk(kbaVar, dg8Var, yqgVar, z)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vfk.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uhk(rm5Var, dg8Var, kbaVar, kt91Var, yqgVar, z)));
        MobiusLoop.Builder builderD = Mobius.d(ajk.a, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        xy0 xy0Var = new xy0(u9u0Var.a(), (byte) 8);
        String str = djkVar.m.b;
        mr20[] mr20VarArr = {xy0Var, new wef(yoi1.g(sd41Var.c(str)), (byte) 4), yoi1.g(qnv0Var.c(mmq0.b, 6, str).toObservable().map(new i3b(djkVar, (byte) 18))), new qbk(new nwd(djkVar.w.getLifecycle().c(), (byte) 18), djkVar, (byte) 1)};
        companion.getClass();
        return gvg.d("Event-page", builderD.h(new b(fnsVar, mr20VarArr)));
    }
}
