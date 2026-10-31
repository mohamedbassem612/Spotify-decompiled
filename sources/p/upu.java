package p;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class upu implements jly0 {
    public static thn A(nzp nzpVar) {
        return new thn(nzpVar, (byte) 17);
    }

    public static thn B(ozp ozpVar) {
        return new thn(ozpVar, (byte) 13);
    }

    public static hre1 C(icp icpVar) {
        hre1 hre1Var = (hre1) icpVar.g.get();
        c8o.m(hre1Var);
        return hre1Var;
    }

    public static bev D() {
        return new bev();
    }

    public static nbp a(l1r l1rVar) {
        return new nbp(l1rVar);
    }

    public static odc b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 27);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static tdl c(ynb0 ynb0Var) {
        tdl tdlVar = new tdl((byte) 22);
        tdlVar.b = ynb0Var;
        return tdlVar;
    }

    public static jtu d(kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3, jo80 jo80Var) {
        jtu jtuVar = new jtu();
        jtuVar.a = kly0Var;
        jtuVar.b = caqVar;
        jtuVar.c = caqVar2;
        jtuVar.d = caqVar3;
        jtuVar.e = jo80Var;
        return jtuVar;
    }

    public static p2v e(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, g5t g5tVar, caq caqVar2, jo80 jo80Var) {
        p2v p2vVar = new p2v();
        p2vVar.a = jly0Var;
        p2vVar.b = jly0Var2;
        p2vVar.c = jly0Var3;
        p2vVar.d = caqVar;
        p2vVar.e = g5tVar;
        p2vVar.f = caqVar2;
        p2vVar.g = jo80Var;
        return p2vVar;
    }

    public static udv f(jly0 jly0Var, jo80 jo80Var, jly0 jly0Var2, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9) {
        udv udvVar = new udv();
        udvVar.a = jly0Var;
        udvVar.b = jo80Var;
        udvVar.c = jly0Var2;
        udvVar.d = caqVar;
        udvVar.e = caqVar2;
        udvVar.f = caqVar3;
        udvVar.g = caqVar4;
        udvVar.h = caqVar5;
        udvVar.i = caqVar6;
        udvVar.j = caqVar7;
        udvVar.k = caqVar8;
        udvVar.l = caqVar9;
        return udvVar;
    }

    public static odc g(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 28);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static xd0 h(icp icpVar) {
        xd0 xd0Var = (xd0) icpVar.f.get();
        c8o.m(xd0Var);
        return xd0Var;
    }

    public static ObservableRefCount i(a42 a42Var) {
        return (ObservableRefCount) a42Var.b;
    }

    public static z5h1 j(x2p x2pVar) {
        i8h1 i8h1Var = (i8h1) ((h72) x2pVar.c).b;
        c8o.l(i8h1Var);
        return new z5h1(i8h1Var, new uol0(r6h1.c));
    }

    public static hx7 k(x2p x2pVar) {
        return x2pVar.a();
    }

    public static nuu l(x2p x2pVar) {
        Activity activity = (Activity) ((h72) x2pVar.c).i;
        c8o.l(activity);
        return new nuu(activity);
    }

    public static ptu m(otu otuVar) {
        boolean zE = ((j25) otuVar.c).e();
        kly0 kly0Var = (kly0) otuVar.b;
        return new ptu(zE ? new r4l1(kly0Var) : new th70(kly0Var));
    }

    public static zvu n(x2p x2pVar) {
        return new zvu((obp) ((jly0) x2pVar.d).get());
    }

    public static suu o(x2p x2pVar) {
        return x2pVar.f();
    }

    public static x2p p(Activity activity, lzn0 lzn0Var, qmr qmrVar) {
        h72 h72Var;
        z8q z8qVar = (z8q) qmrVar.b;
        switch (z8qVar.a) {
            case 0:
                daq daqVar = z8qVar.b.a;
                h72Var = new h72((i8h1) daqVar.A5.get(), (byp0) daqVar.U8.get(), (b7n) daqVar.L4.get(), (xrc0) daqVar.f5.get(), (dxz0) daqVar.I4.get(), (Flowable) daqVar.z2.get(), (ut71) daqVar.g2.get(), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), (q8n) daqVar.E1.get(), activity, lzn0Var);
                break;
            default:
                r7q r7qVar = z8qVar.b;
                daq daqVar2 = r7qVar.b;
                h72Var = new h72((i8h1) daqVar2.A5.get(), (byp0) daqVar2.U8.get(), (b7n) daqVar2.L4.get(), (xrc0) r7qVar.d.e1.get(), (dxz0) daqVar2.I4.get(), (Flowable) daqVar2.z2.get(), (ut71) daqVar2.g2.get(), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), (q8n) daqVar2.E1.get(), activity, lzn0Var);
                break;
        }
        return new x2p(h72Var);
    }

    public static qmr q(z8q z8qVar) {
        return new qmr(z8qVar, (byte) 19);
    }

    public static jyu r(Context context) {
        return new jyu(context, (NotificationManager) context.getSystemService("notification"));
    }

    public static pyu s(oeq oeqVar) {
        return new pyu(oeqVar);
    }

    public static cyu t(nbp nbpVar) {
        l1r l1rVar = nbpVar.a;
        vpp0 vpp0Var = (vpp0) l1rVar.a.get();
        xde0 xde0Var = (xde0) l1rVar.b.get();
        ayl aylVar = (ayl) l1rVar.c.get();
        kly0 kly0Var = l1rVar.e;
        return new cyu(vpp0Var, xde0Var, aylVar, (q8n) kly0Var.get(), new h0c0(new byu((mbp) nbpVar.b.get()), (q8n) kly0Var.get()));
    }

    public static x1v u(x2p x2pVar) {
        return x2pVar.g();
    }

    public static fiv v() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new fiv(yon1.j4().c);
    }

    public static icp w(tjq tjqVar) {
        return new icp(tjqVar);
    }

    public static fiv x() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new fiv(yon1.G1("PROACTIVE_PLATFORMS_LOCK_SCREEN_WIDGET", "proactive-platforms/lock-screen-widget", 1564, "proactive-platforms").c);
    }

    public static hmn0 y(pg5 pg5Var) {
        return new hmn0(pg5Var.a);
    }

    public static thn z(kzp kzpVar) {
        return new thn(kzpVar, (byte) 16);
    }
}
