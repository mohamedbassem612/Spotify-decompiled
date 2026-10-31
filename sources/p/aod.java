package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFilter;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.IsCuratedRequest;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aod implements Function, ya, hg30, g761, ek90, Function3 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public aod(dma1 dma1Var) {
        this.a = (byte) 27;
        this.b = dma1Var;
        this.c = new idd1(new vjh(this, (byte) 23));
    }

    public static goe f(goe goeVar, Map map, Map map2) {
        gxz0 gxz0VarA;
        List list = goeVar.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (true) {
            w4i1 w4i1Var = null;
            if (!it.hasNext()) {
                break;
            }
            jwm jwmVar = (jwm) it.next();
            w4i1 w4i1Var2 = (w4i1) map.get(jwmVar.a.a);
            if (w4i1Var2 == null) {
                w4i1Var2 = jwmVar.a;
            }
            w4i1 w4i1Var3 = jwmVar.d;
            if (w4i1Var3 != null && (w4i1Var = (w4i1) map.get(w4i1Var3.a)) == null) {
                w4i1Var = w4i1Var3;
            }
            arrayList.add(jwm.a(jwmVar, w4i1Var2, w4i1Var, 6));
        }
        List<tom> list2 = goeVar.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (tom tomVar : list2) {
            tom tomVar2 = (tom) map2.get(tomVar.a);
            if (tomVar2 != null) {
                tomVar = tomVar2;
            }
            arrayList2.add(tomVar);
        }
        gxz0 gxz0Var = goeVar.d;
        if (gxz0Var != null) {
            w4i1 w4i1Var4 = gxz0Var.c;
            w4i1 w4i1Var5 = (w4i1) map.get(w4i1Var4.a);
            if (w4i1Var5 != null) {
                w4i1Var4 = w4i1Var5;
            }
            gxz0VarA = gxz0.a(gxz0Var, w4i1Var4, 27);
        } else {
            gxz0VarA = null;
        }
        ctf ctfVar = goeVar.b;
        if (ctfVar instanceof atf) {
            return goe.a(goeVar, (String) null, (btf) null, gxz0VarA, arrayList, arrayList2, 0, 4039);
        }
        if (!(ctfVar instanceof btf)) {
            eg.o();
            return null;
        }
        btf btfVar = (btf) ctfVar;
        List<oe90> list3 = btfVar.b;
        ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
        for (oe90 oe90Var : list3) {
            w4i1 w4i1Var6 = (w4i1) map.get(oe90Var.b.a);
            if (w4i1Var6 == null) {
                w4i1Var6 = oe90Var.b;
            }
            arrayList3.add(new oe90(oe90Var.a, w4i1Var6));
        }
        return goe.a(goeVar, (String) null, new btf(btfVar.a, arrayList3), gxz0VarA, arrayList, arrayList2, 0, 4037);
    }

    public static aod h(Context context, Class cls) {
        return new aod((Object) context, (Object) new dg8(cls, (byte) 27), (byte) 21);
    }

    public Bundle a(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Bundle bundle = new Bundle();
        Class cls = (Class) this.b;
        iar0 iar0Var = (iar0) this.c;
        bundle.putString("page_key", cls.getName());
        bundle.putParcelable("parameters", iar0Var.a(s4b1Var, th61Var));
        return bundle;
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        if (!((jp4) this.b).a()) {
            return false;
        }
        wqg wqgVar = (wqg) this.c;
        String str = kskVar.a;
        wqgVar.getClass();
        return str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
    }

    public Object apply(Object obj) {
        yrd yrdVarL;
        switch (this.a) {
            case 1:
                Logger.b(f4i1.f("[AA-RESUME] connect-sync did not emit (", ((Throwable) obj).getClass().getSimpleName(), "); falling through"), new Object[0]);
                lrd lrdVar = (lrd) this.b;
                String str = (String) this.c;
                Flowable flowable = lrdVar.p;
                flowable.getClass();
                return new MaybeFlatMapCompletable(new FlowableElementAtMaybe(flowable), new xid(lrdVar, str, (byte) 3));
            case 2:
                Map map = (Map) obj;
                kvd kvdVar = (kvd) this.b;
                List list = (List) this.c;
                List listT0 = o7h.T0(map.keySet());
                ArrayList<mvd> arrayList = new ArrayList();
                Iterator it = listT0.iterator();
                while (it.hasNext()) {
                    mvd mvdVar = (mvd) map.get((String) it.next());
                    if (mvdVar != null) {
                        arrayList.add(mvdVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (mvd mvdVar2 : arrayList) {
                    if (mvdVar2.getItems().isEmpty()) {
                        yrdVarL = null;
                    } else {
                        jvd jvdVar = kvdVar.a;
                        list.isEmpty();
                        yrdVarL = jvdVar.l(mvdVar2);
                    }
                    if (yrdVarL != null) {
                        arrayList2.add(yrdVarL);
                    }
                }
                return arrayList2;
            case 4:
                return ((ajq0) this.b).v().subscribeOn((Scheduler) this.c).map(t9w.P0).doOnError(fcc.i).onErrorReturnItem(new b5e()).toObservable();
            case 16:
                return u9c.t((IsCuratedResponse) obj, ((d7h) this.b).b, (Map) this.c);
            case 17:
                Map map2 = (Map) obj;
                u9c u9cVar = (u9c) this.c;
                d7h d7hVar = (d7h) this.b;
                List<String> list2 = d7hVar.b;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (String str2 : list2) {
                    String str3 = (String) map2.get(str2);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    arrayList3.add(str2);
                }
                mwm1 mwm1Var = (mwm1) u9cVar.b;
                String str4 = d7hVar.a;
                boolean z = d7hVar.c;
                hf90 hf90VarP = IsCuratedRequest.p();
                hf90VarP.n(arrayList3);
                hf90VarP.r(str4);
                hf90VarP.s(z ? if90.c : if90.b);
                return mwm1Var.d(hf90VarP.build()).map(new cfd(u9cVar, d7hVar, map2, (byte) 19));
            case 19:
                String str5 = (String) this.c;
                tjh tjhVar = (tjh) this.b;
                return new CompletableFromAction(new sjh((String) obj, str5, tjhVar)).s(tjhVar.a);
            default:
                cce cceVar = (cce) this.b;
                return new MaybeFilter(cwl1.e0((q8n) cceVar.d, new bag(cceVar, (String) this.c, (lnm) null, (byte) 16)), o9p1.R0);
        }
    }

    public nma0 b(tka0 tka0Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsN = ((wdg) tka0Var).n();
        Object hqcVar = concurrentHashMap.get(clsN);
        if (hqcVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsN, (hqcVar = new hqc((nma0) ((iu30) this.b).invoke(tka0Var))))) != null) {
            hqcVar = objPutIfAbsent;
        }
        return ((hqc) hqcVar).a;
    }

    public void c(int i, int i2) {
        utj utjVar = (utj) this.b;
        b8p1 b8p1Var = utjVar.d;
        if (b8p1Var != null) {
            b8p1Var.u(i, i2, ((fpd) this.c).getItems().size());
        }
        Function0 function0 = utjVar.e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a A[LOOP:0: B:47:0x0104->B:49:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x012c A[LOOP:1: B:51:0x0126->B:53:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable d(List list, onm onmVar) {
        nte nteVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        Iterator it;
        if (onmVar instanceof nte) {
            nteVar = (nte) onmVar;
            int i = nteVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nteVar.e = i - Integer.MIN_VALUE;
            } else {
                nteVar = new nte(this, onmVar);
            }
        } else {
            nteVar = new nte(this, onmVar);
        }
        Object objG = nteVar.c;
        int i2 = nteVar.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objG);
            if (list.isEmpty()) {
                return z6x.a;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                r7h.W(((goe) it2.next()).e, arrayList2);
            }
            v1k v1kVar = (v1k) this.b;
            nteVar.a = list;
            nteVar.e = 1;
            objG = v1kVar.g(arrayList2, nteVar);
            if (objG != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            list = nteVar.a;
            hm5.M(objG);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = nteVar.b;
            list = nteVar.a;
            hm5.M(objG);
        }
        Iterable iterable = (Iterable) objG;
        int iS = zno1.s(q7h.U(iterable, 10));
        linkedHashMap2 = new LinkedHashMap(iS >= 16 ? iS : 16);
        for (Object obj : iterable) {
            linkedHashMap2.put(((tom) obj).a, obj);
        }
        List list2 = list;
        arrayList = new ArrayList(q7h.U(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(f((goe) it.next(), linkedHashMap, linkedHashMap2));
        }
        return arrayList;
        List list3 = (List) objG;
        int iS2 = zno1.s(q7h.U(list3, 10));
        if (iS2 < 16) {
            iS2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2);
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            w4i1 w4i1Var = ((jwm) it3.next()).a;
            linkedHashMap3.put(w4i1Var.a, w4i1Var);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            r7h.W(((goe) it4.next()).f, arrayList3);
        }
        List listL1 = o7h.l1(linkedHashMap3.values());
        p2o0 p2o0Var = (p2o0) this.c;
        nteVar.a = list;
        nteVar.b = linkedHashMap3;
        nteVar.e = 2;
        objG = p2o0Var.u(listL1, arrayList3, nteVar);
        if (objG != d9nVar) {
            linkedHashMap = linkedHashMap3;
            Iterable iterable2 = (Iterable) objG;
            int iS3 = zno1.s(q7h.U(iterable2, 10));
            linkedHashMap2 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
            while (r10.hasNext()) {
                linkedHashMap2.put(((tom) obj).a, obj);
            }
            List list4 = list;
            arrayList = new ArrayList(q7h.U(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(f((goe) it.next(), linkedHashMap, linkedHashMap2));
            }
            return arrayList;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3 A[LOOP:0: B:37:0x00bd->B:39:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(goe goeVar, boolean z, onm onmVar) {
        mte mteVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        if (onmVar instanceof mte) {
            mteVar = (mte) onmVar;
            int i = mteVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mteVar.f = i - Integer.MIN_VALUE;
            } else {
                mteVar = new mte(this, onmVar);
            }
        } else {
            mteVar = new mte(this, onmVar);
        }
        Object objG = mteVar.d;
        int i2 = mteVar.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objG);
            v1k v1kVar = (v1k) this.b;
            List list = goeVar.e;
            mteVar.a = goeVar;
            mteVar.c = z;
            mteVar.f = 1;
            objG = v1kVar.g(list, mteVar);
            if (objG != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = mteVar.c;
            goeVar = mteVar.a;
            hm5.M(objG);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap3 = mteVar.b;
            goeVar = mteVar.a;
            hm5.M(objG);
        }
        Iterable iterable = (Iterable) objG;
        int iS = zno1.s(q7h.U(iterable, 10));
        linkedHashMap2 = new LinkedHashMap(iS >= 16 ? iS : 16);
        for (Object obj2 : iterable) {
            linkedHashMap2.put(((tom) obj2).a, obj2);
        }
        linkedHashMap = linkedHashMap3;
        return f(goeVar, linkedHashMap, linkedHashMap2);
        List list2 = (List) objG;
        int iS2 = zno1.s(q7h.U(list2, 10));
        if (iS2 < 16) {
            iS2 = 16;
        }
        linkedHashMap = new LinkedHashMap(iS2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            w4i1 w4i1Var = ((jwm) it.next()).a;
            linkedHashMap.put(w4i1Var.a, w4i1Var);
        }
        List listL1 = o7h.l1(linkedHashMap.values());
        if (z) {
            p2o0 p2o0Var = (p2o0) this.c;
            List list3 = goeVar.f;
            mteVar.a = goeVar;
            mteVar.b = linkedHashMap;
            mteVar.c = z;
            mteVar.f = 2;
            objG = p2o0Var.u(listL1, list3, mteVar);
            if (objG != obj) {
                linkedHashMap3 = linkedHashMap;
                Iterable iterable2 = (Iterable) objG;
                int iS3 = zno1.s(q7h.U(iterable2, 10));
                linkedHashMap2 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                while (r11.hasNext()) {
                    linkedHashMap2.put(((tom) obj2).a, obj2);
                }
                linkedHashMap = linkedHashMap3;
            }
            return obj;
        }
        linkedHashMap2 = b7x.a;
        return f(goeVar, linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public ArrayList g() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        dg8 dg8Var = (dg8) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) dg8Var.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new s0i((String) it.next(), (byte) 0));
        }
        return arrayList2;
    }

    public boolean i() {
        return ((dma1) this.b).h(q3l.a, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r12 == r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(p.onm r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aod.j(p.onm):java.lang.Object");
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        uv00 uv00Var = (uv00) this.c;
        return new o781(str, uv00Var.a(jo70.class, str).b, uv00Var.a(xkk1.class, str).b, uv00Var.a(iam.class, str).b, uv00Var.a(hll.class, str).b, uv00Var.a(w281.class, str).b, uv00Var.a(va81.class, str).b, uv00Var.a(cd8.class, str).b, uv00Var.a(c98.class, str).b, (n781) obj, (m781) obj2, (xwp0) obj3);
    }

    public /* synthetic */ aod(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public aod(u9c u9cVar, d7h d7hVar, Map map) {
        this.a = (byte) 16;
        this.b = d7hVar;
        this.c = map;
    }

    public aod(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = (byte) 5;
        this.b = i8h1Var;
        this.c = new fjl0(r6h1Var, (byte) 2);
    }

    public aod(String str) {
        this.a = (byte) 7;
        bpb1 bpb1VarB = gio1.b(str);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
    }

    public aod(i8h1 i8h1Var) {
        this.a = (byte) 6;
        this.b = i8h1Var;
        this.c = new g5l0(nik1.N2.a, (byte) 23);
    }

    public aod(ConstraintLayout constraintLayout, ViewStub viewStub, ConstraintLayout constraintLayout2, Barrier barrier) {
        this.a = (byte) 23;
        this.b = constraintLayout2;
        this.c = barrier;
    }

    public aod(iu30 iu30Var) {
        this.a = (byte) 24;
        this.b = iu30Var;
        this.c = new ConcurrentHashMap();
    }
}
