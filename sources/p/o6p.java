package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o6p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ o6p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final kp5 a(Observable observable) {
        byte b = this.a;
        b2p b2pVar = this.b;
        switch (b) {
            case 0:
                em0 em0Var = (em0) b2pVar.c;
                bnh bnhVar = (bnh) em0Var.b;
                Context context = (Context) bnhVar.e.get();
                c8o.l(context);
                r5h r5hVar = (r5h) bnhVar.c.get();
                c8o.l(r5hVar);
                a7z a7zVar = (a7z) bnhVar.o.get();
                c8o.l(a7zVar);
                zkj0 zkj0Var = new zkj0(context, r5hVar, a7zVar);
                bnh bnhVar2 = (bnh) em0Var.b;
                v5n v5nVar = (v5n) bnhVar2.n.get();
                c8o.l(v5nVar);
                Flowable flowable = (Flowable) bnhVar2.t.get();
                c8o.l(flowable);
                yeu0 yeu0Var = new yeu0(flowable, v5nVar);
                Context context2 = (Context) bnhVar2.e.get();
                c8o.l(context2);
                ut71 ut71Var = (ut71) bnhVar2.u.get();
                c8o.l(ut71Var);
                Observable observable2 = (Observable) bnhVar2.G.get();
                c8o.l(observable2);
                h0y h0yVar = new h0y(new ck20(context2, observable2, ut71Var), (byte) 11);
                tjh tjhVarA = bnhVar2.a();
                c8o.l(tjhVarA);
                p501 p501Var = (p501) bnhVar2.s.get();
                c8o.l(p501Var);
                wjh wjhVarZ = em0Var.z();
                Scheduler scheduler = (Scheduler) bnhVar2.I.get();
                c8o.l(scheduler);
                Flowable flowable2 = (Flowable) bnhVar2.C.get();
                c8o.l(flowable2);
                yqg yqgVar = (yqg) bnhVar2.b.get();
                c8o.l(yqgVar);
                return new kp5(zkj0Var, yeu0Var, h0yVar, tjhVarA, p501Var, wjhVarZ, new r0s0(scheduler, flowable2, yqgVar, (byte) 24), observable);
            default:
                em0 em0Var2 = (em0) b2pVar.c;
                wph wphVar = (wph) em0Var2.b;
                Context context3 = (Context) wphVar.b.get();
                c8o.l(context3);
                r5h r5hVar2 = (r5h) wphVar.x.get();
                c8o.l(r5hVar2);
                a7z a7zVar2 = (a7z) wphVar.l.get();
                c8o.l(a7zVar2);
                zkj0 zkj0Var2 = new zkj0(context3, r5hVar2, a7zVar2);
                wph wphVar2 = (wph) em0Var2.b;
                v5n v5nVar2 = (v5n) wphVar2.g.get();
                c8o.l(v5nVar2);
                Flowable flowable3 = (Flowable) wphVar2.w.get();
                c8o.l(flowable3);
                yeu0 yeu0Var2 = new yeu0(flowable3, v5nVar2);
                Context context4 = (Context) wphVar2.b.get();
                c8o.l(context4);
                ut71 ut71Var2 = (ut71) wphVar2.y.get();
                c8o.l(ut71Var2);
                Observable observable3 = (Observable) wphVar2.I.get();
                c8o.l(observable3);
                h0y h0yVar2 = new h0y(new ck20(context4, observable3, ut71Var2), (byte) 11);
                tjh tjhVarA2 = wphVar2.a();
                c8o.l(tjhVarA2);
                p501 p501Var2 = (p501) wphVar2.D.get();
                c8o.l(p501Var2);
                luk lukVar = (luk) wphVar2.v.get();
                c8o.l(lukVar);
                wjh wjhVar = new wjh(lukVar);
                Scheduler scheduler2 = (Scheduler) wphVar2.G.get();
                c8o.l(scheduler2);
                Flowable flowable4 = (Flowable) wphVar2.u.get();
                c8o.l(flowable4);
                yqg yqgVar2 = (yqg) wphVar2.a.get();
                c8o.l(yqgVar2);
                return new kp5(zkj0Var2, yeu0Var2, h0yVar2, tjhVarA2, p501Var2, wjhVar, new r0s0(scheduler2, flowable4, yqgVar2, (byte) 24), observable);
        }
    }
}
