package p;

import android.content.res.Resources;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x46 extends hab0 implements vu30 {
    public final /* synthetic */ z46 a;
    public final /* synthetic */ a56 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x46(z46 z46Var, a56 a56Var) {
        super(2);
        this.a = z46Var;
        this.b = a56Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        cir0 cir0Var = (cir0) obj2;
        ca6 ca6Var = new ca6(cir0Var);
        z46 z46Var = this.a;
        x86 x86Var = z46Var.b;
        qzo qzoVar = z46Var.e;
        tbr0 tbr0VarC = cir0Var.c();
        wdm wdmVar = (wdm) qzoVar.a.c;
        Resources resources = (Resources) ((c56) wdmVar.b).g.get();
        c8o.l(resources);
        c56 c56Var = (c56) wdmVar.b;
        lzn0 lzn0Var = (lzn0) c56Var.e.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) c56Var.i.get();
        c8o.l(a1r0Var);
        q7r0 q7r0Var = (q7r0) wdmVar.d;
        q8n q8nVar = (q8n) c56Var.c.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) c56Var.d.get();
        c8o.l(q8nVar2);
        j46 j46Var = (j46) c56Var.a.get();
        c8o.l(j46Var);
        jab jabVar = (jab) c56Var.l.get();
        c8o.l(jabVar);
        x1i1 x1i1Var = (x1i1) c56Var.j.get();
        c8o.l(x1i1Var);
        ced0 ced0Var = new ced0((byte) 4);
        rg4 rg4Var = (rg4) c56Var.h.get();
        c8o.l(rg4Var);
        y66 y66Var = new y66(resources, lzn0Var, a1r0Var, q7r0Var, q8nVar, q8nVar2, j46Var, jabVar, x1i1Var, ced0Var, rg4Var, (l96) ((jly0) wdmVar.Y).get(), this.b, tbr0VarC);
        mr20 mr20VarB = k4p1.B(ca6Var.a);
        w46 w46Var = new w46(0, ca6Var, ca6.class, "launch", "launch()V", 0);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        m66 m66Var = new m66(y66Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g56.class), runSequentially.a(m66Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k66(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x56(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y56(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z56(y66Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a66(y66Var, w46Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w56.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b66(y66Var)));
        MobiusLoop.Builder builderB = Mobius.d(u86.a, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI)).d(new v86(x86Var)).b(new w86(x86Var));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar3 = x86Var.a;
        n86 n86Var = x86Var.c;
        mr20[] mr20VarArr = {mr20VarB, new r86(n86Var.h(), x86Var, (byte) 0), new r86(n86Var.d(), x86Var, (byte) 1), new c64(x86Var.d.c(), x86Var, (byte) 7)};
        companion.getClass();
        return builderB.h(new b(q8nVar3, mr20VarArr));
    }
}
