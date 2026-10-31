package p;

import android.content.Context;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l4p0 {
    public final ro30 a;
    public final q8n b;
    public final q8n c;
    public final qmu d;
    public final qzn0 e;
    public final l7m0 f;
    public final Context g;
    public final npd h;
    public final ow3 i;
    public final t290 j;

    public l4p0(ro30 ro30Var, q8n q8nVar, q8n q8nVar2, qmu qmuVar, qzn0 qzn0Var, l7m0 l7m0Var, Context context, npd npdVar, ow3 ow3Var, t290 t290Var) {
        this.a = ro30Var;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = qmuVar;
        this.e = qzn0Var;
        this.f = l7m0Var;
        this.g = context;
        this.h = npdVar;
        this.i = ow3Var;
        this.j = t290Var;
    }

    public final MobiusLoop a() {
        wam0 wam0Var = new wam0((byte) 2);
        lhd lhdVar = new lhd();
        lhdVar.a = op71.f();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        qmu qmuVar = this.d;
        d3p0 d3p0Var = new d3p0(qmuVar, this.g, lhdVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v2p0.class), runSequentially.a(d3p0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x2p0.class), new khd(lhdVar, new b3p0(qmuVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w2p0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y2p0(lhdVar, this.e)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u2p0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z2p0(lhdVar, qmuVar)));
        q8n q8nVar = this.c;
        MobiusLoop.Builder builderD = Mobius.d(wam0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20 k6e0Var = new k6e0(new r6k0(this.h.g, (byte) 25), (byte) 13);
        mr20 sii0Var = new sii0(this.j.b, this, (byte) 14);
        goq goqVar = (goq) this.a.b;
        mr20[] mr20VarArr = {k6e0Var, sii0Var, new lt20(new r6k0(goqVar.r(), (byte) 26), new ob00(3, null, (byte) 15), (byte) 0), new lt20(new r6k0(rqt0.u(new vow((kge) goqVar.h, goqVar, (byte) 0)), (byte) 27), new ob00(3, null, (byte) 16), (byte) 0), new lt20(new k6e0((vpg0) this.i.c, (byte) 14), new ob00(3, null, (byte) 14), (byte) 0), new huz(new q3p0[0], (byte) 9)};
        companion.getClass();
        MobiusLoop.Builder builderG = l1d.g(builderD.c(new b(q8nVar, mr20VarArr), new EventSource[0]).b(new l1p0(this, (byte) 1)).d(new tym0(this, (byte) 9)));
        q4p0 q4p0Var = new q4p0(60);
        xj61 xj61Var = new xj61();
        if (((k84) this.f.b).p()) {
            xj61Var.add(v2p0.a);
        }
        return builderG.a(q4p0Var, cwl1.j(xj61Var));
    }
}
