package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gnq {
    public final /* synthetic */ ykq a;

    public gnq(ykq ykqVar) {
        this.a = ykqVar;
    }

    public final sak a(cir0 cir0Var) {
        z9p z9pVar = (z9p) this.a.c;
        e7q e7qVar = (e7q) ((v801) z9pVar.k).v.get();
        c8o.l(e7qVar);
        cx0 cx0Var = new cx0((byte) 22);
        Scheduler scheduler = (Scheduler) ((ykq) z9pVar.l).get();
        FlowableFilter flowableFilterH = z9pVar.h();
        Flowable flowable = (Flowable) ((jly0) z9pVar.t).get();
        v801 v801Var = (v801) z9pVar.k;
        uvy uvyVar = (uvy) v801Var.w.get();
        c8o.l(uvyVar);
        d0r d0rVar = (d0r) ((jly0) z9pVar.d).get();
        q8n q8nVar = (q8n) v801Var.f.get();
        c8o.l(q8nVar);
        luk lukVarA = v801Var.a();
        c8o.l(lukVarA);
        hv4 hv4Var = new hv4(false, false, false, lukVarA);
        kly0 kly0Var = v801Var.D;
        dma1 dma1Var = (dma1) kly0Var.get();
        c8o.l(dma1Var);
        acl aclVar = new acl(flowableFilterH, flowable, uvyVar, d0rVar, q8nVar, hv4Var, dma1Var);
        ruz ruzVarD = z9pVar.d();
        Consumer consumer = (Consumer) ((jly0) z9pVar.v).get();
        dma1 dma1Var2 = (dma1) kly0Var.get();
        c8o.l(dma1Var2);
        zr51 zr51Var = new zr51(ruzVarD, consumer, dma1Var2);
        luk lukVarA2 = v801Var.a();
        c8o.l(lukVarA2);
        y441 y441Var = new y441(scheduler, aclVar, zr51Var, new zu4(false, lukVarA2));
        ruz ruzVarD2 = z9pVar.d();
        gn10 gn10Var = mno1.b0;
        FlowableMap flowableMapF = f2u0.f(z9pVar.h());
        FlowableFilter flowableFilterH2 = z9pVar.h();
        mo9 mo9Var = mo9.O0;
        Flowable flowableJ = flowableFilterH2.j(mo9Var);
        Flowable flowableJ2 = z9pVar.h().j(mo9.N0);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d(z9pVar.h());
        pe peVar = (pe) v801Var.k.get();
        c8o.l(peVar);
        luk lukVarA3 = v801Var.a();
        c8o.l(lukVarA3);
        dfm dfmVar = new dfm(ruzVarD2, gn10Var, flowableMapF, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVar, new qmr(new in4(lukVarA3)));
        FlowableMap flowableMapD = f2u0.D(z9pVar.h());
        FlowableDistinctUntilChanged flowableDistinctUntilChangedJ = f2u0.j(z9pVar.h());
        Flowable flowableJ3 = z9pVar.h().j(mo9Var);
        Flowable flowable2 = (Flowable) ((jly0) z9pVar.x).get();
        ruz ruzVarD3 = z9pVar.d();
        yp91 yp91VarG = z9pVar.g();
        im51 im51Var = (im51) ((jly0) z9pVar.y).get();
        luk lukVarA4 = v801Var.a();
        c8o.l(lukVarA4);
        am51 am51Var = new am51(flowableMapD, flowableDistinctUntilChangedJ, flowableJ3, flowable2, ruzVarD3, yp91VarG, im51Var, new kn4(false, lukVarA4));
        FlowableMap flowableMapD2 = f2u0.D(z9pVar.h());
        FlowableDistinctUntilChanged flowableDistinctUntilChangedJ2 = f2u0.j(z9pVar.h());
        Flowable flowableJ4 = z9pVar.h().j(mo9Var);
        Flowable flowable3 = (Flowable) ((jly0) z9pVar.x).get();
        ruz ruzVarD4 = z9pVar.d();
        yp91 yp91VarG2 = z9pVar.g();
        im51 im51Var2 = (im51) ((jly0) z9pVar.y).get();
        luk lukVarA5 = v801Var.a();
        c8o.l(lukVarA5);
        qm51 qm51Var = new qm51(flowableMapD2, flowableDistinctUntilChangedJ2, flowableJ4, flowable3, ruzVarD4, yp91VarG2, im51Var2, new kn4(false, lukVarA5));
        kly0 kly0Var2 = v801Var.l;
        w701 w701Var = (w701) kly0Var2.get();
        c8o.l(w701Var);
        jz51 jz51VarF = z9pVar.f();
        kly0 kly0Var3 = v801Var.e;
        q8n q8nVar2 = (q8n) kly0Var3.get();
        c8o.l(q8nVar2);
        wy61 wy61Var = new wy61(w701Var, jz51VarF, q8nVar2, (byte) 0);
        w701 w701Var2 = (w701) kly0Var2.get();
        c8o.l(w701Var2);
        jz51 jz51VarF2 = z9pVar.f();
        q8n q8nVar3 = (q8n) kly0Var3.get();
        c8o.l(q8nVar3);
        wy61 wy61Var2 = new wy61(w701Var2, jz51VarF2, q8nVar3, (byte) 1);
        nm1 nm1VarA = ((c7p) ((jly0) z9pVar.z).get()).a((d0r) ((jly0) z9pVar.d).get());
        luk lukVarA6 = v801Var.a();
        c8o.l(lukVarA6);
        boolean zA = new j55(lukVarA6).a();
        luk lukVarA7 = v801Var.a();
        c8o.l(lukVarA7);
        xwt0 xwt0Var = new xwt0(y441Var, dfmVar, am51Var, qm51Var, wy61Var, wy61Var2, nm1VarA, zA, new j55(lukVarA7).c(), (otl0) ((ykq) z9pVar.m).get());
        hbg1 hbg1Var = (hbg1) ((v801) z9pVar.k).o.get();
        c8o.l(hbg1Var);
        q7r0 q7r0Var = (q7r0) z9pVar.a;
        myq0 myq0Var = new myq0(q7r0Var);
        String str = ((p901) z9pVar.j).a;
        c8o.m(str);
        hyy0 hyy0Var = new hyy0(str, xqu.a((ykq) z9pVar.m), (byte) 8);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new sak(cir0Var, e7qVar, cx0Var, xwt0Var, hbg1Var.a(yon1.D4(), myq0Var, q7r0Var.d.c, hyy0Var), (p901) z9pVar.j, (byte) 3);
    }
}
