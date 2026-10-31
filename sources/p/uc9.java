package p;

import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import defpackage.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uc9 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uc9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke() {
        int i;
        n511 n511Var;
        n511 n511VarJ;
        n511 n511VarJ2;
        boolean z;
        switch (this.a) {
            case 0:
                vc9 vc9Var = (vc9) this.b;
                zwg zwgVar = (zwg) this.c;
                n811 n811Var = (n811) this.d;
                vc9Var.a();
                uj7 uj7Var = (uj7) zwgVar.c;
                int i2 = n811Var.a;
                do {
                    i = uj7Var.get();
                } while (!uj7Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return rih1.a;
            case 1:
                w5f1 w5f1Var = (w5f1) this.b;
                c9n c9nVar = (c9n) this.c;
                ven0 ven0Var = (ven0) this.d;
                if (w5f1Var.isVisible()) {
                    fn31.T(c9nVar, null, 0, new kk(w5f1Var, (lnm) null, (byte) 21), 3);
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1.a;
            case 2:
                m5c m5cVar = (m5c) this.b;
                n511 n511VarH1 = m5c.H1(m5cVar, (ndo0) this.c, (og) this.d);
                if (n511VarH1 == null) {
                    return null;
                }
                xtl xtlVar = m5cVar.O0;
                if (yr80.b(xtlVar.V0, -1L)) {
                    tf80.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return n511VarH1.n(xtlVar.L1(n511VarH1, xtlVar.I1(), 0L) ^ (-9223372034707292160L));
            case 3:
                xtl xtlVar2 = (xtl) this.b;
                vnh1 vnh1Var = (vnh1) this.c;
                p5c p5cVar = (p5c) this.d;
                rih1 rih1Var = rih1.a;
                ps7 ps7Var = xtlVar2.T0;
                while (true) {
                    bfn0 bfn0Var = (bfn0) ps7Var.b;
                    int i3 = bfn0Var.c;
                    if (i3 != 0) {
                        if (i3 == 0) {
                            bhn0.t("MutableVector is empty.");
                            return null;
                        }
                        n511 n511Var2 = (n511) ((wtl) bfn0Var.a[i3 - 1]).a.invoke();
                        if (n511Var2 == null ? true : xtl.J1(xtlVar2, n511Var2, 0L, 0L, 3)) {
                            bfn0 bfn0Var2 = (bfn0) ps7Var.b;
                            ((wtl) bfn0Var2.l(bfn0Var2.c - 1)).b.resumeWith(rih1Var);
                        }
                    }
                }
                if (xtlVar2.U0 && (n511Var = (n511) xtlVar2.S0.invoke()) != null && xtl.J1(xtlVar2, n511Var, 0L, 0L, 3)) {
                    xtlVar2.U0 = false;
                }
                vnh1Var.e = xtlVar2.H1(p5cVar, 0L);
                return rih1Var;
            case 4:
                l811 l811Var = (l811) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                lu4 lu4Var = (lu4) this.d;
                if (l811Var.a) {
                    qs10 qs10VarA = qs10.a();
                    int i4 = mvl1.a;
                    qs10VarA.getClass();
                    connectivityManager.unregisterNetworkCallback(lu4Var);
                }
                return rih1.a;
            case 5:
                return new rjr0((zu30) ((ven0) this.b).getValue(), (iu30) ((ven0) this.c).getValue(), ((Number) ((Function0) this.d).invoke()).intValue());
            case 6:
                mdt mdtVar = (mdt) this.b;
                xtb0 xtb0Var = (xtb0) this.c;
                aqb0 aqb0Var = (aqb0) this.d;
                jtb0 jtb0Var = (jtb0) mdtVar.getValue();
                return new ktb0(xtb0Var, jtb0Var, aqb0Var, new mgc((tr80) ((ksb0) xtb0Var.e.e).getValue(), (mmo1) jtb0Var));
            case 7:
                vu30 vu30Var = (vu30) this.b;
                p811 p811Var = (p811) this.c;
                zy31 zy31Var = (zy31) this.d;
                x5f0 x5f0Var = (x5f0) p811Var.a;
                nen0 nen0Var = x5f0Var.Z;
                if (nen0Var == null) {
                    long[] jArr = hj41.a;
                    nen0Var = new nen0();
                    x5f0Var.Z = nen0Var;
                }
                Object objG = nen0Var.g(zy31Var);
                if (objG == null) {
                    objG = new v5f0(x5f0Var);
                    nen0Var.m(zy31Var, objG);
                }
                v5f0 v5f0Var = (v5f0) objG;
                v5f0Var.a = false;
                vu30Var.invoke(v5f0Var, zy31Var);
                return rih1.a;
            case 8:
                vy71 vy71Var = (vy71) this.b;
                c9n c9nVar2 = (c9n) this.c;
                vy71 vy71Var2 = (vy71) this.d;
                if (((Boolean) ((iu30) vy71Var.e.e).invoke(xy71.b)).booleanValue()) {
                    fn31.T(c9nVar2, null, 0, new g(vy71Var2, null, (byte) 17), 3);
                }
                return Boolean.TRUE;
            case 9:
                iu30 iu30Var = (iu30) this.b;
                ndo0 ndo0Var = (ndo0) this.c;
                l811 l811Var2 = (l811) this.d;
                n511 n511VarO = n511.e;
                kd31 kd31Var = ndo0.z1;
                iu30Var.invoke(kd31Var);
                boolean zJ = u890.j(ndo0Var.l1, kd31Var.O0);
                boolean z2 = ndo0Var.o1 != kd31Var.P0;
                z1a1 z1a1VarA = kd31Var.O0.a(kd31Var.R0, kd31Var.U0, kd31Var.T0);
                kd31Var.Y0 = z1a1VarA;
                boolean zJ2 = u890.j(ndo0Var.n1, z1a1VarA != null ? z1a1VarA.j() : null);
                l811Var2.a = !zJ2;
                if (!zJ || z2 || !zJ2) {
                    ndo0Var.l1 = kd31Var.O0;
                    ndo0Var.o1 = kd31Var.P0;
                    z1a1 z1a1Var = kd31Var.Y0;
                    if (z1a1Var == null || (n511VarJ = z1a1Var.j()) == null) {
                        n511VarJ = n511VarO;
                    }
                    ndo0Var.n1 = n511VarJ;
                    z1a1 z1a1Var2 = kd31Var.Y0;
                    if (z1a1Var2 != null && (n511VarJ2 = z1a1Var2.j()) != null) {
                        n511VarO = hm5.O(hm5.H(n511VarJ2));
                    }
                    ndo0Var.m1 = n511VarO;
                    if (ndo0Var.p1 && (z2 || (ndo0Var.o1 && !zJ))) {
                        ndo0Var.U0.G();
                    }
                }
                ndo0Var.p1 = true;
                return rih1.a;
            case 10:
                s340 s340Var = (s340) this.b;
                hf91 hf91Var = (hf91) this.c;
                llq0 llq0Var = (llq0) this.d;
                if (s340Var != null) {
                    hf91Var.a(hf91Var.c(s340Var) - hf91Var.t);
                }
                List listQ = rc2.q(hf91Var, null, hf91Var.t, null);
                zyj zyjVar = (zyj) o7h.C0(listQ);
                Integer num = zyjVar != null ? zyjVar.b : null;
                List listB = llq0Var.b(num);
                if (num != null && !listB.isEmpty()) {
                    listB = o7h.N0(o7h.k0(listB, 1), Collections.singletonList(new zyj(((zyj) o7h.q0(listB)).a, null, num)));
                }
                return new xyj(o7h.N0(listB, listQ), llq0Var.c());
            case 11:
                o6 o6Var = (o6) this.b;
                y22 y22Var = (y22) this.c;
                c8k1 c8k1Var = (c8k1) this.d;
                o6Var.removeOnAttachStateChangeListener(y22Var);
                p9p1.x(o6Var).a.remove(c8k1Var);
                return rih1.a;
            case 12:
                mwl1 mwl1Var = (mwl1) this.b;
                UUID uuid = (UUID) this.c;
                ewq ewqVar = (ewq) this.d;
                mwl1Var.getClass();
                String string = uuid.toString();
                qs10 qs10VarA2 = qs10.a();
                uuid.toString();
                Objects.toString(ewqVar);
                qs10VarA2.getClass();
                WorkDatabase workDatabase = mwl1Var.a;
                workDatabase.c();
                try {
                    vwl1 vwl1VarD = workDatabase.A().d(string);
                    if (vwl1VarD == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (vwl1VarD.b == wvl1.b) {
                        kwl1 kwl1Var = new kwl1(string, ewqVar);
                        lwl1 lwl1VarZ = workDatabase.z();
                        qyo1.x(lwl1VarZ.a, false, true, new vae1(lwl1VarZ, kwl1Var, (byte) 13));
                    } else {
                        qs10.a().getClass();
                    }
                    workDatabase.s();
                    workDatabase.o();
                    return null;
                } catch (Throwable th) {
                    try {
                        qs10.a().getClass();
                        throw th;
                    } catch (Throwable th2) {
                        workDatabase.o();
                        throw th2;
                    }
                }
            default:
                awl1 awl1Var = (awl1) this.b;
                String str = (String) this.c;
                rwl1 rwl1Var = (rwl1) this.d;
                rih1 rih1Var2 = rih1.a;
                dxl1 dxl1VarA = awl1Var.c.A();
                List listE = dxl1VarA.e(str);
                if (listE.size() > 1) {
                    hhg1.h("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                twl1 twl1Var = (twl1) o7h.s0(listE);
                if (twl1Var == null) {
                    hay.a(new nvl1(awl1Var, str, 2, Collections.singletonList(rwl1Var), (List) null));
                } else {
                    String str2 = twl1Var.a;
                    vwl1 vwl1VarD2 = dxl1VarA.d(str2);
                    if (vwl1VarD2 == null) {
                        eg.m(cy30.p("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"));
                        return null;
                    }
                    if (!vwl1VarD2.c()) {
                        hhg1.h("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                        return null;
                    }
                    if (twl1Var.b == wvl1.f) {
                        qyo1.x(dxl1VarA.a, false, true, new jfa(str2, (byte) 28));
                        hay.a(new nvl1(awl1Var, str, 2, Collections.singletonList(rwl1Var), (List) null));
                    } else {
                        vwl1 vwl1VarB = vwl1.b(rwl1Var.b, twl1Var.a, (wvl1) null, (String) null, (ewq) null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        lsw0 lsw0Var = awl1Var.f;
                        WorkDatabase workDatabase2 = awl1Var.c;
                        btk btkVar = awl1Var.b;
                        List list = awl1Var.e;
                        Set set = rwl1Var.c;
                        String str3 = vwl1VarB.a;
                        vwl1 vwl1VarD3 = workDatabase2.A().d(str3);
                        if (vwl1VarD3 == null) {
                            hhg1.n(f4i1.f("Worker with ", str3, " doesn't exist"));
                            return null;
                        }
                        if (!vwl1VarD3.b.a()) {
                            if (vwl1VarD3.c() ^ vwl1VarB.c()) {
                                StringBuilder sb = new StringBuilder("Can't update ");
                                sb.append(vwl1VarD3.c() ? "Periodic" : "OneTime");
                                sb.append(" Worker to ");
                                throw new UnsupportedOperationException(l1d.n(vwl1VarB.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type.", sb));
                            }
                            synchronized (lsw0Var.k) {
                                z = lsw0Var.c(str3) != null;
                                break;
                            }
                            if (!z) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((im41) it.next()).b(str3);
                                }
                            }
                            workDatabase2.r(new an31(new dfa(workDatabase2, vwl1VarD3, vwl1VarB, list, str3, set, z), (byte) 0));
                            if (!z) {
                                om41.b(btkVar, workDatabase2, list);
                            }
                        }
                    }
                }
                return rih1Var2;
        }
    }
}
