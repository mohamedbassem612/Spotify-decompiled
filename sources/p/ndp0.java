package p;

import android.content.Context;
import android.os.Looper;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndp0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z740 z740Var = null;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                kly0 kly0Var = ((ry9) obj6).b.b;
                kly0 kly0Var2 = ((ry9) obj5).b.h0;
                kly0 kly0Var3 = ((ry9) obj3).b.i0;
                tz4 tz4Var = ((ry9) obj4).b.j0;
                jmq jmqVar = new jmq(new l1r(kly0Var, kly0Var2, kly0Var3, tz4Var, ((ry9) obj2).b.d0, ((ry9) obj).b.f0));
                return new fv71(tz4Var, (jxp) jmqVar.b, (jxp) jmqVar.c);
            case 1:
                h991 h991Var = (h991) ((acp0) obj6).invoke();
                tau0 tau0VarA = ((rbp0) obj5).b.A();
                RxRouter rxRouterZ = ((rbp0) obj3).b.z();
                luk lukVar = (luk) ((acp0) obj4).invoke();
                Scheduler scheduler = (Scheduler) ((acp0) obj2).invoke();
                Scheduler scheduler2 = (Scheduler) ((acp0) obj).invoke();
                c8o.l(h991Var);
                c8o.l(tau0VarA);
                w9u0 w9u0VarA = tau0VarA.a();
                c8o.l(rxRouterZ);
                c8o.l(lukVar);
                n2t n2tVarP = ce7.p(rxRouterZ, lukVar);
                c8o.l(scheduler);
                c8o.l(scheduler2);
                return new g991(h991Var, w9u0VarA, n2tVarP, scheduler, scheduler2);
            case 2:
                return new n2d1((g0l) ((acp0) obj6).invoke(), (svt) ((acp0) obj5).invoke(), (nd4) ((acp0) obj3).invoke(), (yqg) ((acp0) obj4).invoke(), (mr20) ((acp0) obj2).invoke(), (q8n) ((acp0) obj).invoke(), dho.a);
            case 3:
                return new vf2((s0o1) ((bcp0) obj6).invoke(), (g0l) ((bcp0) obj5).invoke(), (q8n) ((bcp0) obj3).invoke(), (t2j0) ((bcp0) obj4).invoke(), (ygl1) ((bcp0) obj2).invoke(), (p0t) ((bcp0) obj).invoke());
            case 4:
                iu30 iu30Var = (iu30) obj3;
                e8y0 e8y0Var = (e8y0) obj5;
                iz31 iz31Var = (iz31) ((z72) obj6).Y;
                Map map = e8y0Var.g;
                boolean z = e8y0Var.h;
                boolean z2 = ytw0.e(map) != null;
                z740 z740VarA = iz31Var.a();
                if (z2 && z) {
                    z740Var = z740VarA;
                }
                a8y0 a8y0Var = a8y0.a;
                if (z740Var != null) {
                    iu30Var.invoke(a8y0Var);
                } else if (e8y0Var.e) {
                    iu30Var.invoke(new b8y0((String) obj4));
                } else if (!e8y0Var.a) {
                    iu30Var.invoke(new b8y0((String) obj2));
                } else if (e8y0Var.i || e8y0Var.f == null) {
                    iu30Var.invoke(a8y0Var);
                } else {
                    ((ven0) obj).setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 5:
                mlv0 mlv0Var = (mlv0) obj6;
                ui8 ui8VarC = mlv0Var.c();
                nx9 nx9VarA = mlv0Var.a();
                vuk vukVarA = mlv0Var.c().a();
                tif1 tif1Var = (tif1) obj5;
                kly0 kly0Var4 = (kly0) obj2;
                try {
                    tif1Var.e(2, "Session_dependencies", "qss");
                    pd61 pd61Var = (pd61) kly0Var4.get();
                    tif1Var.f("Session_dependencies", "qss");
                    pd61Var.getClass();
                    nx9 nx9VarA2 = mlv0Var.a();
                    ra61 ra61Var = (ra61) ((kly0) obj4).get();
                    bo00 bo00Var = new bo00(((Context) ((pd61) kly0Var4.get()).a.get()).getApplicationContext());
                    Looper mainLooper = Looper.getMainLooper();
                    dm5.y(!bo00Var.A);
                    mainLooper.getClass();
                    bo00Var.i = mainLooper;
                    ec4 ec4Var = new ec4(bo00Var);
                    nx9VarA2.getClass();
                    wdm wdmVar = new wdm(nx9VarA2, ra61Var, ec4Var);
                    ex01 ex01Var = new ex01(Collections.singleton(new zv5()));
                    return new sa61(new zm41((dn41) obj3, new z1(ui8VarC, nx9VarA, vukVarA, mlv0Var, wdmVar, pd61Var, ex01Var, (byte) 21), new c861((jo20) obj, nx9VarA, (byte) 1), new wnx0(ui8VarC, nx9VarA, vukVarA, mlv0Var, wdmVar, pd61Var, ex01Var), new m551(ui8VarC, nx9VarA, vukVarA, mlv0Var, wdmVar, pd61Var, ex01Var, (byte) 2), new m551(ui8VarC, nx9VarA, vukVarA, mlv0Var, wdmVar, pd61Var, ex01Var, (byte) 3), 64));
                } catch (Throwable th) {
                    tif1Var.f("Session_dependencies", "qss");
                    throw th;
                }
            case 6:
                ((Function0) obj6).invoke();
                fn31.T((c9n) obj5, (o8n) null, 0, new p651((ung) obj3, (String) obj4, (String) obj2, (Context) obj, (lnm) null, (byte) 10), 3);
                return rih1Var;
            default:
                az20.a((az20) obj6);
                ven0 ven0Var = (ven0) obj4;
                ((iu30) obj5).invoke(((Boolean) ven0Var.getValue()).booleanValue() ? jgl.a : igl.a);
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    fn31.T((c9n) obj3, (o8n) null, 0, new w621((es41) obj2, (j5c) obj, (lnm) null, (byte) 17), 3);
                }
                return rih1Var;
        }
    }
}
