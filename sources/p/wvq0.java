package p;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wvq0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvq0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        b7x b7xVar = b7x.a;
        b3i1 b3i1Var = wyu0.f;
        b3i1 b3i1Var2 = nyu0.e;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Set set = s4b1.f;
                return Boolean.valueOf(uic.j((String) obj, (b3i1) obj2));
            case 1:
                mwq0 mwq0Var = (mwq0) obj;
                cwq0 cwq0Var = (cwq0) obj2;
                cwq0Var.a.a = mwq0Var;
                jhs0 jhs0Var = cwq0Var.e;
                syn0 syn0Var = cwq0Var.g;
                LinkedList linkedList = jhs0Var.a;
                LinkedList linkedList2 = jhs0Var.a;
                if (!linkedList.isEmpty()) {
                    son0 son0VarA = syn0Var.a(zyn0.a);
                    while (!linkedList2.isEmpty()) {
                        try {
                            lwq0.d(mwq0Var.e, (qwq0) linkedList2.remove());
                        } catch (Throwable th) {
                            syn0Var.e(son0VarA);
                            throw th;
                        }
                    }
                    syn0Var.e(son0VarA);
                }
                return rih1Var;
            case 2:
                return (Boolean) ((wck0) obj2).invoke(((kwq0) obj).b);
            case 3:
                return Boolean.valueOf(((Window.Callback) obj2).dispatchTouchEvent((MotionEvent) obj));
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (((osm0) ((pbq) obj2).X) != null) {
                    return new zau0(zBooleanValue);
                }
                u890.C("multiPlayer");
                throw null;
            case 5:
                ((xev0) ((zl5) obj2).m).d();
                return z6xVar;
            case 6:
                ahi0 ahi0Var = (ahi0) obj2;
                ynb0 ynb0Var = (ynb0) ahi0Var.Z;
                mr20 mr20VarA = ((r0s) ynb0Var.get()).a();
                q0s q0sVar = (q0s) ((ynb0) ahi0Var.N0).get();
                mr20 mr20VarY = qqn1.Y(q0sVar.a, q0sVar.b, q0sVar.c, Collections.singleton(gq50.c), new l1k(0, q0sVar, q0s.class, "fakeGroupData", "fakeGroupData()Lcom/spotify/connect/core/model/group/GroupData;", 0, (byte) 23), new sqk(q0sVar, (byte) 22));
                mr20 mr20VarA2 = ((r0s) ynb0Var.get()).a();
                ynb0 ynb0Var2 = (ynb0) ahi0Var.i;
                evz evzVarS = h5p1.s(mr20VarA, mr20VarY, hu20.e(rqt0.u(new x010(mr20VarA2, rqt0.u(new dkm(((rer) ynb0Var2.get()).a(), (byte) 20)), new hpp0(3, (lnm) null, (byte) 1), (byte) 1)), new t4o0((lnm) null, ahi0Var, (byte) 9)), new vd2(4, (lnm) null, (byte) 21));
                rer rerVar = (rer) ynb0Var2.get();
                mr20 mr20VarA3 = rerVar.a();
                Flowable flowable = rerVar.e;
                vbm[] vbmVarArr = q601.a;
                x010 x010Var = new x010(hu20.e(new x010(mr20VarA3, new ht20(rqt0.u(new qer(new kge(flowable), rerVar, (byte) 0)), new sd0(2, (lnm) null, (byte) 27)), new mnl(3, (lnm) null, (byte) 9), (byte) 1), new b7c((lnm) null, rerVar, (byte) 23)), ((tks) ((ynb0) ahi0Var.f).get()).a(), new dwf0(ahi0Var, (lnm) null, (byte) 9), (byte) 1);
                ht20 ht20Var = ((d8s) ((ynb0) ahi0Var.t).get()).b;
                ht20 ht20Var2 = ((s2s) ((ynb0) ahi0Var.X).get()).b;
                b0s b0sVar = (b0s) ((ynb0) ahi0Var.Y).get();
                Iterable iterable = (Iterable) b0sVar.a.get();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    ((mib1) obj3).getClass();
                    arrayList.add(obj3);
                }
                List listA1 = o7h.a1(arrayList, new xvd(b0sVar, (byte) 9));
                ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
                Iterator it = listA1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ht20(((mib1) it.next()).c, new qjr(2, (lnm) null, (byte) 2)));
                }
                x010 x010Var2 = new x010(new ht20(new wa3((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), (byte) 8), new qjr(2, (lnm) null, (byte) 3)), new huz(Collections.singletonList(new gd80(rih1Var, (xpw) b0sVar.b.get())), (byte) 10), new al3(3, (lnm) null, (byte) 2), (byte) 1);
                ((dwr) b0sVar.e.get()).getClass();
                return h5p1.q(x010Var, ht20Var, ht20Var2, new x010(new x010(x010Var2, new huz(z6xVar, (byte) 10), new al3(3, (lnm) null, (byte) 3), (byte) 1), b0sVar.d.isEnabled() ? new huz(Collections.singletonList(new gd80(rih1Var, (xpw) b0sVar.c.get())), (byte) 10) : new huz(z6xVar, (byte) 10), new al3(3, (lnm) null, (byte) 4), (byte) 1), evzVarS, new h5r0((lnm) null, (byte) 0));
            case 7:
                return new a7r0((b6h1) obj2, (rj41) obj);
            case 8:
                return Boolean.valueOf(xzo1.t((v75) ((ytp0) obj2).f, (Exception) obj));
            case 9:
                zhq0 zhq0Var = (zhq0) obj2;
                return yoi1.i(new lt20(h4p1.g(new dvq0(zhq0Var, new rgb(new ht20(((ir01) zhq0Var.c).d(((ds01) obj).c), new iyb0(zhq0Var, (lnm) null, (byte) 27)), (byte) 8), null, (byte) 6)), new t4o0(zhq0Var, (lnm) null, (byte) 10), (byte) 0), o6x.a);
            case 10:
                ohr0 ohr0Var = (ohr0) obj2;
                ohr0Var.c.invoke(new shq0(ohr0Var, (Map) obj, (byte) 10));
                return rih1Var;
            case 11:
                boolean zContains = ((Set) obj).contains((p6r0) obj2);
                if (zContains) {
                    return wir0.a;
                }
                if (!zContains) {
                    return wir0.b;
                }
                eg.o();
                return null;
            case 12:
                ((avr) ((View) obj).getTag()).f((l7u) obj2);
                return rih1Var;
            case 13:
                ((xyr) ((View) obj).getTag()).f((hi10) obj2);
                return rih1Var;
            case 14:
                ((wbs) ((View) obj).getTag()).f((ivm0) obj2);
                return rih1Var;
            case 15:
                ((lhg0) ((View) obj).getTag()).f((uvm0) obj2);
                return rih1Var;
            case 16:
                ((nhg0) ((View) obj).getTag()).f((yvm0) obj2);
                return rih1Var;
            case 17:
                ((ohg0) ((View) obj).getTag()).f((cwm0) obj2);
                return rih1Var;
            case 18:
                ((ses) ((View) obj).getTag()).f((u7t0) obj2);
                return rih1Var;
            case 19:
                ((yps) ((View) obj).getTag()).f((q191) obj2);
                return rih1Var;
            case 20:
                ((zps) ((View) obj).getTag()).f((s191) obj2);
                return rih1Var;
            case 21:
                ((bqs) ((View) obj).getTag()).f((u191) obj2);
                return rih1Var;
            case 22:
                e6r e6rVar = (e6r) obj;
                urr0 urr0Var = (urr0) obj2;
                return urr0Var.b.b(urr0Var.a.d(), e6rVar.c, e6rVar.b, e6rVar.a);
            case 23:
                return rqt0.u(new dy20((kge) obj2, (byte) 15));
            case 24:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new jaz((yup0) obj2, (lnm) null, (byte) 22));
                qtrVar.d(new ewq0(1, (byte) 4), new xgr0((byte) 4, 2, false));
                return rih1Var;
            case 25:
                b261.n((e261) obj, ((h7s0) obj2).a);
                return rih1Var;
            case 26:
                ca41 ca41Var = (ca41) obj2;
                wdm wdmVar = ((kb61) obj).S().f;
                r630 r630Var = (r630) wdmVar.g;
                Scheduler scheduler = (Scheduler) wdmVar.i;
                CompositeDisposable compositeDisposable = (CompositeDisposable) wdmVar.Z;
                Set set2 = s4b1.f;
                String strValueOf = String.valueOf(uic.x(ca41Var.d).z());
                int i = ca41Var.a;
                String str = ca41Var.b;
                String str2 = ca41Var.c;
                String str3 = ca41Var.e;
                ca41 ca41Var2 = new ca41(i, str, str2, strValueOf, str3);
                ((rvy0) wdmVar.b).a(i);
                if (uic.h(strValueOf, new blc0[]{blc0.g1, blc0.ti, blc0.fh, blc0.u1})) {
                    compositeDisposable.b(j2h1.D((q8n) wdmVar.t, new da41(wdmVar, ca41Var, null, (byte) 1)).g(new ea41(wdmVar, ca41Var, (byte) 1)).subscribe(ps4.W0, w841.h));
                } else if (uic.g(strValueOf, blc0.ee)) {
                    i430 i430VarC = r630Var.c(strValueOf);
                    if (i430VarC != null) {
                        if (!i430VarC.b) {
                            r630Var.k(strValueOf, true);
                            ((l0x0) wdmVar.f).q(str, strValueOf);
                        }
                        ((rb00) wdmVar.Y).a("SAVE_ENTITY", str, str2, strValueOf, str3);
                    } else {
                        m141 m141Var = (m141) wdmVar.d;
                        m141Var.getClass();
                        List listSingletonList = Collections.singletonList(strValueOf);
                        if (listSingletonList.isEmpty()) {
                            hhg1.n("Failed requirement.");
                            return null;
                        }
                        ij01 ij01Var = m141Var.b;
                        dm5.m(!listSingletonList.isEmpty());
                        compositeDisposable.b(Observable.combineLatest(((w730) ij01Var.b).b(new ord1(z1p1.D(listSingletonList, new cwa((byte) 22)))).toObservable().flatMap(new nfr(listSingletonList.size(), (byte) 10)), m141Var.a.c("<no context>", listSingletonList, false).distinctUntilChanged(), new l141(listSingletonList)).map(gex0.h).take(1L).observeOn(scheduler).subscribeOn((Scheduler) wdmVar.h).subscribe(new z0u0(wdmVar, ca41Var2, (byte) 10), w841.e));
                    }
                } else if (uic.k(strValueOf, new b3i1[]{b3i1Var2, b3i1Var})) {
                    compositeDisposable.b(rqt0.F((q8n) wdmVar.X, new da41(wdmVar, ca41Var2, null, (byte) 0)).flatMapCompletable(c4x0.i).n(scheduler).subscribe(new ea41(wdmVar, ca41Var2, (byte) 0), w841.d));
                }
                return rih1Var;
            case 27:
                keu keuVar = (keu) obj2;
                jut jutVar = ((kb61) obj).S().g;
                ((rvy0) jutVar.b).a(keuVar.a);
                ((rb00) jutVar.c).a("DISMISS", keuVar.b, keuVar.c, (String) null, keuVar.d);
                return rih1Var;
            case 28:
                iy1 iy1Var = (iy1) obj2;
                ne neVar = ((kb61) obj).S().b;
                l0x0 l0x0Var = (l0x0) neVar.c;
                String str4 = iy1Var.b;
                String str5 = iy1Var.d;
                i8h1 i8h1Var = (i8h1) l0x0Var.b;
                url0 url0Var = (url0) l0x0Var.d;
                url0Var.getClass();
                x6h1 x6h1VarC = url0Var.a.c();
                x6h1VarC.i.add(new a7h1("push_message_quick_action", str4, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                String str6 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str5 != null ? str5 : "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                y6r0.Companion.getClass();
                iqr iqrVar = (iqr) neVar.a;
                str6.getClass();
                Single singleB = iqrVar.b(str5, "PUSH_NOTIFICATIONS", 2, str6);
                ((rb00) neVar.b).a("ADD_TO_QUEUE", iy1Var.b, iy1Var.c, iy1Var.d, iy1Var.e);
                ((rvy0) neVar.d).a(iy1Var.a);
                neVar.e = singleB.subscribe(nm.g, nm.h);
                return rih1Var;
            default:
                yvu yvuVar = (yvu) obj2;
                tjq tjqVar = ((kb61) obj).S().c;
                Set set3 = s4b1.f;
                String str7 = yvuVar.d;
                s4b1 s4b1VarX = uic.x(str7);
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, b3i1Var2)) {
                    ayl.b((ayl) tjqVar.a, str7, "", 4);
                    l0x0 l0x0Var2 = (l0x0) tjqVar.b;
                    String str8 = yvuVar.b;
                    i8h1 i8h1Var2 = (i8h1) l0x0Var2.b;
                    url0 url0Var2 = (url0) l0x0Var2.d;
                    url0Var2.getClass();
                    x6h1 x6h1VarC2 = url0Var2.a.c();
                    x6h1VarC2.i.add(new a7h1("push_message_quick_action", str8, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    String str9 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", str7 != null ? str7 : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                    ((rb00) tjqVar.c).a("DOWNLOAD", yvuVar.b, yvuVar.c, yvuVar.d, yvuVar.e);
                } else if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, b3i1Var) || f46.S0(new blc0[]{blc0.g1, blc0.ti, blc0.Pg}).contains(s4b1VarX.c)) {
                    ayl.b((ayl) tjqVar.a, str7, "", 4);
                    l0x0 l0x0Var3 = (l0x0) tjqVar.b;
                    String str10 = yvuVar.b;
                    i8h1 i8h1Var3 = (i8h1) l0x0Var3.b;
                    url0 url0Var3 = (url0) l0x0Var3.d;
                    url0Var3.getClass();
                    x6h1 x6h1VarC3 = url0Var3.a.c();
                    x6h1VarC3.i.add(new a7h1("push_message_quick_action", str10, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    String str11 = i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", str7 != null ? str7 : "")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                    ((rb00) tjqVar.c).a("DOWNLOAD", yvuVar.b, yvuVar.c, yvuVar.d, yvuVar.e);
                } else {
                    n57.e("This link type cannot be handled by DownloadHandler");
                }
                ((rvy0) tjqVar.d).a(yvuVar.a);
                return rih1Var;
        }
    }
}
