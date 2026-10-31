package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cug1 extends hab0 implements iu30 {
    public final /* synthetic */ dug1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cug1(dug1 dug1Var) {
        super(1);
        this.a = dug1Var;
    }

    public final Object invoke(Object obj) {
        dug1 dug1Var = this.a;
        aug1 aug1Var = dug1Var.d;
        bug1 bug1Var = new bug1(0, dug1Var, dug1.class, "dismissSheet", "dismissSheet()V", 0);
        xtg1 xtg1Var = new xtg1();
        jnq jnqVar = (jnq) aug1Var.a.a.c;
        k4q0 k4q0Var = (k4q0) ((eug1) jnqVar.d).d.get();
        c8o.l(k4q0Var);
        eug1 eug1Var = (eug1) jnqVar.d;
        u4q0 u4q0Var = (u4q0) eug1Var.f.get();
        c8o.l(u4q0Var);
        wgq0 wgq0Var = (wgq0) eug1Var.g.get();
        c8o.l(wgq0Var);
        i8h1 i8h1Var = (i8h1) eug1Var.e.get();
        c8o.l(i8h1Var);
        ffe1 ffe1Var = new ffe1(i8h1Var, (fug1) jnqVar.c, (byte) 15);
        lzn0 lzn0Var = (lzn0) eug1Var.h.get();
        c8o.l(lzn0Var);
        utg1 utg1Var = new utg1(k4q0Var, u4q0Var, wgq0Var, ffe1Var, lzn0Var, bug1Var);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ktg1 ktg1Var = new ktg1(utg1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gaw.class), runSequentially.a(ktg1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rtg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(odw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ttg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xgw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jtg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ltg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ybw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mtg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ocw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ntg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new otg1(utg1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(idw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ptg1(utg1Var)));
        MobiusLoop.Builder builderB = Mobius.d(xtg1Var, new a(aug1Var.d, coroutinesSubtypeEffectHandlerBuilderI)).d(new ytg1(aug1Var)).b(new ztg1(aug1Var));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = aug1Var.e;
        mr20[] mr20VarArr = {new xkb1(new jha1(aug1Var.b.g(), (byte) 22), (byte) 7)};
        companion.getClass();
        return builderB.h(new b(q8nVar, mr20VarArr));
    }
}
