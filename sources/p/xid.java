package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.your_library.esperanto.proto.IsCuratedRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class xid implements Function, BiFunction, arg0, o4e1, zso0, dqr0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public xid(xid xidVar) {
        bfn0 bfn0Var;
        this.a = (byte) 7;
        this.b = new bfn0(0, new dfe[16]);
        this.c = new bfn0(0, new dfe[16]);
        if (xidVar == null || (bfn0Var = (bfn0) xidVar.b) == null) {
            return;
        }
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            dfe dfeVar = (dfe) objArr[i2];
            ((bfn0) this.b).b(new dfe(dfeVar.e, dfeVar.a, dfeVar.b, dfeVar.c, dfeVar.d));
        }
    }

    public static void r(xid xidVar, thl thlVar, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        xidVar.q(thlVar, f);
    }

    public Completable a(String[] strArr) {
        return ((z0c0) this.b).a(strArr).c(((x5h) this.c).a(strArr));
    }

    public Object apply(Object obj) {
        gn90 gn90Var;
        switch (this.a) {
            case 3:
                PlayerState playerState = (PlayerState) obj;
                lrd lrdVar = (lrd) this.b;
                Logger.b("[AA-RESUME] performResume contextUri=" + playerState.contextUri() + " isPlaying=" + playerState.isPlaying() + " isPaused=" + playerState.isPaused(), new Object[0]);
                t380 t380VarDisallowResumingReasons = playerState.restrictions().disallowResumingReasons();
                if (t380VarDisallowResumingReasons.size() != 1 || !t380VarDisallowResumingReasons.contains("not_paused")) {
                    return lrdVar.t((String) this.c, true).flatMap(new n4b((Object) lrdVar, (byte) 6)).ignoreElement();
                }
                Logger.b("[AA-RESUME] performResume short-circuit: not_paused; switching to local", new Object[0]);
                lrdVar.k.b().b((String) null);
                return CompletableEmpty.a;
            case 4:
                i iVar = (i) obj;
                yvd yvdVar = (yvd) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                yvdVar.getClass();
                if (iVar instanceof g) {
                    gn90Var = gn90.a;
                } else if (iVar instanceof e) {
                    gn90Var = gn90.b;
                } else {
                    if (!(iVar instanceof d)) {
                        eg.o();
                        return null;
                    }
                    gn90Var = gn90.c;
                }
                Collection collectionValues = yvdVar.e.values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (((x9a) obj2).a().contains(gn90Var)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = o7h.n0(arrayList2, isd.class).iterator();
                while (it.hasNext()) {
                    ((isd) it.next()).c(iVar, arrayList);
                }
                return CompletableEmpty.a;
            case 5:
                r7e r7eVar = (r7e) obj;
                rh90 rh90Var = r7eVar.d;
                String str = rh90Var.b;
                kfe kfeVar = r7eVar.e;
                gfe gfeVarI = wm5.I(kfeVar.name());
                mmq0 mmq0VarJ = wm5.J(str);
                if (mmq0VarJ != null) {
                    Observable observable = ((qnv0) this.b).d(new smq0[]{new smq0(gfeVarI, mmq0VarJ, false)}, 1, nik1.I2.a, false, (dg30) null).x(new v7e(kfeVar, false)).subscribeOn((Scheduler) this.c).onErrorReturnItem(new u7e(kfeVar, false, rh90Var)).toObservable();
                    observable.getClass();
                    return observable;
                }
                Observable observableJust = Observable.just(new u7e(kfeVar, false, rh90Var));
                observableJust.getClass();
                return observableJust;
            default:
                Map map = (Map) obj;
                u9c u9cVar = (u9c) this.c;
                d7h d7hVar = (d7h) this.b;
                List<String> list = d7hVar.b;
                ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                for (String str2 : list) {
                    String str3 = (String) map.get(str2);
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
                return mwm1Var.callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "IsCurated", hf90VarP.build()).map(m9x0.Z0).map(new aod(u9cVar, d7hVar, map));
        }
    }

    public Completable b(String[] strArr) {
        return ((z0c0) this.b).b(strArr).c(((x5h) this.c).b(strArr));
    }

    public void c(int i) {
        if (i == 3 || i == 2) {
            ((ohd) this.b).k(rgk.h, new llk(((bgk) this.c).f));
        }
    }

    public Object d(tka0 tka0Var, ArrayList arrayList) {
        nma0 m231Var;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsN = ((wdg) tka0Var).n();
        Object cqr0Var = concurrentHashMap.get(clsN);
        if (cqr0Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsN, (cqr0Var = new cqr0()))) != null) {
            cqr0Var = objPutIfAbsent;
        }
        cqr0 cqr0Var2 = (cqr0) cqr0Var;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new wma0((oma0) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = cqr0Var2.a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                m231Var = (nma0) ((vu30) this.b).invoke(tka0Var, arrayList);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            e331 e331Var = new e331(m231Var);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, e331Var);
            obj = objPutIfAbsent2 == null ? e331Var : objPutIfAbsent2;
        }
        return ((e331) obj).a;
    }

    public void e() {
        ((ohd) this.b).k(rgk.g, new llk(((bgk) this.c).f));
    }

    public void f(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-736045461);
        int i2 = (x340Var.g(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(nim0.a, 16.0f, 14.0f);
            CharSequence charSequence = (CharSequence) this.b;
            String str = (String) this.c;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (charSequence.length() == 0) {
                x340Var.i0(-1723773359);
                uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            } else {
                x340Var.i0(-1723577315);
                x340Var.r(false);
            }
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, j2iVar, i, (byte) 27);
        }
    }

    public void g(dfe dfeVar, int i, int i2, int i3, boolean z) {
        int i4;
        bfn0 bfn0Var = (bfn0) this.c;
        int i5 = bfn0Var.c;
        boolean z2 = true;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            bhn0.t("MutableVector is empty.");
            return;
        } else {
            dfe dfeVar2 = (dfe) bfn0Var.a[i5 - 1];
            i4 = dfeVar2.b - dfeVar2.d;
        }
        if (dfeVar == null) {
            int i6 = i - i4;
            dfeVar = new dfe(z, i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (!dfeVar.e && !z) {
                z2 = false;
            }
            dfeVar.e = z2;
            if (dfeVar.a > i) {
                dfeVar.a = i;
                dfeVar.c = i;
            }
            int i7 = dfeVar.b;
            if (i2 > i7) {
                int i8 = i7 - dfeVar.d;
                dfeVar.b = i2;
                dfeVar.d = i2 - i8;
            } else {
                i2 = i7;
            }
            dfeVar.b = i2 + i3;
        }
        bfn0Var.b(dfeVar);
    }

    public void h() {
        ((bfn0) this.b).g();
    }

    public Bundle i(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("mode", (String) this.b);
        bundle.putString("uri", str);
        bundle.putString("context_source", str2);
        if (str3 != null) {
            bundle.putString("provider", str3);
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable j(List list, List list2, onm onmVar) {
        wte wteVar;
        if (onmVar instanceof wte) {
            wteVar = (wte) onmVar;
            int i = wteVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wteVar.c = i - Integer.MIN_VALUE;
            } else {
                wteVar = new wte(this, onmVar);
            }
        } else {
            wteVar = new wte(this, onmVar);
        }
        Object objU = wteVar.a;
        int i2 = wteVar.c;
        if (i2 == 0) {
            hm5.M(objU);
            p2o0 p2o0Var = (p2o0) this.c;
            wteVar.c = 1;
            objU = p2o0Var.u(list2, list, wteVar);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objU) {
            if (((tom) obj).f instanceof lpl) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((tom) it.next());
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(qte qteVar, onm onmVar) {
        vte vteVar;
        List list;
        if (onmVar instanceof vte) {
            vteVar = (vte) onmVar;
            int i = vteVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vteVar.e = i - Integer.MIN_VALUE;
            } else {
                vteVar = new vte(this, onmVar);
            }
        } else {
            vteVar = new vte(this, onmVar);
        }
        Object objG = vteVar.c;
        int i2 = vteVar.e;
        Serializable serializable = d9n.a;
        if (i2 == 0) {
            hm5.M(objG);
            v1k v1kVar = (v1k) this.b;
            List list2 = qteVar.e;
            vteVar.a = qteVar;
            vteVar.e = 1;
            objG = v1kVar.g(list2, vteVar);
            if (objG != serializable) {
            }
            return serializable;
        }
        if (i2 == 1) {
            qteVar = vteVar.a;
            hm5.M(objG);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = vteVar.b;
            qteVar = vteVar.a;
            hm5.M(objG);
            list = list3;
        }
        return qte.a(qteVar, false, null, list, (List) objG, 15);
        List list4 = (List) objG;
        List list5 = qteVar.f;
        List list6 = list4;
        ArrayList arrayList = new ArrayList(q7h.U(list6, 10));
        Iterator it = list6.iterator();
        while (it.hasNext()) {
            arrayList.add(((jwm) it.next()).a);
        }
        vteVar.a = qteVar;
        vteVar.b = list4;
        vteVar.e = 2;
        Serializable serializableJ = j(list5, arrayList, vteVar);
        if (serializableJ != serializable) {
            list = list4;
            objG = serializableJ;
            return qte.a(qteVar, false, null, list, (List) objG, 15);
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(List list, onm onmVar) {
        xte xteVar;
        if (onmVar instanceof xte) {
            xteVar = (xte) onmVar;
            int i = xteVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xteVar.d = i - Integer.MIN_VALUE;
            } else {
                xteVar = new xte(this, onmVar);
            }
        } else {
            xteVar = new xte(this, onmVar);
        }
        Object objH = xteVar.b;
        int i2 = xteVar.d;
        Serializable serializable = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((tom) it.next()).c);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((w4i1) obj).a)) {
                    arrayList2.add(obj);
                }
            }
            v1k v1kVar = (v1k) this.b;
            xteVar.a = list;
            xteVar.d = 1;
            objH = v1kVar.h(arrayList2, xteVar);
            if (objH != serializable) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = xteVar.a;
            hm5.M(objH);
            return objH;
        }
        list = xteVar.a;
        hm5.M(objH);
        xteVar.a = null;
        xteVar.d = 2;
        Serializable serializableJ = j(list, (List) objH, xteVar);
        return serializableJ == serializable ? serializable : serializableJ;
    }

    public int m() {
        return ((bfn0) this.b).c;
    }

    public s171 n(llg llgVar, long j, boolean z, String str) {
        String strF;
        Context context = (Context) this.b;
        otx otxVar = null;
        Long lValueOf = llgVar != null ? Long.valueOf(llgVar.e - llgVar.d) : null;
        if (lValueOf != null) {
            strF = context.getString(2131960180, ((vr51) this.c).f(lValueOf.longValue()));
        } else {
            long jU = jfv.u(fdg1.l0(j, ngv.d), ngv.e);
            int i = (int) (jU / 3600);
            int i2 = ((int) (jU / 60)) - (i * 60);
            long j2 = jU % 60;
            String string = context.getString(2131963218, i > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Long.valueOf(j2)}, 2)));
            String string2 = ihc1.e1(str).toString();
            if (string2.length() <= 0) {
                string2 = null;
            }
            strF = string2 != null ? f4i1.f(string2, " · ", string) : context.getString(2131960181, string);
        }
        strF.getClass();
        if (lValueOf != null) {
            otxVar = otx.c;
        } else if (z) {
            otxVar = xtx.c;
        }
        return new s171(strF, otxVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(onm onmVar) {
        vbg vbgVar;
        if (onmVar instanceof vbg) {
            vbgVar = (vbg) onmVar;
            int i = vbgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vbgVar.c = i - Integer.MIN_VALUE;
            } else {
                vbgVar = new vbg(this, onmVar);
            }
        } else {
            vbgVar = new vbg(this, onmVar);
        }
        Object objI = vbgVar.a;
        int i2 = vbgVar.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objI);
            ybg ybgVar = (ybg) this.b;
            jge jgeVarE = hu20.e(ybgVar.a(), new b7c(lnmVar, (Object) ybgVar, (byte) 9));
            vbgVar.c = 1;
            objI = b5p1.i(jgeVarE, vbgVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return new ubg((lbg) objI, ((rf4) ((dg8) this.c).b).b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(onm onmVar) {
        wid widVar;
        if (onmVar instanceof wid) {
            widVar = (wid) onmVar;
            int i = widVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                widVar.c = i - Integer.MIN_VALUE;
            } else {
                widVar = new wid(this, onmVar);
            }
        } else {
            widVar = new wid(this, onmVar);
        }
        Object objL = widVar.a;
        int i2 = widVar.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = ((o241) this.b).a.map(v560.N0);
            widVar.c = 1;
            objL = fc11.l(map, 1, (Object) null, widVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return Boolean.valueOf(((bjd) this.c).a() && ((Boolean) objL).booleanValue());
    }

    public void q(thl thlVar, float f) {
        int i = thlVar.b;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = "end";
            } else if (i == 0) {
                str = "left";
            } else if (i == 1) {
                str = "right";
            }
        }
        yhc yhcVar = new yhc(new char[0]);
        yhcVar.n(gic.n(thlVar.a.toString()));
        yhcVar.n(gic.n(str));
        yhcVar.n(new cic(f));
        yhcVar.n(new cic(0.0f));
        ((eic) this.b).I((String) this.c, yhcVar);
    }

    public InputMethodManager s() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.c;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) ((View) this.b).getContext().getSystemService("input_method");
        this.c = inputMethodManager2;
        return inputMethodManager2;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                bfn0 bfn0Var = (bfn0) this.b;
                Object[] objArr = bfn0Var.a;
                int i = bfn0Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    dfe dfeVar = (dfe) objArr[i2];
                    int i3 = dfeVar.c;
                    int i4 = dfeVar.d;
                    int i5 = dfeVar.a;
                    int i6 = dfeVar.b;
                    StringBuilder sbQ = cy30.q(i3, i4, "(", ",", ")->(");
                    sbQ.append(i5);
                    sbQ.append(",");
                    sbQ.append(i6);
                    sbQ.append(")");
                    sb.append(sbQ.toString());
                    if (i2 < ((bfn0) this.b).c - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void t() {
    }

    public xid(u9c u9cVar, d7h d7hVar, YourLibraryContainsRequest yourLibraryContainsRequest) {
        this.a = (byte) 17;
        this.b = d7hVar;
        this.c = yourLibraryContainsRequest;
    }

    public xid(g0l g0lVar) {
        this.a = (byte) 27;
        this.b = g0lVar;
        this.c = p7h.M(new f0u[]{f0u.e, f0u.Y});
    }

    public xid(cir0 cir0Var) {
        this.a = (byte) 26;
        this.b = mno1.a(1, 2, 4);
        this.c = cir0Var.h().a(uj1.p, new wj1(this, (byte) 9));
    }

    public xid(i8h1 i8h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = i8h1Var;
                r6h1 r6h1Var = r6h1.c;
                this.c = new yok0((byte) 24);
                break;
            default:
                this.b = i8h1Var;
                this.c = new zok0((byte) 6);
                break;
        }
    }

    public /* synthetic */ xid(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public xid(int i, eic eicVar) {
        this.a = (byte) 29;
        this.b = eicVar;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = "end";
            } else if (i == 0) {
                str = "left";
            } else if (i == 1) {
                str = "right";
            }
        }
        this.c = str;
    }

    public xid(View view) {
        this.a = (byte) 22;
        this.b = view;
    }

    public xid(vu30 vu30Var) {
        this.a = (byte) 25;
        this.b = vu30Var;
        this.c = new ConcurrentHashMap();
    }

    public Object apply(Object obj, Object obj2) {
        return u9c.s((CollectionContainsResponse) obj2, u9c.u((YourLibraryContainsResponse) obj), (d7h) this.b, (YourLibraryContainsRequest) this.c);
    }
}
