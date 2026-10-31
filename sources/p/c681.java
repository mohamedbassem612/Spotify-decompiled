package p;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.observables.GroupedObservable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public class c681 implements Function, a2i, jvd, br20, oi30, qiw, gka1, h4i1, spc1, ix30, q06, vjm1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public c681(xdn0 xdn0Var) {
        Object objE;
        this.a = (byte) 18;
        this.b = xdn0Var;
        Object objE2 = null;
        try {
            objE = xdn0Var.e(jrd1.s0);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        Class cls = (Class) objE;
        if (cls != null && !cls.equals(cfc1.class)) {
            hhg1.i("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        ((xdn0) this.b).r(i4i1.I0, k4i1.e);
        xdn0 xdn0Var2 = (xdn0) this.b;
        xdn0Var2.r(jrd1.s0, cfc1.class);
        try {
            objE2 = xdn0Var2.e(jrd1.r0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objE2 == null) {
            xdn0Var2.r(jrd1.r0, cfc1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public float a(float f, long j) {
        long j2 = j / 1000000;
        jq20 jq20VarA = ((kq20) this.b).a(f);
        long j3 = jq20VarA.c;
        return (((Math.signum(jq20VarA.a) * mj4.b(j3 > 0 ? j2 / j3 : 1.0f).b) * jq20VarA.b) / j3) * 1000.0f;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                arx0 arx0Var = (arx0) obj;
                qfl1 qfl1Var = (qfl1) obj2;
                long j = arx0Var.a;
                if (arx0Var.b) {
                    return new isx0(j + 2, hwb.x(), qfl1Var.b(2131960161, new Object[0]), true);
                }
                return new isx0(j + 2, hwb.x(), qfl1Var.b(2131960160, new Object[0]), false);
            case 2:
                return Observable.create(new n381(obj2, obj, (byte) 4));
            case 4:
                r3x0 r3x0Var = r3x0.Z;
                fe81 fe81Var = (fe81) obj2;
                return ((ko81) obj).c ? ((Single) fe81Var.invoke()).toObservable().doOnNext(new jkt0((byte) 5)).flatMap(r3x0Var).onErrorReturnItem(cq81.a) : ((Single) fe81Var.invoke()).toObservable().compose(new dgp0()).doOnNext(new jkt0((byte) 6)).flatMap(r3x0Var).onErrorResumeWith(Observable.empty());
            case 6:
                String str = (String) obj;
                qo91 qo91Var = (qo91) obj2;
                return rqt0.F(o6x.a, new sb91(qo91Var, str, null, (byte) 2)).map(new t4o(qo91Var, str)).doOnError(new f93(str, (byte) 9));
            case 7:
                bxe0 bxe0Var = (bxe0) obj2;
                sf8 sf8Var = bxe0Var.b;
                return new lxe0((fww) obj, sf8Var.c, bxe0Var.a, sf8Var.d);
            case 8:
                return new l3a1(((t1a1) obj2).a, false);
            case 13:
                return ((sjb1) obj2).a(((yqn) obj).a);
            case 14:
                er61 er61Var = (er61) obj2;
                return new er61((dr61) obj, er61Var.b, er61Var.c, er61Var.d, er61Var.e);
            case 22:
                tv80 tv80Var = (tv80) obj;
                tv80Var.getClass();
                return (CompletableSource) ((cmd1) obj2).invoke(tv80Var);
            case 25:
                zuf0 zuf0Var = (zuf0) obj;
                byp bypVar = (byp) obj2;
                if (zuf0Var.b != null) {
                    return ee70.a(j4b1.L2, (String) bypVar.c, (String) bypVar.a, byp.p("made-for-you-hub-error-empty-view"));
                }
                re70 re70Var = (re70) zuf0Var.a;
                return (re70Var == null || re70Var.k().isEmpty()) ? ee70.a(j4b1.k4, (String) bypVar.h, (String) bypVar.i, byp.p("made-for-you-hub-no-results-empty-view")) : re70Var;
            case 28:
                ArrayList arrayList = ((z4z0) obj2).d;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(obj3, Boolean.FALSE);
                }
                return new i7z0(linkedHashMap);
            default:
                GroupedObservable groupedObservable = (GroupedObservable) obj;
                yon yonVar = (yon) obj2;
                return groupedObservable.distinctUntilChanged().debounce(((jh4) ((kly0) yonVar.e).get()).e(), TimeUnit.MILLISECONDS, (Scheduler) yonVar.c).concatMap(new dn81((Object) yonVar, (byte) 27)).takeUntil(((PublishSubject) yonVar.d).filter(new q881(groupedObservable, (byte) 25)));
        }
    }

    public float b(float f, float f2, long j) {
        long j2 = j / 1000000;
        jq20 jq20VarA = ((kq20) this.b).a(f2);
        long j3 = jq20VarA.c;
        return (Math.signum(jq20VarA.a) * jq20VarA.b * mj4.b(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    public Observable c(i iVar, ArrayList arrayList) {
        String uri = iVar.getUri();
        String name = iVar.getName();
        fv81 fv81Var = (fv81) this.b;
        q3t0 q3t0Var = new q3t0(uri, name, fv81Var.c.b());
        fv81Var.i = dm61.x0(q3t0Var, fv81Var.i);
        return x(q3t0Var, arrayList);
    }

    public float d() {
        return 0.0f;
    }

    public xdn0 e() {
        return (xdn0) this.b;
    }

    public Observable f(i iVar, ArrayList arrayList, mvd mvdVar) {
        hv81 hv81Var = (hv81) mvdVar;
        fv81 fv81Var = (fv81) this.b;
        vz01 vz01Var = fv81Var.g;
        String uri = iVar.getUri();
        String str = fv81Var.e;
        Set setSingleton = Collections.singleton(hv81Var.a.a);
        int i = fv81Var.f.d;
        List list = hv81Var.b.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i) it.next()).getUri());
        }
        return up30.u(vz01Var.b(str, i, gzy.f, uri, setSingleton, o7h.p1(up30.v(o7h.N0(hv81Var.d, arrayList2)))), arrayList).map(fv81Var.h).map(new nn61((Object) hv81Var, (Object) iVar, false, (byte) 20)).toObservable();
    }

    public Observable g(List list, String str, mvd mvdVar) {
        hv81 hv81Var = (hv81) mvdVar;
        fv81 fv81Var = (fv81) this.b;
        vz01 vz01Var = fv81Var.g;
        String str2 = fv81Var.e;
        String str3 = hv81Var.a.a;
        Set setSingleton = Collections.singleton(str3);
        int i = fv81Var.f.c;
        List list2 = hv81Var.b.a;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).getUri());
        }
        return up30.u(vz01Var.b(str2, i, gzy.f, str3, setSingleton, o7h.p1(up30.v(o7h.N0(hv81Var.d, arrayList)))), list).map(fv81Var.h).map(new q881(hv81Var, (byte) 3)).toObservable();
    }

    public i4i1 h() {
        return new dfc1(eqq0.b((xdn0) this.b));
    }

    public jku i(uk4 uk4Var) {
        return new qbc1(Observable.create(new ep31((c4c1) ((he7) this.b).d, (byte) 24)).subscribe(new z2a1(uk4Var, (byte) 8), iqa1.g));
    }

    public qwa j(String str, int i, int i2, int i3, Map map) {
        if (i == 15) {
            return ((ijv) this.b).j("0".concat(String.valueOf(str)), 8, 200, 200, map);
        }
        hhg1.n("Can only encode UPC-A, but got ".concat(l1d.D(i)));
        return null;
    }

    public Object k(bs41 bs41Var, Float f, Float f2, iu30 iu30Var, qu91 qu91Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objR = jch0.r(bs41Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, prn1.a(28, 0.0f, fFloatValue2), (fe5) this.b, iu30Var, qu91Var);
        return objR == d9n.a ? objR : (be5) objR;
    }

    public yrd l(mvd mvdVar) {
        hv81 hv81Var = (hv81) mvdVar;
        fv81 fv81Var = (fv81) this.b;
        String str = hv81Var.a.a;
        pud pudVar = fv81Var.j;
        String strF = f4i1.f(pudVar.a, "/", str);
        pud pudVar2 = fv81Var.j;
        ivd ivdVar = hv81Var.b;
        List listSingletonList = Collections.singletonList(new avd("items", (String) null, (yud) null, new cvd(ivdVar.a)));
        boolean z = ivdVar.b;
        vtd vtdVar = new vtd(pudVar.a, "");
        Context context = fv81Var.d;
        el51 el51Var = ivdVar.c;
        return new yrd(context.getString(2131952486, el51Var != null ? el51Var.b : null), (String) null, (String) null, strF, pudVar2, listSingletonList, z, vtdVar, hv81Var.c, 14);
    }

    public long m(float f) {
        kq20 kq20Var = (kq20) this.b;
        float[] fArr = mj4.a;
        return ((long) (Math.exp(mj4.a(f, kq20Var.a * kq20Var.b) / (((double) lq20.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    public Observable n(String str, List list) {
        fv81 fv81Var = (fv81) this.b;
        if (fv81Var.i.isEmpty()) {
            Observable observableJust = Observable.just(b7x.a);
            observableJust.getClass();
            return observableJust;
        }
        Set set = fv81Var.i;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(x((q3t0) it.next(), list));
        }
        Observable observableCombineLatest = Observable.combineLatest(arrayList, u3x0.N0);
        observableCombineLatest.getClass();
        return observableCombineLatest;
    }

    public af5 o(km61 km61Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1861194299);
        re81 re81Var = (re81) this.b;
        boolean zI = x340Var.i(re81Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new d781(re81Var, (byte) 7);
            x340Var.s0(objT);
        }
        af5 af5VarA = wmo1.A(2131962014, 2131962015, "https://support.spotify.com/article/shuffle-play/", (zma1) null, (iu30) objT, x340Var, 384, 8);
        x340Var.r(false);
        return af5VarA;
    }

    public void onFailure(Throwable th) {
        hdd1 hdd1Var;
        hdd1 hdd1Var2 = (hdd1) this.b;
        synchronized (hdd1Var2.a) {
            try {
                List list = hdd1Var2.k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((j2t) it.next()).b();
                    }
                    hdd1Var2.k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hdd1Var2.u.g();
        a680 a680Var = hdd1Var2.b;
        Iterator it2 = a680Var.l().iterator();
        while (it2.hasNext() && (hdd1Var = (hdd1) it2.next()) != hdd1Var2) {
            synchronized (hdd1Var.a) {
                try {
                    List list2 = hdd1Var.k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((j2t) it3.next()).b();
                        }
                        hdd1Var.k = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            hdd1Var.u.g();
        }
        synchronized (a680Var.b) {
            ((LinkedHashSet) a680Var.e).remove(hdd1Var2);
        }
    }

    public void onSuccess(Object obj) {
    }

    public float p(float f, float f2) {
        kq20 kq20Var = (kq20) this.b;
        float[] fArr = mj4.a;
        float f3 = kq20Var.a;
        float f4 = kq20Var.b;
        double dA = mj4.a(f2, f3 * f4);
        double d = lq20.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dA) * ((double) (f3 * f4))))) + f;
    }

    public void q(Bundle bundle, String str) {
        SpotifyCheckoutActivity spotifyCheckoutActivity = (SpotifyCheckoutActivity) this.b;
        jcs0 jcs0VarV = jhc1.v(bundle, "PAYMENT_RESULT_BUNDLE_KEY", jcs0.class);
        if (jcs0VarV == null) {
            return;
        }
        int iOrdinal = jcs0VarV.ordinal();
        if (iOrdinal == 0) {
            int i = SpotifyCheckoutActivity.D1;
            spotifyCheckoutActivity.m0().U(s200.a);
        } else if (iOrdinal == 1) {
            int i2 = SpotifyCheckoutActivity.D1;
            spotifyCheckoutActivity.m0().U(pzz.a);
        } else if (iOrdinal != 2) {
            eg.o();
        } else {
            int i3 = SpotifyCheckoutActivity.D1;
            spotifyCheckoutActivity.m0().U(bzz.a);
        }
    }

    public void r(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1564888142);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131963475);
            String strO1 = cwl1.o0(x340Var, 2131961134);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new swi0(function1, ven0Var, (byte) 19);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(2008060791);
                String strN0 = cwl1.n0(2131963476, new Object[]{str}, x340Var);
                String strA = ((a7b) this.b).a(str);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, (i3u) null, (hux) null, strN0, strA, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(2008611444);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, (Object) this, (Object) str, (Object) function0, (Object) function1, (byte) 18);
        }
    }

    public n5b1 s(o5b1 o5b1Var, ti tiVar) {
        ejq ejqVar = (ejq) this.b;
        switch (ejqVar.a) {
            case 0:
                obq obqVar = ejqVar.b;
                ojq ojqVar = (ojq) obqVar.d;
                Set set = (Set) ((obq) ojqVar.j1).get();
                daq daqVar = obqVar.b;
                Context context = (Context) daqVar.x1.a;
                jly0 jly0Var = daqVar.Uf;
                return new n5b1(set, context, jly0Var, ojqVar.n1, ojqVar.o1, ojqVar.f1, o5b1Var, daqVar.Tf, ojqVar.p1, ojqVar.g1, ojqVar.c, tiVar, ojqVar.q1, jly0Var, (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), daqVar.pf, new tuk(xqu.a((obq) ojqVar.j1)), (pw3) daqVar.vo.get(), new uic(false), new pr4(false, false, (luk) ((daq) ojqVar.b).L1.get()));
            default:
                obq obqVar2 = ejqVar.b;
                ojq ojqVar2 = (ojq) obqVar2.d;
                Set set2 = (Set) ((obq) ojqVar2.j1).get();
                daq daqVar2 = obqVar2.b;
                Context context2 = (Context) daqVar2.x1.a;
                jly0 jly0Var2 = daqVar2.Uf;
                return new n5b1(set2, context2, jly0Var2, ojqVar2.n1, ojqVar2.o1, ojqVar2.f1, o5b1Var, daqVar2.Tf, ojqVar2.p1, ojqVar2.g1, ojqVar2.c, tiVar, ojqVar2.q1, jly0Var2, (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), daqVar2.pf, new tuk(xqu.a((obq) ojqVar2.j1)), (pw3) daqVar2.vo.get(), new uic(false), new pr4(false, false, (luk) ((daq) ojqVar2.b).L1.get()));
        }
    }

    public Long t(String str) {
        int i = 0;
        while (true) {
            i++;
            if (i > 3) {
                n57.e("Execution of sizeOfDirectory failed");
                return null;
            }
            try {
                return ((s6b1) this.b).d(str);
            } catch (IOException e) {
                Logger.k(l1d.m("sizeOfDir failed with message ", e.getMessage()), new Object[0]);
            } catch (IllegalArgumentException e2) {
                Logger.k(l1d.m("sizeOfDir failed with message ", e2.getMessage()), new Object[0]);
            } catch (NoClassDefFoundError e3) {
                Logger.b(l1d.m("sizeOfDir failed with message ", e3.getMessage()), new Object[0]);
            }
        }
    }

    public void u() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void v(Object obj) {
        u6c1 u6c1Var = (u6c1) obj;
        a6c1 a6c1Var = ((v9c1) this.b).h;
        if (a6c1Var != null) {
            a6c1Var.g(u6c1Var);
        }
    }

    public iyf1 w(lby lbyVar, jjf1 jjf1Var, boolean z, boolean z2, d8r0 d8r0Var, String str, List list, boolean z3, boolean z4) {
        int i;
        String str2;
        String str3;
        p1g1 p1g1Var = jjf1Var.N0;
        tkf1 tkf1Var = jjf1Var.O0;
        boolean z5 = ((p1g1Var instanceof o1g1) || (p1g1Var instanceof n1g1)) && ((tkf1Var instanceof rkf1) || (tkf1Var instanceof qkf1));
        String str4 = lbyVar.a;
        String str5 = lbyVar.b;
        tb51 tb51Var = (tb51) this.b;
        tb51Var.getClass();
        String string = tb51.i(tb51Var, lbyVar, z5, false, 4).toString();
        String str6 = lbyVar.c;
        String str7 = jjf1Var.t;
        boolean z6 = jjf1Var.a;
        if (jjf1Var.e) {
            i = 1;
        } else {
            i = z6 ? 2 : 3;
        }
        boolean z7 = jjf1Var.f;
        boolean z8 = jjf1Var.b;
        p2q0 p2q0Var = jjf1Var.g;
        String str8 = p2q0Var.b;
        String str9 = p2q0Var.a;
        p7w p7wVar = (str9.length() <= 0 || str8.length() <= 0) ? null : new p7w(str9, str8);
        q8b q8bVarY = aq8.y(lbyVar, jjf1Var, z);
        List list2 = jjf1Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ol11) it.next()).a);
        }
        boolean zW = qxy0.w(p1g1Var);
        boolean z9 = jjf1Var.h || !u890.j(jjf1Var.i, ypl.a);
        aql aqlVar = jjf1Var.i;
        String str10 = lbyVar.d;
        boolean z10 = p1g1Var instanceof o1g1;
        boolean z11 = jjf1Var.Y && z4;
        String str11 = lbyVar.a;
        boolean z12 = jjf1Var.Q0;
        if (z5) {
            str2 = str11;
            long j = jjf1Var.P0.a;
            if (j > 0) {
                int i2 = (int) (j / 3600);
                int i3 = ((int) (j / 60)) - (i2 * 60);
                long j2 = j % 60;
                str3 = i2 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Long.valueOf(j2)}, 2));
            }
            return new iyf1(str4, str5, string, str6, str7, i, d8r0Var, str, z7, z8, p7wVar, arrayList, q8bVarY, zW, z9, aqlVar, str10, list, z10, z5, z11, z3, z2, str2, str3, true, false, z12);
        }
        str2 = str11;
        str3 = "";
        return new iyf1(str4, str5, string, str6, str7, i, d8r0Var, str, z7, z8, p7wVar, arrayList, q8bVarY, zW, z9, aqlVar, str10, list, z10, z5, z11, z3, z2, str2, str3, true, false, z12);
    }

    public Observable x(q3t0 q3t0Var, List list) {
        fv81 fv81Var = (fv81) this.b;
        return up30.u(vz01.c(fv81Var.g, fv81Var.e, fv81Var.f.e, gzy.f, q3t0Var.a, (Set) null, 48), list).map(fv81Var.h).map(new ke71((Object) fv81Var, (Object) q3t0Var, (byte) 16)).toObservable();
    }

    public void y() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new v241(viewFindViewById, (byte) 9));
    }

    public c681(hwb hwbVar, qfl1 qfl1Var) {
        this.a = (byte) 1;
        this.b = qfl1Var;
    }

    public c681(wat watVar) {
        this.a = (byte) 10;
        this.b = new kq20(wxa1.a, watVar);
    }

    public /* synthetic */ c681(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public c681(byte b) {
        this.a = b;
        switch (b) {
            case 26:
                this.b = new ijv((byte) 0);
                break;
            default:
                this.b = new sjb((byte) 7);
                break;
        }
    }
}
