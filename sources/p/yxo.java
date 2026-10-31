package p;

import android.content.Context;
import android.os.Parcelable;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.login.loginflowimpl.QuickLoginActivity;
import com.spotify.scannables.scannables.ScannablesActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yxo implements dl4 {
    public final jly0 N0;
    public final jly0 O0;
    public final jly0 P0;
    public final jly0 Q0;
    public final jly0 R0;
    public final jly0 S0;
    public final jly0 T0;
    public final jly0 U0;
    public final jly0 V0;
    public final jly0 W0;
    public final jly0 X;
    public final jly0 X0;
    public final jly0 Y;
    public final jly0 Y0;
    public final jly0 Z;
    public final jly0 Z0;
    public final /* synthetic */ byte a = 1;
    public final jly0 a1;
    public final jly0 b;
    public final jly0 b1;
    public final Object c;
    public final jly0 c1;
    public final Object d;
    public final jly0 d1;
    public final Object e;
    public final jly0 f;
    public final jly0 g;
    public final jly0 h;
    public final jly0 i;
    public final jly0 t;

    public yxo(ae7 ae7Var, be7 be7Var, q7r0 q7r0Var) {
        this.c = be7Var;
        this.d = ae7Var;
        this.e = q7r0Var;
        byte b = 26;
        this.b = xqu.b(new fwo(this, 1, b));
        this.f = iy81.a(new fwo(this, 3, b));
        this.g = iy81.a(new fwo(this, 2, b));
        this.h = iy81.a(new fwo(this, 4, b));
        this.i = xqu.b(new fwo(this, 6, b));
        this.t = iy81.a(new fwo(this, 5, b));
        this.X = iy81.a(new fwo(this, 7, b));
        this.Y = iy81.a(new fwo(this, 8, b));
        this.Z = iy81.a(new fwo(this, 0, b));
        this.N0 = iy81.a(new fwo(this, 12, b));
        this.O0 = xqu.b(new fwo(this, 13, b));
        this.P0 = xqu.b(new fwo(this, 16, b));
        this.Q0 = iy81.a(new fwo(this, 15, b));
        this.R0 = xqu.b(new fwo(this, 14, b));
        this.S0 = iy81.a(new fwo(this, 11, b));
        this.T0 = iy81.a(new fwo(this, 17, b));
        this.U0 = iy81.a(new fwo(this, 18, b));
        this.V0 = iy81.a(new fwo(this, 19, b));
        this.W0 = iy81.a(new fwo(this, 20, b));
        this.X0 = iy81.a(new fwo(this, 21, b));
        this.Y0 = iy81.a(new fwo(this, 10, b));
        this.Z0 = xqu.b(new fwo(this, 25, b));
        this.a1 = xqu.b(new fwo(this, 24, b));
        this.b1 = xqu.b(new fwo(this, 23, b));
        this.c1 = iy81.a(new fwo(this, 22, b));
        this.d1 = iy81.a(new fwo(this, 9, b));
    }

    public ycc1 a() {
        Set setSingleton;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new jf2());
        arrayList.add(new yp0((byte) 6));
        arrayList.add(new yp0((byte) 7));
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        LinkedHashMap linkedHashMapC0 = d0p1.c0(3);
        linkedHashMapC0.put(af2.class, (fwo) this.P0);
        linkedHashMapC0.put(oc2.class, (fwo) this.W0);
        linkedHashMapC0.put(zd2.class, (fwo) this.c1);
        return new ycc1(setSingleton, ern1.y(linkedHashMapC0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapC0)), (byte) 19);
    }

    public ow3 b() {
        ae7 ae7Var = (ae7) this.d;
        Context contextA = ae7Var.a();
        c8o.l(contextA);
        n451 n451Var = (n451) ae7Var.u.get();
        c8o.l(n451Var);
        return new ow3(contextA, n451Var, (byte) 17);
    }

    public gae c() {
        ae7 ae7Var = (ae7) this.d;
        xrc0 xrc0VarC = ae7Var.c();
        c8o.l(xrc0VarC);
        me30 me30Var = (me30) ae7Var.G.get();
        c8o.l(me30Var);
        ejo e0bVar = new e0b(xrc0VarC, me30Var, (t0p) this.g.get());
        ejo yn50Var = new yn50((v0p) this.h.get(), (byte) 2);
        kly0 kly0Var = ae7Var.M;
        agc0 agc0Var = (agc0) kly0Var.get();
        c8o.l(agc0Var);
        ccc0 ccc0Var = (ccc0) ae7Var.L.get();
        c8o.l(ccc0Var);
        xrc0 xrc0VarC2 = ae7Var.c();
        c8o.l(xrc0VarC2);
        zwm1 zwm1Var = (zwm1) ae7Var.N.get();
        c8o.l(zwm1Var);
        String str = ((be7) this.c).b;
        c8o.m(str);
        agc0 agc0Var2 = (agc0) kly0Var.get();
        c8o.l(agc0Var2);
        ejo yn50Var2 = new yn50(agc0Var, new lcc0(ccc0Var, new v6a0(xrc0VarC2, zwm1Var, str, agc0Var2)));
        ejo yn50Var3 = new yn50((w0p) this.t.get(), (byte) 0);
        z0t z0tVar = (z0t) ae7Var.P.get();
        c8o.l(z0tVar);
        l0p l0pVar = (l0p) this.X.get();
        xrm1 xrm1Var = (xrm1) ae7Var.O.get();
        c8o.l(xrm1Var);
        ejo c5cVar = new c5c(z0tVar, l0pVar, xrm1Var);
        m0p m0pVar = (m0p) this.Y.get();
        rxj0 rxj0Var = (rxj0) ae7Var.H.get();
        c8o.l(rxj0Var);
        return new gae(p7h.M(new ejo[]{e0bVar, yn50Var2, yn50Var3, c5cVar, new c5c(m0pVar, rxj0Var), yn50Var}));
    }

    public lik1 d() {
        be7 be7Var = (be7) this.c;
        Parcelable.Creator creator = lik1.CREATOR;
        Set set = s4b1.f;
        String strZ = uic.x(be7Var.a).z();
        if (strZ != null) {
            return new lik1(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public void w(Object obj) {
        byte b = this.a;
        obq obqVar = this.f;
        obq obqVar2 = this.d1;
        Object obj2 = this.d;
        switch (b) {
            case 2:
                AccountSelectionActivity accountSelectionActivity = (AccountSelectionActivity) obj;
                daq daqVar = (daq) obj2;
                ((t3b1) accountSelectionActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) accountSelectionActivity).c1 = new tuk(xqu.a((p2p) obqVar));
                accountSelectionActivity.h1 = (b2r0) this.g.get();
                r1n0 r1n0Var = (r1n0) this.i.get();
                AccountSelectionActivity accountSelectionActivity2 = (AccountSelectionActivity) this.c;
                bza0 bza0Var = (bza0) daqVar.om.get();
                e2b0 e2b0Var = (e2b0) daqVar.pm.get();
                accountSelectionActivity.f1 = r1n0Var.a(accountSelectionActivity2, accountSelectionActivity2, bbp1.g(Single.zip(((Flowable) daqVar.z2.get()).z().concatMap(new jp((v5n) daqVar.Pb.get(), (byte) 0)), yoi1.i((mr20) daqVar.mm.get(), o6x.a).firstOrError().flatMap(new oj80(bza0Var, e2b0Var, (byte) 5)), u321.d)));
                i1n0 i1n0Var = (i1n0) this.a1.get();
                xfx xfxVar = (xfx) this.c1.get();
                ep epVar = new ep((bza0) daqVar.om.get(), (Context) daqVar.x1.a, (Scheduler) daqVar.z1.get(), (t3f0) daqVar.wm.get(), (rh61) daqVar.xm.get(), (wbd1) daqVar.lj.get());
                fp fpVar = (fp) obqVar2.get();
                boolean zBooleanValue = ((Boolean) daqVar.ym.get()).booleanValue();
                ees eesVarA = i1n0Var.a(accountSelectionActivity2, accountSelectionActivity2);
                eesVarA.a.b = new kp(epVar, accountSelectionActivity2, zBooleanValue, xfxVar, fpVar);
                accountSelectionActivity.g1 = eesVarA;
                break;
            case 3:
                QuickLoginActivity quickLoginActivity = (QuickLoginActivity) obj;
                daq daqVar2 = (daq) obj2;
                quickLoginActivity.b1 = (jgu) daqVar2.a.g0.get();
                quickLoginActivity.a1 = (a2k) obqVar2.get();
                quickLoginActivity.d1 = (kg0) this.O0.get();
                quickLoginActivity.c1 = (dp21) daqVar2.pn.get();
                break;
            default:
                ScannablesActivity scannablesActivity = (ScannablesActivity) obj;
                ((t3b1) scannablesActivity).b1 = (jgu) ((daq) obj2).a.g0.get();
                ((t3b1) scannablesActivity).c1 = new tuk(xqu.a(obqVar));
                scannablesActivity.h1 = (mbq) this.X.get();
                scannablesActivity.f1 = (q1n0) this.Y.get();
                scannablesActivity.g1 = (i1n0) obqVar2.get();
                break;
        }
    }

    public yxo(oa2 oa2Var, sa2 sa2Var) {
        this.c = oa2Var;
        byte b = 9;
        this.d = new fwo(this, 0, b);
        this.e = new fwo(this, 3, b);
        this.f = new fwo(this, 4, b);
        this.g = new fwo(this, 5, b);
        this.h = new fwo(this, 6, b);
        this.i = new fwo(this, 7, b);
        this.t = new fwo(this, 8, b);
        this.X = new fwo(this, b, b);
        this.Y = new fwo(this, 10, b);
        this.Z = new fwo(this, 11, b);
        this.N0 = new fwo(this, 12, b);
        this.O0 = new fwo(this, 2, b);
        this.P0 = new fwo(this, 1, b);
        this.Q0 = new fwo(this, 16, b);
        this.R0 = new fwo(this, 15, b);
        this.S0 = new fwo(this, 17, b);
        this.T0 = new fwo(this, 18, b);
        this.U0 = new fwo(this, 19, b);
        this.V0 = new fwo(this, 14, b);
        this.W0 = new fwo(this, 13, b);
        this.X0 = new fwo(this, 22, b);
        this.Y0 = new fwo(this, 23, b);
        this.Z0 = new fwo(this, 24, b);
        this.a1 = new fwo(this, 21, b);
        this.b1 = new fwo(this, 25, b);
        this.c1 = new fwo(this, 20, b);
        this.b = iy81.a(new fwo(this, 26, b));
        this.d1 = new fwo(this, 27, b);
    }

    public yxo(daq daqVar, AccountSelectionActivity accountSelectionActivity) {
        this.d = daqVar;
        this.c = accountSelectionActivity;
        this.b = xqu.b(new p2p(daqVar, this, 2, (byte) 9));
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 9));
        this.f = new p2p(daqVar, this, 0, (byte) 9);
        this.g = xqu.b(new p2p(daqVar, this, 3, (byte) 9));
        this.h = new p2p(daqVar, this, 5, (byte) 9);
        this.i = new p2p(daqVar, this, 4, (byte) 9);
        this.t = xqu.b(new p2p(daqVar, this, 9, (byte) 9));
        this.X = xqu.b(new p2p(daqVar, this, 8, (byte) 9));
        this.Y = new p2p(daqVar, this, 7, (byte) 9);
        this.Z = new p2p(daqVar, this, 13, (byte) 9);
        this.N0 = new p2p(daqVar, this, 12, (byte) 9);
        this.O0 = iy81.a(new p2p(daqVar, this, 14, (byte) 9));
        this.P0 = new p2p(daqVar, this, 15, (byte) 9);
        this.Q0 = iy81.a(new p2p(daqVar, this, 11, (byte) 9));
        this.R0 = iy81.a(new p2p(daqVar, this, 10, (byte) 9));
        this.S0 = iy81.a(new p2p(daqVar, this, 18, (byte) 9));
        this.T0 = iy81.a(new p2p(daqVar, this, 19, (byte) 9));
        this.U0 = iy81.a(new p2p(daqVar, this, 21, (byte) 9));
        this.V0 = iy81.a(new p2p(daqVar, this, 20, (byte) 9));
        this.W0 = iy81.a(new p2p(daqVar, this, 22, (byte) 9));
        this.X0 = new p2p(daqVar, this, 23, (byte) 9);
        this.Y0 = iy81.a(new p2p(daqVar, this, 17, (byte) 9));
        this.Z0 = new p2p(daqVar, this, 16, (byte) 9);
        this.a1 = new p2p(daqVar, this, 6, (byte) 9);
        this.b1 = new p2p(daqVar, this, 25, (byte) 9);
        this.c1 = new p2p(daqVar, this, 24, (byte) 9);
        this.d1 = xqu.b(new p2p(daqVar, this, 26, (byte) 9));
    }

    public yxo(daq daqVar, QuickLoginActivity quickLoginActivity) {
        this.d = daqVar;
        this.c = quickLoginActivity;
        this.e = new s2q(daqVar, this, 1, (byte) 28);
        this.f = new s2q(daqVar, this, 3, (byte) 28);
        this.g = new s2q(daqVar, this, 2, (byte) 28);
        this.h = new s2q(daqVar, this, 4, (byte) 28);
        this.i = new s2q(daqVar, this, 5, (byte) 28);
        this.t = jo80.a(quickLoginActivity);
        this.b = xqu.b(new s2q(daqVar, this, 8, (byte) 28));
        this.X = new s2q(daqVar, this, 10, (byte) 28);
        this.Y = xqu.b(new s2q(daqVar, this, 9, (byte) 28));
        this.Z = xqu.b(new s2q(daqVar, this, 11, (byte) 28));
        this.N0 = xqu.b(new s2q(daqVar, this, 7, (byte) 28));
        this.O0 = xqu.b(new s2q(daqVar, this, 12, (byte) 28));
        this.P0 = new s2q(daqVar, this, 13, (byte) 28);
        this.Q0 = new s2q(daqVar, this, 14, (byte) 28);
        this.R0 = new s2q(daqVar, this, 15, (byte) 28);
        this.S0 = new s2q(daqVar, this, 6, (byte) 28);
        this.T0 = new s2q(daqVar, this, 17, (byte) 28);
        this.U0 = new s2q(daqVar, this, 18, (byte) 28);
        this.V0 = new s2q(daqVar, this, 19, (byte) 28);
        this.W0 = new s2q(daqVar, this, 20, (byte) 28);
        this.X0 = xqu.b(new s2q(daqVar, this, 21, (byte) 28));
        this.Y0 = new s2q(daqVar, this, 22, (byte) 28);
        this.Z0 = new s2q(daqVar, this, 23, (byte) 28);
        this.a1 = new s2q(daqVar, this, 24, (byte) 28);
        this.b1 = xqu.b(new s2q(daqVar, this, 25, (byte) 28));
        this.c1 = new s2q(daqVar, this, 16, (byte) 28);
        this.d1 = xqu.b(new s2q(daqVar, this, 0, (byte) 28));
    }

    public yxo(daq daqVar, ScannablesActivity scannablesActivity) {
        this.d = daqVar;
        this.c = scannablesActivity;
        this.b = xqu.b(new obq(daqVar, this, 2, (byte) 0));
        this.e = xqu.b(new obq(daqVar, this, 1, (byte) 0));
        this.f = new obq(daqVar, this, 0, (byte) 0);
        this.g = xqu.b(new obq(daqVar, this, 5, (byte) 0));
        this.h = xqu.b(new obq(daqVar, this, 6, (byte) 0));
        this.i = xqu.b(new obq(daqVar, this, 7, (byte) 0));
        this.t = iy81.a(new obq(daqVar, this, 4, (byte) 0));
        this.X = iy81.a(new obq(daqVar, this, 3, (byte) 0));
        this.Y = new obq(daqVar, this, 8, (byte) 0);
        this.Z = xqu.b(new obq(daqVar, this, 12, (byte) 0));
        this.N0 = xqu.b(new obq(daqVar, this, 11, (byte) 0));
        this.O0 = new obq(daqVar, this, 10, (byte) 0);
        this.P0 = new obq(daqVar, this, 16, (byte) 0);
        this.Q0 = new obq(daqVar, this, 15, (byte) 0);
        this.R0 = iy81.a(new obq(daqVar, this, 17, (byte) 0));
        this.S0 = new obq(daqVar, this, 18, (byte) 0);
        this.T0 = iy81.a(new obq(daqVar, this, 14, (byte) 0));
        this.U0 = iy81.a(new obq(daqVar, this, 13, (byte) 0));
        this.V0 = iy81.a(new obq(daqVar, this, 21, (byte) 0));
        this.W0 = iy81.a(new obq(daqVar, this, 22, (byte) 0));
        this.X0 = iy81.a(new obq(daqVar, this, 24, (byte) 0));
        this.Y0 = iy81.a(new obq(daqVar, this, 23, (byte) 0));
        this.Z0 = iy81.a(new obq(daqVar, this, 25, (byte) 0));
        this.a1 = new obq(daqVar, this, 26, (byte) 0);
        this.b1 = iy81.a(new obq(daqVar, this, 20, (byte) 0));
        this.c1 = new obq(daqVar, this, 19, (byte) 0);
        this.d1 = new obq(daqVar, this, 9, (byte) 0);
    }
}
