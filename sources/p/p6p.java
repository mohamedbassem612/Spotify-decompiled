package p;

import android.app.NotificationManager;
import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p6p {
    public final /* synthetic */ b2p a;

    public p6p(b2p b2pVar) {
        this.a = b2pVar;
    }

    public final qph a(kp5 kp5Var, njb0 njb0Var, String str, lik1 lik1Var, rph rphVar, boolean z) {
        em0 em0Var = (em0) this.a.c;
        Scheduler scheduler = (Scheduler) ((bnh) em0Var.b).H.get();
        c8o.l(scheduler);
        bnh bnhVar = (bnh) em0Var.b;
        Scheduler scheduler2 = (Scheduler) bnhVar.I.get();
        c8o.l(scheduler2);
        i4q i4qVar = (i4q) bnhVar.m.get();
        c8o.l(i4qVar);
        tjh tjhVarA = bnhVar.a();
        c8o.l(tjhVarA);
        kly0 kly0Var = bnhVar.D;
        cwe1 cwe1Var = (cwe1) kly0Var.get();
        c8o.l(cwe1Var);
        kly0 kly0Var2 = bnhVar.E;
        hwe1 hwe1Var = (hwe1) kly0Var2.get();
        c8o.l(hwe1Var);
        pn0 pn0Var = (pn0) bnhVar.a.get();
        c8o.l(pn0Var);
        zd1 zd1Var = new zd1(tjhVarA, cwe1Var, hwe1Var, new myq0(pn0Var, em0Var.z(), (byte) 8), (byte) 2);
        tjh tjhVarA2 = bnhVar.a();
        c8o.l(tjhVarA2);
        yqg yqgVar = (yqg) bnhVar.b.get();
        c8o.l(yqgVar);
        cwe1 cwe1Var2 = (cwe1) kly0Var.get();
        c8o.l(cwe1Var2);
        hwe1 hwe1Var2 = (hwe1) kly0Var2.get();
        c8o.l(hwe1Var2);
        pn0 pn0Var2 = (pn0) bnhVar.a.get();
        c8o.l(pn0Var2);
        yon yonVar = new yon(tjhVarA2, yqgVar, cwe1Var2, hwe1Var2, new myq0(pn0Var2, em0Var.z(), (byte) 8));
        tjh tjhVarA3 = bnhVar.a();
        c8o.l(tjhVarA3);
        h1e0 h1e0Var = new h1e0(tjhVarA3, (byte) 0);
        tjh tjhVarA4 = bnhVar.a();
        c8o.l(tjhVarA4);
        h1e0 h1e0Var2 = new h1e0(tjhVarA4, (byte) 1);
        tjh tjhVarA5 = bnhVar.a();
        c8o.l(tjhVarA5);
        h1e0 h1e0Var3 = new h1e0(tjhVarA5, (byte) 2);
        lzn0 lzn0Var = (lzn0) bnhVar.r.get();
        c8o.l(lzn0Var);
        f5b f5bVar = new f5b(lzn0Var, (byte) 13);
        q6p q6pVar = (q6p) ((jly0) em0Var.e).get();
        tjh tjhVarA6 = bnhVar.a();
        c8o.l(tjhVarA6);
        h1e0 h1e0Var4 = new h1e0(tjhVarA6, (byte) 3);
        r6p r6pVar = (r6p) ((jly0) em0Var.f).get();
        kly0 kly0Var3 = bnhVar.w;
        jjz jjzVar = (jjz) kly0Var3.get();
        c8o.l(jjzVar);
        kly0 kly0Var4 = bnhVar.e;
        Context context = (Context) kly0Var4.get();
        c8o.l(context);
        i8h1 i8h1Var = (i8h1) bnhVar.y.get();
        c8o.l(i8h1Var);
        yon yonVar2 = new yon(jjzVar, context, new m021(i8h1Var));
        jjz jjzVar2 = (jjz) kly0Var3.get();
        c8o.l(jjzVar2);
        x981 x981Var = new x981(jjzVar2, ((Boolean) bnhVar.F.get()).booleanValue(), (byte) 3);
        pyd1 pyd1Var = (pyd1) bnhVar.x.get();
        c8o.l(pyd1Var);
        tr41 tr41Var = new tr41(pyd1Var, (byte) 19);
        gpo0 gpo0Var = (gpo0) bnhVar.A.get();
        c8o.l(gpo0Var);
        Context context2 = (Context) kly0Var4.get();
        c8o.l(context2);
        NotificationManager notificationManager = (NotificationManager) bnhVar.z.get();
        c8o.l(notificationManager);
        qg7 qg7Var = new qg7(gpo0Var, context2, notificationManager, (byte) 23);
        pn0 pn0Var3 = (pn0) bnhVar.a.get();
        c8o.l(pn0Var3);
        Flowable flowable = (Flowable) bnhVar.C.get();
        c8o.l(flowable);
        tnh tnhVar = new tnh(scheduler2, i4qVar, zd1Var, yonVar, h1e0Var, h1e0Var2, h1e0Var3, f5bVar, q6pVar, h1e0Var4, r6pVar, yonVar2, x981Var, tr41Var, qg7Var, new g2x0(pn0Var3, flowable, (byte) 16));
        tjh tjhVarA7 = bnhVar.a();
        c8o.l(tjhVarA7);
        return new qph(scheduler, tnhVar, tjhVarA7, kp5Var, njb0Var, str, lik1Var, rphVar, z);
    }
}
