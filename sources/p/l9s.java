package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l9s implements wpw {
    public final q8n a;
    public final zic b;
    public final oll1 c;
    public final cir0 d;
    public m4r e;
    public final e7m0 f;
    public final ia00 g;
    public final nsw h;

    public l9s(q8n q8nVar, zic zicVar, qmc qmcVar, dvq dvqVar, oll1 oll1Var, cir0 cir0Var) {
        this.a = q8nVar;
        this.b = zicVar;
        this.c = oll1Var;
        this.d = cir0Var;
        uhj0 uhj0Var = new uhj0();
        t2m t2mVar = t2m.h;
        kp5 kp5Var = (kp5) dvqVar.a.c;
        q8n q8nVar2 = (q8n) ((tkl1) kp5Var.a).i.get();
        c8o.l(q8nVar2);
        tkl1 tkl1Var = (tkl1) kp5Var.a;
        q8n q8nVar3 = (q8n) tkl1Var.h.get();
        c8o.l(q8nVar3);
        g341 g341Var = (g341) tkl1Var.g.get();
        c8o.l(g341Var);
        ldj0 ldj0Var = (ldj0) tkl1Var.b.get();
        c8o.l(ldj0Var);
        z4q0 z4q0Var = (z4q0) tkl1Var.e.get();
        c8o.l(z4q0Var);
        w7q0 w7q0Var = (w7q0) tkl1Var.d.get();
        c8o.l(w7q0Var);
        cll1 cll1Var = new cll1(q8nVar2, q8nVar3, g341Var, ldj0Var, z4q0Var, w7q0Var, (oll1) ((jly0) kp5Var.f).get(), cir0Var);
        cir0Var.g().d.c.getLifecycle().a(new i83(cll1Var, (byte) 26));
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        p811 p811Var = new p811();
        p811 p811Var2 = new p811();
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        vkl1 vkl1Var = new vkl1(cll1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wgj0.class), runSequentially.a(vkl1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xgj0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wkl1(cll1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ygj0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new zkl1(cll1Var, p811Var2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zgj0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bll1(p811Var, cll1Var, p811Var2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vgj0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xkl1(p811Var)));
        this.f = sbl.B(uhj0Var, t2mVar, new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI), new sqk(this, (byte) 26), new i9s(this, qmcVar));
        this.g = n3o1.q(this).a(zyr.V0, zyr.W0);
        this.h = new nsw(new k9s(this, (byte) 0), true);
    }

    public final rqw a() {
        return this.g;
    }

    public final rsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
