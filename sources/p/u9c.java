package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.browsita.v1.resolved.ResolvedBrowse;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit2.HttpException;
import spotify.collection.esperanto.proto.CollectionContainsRequest;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.your_library.esperanto.proto.IsCuratedItem;
import spotify.your_library.esperanto.proto.IsCuratedRequest;
import spotify.your_library.esperanto.proto.IsCuratedResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u9c implements y8c, b1o1 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;
    public final Object f;

    public u9c(dxy dxyVar) {
        this.a = dxy.h(dxyVar);
        this.b = dxy.i(dxyVar);
        this.c = dxy.j(dxyVar);
        this.d = dxy.k(dxyVar);
        this.e = dxy.l(dxyVar);
        this.f = dxy.m(dxyVar);
    }

    public static boolean n(List list) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            Set set = s4b1.f;
            if (uic.x(str).c == blc0.ti) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(List list) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            Set set = s4b1.f;
            if (uic.x(str).c == blc0.ed) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(List list) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            Set set = s4b1.f;
            if (uic.x(str).c == blc0.Pg) {
                return true;
            }
        }
        return false;
    }

    public static IsCuratedRequest r(d7h d7hVar) {
        hf90 hf90VarP = IsCuratedRequest.p();
        hf90VarP.n(d7hVar.b);
        hf90VarP.r(d7hVar.a);
        hf90VarP.s(d7hVar.c ? if90.c : if90.b);
        return hf90VarP.build();
    }

    public static LinkedHashMap s(CollectionContainsResponse collectionContainsResponse, LinkedHashMap linkedHashMap, d7h d7hVar, YourLibraryContainsRequest yourLibraryContainsRequest) {
        h290 h290VarP = yourLibraryContainsRequest.p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarP) {
            if (!linkedHashMap.keySet().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.g("Some requested uris to YLContains dit not return a response " + arrayList, new Object[0]);
        }
        List list = d7hVar.b;
        if (list.size() != collectionContainsResponse.o()) {
            Logger.g("Some requested uris are missing from ban response, uris requested " + list, new Object[0]);
        }
        ba80 ba80VarU1 = o7h.u1(list);
        int iS = zno1.s(q7h.U(ba80VarU1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                return linkedHashMap2;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            Object obj2 = aa80Var.b;
            int i = aa80Var.a;
            e7h e7hVar = (e7h) linkedHashMap.get(obj2);
            boolean z = e7hVar != null ? e7hVar.b : false;
            Boolean bool = p7h.K(collectionContainsResponse.p()).c(i) ? (Boolean) collectionContainsResponse.p().get(i) : Boolean.FALSE;
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            e7h e7hVar2 = (e7h) linkedHashMap.get(aa80Var.b);
            mmr0 mmr0VarN = oqn1.n(obj2, new f7h(z, zBooleanValue, e7hVar2 != null ? e7hVar2.b : false));
            linkedHashMap2.put(mmr0VarN.a, mmr0VarN.b);
        }
    }

    public static xkg0 t(IsCuratedResponse isCuratedResponse, List list, Map map) {
        if (list.size() != isCuratedResponse.p()) {
            Logger.g("Some request uris to isCurated did not get a response, requested uris " + list + " response " + isCuratedResponse.q(), new Object[0]);
        }
        xkg0 xkg0Var = new xkg0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = null;
            String str2 = map != null ? (String) map.get(str) : null;
            for (Object obj2 : isCuratedResponse.q()) {
                IsCuratedItem isCuratedItem = (IsCuratedItem) obj2;
                if (u890.j(isCuratedItem.getUri(), str) || u890.j(str2, isCuratedItem.getUri())) {
                    obj = obj2;
                    break;
                }
            }
            IsCuratedItem isCuratedItem2 = (IsCuratedItem) obj;
            f7h f7hVar = new f7h(isCuratedItem2 != null ? isCuratedItem2.getIsInCollection() : false, isCuratedItem2 != null ? isCuratedItem2.getIsBanned() : false, isCuratedItem2 != null ? isCuratedItem2.getIsCurated() : false);
            xkg0Var.put(str, f7hVar);
            if (str2 != null && !str2.equals(str)) {
                xkg0Var.put(str2, f7hVar);
            }
        }
        return xkg0Var.b();
    }

    public static LinkedHashMap u(YourLibraryContainsResponse yourLibraryContainsResponse) {
        h290<YourLibraryContainsResponseEntity> h290VarO = yourLibraryContainsResponse.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity : h290VarO) {
            arrayList.add(new e7h(yourLibraryContainsResponseEntity.getUri(), yourLibraryContainsResponseEntity.o()));
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : arrayList) {
            linkedHashMap.put(((e7h) obj).a, obj);
        }
        return linkedHashMap;
    }

    @Override // p.b1o1
    public nwo1 a(String str, String str2, sln1 sln1Var, long j) {
        return new nwo1(66, new n9i0(this, str, str2, sln1Var, j, (lnm) null), (Integer) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p.y8c
    public Object b(jce0 jce0Var, boolean z, lnm lnmVar) throws HttpException {
        t9c t9cVar;
        yqg yqgVar = (yqg) this.d;
        if (lnmVar instanceof t9c) {
            t9cVar = (t9c) lnmVar;
            int i = t9cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t9cVar.c = i - Integer.MIN_VALUE;
            } else {
                t9cVar = new t9c(this, (onm) lnmVar);
            }
        } else {
            t9cVar = new t9c(this, (onm) lnmVar);
        }
        t9c t9cVar2 = t9cVar;
        Object objA = t9cVar2.a;
        int i2 = t9cVar2.c;
        if (i2 == 0) {
            hm5.M(objA);
            s9c s9cVar = (s9c) this.a;
            String strM = y7y0.m(jce0Var);
            Boolean boolM = ((kf4) this.e).f() ? yah0.m(xoi1.b((Context) this.f)) : null;
            String id = yqgVar.g().getID();
            Boolean boolM2 = z ? yah0.m(true) : null;
            t9cVar2.c = 1;
            objA = s9cVar.a(strM, boolM, id, boolM2, t9cVar2);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        sy21 sy21Var = (sy21) objA;
        ResolvedBrowse resolvedBrowse = (ResolvedBrowse) sy21Var.b;
        if (resolvedBrowse == null) {
            throw new HttpException(sy21Var);
        }
        String str = y7y0.p(sy21Var, yqgVar) ? "cache" : "remote";
        ((t2r0) this.c).c(new u2r0("data_source", str));
        return zu21.a(resolvedBrowse, ((hs00) this.b).b(), str);
    }

    @Override // p.b1o1
    public nwo1 c(long j, yln1 yln1Var) {
        return new nwo1(65, new gxn1(this, j, yln1Var, null, (byte) 1), (Integer) null);
    }

    public rf01 d() {
        h1i h1iVar;
        Context context = (Context) this.f;
        wy70 wy70VarA = wy70.a((wy70) this.a, new kc10(ila0.G(((ic10) this.e).a)), 8191);
        idd1 idd1Var = new idd1(new el70((byte) 1));
        idd1 idd1Var2 = (idd1) this.b;
        if (idd1Var2 == null) {
            idd1Var2 = new idd1(new g030(this, (byte) 6));
        }
        idd1 idd1Var3 = (idd1) this.c;
        if (idd1Var3 == null) {
            idd1Var3 = new idd1(new el70((byte) 2));
        }
        h1i h1iVar2 = (h1i) this.d;
        if (h1iVar2 == null) {
            z6x z6xVar = z6x.a;
            h1iVar = new h1i(z6xVar, z6xVar, z6xVar, z6xVar, z6xVar);
        } else {
            h1iVar = h1iVar2;
        }
        return new rf01(new pf01(context, wy70VarA, idd1Var, idd1Var2, idd1Var3, h1iVar));
    }

    @Override // p.b1o1
    public qwo1 e(String str, String str2) {
        return new qwo1(new t7h0(this, str, str2, (lnm) null, (byte) 1));
    }

    public ig51 f(rnt0 rnt0Var, xpw xpwVar) {
        mmr0 mmr0VarM;
        int i = ((uk00) this.e).b;
        String strC = rnt0Var.c();
        if (strC == null) {
            strC = "";
        }
        smc0 smc0VarN = k4p1.n();
        x360 x360VarB = rnt0Var.b();
        if (x360VarB != null && (mmr0VarM = ((uu0) this.d).m(x360VarB)) != null) {
            smc0VarN.add(o4o1.q((xpw) mmr0VarM.a, mmr0VarM.b, i));
        }
        smc0VarN.add(o4o1.q(xpwVar, rnt0Var.a(), i));
        return new ig51(strC, k4p1.k(smc0VarN), new t1t0(rnt0Var, (byte) 8));
    }

    public Single g(d7h d7hVar) {
        ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
        List list = d7hVar.b;
        ssm1VarQ.n(list);
        YourLibraryContainsRequest yourLibraryContainsRequestBuild = ssm1VarQ.build();
        mwm1 mwm1Var = (mwm1) this.b;
        ssm1 ssm1VarQ2 = YourLibraryContainsRequest.q();
        ssm1VarQ2.n(list);
        Single singleA = mwm1Var.a(ssm1VarQ2.build());
        r5h r5hVar = (r5h) this.a;
        x2h x2hVarP = CollectionContainsRequest.p();
        x2hVarP.n(list);
        x2hVarP.r(d7hVar.a);
        return Single.zip(singleA, r5hVar.callSingle("spotify.collection_esperanto.proto.CollectionService", "Contains", x2hVarP.build()).map(pbo1.O0), new cfd(this, d7hVar, yourLibraryContainsRequestBuild, (byte) 18));
    }

    public aso h(zob1 zob1Var) {
        return kyo1.n(f6o1.A(t3k1.H((jg51) this.c, new aft0(this, ((pmt0) this.a).a(new omt0(((uk00) this.e).b), zob1Var), (byte) 5)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new xy50(this, (byte) 25));
    }

    public bso i(d0r d0rVar) {
        el9 el9VarA = ((hnt0) this.b).a(d0rVar, gnt0.a(), new omt0(((uk00) this.e).b));
        return kyo1.o(fdg1.m0(new knt0((jg51) this.c, el9VarA, new aft0(this, m0p1.p(el9VarA), (byte) 6)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new fgs0(this, (byte) 15));
    }

    public Single j(d7h d7hVar) {
        List list = d7hVar.b;
        return (n(list) || o(list) || p(list)) ? m(d7hVar).flatMap(new xid(d7hVar, this, (byte) 16)) : ((mwm1) this.b).callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "IsCurated", r(d7hVar)).map(m9x0.Z0).map(new jc9(this, d7hVar));
    }

    public Observable k(d7h d7hVar) {
        List list = d7hVar.b;
        return (n(list) || o(list) || p(list)) ? m(d7hVar).flatMapObservable(new aod(d7hVar, this, (byte) 17)) : ((mwm1) this.b).d(r(d7hVar)).map(new mp8(this, d7hVar));
    }

    public lsg0 l(c481 c481Var) {
        ArrayList<i1z> arrayListQ = uic.q(c481Var.getItems());
        ArrayList arrayList = new ArrayList(q7h.U(arrayListQ, 10));
        for (i1z i1zVar : arrayListQ) {
            arrayList.add(new hrg0(i1zVar.g(), i1zVar.e(), i1zVar.f(), i1zVar.c(), i1zVar.j(), i1zVar.i(), i1zVar.h()));
        }
        return new lsg0(c481Var.d().a, arrayList);
    }

    public Single m(d7h d7hVar) {
        List list = d7hVar.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set set = s4b1.f;
            if (uic.x((String) obj).c == blc0.ti) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Set set2 = s4b1.f;
            blc0 blc0Var = uic.x((String) obj2).c;
            if (blc0Var == blc0.ed || blc0Var == blc0.Pg) {
                arrayList2.add(obj2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        b7x b7xVar = b7x.a;
        return Single.zip(!zIsEmpty ? ((nwf1) this.c).b(arrayList) : Single.just(b7xVar), !arrayList2.isEmpty() ? rqt0.F((q8n) this.e, new bag(this, arrayList2, (lnm) null, (byte) 10)) : Single.just(b7xVar), t9w.R0);
    }

    public Observable q(d7h d7hVar) {
        ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
        List list = d7hVar.b;
        ssm1VarQ.n(list);
        s2j0 s2j0Var = (YourLibraryContainsRequest) ssm1VarQ.build();
        mwm1 mwm1Var = (mwm1) this.b;
        s2j0Var.getClass();
        Observable map = mwm1Var.callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamContains", s2j0Var).map(s9x0.Y0);
        r5h r5hVar = (r5h) this.a;
        x2h x2hVarP = CollectionContainsRequest.p();
        x2hVarP.n(list);
        x2hVarP.r(d7hVar.a);
        return Observable.combineLatest(map, r5hVar.callStream("spotify.collection_esperanto.proto.CollectionService", "StreamContains", x2hVarP.build()).map(zp8.Q0), new xid(this, d7hVar, s2j0Var));
    }

    public u9c(ssk1 ssk1Var, tmc0 tmc0Var, uyo1 uyo1Var, dzp0 dzp0Var, qeh1 qeh1Var) {
        this.a = ssk1Var;
        this.b = tmc0Var;
        this.c = uyo1Var;
        this.d = dzp0Var;
        this.f = qeh1Var;
        this.e = ygn0.a();
    }

    public u9c(h481 h481Var, n481 n481Var, e481 e481Var, uic uicVar, ulc ulcVar, t881 t881Var, ogr ogrVar, atg0 atg0Var) {
        this.a = h481Var;
        this.b = n481Var;
        this.c = e481Var;
        this.d = t881Var;
        this.e = ogrVar;
        this.f = atg0Var;
    }

    public u9c(pmt0 pmt0Var, hnt0 hnt0Var, jg51 jg51Var, uu0 uu0Var, uk00 uk00Var) {
        this.a = pmt0Var;
        this.b = hnt0Var;
        this.c = jg51Var;
        this.d = uu0Var;
        this.e = uk00Var;
        nmt0.g0.getClass();
        this.f = mmt0.b;
    }

    public u9c(Context context) {
        this.f = context.getApplicationContext();
        this.a = wy70.o;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = new ic10();
    }

    public /* synthetic */ u9c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }
}
