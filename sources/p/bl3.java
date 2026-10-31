package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bl3 {
    public final Context a;
    public final xrc0 b;
    public final vlo c;
    public final joo d;
    public final uu00 e;
    public final q8n f;
    public final ut71 g;
    public final vwm1 h;
    public final j6g1 i;
    public final ov20 j;
    public final r241 k;
    public final llm o;
    public final Single l = rqt0.F(igu.b, new c6(this, (lnm) null, (byte) 22));
    public final xgn0 m = ygn0.a();
    public final bpb1 n = gio1.b(b7x.a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f13p = new idd1(new wam1(this, (byte) 25));
    public final idd1 q = new idd1(new w0n0(this));

    public bl3(Context context, xrc0 xrc0Var, wqg wqgVar, vlo vloVar, joo jooVar, agc0 agc0Var, uu00 uu00Var, q8n q8nVar, ut71 ut71Var, vwm1 vwm1Var, j6g1 j6g1Var, xrm1 xrm1Var, ov20 ov20Var, r241 r241Var, thu0 thu0Var) {
        this.a = context;
        this.b = xrc0Var;
        this.c = vloVar;
        this.d = jooVar;
        this.e = uu00Var;
        this.f = q8nVar;
        this.g = ut71Var;
        this.h = vwm1Var;
        this.i = j6g1Var;
        this.j = ov20Var;
        this.k = r241Var;
        this.o = l1d.x(q8nVar);
    }

    public static List f(String str) {
        if (str.length() == 0) {
            return z6x.a;
        }
        List<String> listQ0 = ihc1.Q0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
        for (String str2 : listQ0) {
            arrayList.add(u890.j(str2, "spotify:collection") ? bk3.a : new ck3(str2));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String j(ak3 ak3Var) throws NoWhenBranchMatchedException {
        int iOrdinal = ak3Var.ordinal();
        if (iOrdinal == 0) {
            return "yl-settings-preferred-save-location-songs";
        }
        if (iOrdinal == 1) {
            return "yl-settings-preferred-save-location-talk";
        }
        if (iOrdinal == 2) {
            return "yl-settings-preferred-save-location-audiobooks";
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008a, B:32:0x0092, B:33:0x0098), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008a, B:32:0x0092, B:33:0x0098), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0092 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008a, B:32:0x0092, B:33:0x0098), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008a, B:32:0x0092, B:33:0x0098), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ak3 ak3Var, dk3 dk3Var, onm onmVar) throws Throwable {
        ok3 ok3Var;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        String strJ;
        dk3 dk3Var2;
        List list;
        xj3 xj3Var;
        if (onmVar instanceof ok3) {
            ok3Var = (ok3) onmVar;
            int i2 = ok3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ok3Var.h = i2 - Integer.MIN_VALUE;
            } else {
                ok3Var = new ok3(this, onmVar);
            }
        } else {
            ok3Var = new ok3(this, onmVar);
        }
        Object obj = ok3Var.f;
        int i3 = ok3Var.h;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                ok3Var.a = ak3Var;
                ok3Var.b = dk3Var;
                vgn0Var = this.m;
                ok3Var.c = vgn0Var;
                i = 0;
                ok3Var.e = 0;
                ok3Var.h = 1;
                if (vgn0Var.a(ok3Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                strJ = ok3Var.d;
                vgn0Var2 = ok3Var.c;
                dk3Var2 = ok3Var.b;
                try {
                    hm5.M(obj);
                    list = (List) obj;
                    if (list.contains(dk3Var2)) {
                        xj3Var = new xj3(1);
                    } else if (list.size() >= 10) {
                        xj3Var = new xj3(2);
                    } else {
                        c(strJ, o7h.O0(dk3Var2, list));
                        xj3Var = yj3.a;
                    }
                    vgn0Var2.c((Object) null);
                    return xj3Var;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            int i4 = ok3Var.e;
            vgn0 vgn0Var3 = ok3Var.c;
            dk3 dk3Var3 = ok3Var.b;
            ak3 ak3Var2 = ok3Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            dk3Var = dk3Var3;
            i = i4;
            ak3Var = ak3Var2;
            strJ = j(ak3Var);
            ok3Var.a = null;
            ok3Var.b = dk3Var;
            ok3Var.c = vgn0Var;
            ok3Var.d = strJ;
            ok3Var.e = i;
            ok3Var.h = 2;
            Object objD = d(strJ, ok3Var);
            if (objD != d9nVar) {
                dk3Var2 = dk3Var;
                vgn0Var2 = vgn0Var;
                obj = objD;
                list = (List) obj;
                if (list.contains(dk3Var2)) {
                    xj3Var = new xj3(1);
                } else if (list.size() >= 10) {
                    xj3Var = new xj3(2);
                } else {
                    c(strJ, o7h.O0(dk3Var2, list));
                    xj3Var = yj3.a;
                }
                vgn0Var2.c((Object) null);
                return xj3Var;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final dk3 b(ak3 ak3Var) throws NoWhenBranchMatchedException {
        int iOrdinal = ak3Var.ordinal();
        if (iOrdinal == 0) {
            return new ck3("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
        }
        if (iOrdinal == 1) {
            return new ck3("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt");
        }
        if (iOrdinal == 2) {
            return bk3.a;
        }
        eg.o();
        return null;
    }

    public final void c(String str, List list) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.n;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, sqg0.P((Map) value, oqn1.n(str, list))));
        c921.y(this.o, (o8n) null, 0, new c6(this, str, list, (lnm) null, (byte) 21), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        pk3 pk3Var;
        if (onmVar instanceof pk3) {
            pk3Var = (pk3) onmVar;
            int i = pk3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk3Var.d = i - Integer.MIN_VALUE;
            } else {
                pk3Var = new pk3(this, onmVar);
            }
        } else {
            pk3Var = new pk3(this, onmVar);
        }
        Object objI = pk3Var.b;
        int i2 = pk3Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            List list = (List) ((Map) this.n.getValue()).get(str);
            if (list != null) {
                return list;
            }
            mr20 mr20VarC = ((bw20) this.j).c(str, "");
            pk3Var.a = this;
            pk3Var.d = 1;
            objI = b5p1.i(mr20VarC, pk3Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = pk3Var.a;
            hm5.M(objI);
        }
        this.getClass();
        return f((String) objI);
    }

    public final kk3 e(nk3 nk3Var) {
        int iOrdinal = nk3Var.ordinal();
        if (iOrdinal == 0) {
            return (ek3) this.f13p.getValue();
        }
        if (iOrdinal == 1) {
            return cl3.d();
        }
        if (iOrdinal == 2) {
            return cl3.c();
        }
        if (iOrdinal == 3) {
            return cl3.a();
        }
        if (iOrdinal != 4) {
            return iOrdinal != 6 ? gk3.a : cl3.d();
        }
        return (hk3) this.q.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    public final Single g(String str) {
        Single singleJust;
        Set set = s4b1.f;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal == 166) {
            singleJust = Single.just(nk3.e);
        } else if (iOrdinal == 416) {
            singleJust = Single.just(nk3.a);
        } else if (iOrdinal == 652) {
            singleJust = Single.just(nk3.g);
        } else if (iOrdinal != 844) {
            nk3 nk3Var = nk3.f;
            if (iOrdinal == 860) {
                singleJust = ((zu00) this.e).b(new oi("aligned_curation", new wk3(str, (byte) 0))).map(new acn1(str, (byte) 1)).filter(f331.b).map(cxo1.f).timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(o9p1.f).onErrorReturnItem(nk3Var);
            } else if (iOrdinal != 926) {
                singleJust = Single.just(nk3Var);
            } else {
                singleJust = Single.just(nk3.a);
            }
        } else {
            singleJust = Single.just(nk3.b);
        }
        return singleJust.flatMap(new ycc1(this, str, (byte) 29));
    }

    public final Single h(nk3 nk3Var, bma1 bma1Var) {
        return this.l.flatMap(new g23(this, nk3Var, bma1Var, (byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ak3 ak3Var, onm onmVar) throws Throwable {
        sk3 sk3Var;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        if (onmVar instanceof sk3) {
            sk3Var = (sk3) onmVar;
            int i2 = sk3Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sk3Var.f = i2 - Integer.MIN_VALUE;
            } else {
                sk3Var = new sk3(this, onmVar);
            }
        } else {
            sk3Var = new sk3(this, onmVar);
        }
        Object obj = sk3Var.d;
        int i3 = sk3Var.f;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                sk3Var.a = ak3Var;
                vgn0Var = this.m;
                sk3Var.b = vgn0Var;
                sk3Var.c = 0;
                sk3Var.f = 1;
                if (vgn0Var.a(sk3Var) != d9nVar) {
                    i = 0;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = sk3Var.b;
                try {
                    hm5.M(obj);
                    Boolean boolM = yah0.m(((List) obj).size() >= 10);
                    vgn0Var2.c((Object) null);
                    return boolM;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            int i4 = sk3Var.c;
            vgn0 vgn0Var3 = sk3Var.b;
            ak3 ak3Var2 = sk3Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            i = i4;
            ak3Var = ak3Var2;
            String strJ = j(ak3Var);
            sk3Var.a = null;
            sk3Var.b = vgn0Var;
            sk3Var.c = i;
            sk3Var.f = 2;
            Object objD = d(strJ, sk3Var);
            if (objD != d9nVar) {
                vgn0 vgn0Var4 = vgn0Var;
                obj = objD;
                vgn0Var2 = vgn0Var4;
                Boolean boolM2 = yah0.m(((List) obj).size() >= 10);
                vgn0Var2.c((Object) null);
                return boolM2;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(List list, ak3 ak3Var, onm onmVar) throws Throwable {
        tk3 tk3Var;
        Set setZ0;
        Object objB;
        Throwable th;
        YourLibraryContainsResponse m231Var;
        xgn0 xgn0Var;
        ak3 ak3Var2;
        List list2;
        if (onmVar instanceof tk3) {
            tk3Var = (tk3) onmVar;
            int i = tk3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tk3Var.h = i - Integer.MIN_VALUE;
            } else {
                tk3Var = new tk3(this, onmVar);
            }
        } else {
            tk3Var = new tk3(this, onmVar);
        }
        Object obj = tk3Var.f;
        int i2 = tk3Var.h;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                Set set = tk3Var.c;
                ak3Var = tk3Var.b;
                List list3 = tk3Var.a;
                try {
                    hm5.M(obj);
                    setZ0 = set;
                    list = list3;
                    objB = obj;
                } catch (Throwable th2) {
                    setZ0 = set;
                    list = list3;
                    th = th2;
                    m231Var = new m231(th);
                }
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xgn0Var = tk3Var.e;
                list2 = tk3Var.d;
                Set set2 = tk3Var.c;
                ak3Var2 = tk3Var.b;
                List list4 = tk3Var.a;
                hm5.M(obj);
            }
            try {
                c(j(ak3Var2), list2);
                return list2;
            } finally {
                xgn0Var.c((Object) null);
            }
        }
        hm5.M(obj);
        setZ0 = dm61.z0(new String[]{"spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt"});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ck3) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ck3) it.next()).a());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!setZ0.contains((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.isEmpty()) {
            return list;
        }
        try {
            vwm1 vwm1Var = this.h;
            ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
            ssm1VarQ.n(arrayList3);
            YourLibraryContainsRequest yourLibraryContainsRequestBuild = ssm1VarQ.build();
            tk3Var.a = list;
            tk3Var.b = ak3Var;
            tk3Var.c = setZ0;
            tk3Var.h = 1;
            objB = vwm1Var.b(yourLibraryContainsRequestBuild, tk3Var);
            if (objB == d9nVar) {
            }
        } catch (Throwable th3) {
            th = th3;
            m231Var = new m231(th);
        }
        return d9nVar;
        m231Var = (YourLibraryContainsResponse) objB;
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        YourLibraryContainsResponse yourLibraryContainsResponse = m231Var;
        if (yourLibraryContainsResponse == null || yourLibraryContainsResponse.p().length() > 0) {
            return list;
        }
        h290 h290VarO = yourLibraryContainsResponse.o();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : h290VarO) {
            if (((YourLibraryContainsResponseEntity) obj4).o()) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((YourLibraryContainsResponseEntity) it2.next()).getUri());
        }
        Set setP1 = o7h.p1(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list) {
            ck3 ck3Var = (dk3) obj5;
            if (!(ck3Var instanceof bk3)) {
                if (!(ck3Var instanceof ck3)) {
                    eg.o();
                    return null;
                }
                ck3 ck3Var2 = ck3Var;
                if (setZ0.contains(ck3Var2.a()) || setP1.contains(ck3Var2.a())) {
                }
            }
            arrayList6.add(obj5);
        }
        if (arrayList6.size() == list.size()) {
            return list;
        }
        if (arrayList6.isEmpty()) {
            return arrayList6;
        }
        tk3Var.a = null;
        tk3Var.b = ak3Var;
        tk3Var.c = null;
        tk3Var.d = arrayList6;
        xgn0Var = this.m;
        tk3Var.e = xgn0Var;
        tk3Var.h = 2;
        if (xgn0Var.a(tk3Var) != d9nVar) {
            ak3Var2 = ak3Var;
            list2 = arrayList6;
            c(j(ak3Var2), list2);
            return list2;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x007f, B:29:0x0087, B:30:0x008f, B:35:0x009d, B:37:0x00a9, B:38:0x00b1), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x007f, B:29:0x0087, B:30:0x008f, B:35:0x009d, B:37:0x00a9, B:38:0x00b1), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x007f, B:29:0x0087, B:30:0x008f, B:35:0x009d, B:37:0x00a9, B:38:0x00b1), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(ak3 ak3Var, dk3 dk3Var, onm onmVar) throws Throwable {
        uk3 uk3Var;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        dk3 dk3Var2;
        ak3 ak3Var2;
        String str;
        Collection collectionX;
        List list;
        boolean zContains;
        rih1 rih1Var;
        ArrayList arrayListJ0;
        List listX;
        if (onmVar instanceof uk3) {
            uk3Var = (uk3) onmVar;
            int i2 = uk3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uk3Var.h = i2 - Integer.MIN_VALUE;
            } else {
                uk3Var = new uk3(this, onmVar);
            }
        } else {
            uk3Var = new uk3(this, onmVar);
        }
        Object obj = uk3Var.f;
        int i3 = uk3Var.h;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                uk3Var.a = ak3Var;
                uk3Var.b = dk3Var;
                vgn0Var = this.m;
                uk3Var.c = vgn0Var;
                i = 0;
                uk3Var.e = 0;
                uk3Var.h = 1;
                if (vgn0Var.a(uk3Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = uk3Var.d;
                vgn0Var2 = uk3Var.c;
                dk3Var2 = uk3Var.b;
                ak3Var2 = uk3Var.a;
                try {
                    hm5.M(obj);
                    collectionX = (Collection) obj;
                    if (collectionX.isEmpty()) {
                        collectionX = k4p1.x(b(ak3Var2));
                    }
                    list = (List) collectionX;
                    zContains = list.contains(dk3Var2);
                    rih1Var = rih1.a;
                    if (!zContains) {
                        vgn0Var2.c((Object) null);
                        return rih1Var;
                    }
                    arrayListJ0 = o7h.J0(list, dk3Var2);
                    if (arrayListJ0.isEmpty()) {
                        listX = arrayListJ0;
                        listX = k4p1.x(b(ak3Var2));
                    }
                    listX = arrayListJ0;
                    c(str, listX);
                    vgn0Var2.c((Object) null);
                    return rih1Var;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            int i4 = uk3Var.e;
            vgn0 vgn0Var3 = uk3Var.c;
            dk3 dk3Var3 = uk3Var.b;
            ak3 ak3Var3 = uk3Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            dk3Var = dk3Var3;
            i = i4;
            ak3Var = ak3Var3;
            String strJ = j(ak3Var);
            uk3Var.a = ak3Var;
            uk3Var.b = dk3Var;
            uk3Var.c = vgn0Var;
            uk3Var.d = strJ;
            uk3Var.e = i;
            uk3Var.h = 2;
            Object objD = d(strJ, uk3Var);
            if (objD != d9nVar) {
                dk3Var2 = dk3Var;
                vgn0Var2 = vgn0Var;
                obj = objD;
                ak3Var2 = ak3Var;
                str = strJ;
                collectionX = (Collection) obj;
                if (collectionX.isEmpty()) {
                    collectionX = k4p1.x(b(ak3Var2));
                }
                list = (List) collectionX;
                zContains = list.contains(dk3Var2);
                rih1Var = rih1.a;
                if (!zContains) {
                    vgn0Var2.c((Object) null);
                    return rih1Var;
                }
                arrayListJ0 = o7h.J0(list, dk3Var2);
                if (arrayListJ0.isEmpty()) {
                    listX = arrayListJ0;
                    listX = k4p1.x(b(ak3Var2));
                }
                listX = arrayListJ0;
                c(str, listX);
                vgn0Var2.c((Object) null);
                return rih1Var;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m(nk3 nk3Var, String str, onm onmVar) {
        vk3 vk3Var;
        nk3 nk3Var2;
        nk3 nk3Var3;
        Object obj;
        bl3 bl3Var;
        kk3 m231Var;
        String str2 = str;
        if (onmVar instanceof vk3) {
            vk3Var = (vk3) onmVar;
            int i = vk3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk3Var.f = i - Integer.MIN_VALUE;
            } else {
                vk3Var = new vk3(this, onmVar);
            }
        } else {
            vk3Var = new vk3(this, onmVar);
        }
        Object obj2 = vk3Var.d;
        int i2 = vk3Var.f;
        if (i2 == 0) {
            hm5.M(obj2);
            try {
                rsc0 rsc0Var = this.b;
                trc0 trc0Var = new trc0(cl3.b(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                nk3Var2 = nk3Var;
                try {
                    vk3Var.a = nk3Var2;
                    vk3Var.b = str2;
                    vk3Var.c = this;
                    vk3Var.f = 1;
                    Object objF = rsc0Var.f(str2, trc0Var, vk3Var);
                    d9n d9nVar = d9n.a;
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                    nk3Var3 = nk3Var2;
                    obj = objF;
                    bl3Var = this;
                } catch (Throwable th) {
                    th = th;
                    m231Var = new m231(th);
                    nk3Var3 = nk3Var2;
                }
            } catch (Throwable th2) {
                th = th2;
                nk3Var2 = nk3Var;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bl3 bl3Var2 = vk3Var.c;
            String str3 = vk3Var.b;
            nk3Var3 = vk3Var.a;
            try {
                hm5.M(obj2);
                bl3Var = bl3Var2;
                str2 = str3;
                obj = obj2;
            } catch (Throwable th3) {
                th = th3;
                nk3Var2 = nk3Var3;
                m231Var = new m231(th);
                nk3Var3 = nk3Var2;
            }
        }
        m231Var = (kk3) ((py21) obj).b(new cc2(bl3Var, nk3Var3, (byte) 14), new t6(bl3Var, nk3Var3, str2, (byte) 22));
        return m231Var instanceof m231 ? e(nk3Var3) : m231Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final mr20 n(ak3 ak3Var) throws NoWhenBranchMatchedException {
        String strJ = j(ak3Var);
        return rqt0.u(new sr0(h5p1.t(new gk(((bw20) this.j).c(strJ, ""), this, (byte) 27), new ld2(this.n, strJ, (byte) 1), new al3()), this, ak3Var, strJ, (byte) 4));
    }
}
