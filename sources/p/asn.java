package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import app.p000rive.semantics.SemanticState;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class asn {
    public Object a;
    public Object b;
    public Object c;

    public asn(d0r d0rVar, vlo vloVar) {
        this.a = d0rVar;
        this.b = vloVar;
        this.c = w3p1.o(new l4r(new xv00(rc11.a.b(uio.class)), 1, kfo.b1, new j4r(kfo.d1), kfo.c1), kfo.e1);
    }

    public static boolean e(Context context, String str, jro jroVar) {
        jroVar.a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            hhg1.n("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(str);
        return context.bindService(intent, jroVar, 33);
    }

    public static String i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        ArrayList<String> arrayList = z6x.a;
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList2.addAll(arrayList);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public static boolean k(Context context, String str) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory("androidx.browser.customtabs.category.EphemeralBrowsing")) {
                return true;
            }
        }
        return false;
    }

    public void a(evb1 evb1Var, lvb1 lvb1Var, s0s s0sVar, mvb1 mvb1Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        String str = evb1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1942731149);
        int i2 = i | (x340Var.i(evb1Var) ? 4 : 2) | (x340Var.i(lvb1Var) ? 32 : 16) | (x340Var.i(s0sVar) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(mvb1Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(iu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = gio1.b(lvb1Var);
                x340Var.s0(objT);
            }
            wen0 wen0Var = (wen0) objT;
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            boolean zI = x340Var.i(wen0Var) | x340Var.i(lvb1Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new sqm(wen0Var, lvb1Var, (byte) 16);
                x340Var.s0(objT2);
            }
            qxd0.S((Function0) objT2, x340Var);
            boolean zG2 = x340Var.g(str) | x340Var.g(s0sVar) | x340Var.g(wen0Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new tso(s0sVar, wen0Var, mvb1Var, ven0VarS);
                x340Var.s0(objT3);
            }
            tso tsoVar = (tso) objT3;
            boolean zG3 = x340Var.g(str);
            Object objT4 = x340Var.T();
            if (zG3 || objT4 == m4cVar) {
                sso ssoVar = (sso) this.a;
                kvb1 kvb1Var = evb1Var.b;
                Class<?> cls = kvb1Var.getClass();
                ebr0 ebr0Var = (ebr0) ssoVar.a.get(cls);
                if (ebr0Var == null) {
                    k220.f("Unknown step parameters: ".concat(cls.getName()));
                    return;
                } else {
                    lzh lzhVar = new lzh(ebr0Var, kvb1Var);
                    x340Var.s0(lzhVar);
                    objT4 = lzhVar;
                }
            }
            lzh lzhVar2 = (lzh) objT4;
            x340Var.f0(1346166701, new jvb1(str));
            o7r0 o7r0Var = (o7r0) this.b;
            kly0 kly0Var = (kly0) this.c;
            g0i g0iVar = (g0i) x340Var.k(mce0.a);
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            kgu kguVarH = cir0Var.h();
            kgu kguVar = kguVarH instanceof kgu ? kguVarH : null;
            if (kguVar == null) {
                eg.m("Required value was null.");
                return;
            }
            zbr0 zbr0Var = kguVar.a;
            boolean zG4 = x340Var.g(g0iVar) | x340Var.g(cir0Var) | x340Var.g(zbr0Var) | x340Var.g(o7r0Var) | x340Var.g(kly0Var);
            Object objT5 = x340Var.T();
            if (zG4 || objT5 == m4cVar) {
                b6r0 b6r0Var = new b6r0(g0iVar, cir0Var.d(), o7r0Var, (fkk1) null, new x5q(zbr0Var, (byte) 3), (sbr0) null, (Function0) null, (n2r0) null, (Observable) null, (Observable) null, (dar0) null, (kvn0) null, new nda1(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), 16360);
                x340Var.s0(b6r0Var);
                objT5 = b6r0Var;
            }
            eqn1.h(grn1.w(lzhVar2, (b6r0) objT5, tsoVar, x340Var, 0), x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(this, evb1Var, lvb1Var, s0sVar, mvb1Var, iu30Var, i, (byte) 20);
        }
    }

    public void b(String str, cio cioVar, iu30 iu30Var, iu30 iu30Var2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        int i2;
        asn asnVar;
        zql0 zql0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-602349349);
        int i3 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(cioVar) ? 32 : 16) | (b0kVar3.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.i(iu30Var2) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar3.i(function0) ? 16384 : SemanticState.Multiline) | (b0kVar3.i(this) ? 131072 : 65536);
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new zql0();
                b0kVar3.s0(objT2);
            }
            zql0 zql0Var2 = (zql0) objT2;
            boolean zI = b0kVar3.i(this) | b0kVar3.i(zql0Var2);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new eum(this, zql0Var2, (lnm) null, (byte) 11);
                b0kVar3.s0(objT3);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT3);
            String strO0 = cwl1.o0(b0kVar3, 2131954754);
            String strO1 = cwl1.o0(b0kVar3, cioVar.a());
            String strO2 = cwl1.o0(b0kVar3, 2131954753);
            int i4 = i3 & 14;
            int i5 = i3 & 57344;
            boolean zI2 = ((i3 & 7168) == 2048) | b0kVar3.i(this) | b0kVar3.i(zql0Var2) | (i4 == 4) | b0kVar3.i(c9nVar) | (i5 == 16384);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                i2 = i4;
                dy7 dy7Var = new dy7((byte) 3, this, zql0Var2, str, c9nVar, function0, iu30Var2, false);
                asnVar = this;
                zql0Var = zql0Var2;
                b0kVar3.s0(dy7Var);
                objT4 = dy7Var;
            } else {
                i2 = i4;
                zql0Var = zql0Var2;
                asnVar = this;
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT4));
            String strO3 = cwl1.o0(b0kVar3, 2131954757);
            boolean zI3 = b0kVar3.i(asnVar) | b0kVar3.i(zql0Var) | (i2 == 4) | (i5 == 16384) | ((i3 & 896) == 256);
            Object objT5 = b0kVar3.T();
            if (zI3 || objT5 == m4cVar) {
                vt1 vt1Var = new vt1(asnVar, zql0Var, str, function0, iu30Var, (byte) 10);
                b0kVar3.s0(vt1Var);
                objT5 = vt1Var;
            }
            b0kVar2 = b0kVar3;
            mqo1.d(function0, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT5)), b0kVar2, ((i3 >> 12) & 14) | 2359296, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new eio(this, str, cioVar, iu30Var, iu30Var2, function0, i, (byte) 0);
        }
    }

    public void c(String str, cio cioVar, iu30 iu30Var, iu30 iu30Var2, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1564820155);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(cioVar) ? 32 : 16) | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(iu30Var2) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(function0) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            b(str, cioVar, iu30Var, iu30Var2, function0, x340Var, i2 & 524286);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eio(this, str, cioVar, iu30Var, iu30Var2, function0, i, (byte) 1);
        }
    }

    public w4b1 d() {
        koc0 koc0Var = ((bct) this.a).d;
        qs6 qs6Var = (qs6) ((g0q) this.b).a.Z7.get();
        c8o.l(qs6Var);
        return new w4b1(koc0Var, qs6Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(List list, lnm lnmVar) {
        ixn ixnVar;
        pls0 pls0Var;
        int i;
        if (lnmVar instanceof ixn) {
            ixnVar = (ixn) lnmVar;
            int i2 = ixnVar.c;
            if ((i2 & os00.INVALID_ID) != 0) {
                ixnVar.c = i2 - os00.INVALID_ID;
            } else {
                ixnVar = new ixn(this, lnmVar);
            }
        } else {
            ixnVar = new ixn(this, lnmVar);
        }
        Object objA = ixnVar.a;
        int i3 = ixnVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objA);
                qns0 qns0Var = (qns0) this.a;
                ixnVar.c = 1;
                objA = qns0Var.a("creator_page_permission", list, ixnVar, false);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            for (qfd qfdVar : (List) objA) {
                if (qfdVar.b || (i = qfdVar.c) == 4) {
                    pls0Var = nls0.a;
                } else {
                    boolean z = i == 3;
                    rh7 rh7Var = qfdVar.d;
                    pls0Var = new pls0(rh7Var != null ? rh7Var.a : 0, z);
                }
                bpb1 bpb1Var = (wen0) ((ConcurrentHashMap) this.b).get(qfdVar.a);
                if (bpb1Var != null) {
                    bpb1Var.m((Object) null, pls0Var);
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to check age assurance permissions for creator page", e2);
        }
        return rih1.a;
    }

    public n09 g(String str) {
        return new n09((Context) this.a, (xqg) this.b, (xqg) this.c, str);
    }

    public Single h(String str) {
        Single singleFlatMap = ((rh11) this.c).d().firstOrError().onErrorReturnItem(Boolean.FALSE).flatMap(new ham(this, str, (byte) 14));
        mfo mfoVar = mfo.b;
        return singleFlatMap.map(new uic((byte) 3));
    }

    public void j(atn atnVar) {
        y6h1 y6h1Var = ((w3l0) this.c).a;
        i8h1 i8h1Var = (i8h1) this.b;
        if (atnVar instanceof wsn) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            ((lzn0) this.a).e();
            return;
        }
        if (!(atnVar instanceof zsn)) {
            if ((atnVar instanceof ysn) || (atnVar instanceof xsn)) {
                return;
            }
            eg.o();
            return;
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("agent_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        x6h1VarC3.a();
        throw null;
    }

    public wzn l(hwb hwbVar, PendingIntent pendingIntent) {
        boolean zB0;
        qg70 qg70Var = (qg70) this.b;
        hro hroVar = new hro(hwbVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zB0 = ((og70) qg70Var).X0(hroVar, bundle);
            } else {
                zB0 = ((og70) qg70Var).B0(hroVar);
            }
            if (zB0) {
                return new wzn(qg70Var, hroVar, (ComponentName) this.c, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.TimeoutCancellationException */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object m(List list, onm onmVar) throws TimeoutCancellationException {
        ulo uloVar;
        String str;
        uio uioVar;
        if (onmVar instanceof ulo) {
            uloVar = (ulo) onmVar;
            int i = uloVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                uloVar.d = i - os00.INVALID_ID;
            } else {
                uloVar = new ulo(this, onmVar);
            }
        } else {
            uloVar = new ulo(this, onmVar);
        }
        Object objO = uloVar.b;
        int i2 = uloVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                if (list.isEmpty()) {
                    return new tlo();
                }
                String str2 = (String) o7h.q0(list);
                if (!((vlo) this.b).a(str2)) {
                    return new tlo();
                }
                clo cloVar = new clo(this, str2, (lnm) null, (byte) 1);
                uloVar.a = str2;
                uloVar.d = 1;
                objO = rc2.O(5000L, cloVar, uloVar);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
                str = str2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = uloVar.a;
                hm5.M(objO);
            }
            i1r i1rVar = (k1r) objO;
            if (i1rVar == null) {
                Logger.k("CurationTraitDestinationResolver", new Object[]{"Timed out resolving curation trait for " + str});
            }
            i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
            if (i1rVar2 != null && (uioVar = (uio) i1rVar2.a) != null) {
                rio rioVar = uioVar.b;
                List list2 = uioVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof pio) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((pio) it.next()).c, arrayList2);
                }
                Set setP1 = o7h.p1(arrayList2);
                xj61 xj61Var = new xj61();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof rio) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    xj61Var.add(((rio) it2.next()).c);
                }
                if (rioVar instanceof rio) {
                    xj61Var.add(rioVar.c);
                }
                return new tlo(setP1, rioVar instanceof rio ? rioVar.c : null, cwl1.j(xj61Var), uioVar);
            }
            return new tlo();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.k("CurationTraitDestinationResolver", new Object[]{"Failed to resolve curation trait destinations", e2});
            return new tlo();
        }
    }

    public /* synthetic */ asn(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public asn(b6e0 b6e0Var, lvc1 lvc1Var) {
        this.a = b6e0Var;
        this.b = lvc1Var;
        this.c = rqt0.u(new x010(new rgb(b6e0Var.h, (byte) 4), (plu) lvc1Var.d, new qno(this, (lnm) null, (byte) 0), (byte) 1));
    }
}
