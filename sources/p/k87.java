package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k87 extends hab0 implements vu30 {
    public final /* synthetic */ zwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k87(zwg zwgVar) {
        super(2);
        this.a = zwgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        xb7 xb7Var = (xb7) obj;
        cir0 cir0Var = (cir0) obj2;
        x0p x0pVar = (x0p) ((p0p) this.a.a).a.c;
        dqu dquVar = new dqu((yvd) x0pVar.k.get(), (byte) 13);
        fwo fwoVar = x0pVar.i;
        ub7 ub7Var = x0pVar.b;
        ymu0 ymu0Var = (ymu0) ub7Var.p.get();
        c8o.l(ymu0Var);
        bnj0 bnj0Var = new bnj0(fwoVar, ymu0Var, (byte) 9);
        up41 up41Var = new up41((ec7) x0pVar.n.get(), (byte) 26);
        uic uicVar = new uic((byte) 8);
        yd1 yd1Var = new yd1((yvd) x0pVar.k.get(), (zx11) x0pVar.f76p.get());
        yd1 yd1Var2 = new yd1((yvd) x0pVar.k.get(), (zx11) x0pVar.f76p.get());
        tz01 tz01Var = new tz01((zx11) x0pVar.f76p.get(), (byte) 5);
        a0b a0bVar = new a0b((byte) 24);
        ilh1 ilh1Var = new ilh1((x5b0) x0pVar.r.get(), (aek1) x0pVar.s.get(), (byte) 1);
        x290 x290Var = (x290) ub7Var.I.get();
        c8o.l(x290Var);
        zgz0 zgz0Var = new zgz0(x290Var, (byte) 28);
        y390 y390Var = (y390) ub7Var.L.get();
        c8o.l(y390Var);
        iac0 iac0Var = x0pVar.c.d.c;
        c8o.m(iac0Var);
        vr51 vr51Var = new vr51(y390Var.a(iac0Var, r6h1.c), (byte) 8);
        by3 by3Var = (by3) ub7Var.w.get();
        c8o.l(by3Var);
        s6z0 s6z0Var = new s6z0(by3Var, (byte) 26);
        kt91 kt91Var = (kt91) ub7Var.o.get();
        c8o.l(kt91Var);
        q881 q881Var = new q881(kt91Var, (byte) 0);
        yh2 yh2Var = (yh2) ub7Var.H.get();
        c8o.l(yh2Var);
        tz01 tz01Var2 = new tz01(yh2Var, (byte) 19);
        q8n q8nVar = (q8n) ub7Var.d.get();
        c8o.l(q8nVar);
        ha7 ha7Var = new ha7(dquVar, bnj0Var, up41Var, uicVar, yd1Var, yd1Var2, tz01Var, a0bVar, ilh1Var, zgz0Var, vr51Var, s6z0Var, q881Var, tz01Var2, q8nVar);
        q8n q8nVar2 = (q8n) x0pVar.b.b.get();
        c8o.l(q8nVar2);
        ub7 ub7Var2 = x0pVar.b;
        q8n q8nVar3 = (q8n) ub7Var2.c.get();
        c8o.l(q8nVar3);
        bb7 bb7Var = new bb7();
        s0p s0pVar = (s0p) x0pVar.t.get();
        q8n q8nVar4 = (q8n) ub7Var2.d.get();
        c8o.l(q8nVar4);
        pb7 pb7Var = new pb7(ha7Var, q8nVar2, bb7Var, s0pVar, q8nVar4, xb7Var);
        yu3 yu3Var = new yu3(((x0p) s0pVar.a.c).a, cir0Var, xb7Var);
        mb7 mb7Var = new mb7();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        s97 s97Var = new s97(yu3Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e97.class), runSequentially.a(s97Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t97(ha7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u97(ha7Var, cir0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new ca7(ha7Var, xb7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new ea7(ha7Var, xb7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new ga7(ha7Var, xb7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v97()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w97(up41Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x97(vr51Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y97(ha7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z97(tz01Var2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aa7(ilh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new p97(zgz0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q97(ha7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f97.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r97(bnj0Var)));
        MobiusLoop.Builder builderD = Mobius.d(mb7Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI)).b(new nb7(pb7Var)).d(new ob7(pb7Var));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {k4p1.B((bbc) yu3Var.d), new nf(yoi1.g(xb7Var.Z), (byte) 13)};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar3, mr20VarArr)));
    }
}
