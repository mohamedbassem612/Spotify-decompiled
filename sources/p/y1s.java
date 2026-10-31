package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y1s implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1s(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onCreate(iac0 iac0Var) {
        String string;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                z1s z1sVar = (z1s) obj;
                z1sVar.c.onNext(k8c0.ON_CREATE);
                z1sVar.h.onNext(wpq0.a);
                return;
            case 1:
                cks cksVar = (cks) obj;
                idd1 idd1Var = cksVar.U0;
                gj5 gj5Var = cksVar.b;
                ((oe41) ((g0i) gj5Var).d.c).c("root-ui-saved-state", new aks(cksVar, (byte) 0));
                Bundle bundleA = ((oe41) ((g0i) gj5Var).d.c).a("root-ui-saved-state");
                dp31 dp31Var = bundleA != null ? (dp31) bundleA.getParcelable("root-contraption-saved-state-key") : null;
                boolean z = dp31Var == null;
                Parcelable parcelable = bundleA != null ? bundleA.getParcelable("logged-in-ui-saved-state") : null;
                niq niqVar = cksVar.e;
                if (!cksVar.S0) {
                    cksVar.R0 = parcelable;
                }
                vas vasVar = new vas(cksVar, (byte) 10);
                boolean z2 = z;
                l1k l1kVar = new l1k(0, cksVar, cks.class, "ensureLoggedInUiDetached", "ensureLoggedInUiDetached()V", 0, (byte) 27);
                vxf0 vxf0Var = cksVar.f;
                thq thqVar = niqVar.a;
                teq teqVar = thqVar.c;
                jo80 jo80Var = teqVar.f;
                yiq yiqVar = teqVar.b;
                dg30 dg30Var = (dg30) jo80Var.a;
                oiq oiqVar = (oiq) yiqVar.pa.get();
                dp31 dp31Var2 = dp31Var;
                ip31 ip31Var = new ip31(dg30Var, oiqVar, yiqVar.u1(), (e4t) yiqVar.qa.get(), tq21.s((e8q0) yiqVar.ra.get()), (lxg) thqVar.b.D1.get(), dp31Var2, vasVar, l1kVar, cksVar, vxf0Var);
                gp5 gp5Var = dp31Var2 != null ? dp31Var2.b : null;
                ep31 ep31Var = new ep31(ip31Var, (byte) 0);
                fp31 fp31Var = new fp31(ip31Var);
                gp5 gp5Var2 = gp5Var;
                gp31 gp31Var = new gp31(ip31Var);
                hp31 hp31Var = new hp31(dg30Var);
                teq teqVar2 = oiqVar.a.c;
                piq piqVar = (piq) teqVar2.b.ma.get();
                qiq qiqVar = (qiq) teqVar2.b.oa.get();
                kp5 kp5Var = new kp5(gp5Var2, dg30Var, fp31Var, gp31Var, vxf0Var, hp31Var, dg30Var, cksVar, ep31Var, piqVar, qiqVar);
                fai0 fai0Var = (fai0) kp5Var.g;
                dn81 dn81Var = new dn81(hp31Var, dg30Var);
                ((kdn0) dn81Var.b).m(nxa1.a);
                kp5Var.d = dn81Var;
                n1f0 n1f0Var = gp5Var2 != null ? gp5Var2.a : null;
                riq riqVar = (riq) qiqVar.a.c.b.na.get();
                n1f0 n1f0Var2 = n1f0Var;
                p1f0 p1f0Var = new p1f0(dg30Var, n1f0Var2, cksVar, vxf0Var, ep31Var, riqVar);
                lb61 lb61Var = n1f0Var2 != null ? n1f0Var2.a : null;
                daq daqVar = riqVar.a.b;
                ywv0 ywv0Var = new ywv0(lb61Var, (Flowable) daqVar.z2.get(), daqVar.l5, daqVar.z1, (o241) daqVar.u4.get());
                p1f0Var.f = ywv0Var;
                ((kdn0) ywv0Var.f).g(new z11(p1f0Var, (byte) 29));
                e72 e72Var = new e72(p1f0Var, (byte) 4);
                p1f0Var.g = e72Var;
                ((f0i) dg30Var).a.a(e72Var);
                kp5Var.e = p1f0Var;
                dn81 dn81Var2 = (dn81) kp5Var.d;
                if (dn81Var2 == null) {
                    u890.C("splashScreenContraption");
                    throw null;
                }
                kdn0 kdn0Var = (kdn0) dn81Var2.b;
                kdn0 kdn0Var2 = (kdn0) p1f0Var.e;
                fai0Var.n(kdn0Var, new ip5(kdn0Var2, kp5Var, (byte) 0));
                fai0Var.n(kdn0Var2, new jp5(kdn0Var, kp5Var, (byte) 0));
                ip31Var.h = kp5Var;
                ((fai0) kp5Var.h).g(new es3(ip31Var, (byte) 6));
                cksVar.T0 = ip31Var;
                ((iac0) idd1Var.getValue()).getLifecycle().a(new bks(cksVar, z2));
                new st60(gj5Var, (iac0) idd1Var.getValue(), cksVar.Y, (byte) 17).D();
                tif1.a(cksVar.Z, "LoggedInUi", (String) null, 2);
                cksVar.X.a();
                return;
            case 2:
                hdo0 hdo0Var = (hdo0) obj;
                new st60(hdo0Var.a, (iac0) hdo0Var.R0.getValue(), hdo0Var.N0, (byte) 17).D();
                hdo0Var.t.a();
                tif1.a(hdo0Var.X, "LoggedInUi", (String) null, 2);
                return;
            case 3:
                ik21 ik21Var = (ik21) obj;
                Bundle bundleA2 = ik21Var.g.p().a("report_blocking_state");
                if (ik21Var.h == null) {
                    ik21Var.h = bundleA2 != null ? (gk21) bundleA2.getParcelable("report_blocking_data") : null;
                }
                if (ik21Var.j.length() == 0) {
                    if (bundleA2 == null || (string = bundleA2.getString("report_blocking_entity_uri")) == null) {
                        string = "";
                    }
                    ik21Var.j = string;
                    return;
                }
                return;
            default:
                i0n1 i0n1Var = ((x1n1) obj).a;
                i0n1Var.c.a(i0n1Var.d.switchMap(new lxh1(i0n1Var, (byte) 12)).subscribe(new rdj1(i0n1Var, (byte) 19), wx91.Y));
                return;
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        switch (this.a) {
            case 0:
                ((z1s) this.b).c.onNext(k8c0.ON_DESTROY);
                return;
            case 1:
                cks cksVar = (cks) this.b;
                cksVar.X.b();
                ip31 ip31Var = cksVar.T0;
                if (ip31Var != null) {
                    kp5 kp5Var = (kp5) ip31Var.h;
                    if (kp5Var == null) {
                        u890.C("appLoggedInStateContraption");
                        throw null;
                    }
                    if (((dn81) kp5Var.d) == null) {
                        u890.C("splashScreenContraption");
                        throw null;
                    }
                    p1f0 p1f0Var = (p1f0) kp5Var.e;
                    if (p1f0Var == null) {
                        u890.C("loggedInContraption");
                        throw null;
                    }
                    x8c0 lifecycle = ((iac0) p1f0Var.a).getLifecycle();
                    e72 e72Var = (e72) p1f0Var.g;
                    if (e72Var == null) {
                        u890.C("observer");
                        throw null;
                    }
                    lifecycle.d(e72Var);
                    ywv0 ywv0Var = (ywv0) p1f0Var.f;
                    if (ywv0Var == null) {
                        u890.C("sessionContraption");
                        throw null;
                    }
                    ((rku) ywv0Var.g).a();
                    ((kdn0) ywv0Var.f).m(il8.a);
                    r961 r961Var = (r961) kp5Var.f;
                    if (r961Var != null) {
                        ((x8c0) r961Var.b).d((e72) r961Var.d);
                        ((kdn0) r961Var.c).m(li61.b);
                    }
                    kp5Var.f = null;
                    return;
                }
                return;
            case 2:
                ((hdo0) this.b).t.b();
                return;
            case 3:
                ((ik21) this.b).g.getLifecycle().d(this);
                return;
            default:
                k0n1 k0n1Var = ((x1n1) this.b).b;
                synchronized (k0n1Var) {
                    try {
                        Iterator it = k0n1Var.a.iterator();
                        while (it.hasNext()) {
                            ((Connection) it.next()).dispose();
                        }
                        k0n1Var.a.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((x1n1) this.b).a.c.c();
                ((x1n1) this.b).c.c.c();
                iac0Var.getLifecycle().d(this);
                return;
        }
    }
}
