package p;

import android.app.Activity;
import android.widget.LinearLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gdc1 implements vek1 {
    public final c8c0 a;
    public final koc0 b;
    public final lcb0 c;
    public final Scheduler d;
    public final e3x e;
    public final ge4 f;
    public final q8n g;
    public hp91 h;
    public final pbq i;
    public final rku j;
    public final bpb1 k;
    public ljo1 l;
    public llm m;
    public final bpb1 n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x010 f14p;
    public final ccb1 q;

    public gdc1(Activity activity, c8c0 c8c0Var, koc0 koc0Var, esq esqVar, lcb0 lcb0Var, Scheduler scheduler, e3x e3xVar, ge4 ge4Var, q8n q8nVar) {
        this.a = c8c0Var;
        this.b = koc0Var;
        this.c = lcb0Var;
        this.d = scheduler;
        this.e = e3xVar;
        this.f = ge4Var;
        this.g = q8nVar;
        lbq lbqVar = (lbq) esqVar.a.b;
        l3q l3qVar = (l3q) lbqVar.b;
        daq daqVar = l3qVar.a;
        ao0 ao0Var = (ao0) daqVar.Hk.get();
        c8o.l(ao0Var);
        ua91 ua91VarC = lbqVar.c();
        ko0 ko0Var = (ko0) daqVar.a.A1.get();
        c8o.l(ko0Var);
        teq teqVar = l3qVar.b;
        Activity activity2 = (Activity) teqVar.f.a;
        c8o.l(activity2);
        lzn0 lzn0Var = (lzn0) teqVar.i.get();
        c8o.l(lzn0Var);
        ua91 ua91Var = new ua91(ao0Var, ua91VarC, ko0Var, activity2, lzn0Var, (byte) 19);
        l3q l3qVar2 = (l3q) lbqVar.b;
        daq daqVar2 = l3qVar2.a;
        kh5 kh5Var = (kh5) daqVar2.a.C1.get();
        c8o.l(kh5Var);
        luk lukVar = (luk) daqVar2.L1.get();
        c8o.l(lukVar);
        ye90 ye90Var = new ye90(kh5Var, new co4(lukVar), (byte) 17);
        t2j0 t2j0Var = (t2j0) l3qVar2.a.f2.get();
        c8o.l(t2j0Var);
        x390 x390Var = new x390(ye90Var, new rdo(t2j0Var), (byte) 22);
        ua91 ua91VarC2 = lbqVar.c();
        daq daqVar3 = l3qVar2.a;
        t2j0 t2j0Var2 = (t2j0) daqVar3.f2.get();
        c8o.l(t2j0Var2);
        hr0 hr0Var = new hr0(t2j0Var2);
        Flowable flowable = (Flowable) daqVar3.D5.get();
        c8o.l(flowable);
        Scheduler scheduler2 = (Scheduler) daqVar3.z1.get();
        c8o.l(scheduler2);
        yqg yqgVar = (yqg) daqVar3.J1.get();
        c8o.l(yqgVar);
        FlowableMap flowableMapJ = flowable.j(new xeu0(32L, scheduler2, yqgVar)).x(n9x0.Q0).J(o9x0.Q0);
        Scheduler scheduler3 = (Scheduler) daqVar3.z1.get();
        c8o.l(scheduler3);
        this.i = new pbq(this, ua91Var, x390Var, ua91VarC2, hr0Var, flowableMapJ, scheduler3);
        this.j = new rku();
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.k = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(d3x.a);
        this.n = bpb1VarB2;
        this.f14p = new x010(bpb1VarB, bpb1VarB2, new lag0(this, (lnm) null, (byte) 13), (byte) 1);
        this.q = new ccb1(this, activity, (byte) 13);
    }

    @Override // p.anc0
    public final void a() {
        llm llmVar = this.m;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.m = null;
        this.o = false;
        ((vku) this.i.c).c();
        this.j.a();
    }

    @Override // p.anc0
    public final void b() {
        this.c.g = this;
        llm llmVarE = smo1.e(this.g);
        this.m = llmVarE;
        lnm lnmVar = null;
        if (!this.o) {
            this.o = true;
            fn31.T(llmVarE, (o8n) null, 0, new edc1(this, lnmVar, (byte) 1), 3);
        }
        fn31.T(llmVarE, (o8n) null, 0, new edc1(this, lnmVar, (byte) 2), 3);
    }

    public final void d(ljo1 ljo1Var) {
        if (ljo1Var instanceof hdc1) {
            hp91 hp91Var = this.h;
            if (hp91Var == null) {
                u890.C("binding");
                throw null;
            }
            ((LinearLayout) hp91Var.b).setVisibility(8);
            Boolean bool = Boolean.TRUE;
            bpb1 bpb1Var = this.k;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
            return;
        }
        if (!(ljo1Var instanceof idc1)) {
            eg.o();
            return;
        }
        hp91 hp91Var2 = this.h;
        if (hp91Var2 == null) {
            u890.C("binding");
            throw null;
        }
        ((LinearLayout) hp91Var2.b).setVisibility(0);
        this.c.C(((idc1) ljo1Var).d);
    }

    @Override // p.vek1
    public final mr20 getShow() {
        return this.f14p;
    }

    @Override // p.vek1
    public final iu30 m() {
        return this.q;
    }
}
