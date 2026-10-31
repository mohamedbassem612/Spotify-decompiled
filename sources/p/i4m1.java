package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i4m1 implements h0r0 {
    public final qyj a;
    public final a1r0 b;
    public final lzn0 c;
    public final kt91 d;
    public final iz31 e;
    public final x1i1 f;
    public final los g;
    public final zok0 h;
    public final g2m1 i;
    public final b2m1 j;
    public final err0 k;
    public final nxb l;
    public final cbr0 m;

    public i4m1(qyj qyjVar, k4m1 k4m1Var, i2m1 i2m1Var, a1r0 a1r0Var, lzn0 lzn0Var, kt91 kt91Var, iz31 iz31Var, x1i1 x1i1Var) {
        this.a = qyjVar;
        this.b = a1r0Var;
        this.c = lzn0Var;
        this.d = kt91Var;
        this.e = iz31Var;
        this.f = x1i1Var;
        los losVar = new los();
        this.g = losVar;
        String str = k4m1Var.a;
        this.h = new zok0(str, (byte) 7);
        bz11 bz11Var = new bz11(i2m1Var.a, i2m1Var.b, i2m1Var.c, i2m1Var.d, i2m1Var.e, i2m1Var.f, k4m1Var.b, new h4m1(this, (byte) 0), new e4m1(this, (byte) 1), new h4m1(this, (byte) 1), new h4m1(this, (byte) 2));
        q8n q8nVar = i2m1Var.h;
        trc0 trc0Var = j3m1.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        c3m1 c3m1Var = new c3m1(bz11Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k2m1.class), runSequentially.a(c3m1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e3m1(bz11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g3m1(bz11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i3m1(bz11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x2m1(bz11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y2m1(bz11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z2m1(bz11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l2m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a3m1(bz11Var)));
        a aVar = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
        iz31 iz31Var2 = i2m1Var.g;
        boolean zB = iz31Var2.b();
        d4m1 d4m1Var = new d4m1(str, false, false, zB ? ws61.c : ws61.a, "", true, 0, 0, 0, 0, 0, false, ouc.a, 0, 0, 0, false, "", z6x.a, w7x.a, (Integer) null, false, gzl1.c, false, false, true, false, false, false, zB, i2m1Var.i, (qu61) null);
        MobiusLoop.Builder builderD = Mobius.d(gp71.A, aVar);
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new puh1(iz31Var2.c(), (byte) 1)};
        companion.getClass();
        MobiusLoop.Controller controllerB = MobiusAndroid.b(builderD.h(new b(q8nVar, mr20VarArr)), d4m1Var, e2x0.Z0);
        qn qnVar = new qn(d4m1Var);
        controllerB.c(qnVar);
        g2m1 g2m1Var = new g2m1(controllerB, qnVar);
        this.i = g2m1Var;
        Consumer consumer = (Consumer) qnVar.c;
        if (consumer == null) {
            u890.C("eventConsumer");
            throw null;
        }
        this.j = new b2m1(consumer, (bpb1) qnVar.b, g2m1Var.b);
        this.k = new err0(0);
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 2781);
        this.l = nxbVar;
        losVar.b(new e4m1(this, (byte) 0));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.m = new cbr0(new dbr0[]{new bn70(yon1.G1("FITNESS_WORKOUT_SETTINGS", "fitness/workout-settings", 558, "fitness"), new lik1(str), (nar0) null), nxbVar, new cxb(new e4m1(this, (byte) 2), new j2i(-1695143729, new g4m1(this, (byte) 1), true)), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.m;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-583652546, new g4m1(this, (byte) 0), true));
    }
}
