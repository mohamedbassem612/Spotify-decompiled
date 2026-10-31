package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ke71 implements Function, za21, l381, ObservableOnSubscribe, o2r0, CompletableOnSubscribe, mh91, Predicate {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ke71(Function0 function0) {
        this.a = (byte) 5;
        this.c = function0;
        this.b = new o3r(z6x.a, rz71.t, false);
    }

    public static ke71 i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131626134, viewGroup, false);
        View viewT = m5n1.t(viewInflate, 2131430968);
        if (viewT != null) {
            return new ke71(viewInflate, (Object) viewT, (byte) 13);
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131430968)));
        return null;
    }

    public void a() {
        ((dt71) this.b).a(rih1.a);
    }

    public Object apply(Object obj) {
        t131 s131Var;
        x771 x771Var;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                uv00 uv00Var = (uv00) obj;
                boolean zC = uv00Var.c();
                q131 q131Var = q131.a;
                if (!zC) {
                    List list = (List) obj3;
                    int iS = zno1.s(q7h.U(list, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                    for (Object obj4 : list) {
                        linkedHashMap.put(obj4, q131Var);
                    }
                    return linkedHashMap;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) obj2;
                for (tv00 tv00Var : uv00Var.b(ge71.class)) {
                    sv00 sv00Var = tv00Var.c;
                    String str = tv00Var.a;
                    int iC = l1d.C(sv00Var.b);
                    if (iC != 1) {
                        s131Var = (iC == 2 || iC == 3) ? r131.a : q131Var;
                    } else {
                        ge71 ge71Var = tv00Var.b;
                        if (ge71Var != null) {
                            LinkedHashSet<e871> linkedHashSet = ge71Var.a;
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (e871 e871Var : linkedHashSet) {
                                Set set = s4b1.f;
                                s4b1 s4b1VarX = uic.x(e871Var.a);
                                boolean z = e871Var.b;
                                LinkedHashSet linkedHashSet3 = e871Var.c;
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    int iOrdinal = ((y771) it.next()).ordinal();
                                    if (iOrdinal == 0) {
                                        x771Var = x771.a;
                                    } else {
                                        if (iOrdinal != 1) {
                                            eg.o();
                                            return null;
                                        }
                                        x771Var = x771.b;
                                    }
                                    linkedHashSet4.add(x771Var);
                                }
                                LinkedHashSet linkedHashSet5 = e871Var.d;
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = linkedHashSet5.iterator();
                                while (it2.hasNext()) {
                                    o571 o571VarO = myo1.o(((he71) it2.next()).a);
                                    if (o571VarO != null) {
                                        arrayList.add(o571VarO);
                                    }
                                }
                                linkedHashSet2.add(new d871(s4b1VarX, z, linkedHashSet4, o7h.p1(arrayList)));
                            }
                            s131Var = new s131(new fe71(linkedHashSet2));
                        } else {
                            s131Var = null;
                        }
                    }
                    if (s131Var != null) {
                        List listSingletonList = (List) linkedHashMap3.get(str);
                        if (listSingletonList == null) {
                            listSingletonList = Collections.singletonList(str);
                        }
                        Iterator it3 = listSingletonList.iterator();
                        while (it3.hasNext()) {
                            linkedHashMap2.put((String) it3.next(), s131Var);
                        }
                    }
                }
                return linkedHashMap2;
            case 8:
                uv00 uv00Var2 = (uv00) obj;
                String str2 = (String) obj3;
                ez00 ez00Var = uv00Var2.a(va81.class, str2).b;
                if (ez00Var != null) {
                    return ((t781) obj2).h1(ez00Var);
                }
                swg0.h(l1d.t("Missing metadata for Uri: ", str2, ". Response cacheStatus: "), bb00.u(uv00Var2.a(va81.class, str2).c.b), ".");
                return null;
            case 10:
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return ((p981) obj3).a.b(new oi("aligned_curation", false, new pg61(str3, (byte) 16))).filter(new ljp1(str3, (byte) 16)).timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(new njp1(str3, (byte) 16)).onErrorReturnItem(pa81.b);
                }
                return Single.just(pa81.a);
            case 16:
                List list2 = (List) obj;
                fv81 fv81Var = (fv81) obj3;
                q3t0 q3t0Var = (q3t0) obj2;
                String strF = f4i1.f(fv81Var.j.a, "/", q3t0Var.a);
                long j = q3t0Var.c;
                String str4 = q3t0Var.a;
                String str5 = q3t0Var.b;
                return Collections.singletonMap(strF, new hv81(new el51(str4, str5), new ivd(list2, !list2.isEmpty(), new el51(str4, str5), w7x.a, fv81Var.f), j));
            case 17:
                hv81 hv81Var = (hv81) obj3;
                return hv81.h(hv81Var, hv81Var.b.k((i) obj2, (List) obj, false), null, 13);
            case 20:
                return ((n691) obj3).d.a((PlayerState) obj, (tv80) obj2);
            case 26:
                List list3 = (List) obj;
                return (list3.isEmpty() && ((bo91) obj3).k.b((String) obj2)) ? Collections.singletonList("enhance") : list3;
            default:
                return rqt0.F(o6x.a, new uk71(obj3, obj, obj2, (lnm) null, (byte) 18)).doOnSuccess(w841.c1).ignoreElement();
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public wh81 c(View view, th81 th81Var) {
        View view2 = (fh81) ((kly0) this.b).get();
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            bhn0.g(parent, "Side drawer can only be attached to a view with a ViewGroup parent, parent=");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.addView(view2, viewGroup.indexOfChild(view));
        viewGroup.removeView(view);
        view2.setContentView(view);
        view2.setMainLayoutConfig(th81Var);
        biq biqVar = (biq) this.c;
        biqVar.getClass();
        teq teqVar = biqVar.a.c;
        bbr0 bbr0Var = (bbr0) teqVar.f.a;
        ph81 ph81Var = (ph81) teqVar.b.I6.get();
        r1q0 r1q0VarJ = ((dg30) teqVar.b.b.f.a).J();
        c8o.m(r1q0VarJ);
        return new wh81(view2, bbr0Var, ph81Var, r1q0VarJ);
    }

    public void d() {
        ((ven0) this.b).setValue(Boolean.TRUE);
    }

    public jhm e(String str, d991 d991Var) {
        hqs hqsVar = (hqs) this.b;
        hqsVar.getClass();
        return new jhm("sleep_timer", dtx.c, (fhm) null, (Integer) null, hqsVar.b.a(d991Var), false, (tm81) null, new ihm(new bhm(2), hqsVar.a.b() ? hhm.b : hhm.a, new ghm(er81.c1, er81.d1), new ny51(this, str, d991Var, (byte) 12)), 236);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object f(p.tka0 r8, java.util.List r9, p.k371 r10, p.onm r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ke71.f(p.tka0, java.util.List, p.k371, p.onm):java.lang.Object");
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        return new d931(nhr0Var, (iu30) this.c, bundle);
    }

    public void h() {
        ((ven0) this.b).setValue(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(k371 k371Var, onm onmVar) {
        ul71 ul71Var;
        fd91[] fd91VarArr;
        k371 k371Var2;
        byte b;
        Object[] objArr;
        Object[] objArr2;
        k371 k371Var3;
        Object[] objArr3;
        Object[] objArr4;
        if (onmVar instanceof ul71) {
            ul71Var = (ul71) onmVar;
            int i = ul71Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ul71Var.g = i - Integer.MIN_VALUE;
            } else {
                ul71Var = new ul71(this, onmVar);
            }
        } else {
            ul71Var = new ul71(this, onmVar);
        }
        Object objF = ul71Var.e;
        int i2 = ul71Var.g;
        byte b2 = 2;
        byte b3 = 1;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            fd91VarArr = new fd91[3];
            tka0 tka0VarB = rc11.a.b(mqq.class);
            List list = (smc0) this.b;
            ul71Var.a = k371Var;
            ul71Var.b = fd91VarArr;
            ul71Var.c = fd91VarArr;
            ul71Var.d = (byte) 0;
            ul71Var.g = 1;
            objF = f(tka0VarB, list, k371Var, ul71Var);
            if (objF != obj) {
                k371Var2 = k371Var;
                b = 0;
                objArr = fd91VarArr;
            }
            return obj;
        }
        if (i2 == 1) {
            b = ul71Var.d;
            Object[] objArr5 = ul71Var.c;
            fd91[] fd91VarArr2 = ul71Var.b;
            k371Var2 = ul71Var.a;
            hm5.M(objF);
            objArr = objArr5;
            fd91VarArr = fd91VarArr2;
        } else {
            if (i2 == 2) {
                b3 = ul71Var.d;
                Object[] objArr6 = ul71Var.c;
                fd91VarArr = ul71Var.b;
                k371Var3 = ul71Var.a;
                hm5.M(objF);
                objArr2 = objArr6;
                objArr2[b3] = objF;
                tka0 tka0VarB2 = rc11.a.b(oqq.class);
                List list2 = (smc0) this.c;
                ul71Var.a = null;
                ul71Var.b = fd91VarArr;
                ul71Var.c = fd91VarArr;
                ul71Var.d = (byte) 2;
                ul71Var.g = 3;
                objF = f(tka0VarB2, list2, k371Var3, ul71Var);
                if (objF != obj) {
                    objArr3 = fd91VarArr;
                    objArr4 = objArr3;
                }
                return obj;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b2 = ul71Var.d;
            objArr3 = ul71Var.c;
            objArr4 = ul71Var.b;
            hm5.M(objF);
        }
        objArr3[b2] = objF;
        return p7h.M(objArr4);
        objArr[b] = objF;
        tka0 tka0VarB3 = rc11.a.b(nqq.class);
        ul71Var.a = k371Var2;
        ul71Var.b = fd91VarArr;
        ul71Var.c = fd91VarArr;
        ul71Var.d = (byte) 1;
        ul71Var.g = 2;
        objF = f(tka0VarB3, z6x.a, k371Var2, ul71Var);
        if (objF != obj) {
            objArr2 = fd91VarArr;
            k371Var3 = k371Var2;
            objArr2[b3] = objF;
            tka0 tka0VarB4 = rc11.a.b(oqq.class);
            List list3 = (smc0) this.c;
            ul71Var.a = null;
            ul71Var.b = fd91VarArr;
            ul71Var.c = fd91VarArr;
            ul71Var.d = (byte) 2;
            ul71Var.g = 3;
            objF = f(tka0VarB4, list3, k371Var3, ul71Var);
            if (objF != obj) {
                objArr3 = fd91VarArr;
                objArr4 = objArr3;
                objArr3[b2] = objF;
                return p7h.M(objArr4);
            }
        }
        return obj;
    }

    public n2r k() {
        return (bb01) this.b;
    }

    public void l(boolean z) {
        ((ven0) this.b).setValue(Boolean.FALSE);
        ((ven0) this.c).setValue(Boolean.valueOf(!z));
    }

    public void m() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((xok0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("snackbar", "snackbar", (Integer) null, "", (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public q41 n(a11 a11Var) {
        return new q41(new w31((hm) this.b, (epv0) null, (n5o) this.c, (jj01) null, false), (s31) null, a11Var);
    }

    public Observable o() {
        boolean zA = ((i05) this.c).a();
        up91 up91Var = up91.c;
        return !zA ? Observable.just(up91Var) : ((o241) this.b).a.map(rdx0.N0).distinctUntilChanged().onErrorReturnItem(up91Var);
    }

    public byte[] p() throws CharConversionException {
        String str = (String) this.c;
        try {
            String string = ((SharedPreferences) this.b).getString(str, null);
            if (string != null) {
                return hm5.q(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(f4i1.f("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public void subscribe(CompletableEmitter completableEmitter) {
        t891 t891Var = (t891) this.b;
        LinkedHashMap linkedHashMap = t891Var.b;
        String str = (String) this.c;
        if (((gjo0) linkedHashMap.get(str)) == null) {
            completableEmitter.onError(new Throwable(l1d.m("Dismiss failed, notificationId not found: ", str)));
        } else {
            t891Var.d.onNext(str);
            completableEmitter.onComplete();
        }
    }

    public boolean t(Object obj) {
        return ((Boolean) ((Function0) this.c).invoke()).booleanValue();
    }

    public boolean test(Object obj) {
        hi91 hi91Var = (hi91) obj;
        if (hi91Var.a.equals(((ji91) this.b).a)) {
            return hi91Var.b.equals(((zuc0) this.c).c) || hi91Var.c;
        }
        return false;
    }

    public ke71(List list, le71 le71Var, LinkedHashMap linkedHashMap) {
        this.a = (byte) 0;
        this.b = list;
        this.c = linkedHashMap;
    }

    public ke71(dma1 dma1Var) {
        this.a = (byte) 4;
        this.b = dma1Var;
        this.c = bma1.b.n("watch_feed_header_onboarding_seen");
    }

    public ke71() {
        this.a = (byte) 23;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.b = dt71VarE;
        this.c = dt71VarE;
    }

    public ke71(i8h1 i8h1Var) {
        this.a = (byte) 29;
        this.b = i8h1Var;
        this.c = new xok0((byte) 2);
    }

    public ke71(iu30 iu30Var) {
        this.a = (byte) 18;
        this.c = iu30Var;
        this.b = new bb01((byte) 29);
    }

    public /* synthetic */ ke71(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ke71(Object obj) {
        this.a = (byte) 19;
        this.b = obj;
        this.c = Thread.currentThread();
    }

    public ke71(Context context, String str, String str2) {
        this.a = (byte) 3;
        this.c = str;
        this.b = context.getApplicationContext().getSharedPreferences(str2, 0);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        x981 x981Var = (x981) this.b;
        ((Handler) x981Var.d).post(new sl21(x981Var, (l101) this.c, observableEmitter, (byte) 7));
    }
}
