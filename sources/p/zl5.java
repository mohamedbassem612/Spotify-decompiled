package p;

import android.content.Context;
import android.os.Handler;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import j$.time.Clock;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zl5 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f21p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;

    public zl5(sjf0 sjf0Var, ryj ryjVar, wjf0 wjf0Var, q7r0 q7r0Var) {
        this.a = (byte) 3;
        this.b = sjf0Var;
        this.c = ryjVar;
        this.d = q7r0Var;
        this.e = iy81.a(new blp(this, 1, (byte) 16));
        this.f = iy81.a(new blp(this, 2, (byte) 16));
        this.g = iy81.a(new blp(this, 4, (byte) 16));
        this.h = iy81.a(new blp(this, 5, (byte) 16));
        this.i = iy81.a(new blp(this, 3, (byte) 16));
        this.j = iy81.a(new blp(this, 7, (byte) 16));
        this.k = iy81.a(new blp(this, 6, (byte) 16));
        this.l = iy81.a(new blp(this, 9, (byte) 16));
        this.m = iy81.a(new blp(this, 8, (byte) 16));
        this.n = iy81.a(new blp(this, 10, (byte) 16));
        this.o = iy81.a(new blp(this, 11, (byte) 16));
        this.f21p = new blp(this, 12, (byte) 16);
        this.q = new blp(this, 13, (byte) 16);
        this.r = new blp(this, 14, (byte) 16);
        this.s = xqu.b(new blp(this, 16, (byte) 16));
        this.t = iy81.a(new blp(this, 18, (byte) 16));
        this.u = xqu.b(new blp(this, 17, (byte) 16));
        this.v = xqu.b(new blp(this, 15, (byte) 16));
        this.w = iy81.a(new blp(this, 20, (byte) 16));
        this.x = xqu.b(new blp(this, 19, (byte) 16));
        this.y = iy81.a(new blp(this, 0, (byte) 16));
    }

    public static /* synthetic */ List E(zl5 zl5Var, ioj0 ioj0Var, String str, int i, ArrayList arrayList) {
        return zl5Var.D(ioj0Var, str, i, arrayList, new ydv0(), true, 0);
    }

    public static List K(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        ukf1 ukf1Var;
        hoj0 hoj0VarC = ioj0Var.c(ukf1.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (ukf1Var = (ukf1) goj0VarA.a) == null) {
            return z6x.a;
        }
        ArrayList arrayList = ukf1Var.a.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ai51) it.next()).a);
        }
        return Collections.singletonList(new lfr0(arrayList2, str, new tfr0(Integer.valueOf(i), (y6h1) null, 2)));
    }

    public static final List e(qfr0 qfr0Var, y6h1 y6h1Var, String str, boolean z, List list) {
        if (list.isEmpty()) {
            return z6x.a;
        }
        if (list.size() <= 5) {
            return o7h.N0(list, Collections.singletonList(qfr0Var));
        }
        mfr0 mfr0Var = (mfr0) list.get(5);
        return o7h.O0(new kfr0(z, str, mfr0Var.a, z ? list.size() + 1 : 6, mfr0Var.d, new tfr0(Integer.valueOf(z ? list.size() : 5), y6h1Var)), o7h.N0(z ? list : o7h.d1(list, 5), Collections.singletonList(qfr0Var)));
    }

    public static List w(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        xti0 xti0Var;
        hoj0 hoj0VarC = ioj0Var.c(xti0.class, str);
        ArrayList arrayList = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (xti0Var = (xti0) goj0VarA.a) == null) ? null : xti0Var.a;
        return (arrayList == null || arrayList.isEmpty()) ? z6x.a : Collections.singletonList(new bfr0(str, new tfr0(Integer.valueOf(i), (y6h1) null, 2)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    public static List y(String str, ioj0 ioj0Var) {
        int i;
        int i2;
        foj0 foj0VarC = ioj0Var.c(myv0.class, str);
        if (foj0VarC == null) {
            i = 0;
        } else {
            foj0 foj0Var = foj0VarC instanceof foj0 ? foj0VarC : null;
            if (foj0Var != null) {
                i = foj0Var.a;
            } else {
                i = 0;
            }
        }
        boolean z = i == 2;
        hoj0 hoj0VarC = ioj0Var.c(tdv0.class, str);
        if (hoj0VarC == null) {
            i2 = 0;
        } else {
            foj0 foj0Var2 = hoj0VarC instanceof foj0 ? (foj0) hoj0VarC : null;
            if (foj0Var2 != null) {
                i2 = foj0Var2.a;
            } else {
                i2 = 0;
            }
        }
        return (z && (i2 == 2)) ? Collections.singletonList(ier0.a) : z6x.a;
    }

    public ytp0 A() {
        ib3 ib3Var = (ib3) this.b;
        yh2 yh2Var = (yh2) ib3Var.A;
        vb2 vb2Var = (vb2) ib3Var.z;
        return new ytp0(yh2Var, (zr00) ib3Var.B, ((y390) ib3Var.C).a((iac0) ib3Var.x, r6h1.c), (qns0) ib3Var.y, vb2Var, (byte) 11);
    }

    public ruz B() {
        return ((cyp) ((jly0) this.k).get()).a();
    }

    public List C(int i, String str, ioj0 ioj0Var) {
        ArrayList arrayList;
        goj0 goj0VarA;
        tdv0 tdv0Var;
        hoj0 hoj0VarC = ioj0Var.c(tdv0.class, str);
        if (hoj0VarC != null && (hoj0VarC instanceof foj0)) {
            ((gev0) this.n).e();
        }
        hoj0 hoj0VarC2 = ioj0Var.c(tdv0.class, str);
        if (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (tdv0Var = (tdv0) goj0VarA.a) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = tdv0Var.a;
            arrayList = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((no11) it.next()).a);
            }
        }
        return E(this, ioj0Var, str, i, arrayList);
    }

    public List D(ioj0 ioj0Var, String str, int i, List list, ydv0 ydv0Var, boolean z, int i2) {
        int i3;
        goj0 goj0VarA;
        myv0 myv0Var;
        goj0 goj0VarA2;
        myv0 myv0Var2;
        List list2 = ydv0Var.a;
        Context context = (Context) this.b;
        hoj0 hoj0VarC = ioj0Var.c(myv0.class, str);
        String str2 = (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null || (myv0Var2 = (myv0) goj0VarA2.a) == null) ? null : myv0Var2.a;
        if (!z) {
            str2 = null;
        }
        hoj0 hoj0VarC2 = ioj0Var.c(myv0.class, str);
        String str3 = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (myv0Var = (myv0) goj0VarA.a) == null) ? null : myv0Var.c.a;
        List list3 = list;
        if ((list3 == null || list3.isEmpty()) && ((str2 == null || str2.length() == 0) && list2.isEmpty() && i2 <= 0)) {
            return z6x.a;
        }
        smc0 smc0VarN = k4p1.n();
        Integer numValueOf = Integer.valueOf(i);
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-popular-releases-section";
        x6h1VarI.f = "2.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        smc0VarN.add(new gfr0(context.getString(2131960255), str.concat(":releases"), new tfr0(0, y6h1VarA)));
        if (!list2.isEmpty()) {
            smc0VarN.add(new efr0(ydv0Var, new tfr0(Integer.valueOf(i), (y6h1) null, 2)));
        }
        if (str2 == null || str2.length() == 0) {
            i3 = 0;
        } else {
            if (list != null) {
                List list4 = list;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (u890.j((String) it.next(), str3)) {
                                i3 = 0;
                            }
                        }
                    }
                }
            }
            smc0VarN.add(new eer0(str2, str, true, new tfr0(0, y6h1VarA)));
            i3 = 1;
        }
        if (i2 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                smc0VarN.add(new dfr0(i4));
            }
        } else if (list3 != null && !list3.isEmpty()) {
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                smc0VarN.add(new eer0((String) obj, str, i5 == 0, new tfr0(Integer.valueOf(i3), y6h1VarA)));
                i5 = i6;
                i3++;
            }
        }
        smc0VarN.add(new yer0(context.getString(2131954710), context.getString(2131954710), str.concat(":releases"), new tfr0((Integer) null, y6h1VarA, 1)));
        return k4p1.k(smc0VarN);
    }

    public aru0 F() {
        return new aru0((yqg) ((fwo) this.c).get(), (nwt) ((fwo) this.d).get(), (clm) ((fwo) this.e).get(), (byte) 20);
    }

    public jz51 G() {
        hwj hwjVar = (hwj) this.c;
        lzn0 lzn0Var = (lzn0) hwjVar.a.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) hwjVar.b.get();
        c8o.l(a1r0Var);
        dg30 dg30Var = (dg30) hwjVar.l.get();
        c8o.l(dg30Var);
        return new jz51(lzn0Var, a1r0Var, dg30Var);
    }

    public yp91 H() {
        hwj hwjVar = (hwj) this.c;
        uvy uvyVar = (uvy) hwjVar.r.get();
        c8o.l(uvyVar);
        luk lukVarC = hwjVar.c();
        c8o.l(lukVarC);
        yu4 yu4Var = new yu4(false, lukVarC);
        q8n q8nVar = (q8n) hwjVar.d.get();
        c8o.l(q8nVar);
        return new yp91(f2u0.D(J()), uvyVar, yu4Var, q8nVar);
    }

    public vqb1 I() {
        sjf0 sjf0Var = (sjf0) this.b;
        t8u0 t8u0Var = (t8u0) sjf0Var.n.get();
        c8o.l(t8u0Var);
        iac0 iac0Var = ((q7r0) this.d).d.c;
        c8o.m(iac0Var);
        Flowable flowable = (Flowable) sjf0Var.p.get();
        c8o.l(flowable);
        loc1 loc1Var = (loc1) sjf0Var.o.get();
        c8o.l(loc1Var);
        Scheduler scheduler = (Scheduler) sjf0Var.k.get();
        c8o.l(scheduler);
        yqg yqgVar = (yqg) sjf0Var.j.get();
        c8o.l(yqgVar);
        return new vqb1(t8u0Var.a(iac0Var.getLifecycle()), flowable, loc1Var, scheduler, yqgVar);
    }

    public FlowableFilter J() {
        hwj hwjVar = (hwj) this.c;
        t8u0 t8u0Var = (t8u0) hwjVar.m.get();
        c8o.l(t8u0Var);
        iac0 iac0VarO = xcz0.o((q7r0) this.d);
        Flowable flowable = (Flowable) hwjVar.n.get();
        c8o.l(flowable);
        loc1 loc1Var = new loc1();
        Scheduler scheduler = (Scheduler) ((b2p) this.g).get();
        yqg yqgVar = (yqg) hwjVar.g.get();
        c8o.l(yqgVar);
        cyp cypVarA = t8u0Var.a(iac0VarO.getLifecycle());
        grb1 grb1Var = new grb1(flowable.L(scheduler), yqgVar, new erb1(yqgVar), new frb1(yqgVar), new Handler());
        cypVarA.a();
        cypVarA.c();
        r2a1 r2a1Var = new r2a1(loc1Var, grb1Var.l, (byte) 22);
        int i = Flowable.a;
        return new FlowableCreate(r2a1Var, BackpressureStrategy.d).L(scheduler).x(xi10.Z0);
    }

    public List L(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        myv0 myv0Var;
        hoj0 hoj0VarC = ioj0Var.c(myv0.class, str);
        String str2 = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (myv0Var = (myv0) goj0VarA.a) == null) ? null : myv0Var.a;
        return (str2 == null || str2.length() == 0) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131963496)), new nfr0(str2, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List M(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        hoj0 hoj0VarC = ioj0Var.c(myv0.class, str);
        myv0 myv0Var = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (myv0) goj0VarA.a;
        return (myv0Var == null || myv0Var.b < ZonedDateTime.now(ZoneId.of(Clock.systemDefaultZone().getZone().getId())).toEpochSecond()) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131963503)), new nfr0(myv0Var.a, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List N(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        bz6 bz6Var;
        Context context = (Context) this.b;
        Integer numValueOf = Integer.valueOf(i);
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-clips-section";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        hoj0 hoj0VarC = ioj0Var.c(bz6.class, str);
        ArrayList arrayListC = z6x.a;
        if (hoj0VarC == null || !(hoj0VarC instanceof goj0)) {
            return arrayListC;
        }
        hoj0 hoj0VarC2 = ioj0Var.c(bz6.class, str);
        if (hoj0VarC2 != null && (goj0VarA = hoj0VarC2.a()) != null && (bz6Var = (bz6) goj0VarA.a) != null) {
            arrayListC = oon1.C(bz6Var.a);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : arrayListC) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            tr80 tr80Var = (tr80) obj;
            if (i2 == 0) {
                arrayList.add(new ffr0(context.getString(2131953945)));
            } else if (i2 == 1) {
                arrayList.add(new ffr0(context.getString(2131953946)));
            }
            String str2 = str;
            arrayList.add(new pfr0(f4i1.c(i2, "artist-page-clips-tab-"), str2, tr80Var, i2 == 0, new tfr0(Integer.valueOf(i2), y6h1VarA)));
            if (i2 == 0) {
                arrayList.add(new hfr0(2));
            } else {
                arrayList.add(new hfr0(1));
            }
            i2 = i3;
            str = str2;
        }
        return arrayList;
    }

    public List O(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        bz6 bz6Var;
        goj0 goj0VarA2;
        jo70 jo70Var;
        hoj0 hoj0VarC = ioj0Var.c(bz6.class, str);
        ArrayList arrayListC = z6x.a;
        if (hoj0VarC == null || !(hoj0VarC instanceof goj0)) {
            return arrayListC;
        }
        hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str);
        String str2 = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null || (jo70Var = (jo70) goj0VarA2.a) == null) ? null : jo70Var.a;
        hoj0 hoj0VarC3 = ioj0Var.c(bz6.class, str);
        if (hoj0VarC3 != null && (goj0VarA = hoj0VarC3.a()) != null && (bz6Var = (bz6) goj0VarA.a) != null) {
            arrayListC = oon1.C(bz6Var.a);
        }
        return p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131953931, str2)), new pfr0("artist-page-featured-expressions", str, (tr80) o7h.q0(arrayListC), true, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public vu4 a() {
        switch (this.a) {
            case 2:
                luk lukVarC = ((hwj) this.c).c();
                c8o.l(lukVarC);
                return new vu4(false, false, false, lukVarC);
            default:
                luk lukVarA = ((sjf0) this.b).a();
                c8o.l(lukVarA);
                return new vu4(false, false, false, lukVarA);
        }
    }

    public List b(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        jxn jxnVar;
        hoj0 hoj0VarC = ioj0Var.c(jxn.class, str);
        ArrayList arrayList = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (jxnVar = (jxn) goj0VarA.a) == null) ? null : jxnVar.a.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return z6x.a;
        }
        qfr0 ffr0Var = new ffr0(((Context) this.b).getString(2131952376));
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((di51) it.next()).a);
        }
        return p7h.M(new qfr0[]{ffr0Var, new fer0(arrayList2, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List c(int i, String str, ioj0 ioj0Var) {
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        return (hoj0VarC == null || !(hoj0VarC instanceof goj0) || ioj0Var.c(pnt.class, str) == null) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131954693)), new ger0(str, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List d(ioj0 ioj0Var, String str, int i, boolean z) {
        goj0 goj0VarA;
        myv0 myv0Var;
        hoj0 hoj0VarC = ioj0Var.c(pnt.class, str);
        boolean z2 = hoj0VarC != null && (hoj0VarC instanceof goj0);
        hoj0 hoj0VarC2 = ioj0Var.c(myv0.class, str);
        String str2 = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (myv0Var = (myv0) goj0VarA.a) == null) ? null : myv0Var.a;
        return ((z || !(str2 == null || str2.length() == 0)) && z2) ? p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131954693)), new mer0(str, new tfr0(Integer.valueOf(i), (y6h1) null, 2))}) : z6x.a;
    }

    public List f(int i, List list, boolean z) {
        boolean zIsEmpty = list.isEmpty();
        List listSingletonList = z6x.a;
        if (zIsEmpty) {
            return listSingletonList;
        }
        Integer numValueOf = Integer.valueOf(i);
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-audiobook-series-section";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        int i2 = 0;
        boolean z2 = list.size() > 3;
        List listD1 = (z || !z2) ? list : o7h.d1(list, 2);
        List list2 = listD1;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                if (!z && z2) {
                    str = (String) o7h.t0(2, list);
                }
                if (z2) {
                    listSingletonList = Collections.singletonList(new ker0(z, str, new tfr0(Integer.valueOf(listD1.size()), y6h1VarA)));
                }
                return o7h.N0(listSingletonList, o7h.N0(arrayList, Collections.singletonList(new ffr0(((Context) this.b).getString(2131952664)))));
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(new ler0((String) next, new tfr0(Integer.valueOf(i2), y6h1VarA)));
            i2 = i3;
        }
    }

    public List g(String str, z2r0 z2r0Var, int i) {
        ArrayList arrayList = z2r0Var.a;
        if (arrayList.isEmpty()) {
            return z6x.a;
        }
        int i2 = z2r0Var.b;
        int size = arrayList.size();
        String str2 = (String) this.s;
        return p7h.M(new qfr0[]{i2 > size ? new gfr0(str2, str.concat(":dna"), new tfr0(Integer.valueOf(i), (y6h1) null, 2)) : new ffr0(str2), new jfr0(arrayList, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public jpg0 h(epb1 epb1Var, iac0 iac0Var, ms11 ms11Var, nu11 nu11Var) {
        zsc zscVar = (zsc) this.d;
        int iG = k4p1.G(ms11Var.y);
        int i = ms11Var.z;
        e50 e50Var = ms11Var.e;
        vtw vtwVarX = e50Var != null ? two1.x(e50Var, epb1Var, iac0Var) : null;
        e50 e50Var2 = ms11Var.f;
        vtw vtwVarX2 = e50Var2 != null ? two1.x(e50Var2, epb1Var, iac0Var) : null;
        yt11 yt11Var = ms11Var.g;
        w1x0 w1x0Var = (w1x0) this.n;
        boolean z = ms11Var.o;
        lh2 lh2Var = new lh2(3, (w6g1) ms11Var.l.d, w6g1.class, "extractTraits", "extractTraits(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Ljava/lang/Object;", 0, (byte) 16);
        xu30 xu30Var = ms11Var.m;
        vu30 vu30Var = ms11Var.i;
        es11 es11Var = null;
        iu30 iu30Var = ms11Var.r;
        iu30 iu30Var2 = ms11Var.s;
        vu30 vu30Var2 = ms11Var.t;
        vu30 vu30Var3 = ms11Var.u;
        if (((xf4) this.t).a()) {
            es11Var = new es11(this, (byte) 1);
        }
        return new jpg0(zsc.j(zscVar, new em0(lh2Var, epb1Var, vu30Var, (iu30) null, iu30Var, iu30Var2, es11Var, xu30Var, vu30Var2, vu30Var3, 24), (mka) null, iG, false, vtwVarX, vtwVarX2, (vtw) null, (vtw) null, (vtw) null, (vtw) null, yt11Var, w1x0Var, nu11Var, z, 0, false, opc1.a, false, false, false, (egx0) null, i, 1065258800), br11.X);
    }

    public afr0 i(int i, String str, String str2, String str3, String str4, List list, boolean z) {
        return new afr0(str, str2, str3, z ? str4 : null, z ? ((Context) this.b).getString(2131954712) : null, o7h.d1(list, 10), new tfr0(Integer.valueOf(i), (y6h1) null, 2));
    }

    public List j(int i, String str, ioj0 ioj0Var) {
        hoj0 hoj0VarC = ioj0Var.c(o2o.class, str);
        return (hoj0VarC == null || !(hoj0VarC instanceof goj0)) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131954713)), new oer0(str, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List k(int i, String str, ioj0 ioj0Var) {
        ArrayList arrayList;
        goj0 goj0VarA;
        q2o q2oVar;
        hoj0 hoj0VarC = ioj0Var.c(q2o.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (q2oVar = (q2o) goj0VarA.a) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = q2oVar.a.a;
            arrayList = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((xh51) it.next()).a);
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131954703)), new per0(arrayList, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List l(int i, String str, ioj0 ioj0Var) {
        ArrayList arrayList;
        goj0 goj0VarA;
        yl6 yl6Var;
        Context context = (Context) this.b;
        Integer numValueOf = Integer.valueOf(i);
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-events-section";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        hoj0 hoj0VarC = ioj0Var.c(yl6.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (yl6Var = (yl6) goj0VarA.a) == null) {
            arrayList = null;
        } else {
            h290 h290Var = yl6Var.a;
            arrayList = new ArrayList(q7h.U(h290Var, 10));
            int i2 = 0;
            for (Object obj : h290Var) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                arrayList.add(new ser0((String) obj, new tfr0(Integer.valueOf(i2), y6h1VarA)));
                i2 = i3;
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? z6x.a : o7h.O0(new yer0(context.getString(2131954711), context.getString(2131954711), str.concat(":concerts"), new tfr0((Integer) null, y6h1VarA, 1)), arrayList);
    }

    public List m(int i, String str, ioj0 ioj0Var) {
        hoj0 hoj0VarC = ioj0Var.c(o0o.class, str);
        return (hoj0VarC == null || !(hoj0VarC instanceof goj0)) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131955925)), new ter0(str, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List n(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        kl11 kl11Var;
        hoj0 hoj0VarC = ioj0Var.c(kl11.class, str);
        ArrayList arrayList = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (kl11Var = (kl11) goj0VarA.a) == null) ? null : kl11Var.a.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return z6x.a;
        }
        qfr0 ffr0Var = new ffr0(((Context) this.b).getString(2131955926));
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((yh51) it.next()).a);
        }
        return p7h.M(new qfr0[]{ffr0Var, new uer0(arrayList2, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public List o(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        jo70 jo70Var;
        goj0 goj0VarA2;
        s211 s211Var;
        hoj0 hoj0VarC = ioj0Var.c(s211.class, str);
        ArrayList arrayList = (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null || (s211Var = (s211) goj0VarA2.a) == null) ? null : s211Var.a;
        hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str);
        String str2 = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (jo70Var = (jo70) goj0VarA.a) == null) ? null : jo70Var.a;
        return (arrayList == null || str2 == null) ? z6x.a : p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString(2131955933, str2)), new ver0(arrayList, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public Context p() {
        return (Context) ((kly0) this.i).get();
    }

    public ms11 q(String str, y6r0 y6r0Var, kko kkoVar, btt0 btt0Var) {
        os11 os11Var = new os11();
        uvf1 uvf1Var = (uvf1) this.m;
        req reqVar = (req) this.w;
        iac0 iac0Var = (iac0) this.g;
        uvf1.b(uvf1Var, (y1c1) null, (String) null, reqVar.a(iac0Var, a8o.v((peq) this.x, new huz(Collections.singleton(str), (byte) 10)), ((myq0) this.y).get()), btt0Var, new my6((Context) this.f, ((lik1) this.h).a, str, (aas) this.i, (jr6) this.k, y6r0Var, (vgm) this.j, btt0Var, ((x290) this.o).a(), (q8n) this.q, ((y390) this.f21p).a(iac0Var, (r6h1) this.s), (t740) this.r, (kly0) this.b, (yqg) this.e, (vb2) this.v, ((xf4) this.t).a()), new ziz0(this, str), (r3x0) null, new e10(ey6.e, new es11(this, (byte) 2)), new e10(new nt01(this, kkoVar, (byte) 8)), false, false, h211.Z0, kkoVar, true, true, false, 535619).invoke(os11Var);
        return os11Var.a();
    }

    public Map r() {
        mmr0 mmr0Var = new mmr0(w2r0.a, new xfr0(c13.i(jxn.class), new t3r0(this, (byte) 0)));
        byte b = 1;
        mmr0 mmr0Var2 = new mmr0(w2r0.b, new xfr0(c13.i(myv0.class), new p3r0(this, b)));
        mmr0 mmr0Var3 = new mmr0(w2r0.c, new xfr0(c13.i(myv0.class), new r3r0(this, b)));
        s3r0 s3r0Var = new s3r0(this, b);
        w7x w7xVar = w7x.a;
        mmr0 mmr0Var4 = new mmr0(w2r0.d, new xfr0(w7xVar, s3r0Var));
        mmr0 mmr0Var5 = new mmr0(w2r0.f1, new xfr0(w7xVar, new t3r0(this, b)));
        mmr0 mmr0Var6 = new mmr0(w2r0.e, new xfr0(c13.i(kl11.class), new w3r0(this, b)));
        mmr0 mmr0Var7 = new mmr0(w2r0.f, new xfr0(f46.S0(new yp21[]{new yp21(s211.class), new yp21(jo70.class)}), new y3r0(this, b)));
        mmr0 mmr0Var8 = new mmr0(w2r0.d1, new xfr0(c13.i(us6.class), new a4r0(this, b)));
        mmr0 mmr0Var9 = new mmr0(w2r0.T0, new xfr0(c13.i(us6.class), new c4r0(this, b)));
        mmr0 mmr0Var10 = new mmr0(w2r0.U0, new xfr0(c13.i(us6.class), new f3r0(this, (byte) 0)));
        byte b2 = 0;
        mmr0 mmr0Var11 = new mmr0(w2r0.V0, new xfr0(f46.S0(new yp21[]{new yp21(jo70.class), new yp21(ljh1.class)}), new h3r0(this, b2)));
        mmr0 mmr0Var12 = new mmr0(w2r0.W0, new xfr0(c13.i(us6.class), new i3r0(this, b2)));
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 1;
        return sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, new mmr0(w2r0.X0, new xfr0(f46.S0(new yp21[]{new yp21(jo70.class), new yp21(ljh1.class)}), new j3r0(this, (byte) 0))), new mmr0(w2r0.g, (xfr0) this.v), new mmr0(w2r0.h, new xfr0(f46.S0(new yp21[]{new yp21(myv0.class), new yp21(tdv0.class)}), new l3r0(this, b3))), new mmr0(w2r0.i, new xfr0(c13.i(xti0.class), new n3r0(this, b3))), new mmr0(w2r0.t, ((xf4) this.i).o() ? (xfr0) this.u : new xfr0(f46.S0(new yp21[]{new yp21(tdv0.class), new yp21(myv0.class)}), new p3r0(this, (byte) 0))), new mmr0(w2r0.X, (xfr0) this.t), new mmr0(w2r0.Y, new xfr0(f46.S0(new yp21[]{new yp21(jo70.class), new yp21(pnt.class)}), new r3r0(this, (byte) 0))), new mmr0(w2r0.Z, (xfr0) this.y), new mmr0(w2r0.N0, new xfr0(w7xVar, new s3r0(this, (byte) 0))), new mmr0(w2r0.O0, new xfr0(w7xVar, zi20.S0)), new mmr0(w2r0.P0, new xfr0(c13.i(yl6.class), new w3r0(this, b4))), new mmr0(w2r0.Q0, new xfr0(c13.i(q2o.class), new y3r0(this, b4))), new mmr0(w2r0.R0, new xfr0(c13.i(o2o.class), new a4r0(this, b4))), new mmr0(w2r0.S0, new xfr0(c13.i(o0o.class), new c4r0(this, b4))), new mmr0(w2r0.Y0, new xfr0(f46.S0(new yp21[]{new yp21(jo70.class), new yp21(bz6.class)}), new f3r0(this, b5))), new mmr0(w2r0.Z0, new xfr0(c13.i(bz6.class), new h3r0(this, b5))), new mmr0(w2r0.e1, new xfr0(c13.i(bz6.class), new i3r0(this, b5))), new mmr0(w2r0.a1, new xfr0(c13.i(mr6.class), new j3r0(this, b5))), new mmr0(w2r0.b1, new xfr0(w7xVar, new l3r0(this, b5))), new mmr0(w2r0.c1, new xfr0(c13.i(ukf1.class), new n3r0(this, b5)))});
    }

    public otl0 s() {
        return n901.a[((r801) ((jly0) this.q).get()).X.X.ordinal()] == 1 ? otl0.STATIC : otl0.SYLLABLE_SINCED;
    }

    public List t(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        bz6 bz6Var;
        hoj0 hoj0VarC;
        goj0 goj0VarA3;
        ljh1 ljh1Var;
        us6 us6Var;
        goj0 goj0VarA4;
        bz6 bz6Var2;
        xf4 xf4Var = (xf4) this.i;
        hoj0 hoj0VarC2 = ioj0Var.c(bz6.class, str);
        ArrayList arrayList = (hoj0VarC2 == null || (goj0VarA4 = hoj0VarC2.a()) == null || (bz6Var2 = (bz6) goj0VarA4.a) == null) ? null : bz6Var2.a;
        List listD1 = z6x.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return listD1;
        }
        String strV0 = ihc1.V0(str, ':', str);
        hoj0 hoj0VarC3 = ioj0Var.c(us6.class, str);
        if (hoj0VarC3 == null || (((goj0VarA = hoj0VarC3.a()) != null && (us6Var = (us6) goj0VarA.a) != null && (!us6Var.a.isEmpty())) || (xf4Var.r() && ((hoj0VarC = ioj0Var.c(ljh1.class, str)) == null || ((goj0VarA3 = hoj0VarC.a()) != null && (ljh1Var = (ljh1) goj0VarA3.a) != null && (!o7h.K0(ljh1Var.a, ljh1Var.b).isEmpty())))))) {
            return p7h.M(new qfr0[]{new gfr0(((Context) this.b).getString(2131956997), f4i1.f("spotify:artist:", strV0, ":clips"), new tfr0(Integer.valueOf(i), (y6h1) null, 2)), new pfr0("artist-page-video-tab-keep-watching", str, (tr80) o7h.q0(oon1.C(arrayList)), true, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
        }
        hoj0 hoj0VarC4 = ioj0Var.c(bz6.class, str);
        if (hoj0VarC4 != null && (goj0VarA2 = hoj0VarC4.a()) != null && (bz6Var = (bz6) goj0VarA2.a) != null) {
            listD1 = oon1.C(bz6Var.a);
        }
        ArrayList arrayList2 = new ArrayList();
        if (xf4Var.j()) {
            listD1 = o7h.d1(listD1, 5);
        }
        int i2 = 0;
        for (Object obj : listD1) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            arrayList2.add(new pfr0(f4i1.c(i2, "artist-page-clips-tab-"), str, (tr80) obj, i2 == 0, new tfr0(Integer.valueOf(i2), (y6h1) null, 2)));
            arrayList2.add(new hfr0(1));
            i2 = i3;
        }
        return arrayList2;
    }

    public List u(int i, String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        mr6 mr6Var;
        hoj0 hoj0VarC = ioj0Var.c(mr6.class, str);
        if (hoj0VarC == null || !(hoj0VarC instanceof goj0)) {
            return z6x.a;
        }
        hoj0 hoj0VarC2 = ioj0Var.c(mr6.class, str);
        int i2 = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (mr6Var = (mr6) goj0VarA.a) == null) ? 0 : mr6Var.e;
        return p7h.M(new qfr0[]{new ffr0(((Context) this.b).getString((i2 == 0 ? -1 : a3r0.a[l1d.C(i2)]) == 1 ? 2131954699 : 2131954698)), new zer0(str, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
    }

    public aru0 v() {
        ib3 ib3Var = (ib3) this.b;
        return new aru0((gw70) ib3Var.d, new m35(false, (luk) ib3Var.g), (ycm) ib3Var.h, (byte) 21);
    }

    public String x(String str) {
        return ((f54) this.j).c() ? "spotify:artist-music-videos:".concat(ihc1.V0(str, ':', str)) : "spotify:list:artist-music-videos:".concat(ihc1.V0(str, ':', str));
    }

    public uyt0 z() {
        h6h0 h6h0Var = (h6h0) this.b;
        xrc0 xrc0Var = (xrc0) h6h0Var.p.get();
        c8o.l(xrc0Var);
        yqg yqgVar = (yqg) h6h0Var.P.get();
        c8o.l(yqgVar);
        q7r0 q7r0Var = (q7r0) this.d;
        b7r0 b7r0Var = (b7r0) h6h0Var.W.get();
        c8o.l(b7r0Var);
        Flowable flowable = (Flowable) h6h0Var.J.get();
        c8o.l(flowable);
        a2n a2nVar = (a2n) h6h0Var.q.get();
        c8o.l(a2nVar);
        return new uyt0(xrc0Var, yqgVar, q7r0Var, b7r0Var, flowable, a2nVar);
    }

    public zl5(i0p i0pVar, zsc zscVar, yqg yqgVar, Context context, iac0 iac0Var, lik1 lik1Var, aas aasVar, vgm vgmVar, jr6 jr6Var, azo azoVar, uvf1 uvf1Var, w1x0 w1x0Var, x290 x290Var, y390 y390Var, q8n q8nVar, t740 t740Var, fwo fwoVar, r6h1 r6h1Var, xf4 xf4Var, asn asnVar, vb2 vb2Var, req reqVar, peq peqVar, myq0 myq0Var) {
        this.a = (byte) 6;
        this.c = i0pVar;
        this.d = zscVar;
        this.e = yqgVar;
        this.f = context;
        this.g = iac0Var;
        this.h = lik1Var;
        this.i = aasVar;
        this.j = vgmVar;
        this.k = jr6Var;
        this.l = azoVar;
        this.m = uvf1Var;
        this.n = w1x0Var;
        this.o = x290Var;
        this.f21p = y390Var;
        this.q = q8nVar;
        this.r = t740Var;
        this.b = fwoVar;
        this.s = r6h1Var;
        this.t = xf4Var;
        this.u = asnVar;
        this.v = vb2Var;
        this.w = reqVar;
        this.x = peqVar;
        this.y = myq0Var;
    }

    public zl5(Context context, xrc0 xrc0Var, cgf1 cgf1Var, kc8 kc8Var, kn6 kn6Var, lq6 lq6Var, z141 z141Var, xf4 xf4Var, f54 f54Var, v8n0 v8n0Var, String str, xev0 xev0Var, gev0 gev0Var, u9c0 u9c0Var, ynb0 ynb0Var, ynb0 ynb0Var2, oev0 oev0Var) {
        this.a = (byte) 5;
        b3s b3sVar = b3s.c;
        this.b = context;
        this.c = xrc0Var;
        this.d = cgf1Var;
        this.e = kc8Var;
        this.f = kn6Var;
        this.g = lq6Var;
        this.h = z141Var;
        this.i = xf4Var;
        this.j = f54Var;
        this.k = v8n0Var;
        this.l = str;
        this.m = xev0Var;
        this.n = gev0Var;
        this.o = u9c0Var;
        this.f21p = ynb0Var;
        this.q = ynb0Var2;
        this.r = oev0Var;
        this.s = context.getString(2131963300);
        byte b = 2;
        this.t = new xfr0(f46.S0(new yp21[]{new yp21(myv0.class), new yp21(jo70.class), new yp21(pnt.class)}), new h3r0(this, b));
        this.u = new xfr0(c13.i(myv0.class), new i3r0(this, b));
        this.v = new xfr0(w7x.a, new f3r0(this, b));
        hvm hvmVar = hvm.c;
        this.w = w3p1.n(new l4r(hvmVar, 2, q4r0.c, new j4r(rfq0.c1), q4r0.d), new l4r(pwc0.b, 2, q4r0.e, new j4r(rfq0.d1), q4r0.f), w0q0.t);
        this.x = w3p1.o(new l4r(hvmVar, 2, q4r0.g, new j4r(rfq0.e1), q4r0.h), q4r0.b);
        this.y = new xfr0(c13.i(kbf1.class), new t4r0(this));
    }

    public zl5(ib3 ib3Var) {
        this.a = (byte) 1;
        this.b = ib3Var;
        this.c = new fwo(this, 3, (byte) 13);
        this.d = new fwo(this, 4, (byte) 13);
        this.e = new fwo(this, 5, (byte) 13);
        this.f = new fwo(this, 8, (byte) 13);
        this.g = new fwo(this, 7, (byte) 13);
        this.h = new fwo(this, 9, (byte) 13);
        this.i = new fwo(this, 10, (byte) 13);
        this.j = new fwo(this, 11, (byte) 13);
        this.k = new fwo(this, 12, (byte) 13);
        this.l = new fwo(this, 6, (byte) 13);
        this.m = new fwo(this, 14, (byte) 13);
        this.n = new fwo(this, 15, (byte) 13);
        this.o = new fwo(this, 18, (byte) 13);
        this.f21p = xqu.b(new fwo(this, 17, (byte) 13));
        this.q = iy81.a(new fwo(this, 16, (byte) 13));
        this.r = new fwo(this, 19, (byte) 13);
        this.s = iy81.a(new fwo(this, 13, (byte) 13));
        this.t = new fwo(this, 20, (byte) 13);
        this.u = new fwo(this, 21, (byte) 13);
        this.v = iy81.a(new fwo(this, 2, (byte) 13));
        this.w = iy81.a(new fwo(this, 22, (byte) 13));
        this.x = iy81.a(new fwo(this, 1, (byte) 13));
        this.y = iy81.a(new fwo(this, 0, (byte) 13));
    }

    public zl5(caq caqVar, g5t g5tVar, kly0 kly0Var, caq caqVar2, caq caqVar3, kly0 kly0Var2, caq caqVar4, jo80 jo80Var, jo80 jo80Var2, caq caqVar5, g5t g5tVar2, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, kly0 kly0Var3, caq caqVar10, caq caqVar11, caq caqVar12, caq caqVar13, g5t g5tVar3, caq caqVar14, caq caqVar15, caq caqVar16) {
        this.a = (byte) 0;
        this.b = caqVar;
        this.c = g5tVar;
        this.d = kly0Var;
        this.e = caqVar2;
        this.f = caqVar3;
        this.g = kly0Var2;
        this.h = caqVar4;
        this.i = jo80Var;
        this.j = jo80Var2;
        this.k = caqVar5;
        this.l = g5tVar2;
        this.m = caqVar6;
        this.n = caqVar7;
        this.o = caqVar8;
        this.f21p = caqVar9;
        this.q = kly0Var3;
        this.r = caqVar10;
        this.s = caqVar11;
        this.t = caqVar12;
        this.u = caqVar13;
        this.v = g5tVar3;
        this.w = caqVar14;
        this.x = caqVar15;
        this.y = caqVar16;
    }

    public zl5(h6h0 h6h0Var, x6h0 x6h0Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.b = h6h0Var;
        this.c = x6h0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new blp(this, 1, (byte) 27));
        this.f = xqu.b(new blp(this, 0, (byte) 27));
        this.g = xqu.b(new blp(this, 2, (byte) 27));
        this.h = xqu.b(new blp(this, 3, (byte) 27));
        this.i = xqu.b(new blp(this, 5, (byte) 27));
        this.j = xqu.b(new blp(this, 4, (byte) 27));
        this.k = new blp(this, 6, (byte) 27);
        this.l = iy81.a(new blp(this, 7, (byte) 27));
        this.m = xqu.b(new blp(this, 8, (byte) 27));
        this.n = iy81.a(new blp(this, 9, (byte) 27));
        this.o = iy81.a(new blp(this, 11, (byte) 27));
        this.f21p = iy81.a(new blp(this, 10, (byte) 27));
        this.q = iy81.a(new blp(this, 13, (byte) 27));
        this.r = iy81.a(new blp(this, 12, (byte) 27));
        this.s = new blp(this, 14, (byte) 27);
        this.t = new blp(this, 15, (byte) 27);
        this.u = new blp(this, 16, (byte) 27);
        this.v = new blp(this, 17, (byte) 27);
        this.w = iy81.a(new blp(this, 19, (byte) 27));
        this.x = iy81.a(new blp(this, 18, (byte) 27));
        this.y = xqu.b(new blp(this, 20, (byte) 27));
    }

    public zl5(hwj hwjVar, p901 p901Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.b = p901Var;
        this.c = hwjVar;
        this.d = q7r0Var;
        this.e = xqu.b(new b2p(this, 0, (byte) 29));
        this.f = xqu.b(new b2p(this, 2, (byte) 29));
        this.g = new b2p(this, 3, (byte) 29);
        this.h = iy81.a(new b2p(this, 5, (byte) 29));
        this.i = iy81.a(new b2p(this, 6, (byte) 29));
        this.j = iy81.a(new b2p(this, 4, (byte) 29));
        this.k = xqu.b(new b2p(this, 7, (byte) 29));
        this.l = iy81.a(new b2p(this, 8, (byte) 29));
        this.m = iy81.a(new b2p(this, 10, (byte) 29));
        this.n = iy81.a(new b2p(this, 9, (byte) 29));
        this.o = iy81.a(new b2p(this, 11, (byte) 29));
        this.f21p = xqu.b(new b2p(this, 13, (byte) 29));
        this.q = xqu.b(new b2p(this, 14, (byte) 29));
        this.r = iy81.a(new b2p(this, 12, (byte) 29));
        this.s = new b2p(this, 16, (byte) 29);
        this.t = new b2p(this, 18, (byte) 29);
        this.u = new b2p(this, 19, (byte) 29);
        this.v = new b2p(this, 17, (byte) 29);
        this.w = xqu.b(new b2p(this, 20, (byte) 29));
        this.x = xqu.b(new b2p(this, 15, (byte) 29));
        this.y = xqu.b(new b2p(this, 1, (byte) 29));
    }
}
