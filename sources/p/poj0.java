package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDecorationErrorEvent;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class poj0 implements b0z0, Function, kxp0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;

    public poj0(l270 l270Var, l270 l270Var2, nfa0 nfa0Var) {
        this.a = (byte) 19;
        gzp0 gzp0Var = gzp0.a;
        this.b = nfa0Var;
        this.c = gzp0Var;
        this.d = ((yyp0) l270Var).c();
        this.e = ((yyp0) l270Var2).d(new nrj0(1, (byte) 24)).c();
    }

    public static int q(GroupMetadata groupMetadata, m9m m9mVar) {
        if (groupMetadata.r().isEmpty() || m9mVar == null || groupMetadata.p().isEmpty()) {
            return groupMetadata.getItemsCount();
        }
        Integer num = (Integer) groupMetadata.p().get(m9mVar.name().toLowerCase(Locale.ROOT));
        return num != null ? num.intValue() : groupMetadata.getItemsCount();
    }

    public static ArrayList t(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) ((zuc0) obj).g.get("children_group_id");
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static poj0 u(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625292, (ViewGroup) null, false);
        int i = 2131429583;
        IconVideo iconVideoT = m5n1.t(constraintLayoutInflate, 2131429583);
        if (iconVideoT != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i = 2131431591;
            ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutInflate, 2131431591);
            if (viewStub != null) {
                i = 2131431598;
                EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131431598);
                if (encoreTextViewT != null) {
                    return new poj0(constraintLayout, iconVideoT, constraintLayout, viewStub, encoreTextViewT);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static boolean w(Intent intent) {
        return intent.getBooleanExtra("forwarded_by_login_flow", false);
    }

    public static boolean y(Intent intent) {
        return intent.getBooleanExtra("resolved_from_short_link", false);
    }

    public static boolean z(Intent intent) {
        if (intent.getBooleanExtra("campfire_navigation", false)) {
            Set set = s4b1.f;
            String strN = uic.x(intent.getDataString()).n("si");
            if (strN != null && (!ihc1.y0(strN))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object A(String str, onm onmVar) {
        e3o0 e3o0Var;
        String str2;
        Context context = (Context) this.d;
        ut71 ut71Var = (ut71) this.b;
        dma1 dma1Var = (dma1) this.e;
        if (onmVar instanceof e3o0) {
            e3o0Var = (e3o0) onmVar;
            int i = e3o0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e3o0Var.d = i - Integer.MIN_VALUE;
            } else {
                e3o0Var = new e3o0(this, onmVar);
            }
        } else {
            e3o0Var = new e3o0(this, onmVar);
        }
        Object obj = e3o0Var.b;
        int i2 = e3o0Var.d;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (dma1Var.h(bma1.b.k("key_nearby_devices_permissions_app_scope_migration_complete"), false)) {
                return rih1Var;
            }
            jq jqVar = (jq) ((kly0) this.c).get();
            e3o0Var.a = str;
            e3o0Var.d = 1;
            Object objI = jqVar.i(e3o0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            obj = objI;
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = e3o0Var.a;
            hm5.M(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((ev) it.next()).a);
        }
        Iterator it2 = o7h.j0(o7h.O0(str2, arrayList)).iterator();
        if (!it2.hasNext()) {
            hhg1.k();
            return null;
        }
        dma1 dma1VarB = ut71Var.b(context, (String) it2.next());
        nbc nbcVar = bma1.b;
        l0o1.k(dma1VarB, nbcVar.n("key_tap_bt_permissions_count"), nbcVar.n("key_bt_permissions_sdk37_counter_reset"), nbcVar.n("key_bt_permissions_last_known_sdk_version"));
        int iL = dma1VarB.l(nbcVar.n("key_tap_bt_permissions_count"), 0);
        while (it2.hasNext()) {
            dma1 dma1VarB2 = ut71Var.b(context, (String) it2.next());
            nbc nbcVar2 = bma1.b;
            l0o1.k(dma1VarB2, nbcVar2.n("key_tap_bt_permissions_count"), nbcVar2.n("key_bt_permissions_sdk37_counter_reset"), nbcVar2.n("key_bt_permissions_last_known_sdk_version"));
            int iL2 = dma1VarB2.l(nbcVar2.n("key_tap_bt_permissions_count"), 0);
            if (iL < iL2) {
                iL = iL2;
            }
        }
        if (iL > 2) {
            iL = 2;
        }
        nbc nbcVar3 = bma1.b;
        int iMax = Math.max(dma1Var.l(nbcVar3.k("key_nearby_devices_permissions_count_app_scope"), 0), iL);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(nbcVar3.k("key_nearby_devices_permissions_count_app_scope"), iMax);
        bma1 bma1VarK = nbcVar3.k("key_nearby_devices_permissions_last_known_sdk_version_app_scope");
        int i3 = Build.VERSION.SDK_INT;
        hma1VarEdit.b(bma1VarK, i3);
        hma1VarEdit.a(nbcVar3.k("key_nearby_devices_permissions_sdk37_counter_reset_app_scope"), i3 == 37);
        hma1VarEdit.a(nbcVar3.k("key_nearby_devices_permissions_app_scope_migration_complete"), true);
        hma1VarEdit.g();
        return rih1Var;
    }

    public Map B(Map map, m9m m9mVar) {
        btr0 btr0Var;
        Map map2 = ((xr01) this.d).b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            atr0 atr0Var = (atr0) entry.getKey();
            GroupMetadata groupMetadata = (GroupMetadata) entry.getValue();
            List list = (map2 == null || (btr0Var = (btr0) map2.get(atr0Var)) == null) ? null : btr0Var.a;
            if (list == null) {
                list = z6x.a;
            }
            arrayList.add(new mmr0(atr0Var, new btr0(list, new yq01(atr0Var.b, q(groupMetadata, m9mVar)))));
        }
        return sqg0.T(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(String str, String str2, onm onmVar) {
        hzp0 hzp0Var;
        s1u s1uVar;
        if (onmVar instanceof hzp0) {
            hzp0Var = (hzp0) onmVar;
            int i = hzp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hzp0Var.c = i - Integer.MIN_VALUE;
            } else {
                hzp0Var = new hzp0(this, onmVar);
            }
        } else {
            hzp0Var = new hzp0(this, onmVar);
        }
        Object objD = hzp0Var.a;
        int i2 = hzp0Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            ne neVar = new ne((byte) 9);
            neVar.e0(str);
            ((t360) neVar.c).g("Accept", "application/json");
            ((t360) neVar.c).g("Content-Encoding", "identity");
            se11 se11Var = r8i0.e;
            neVar.L("POST", zov0.c(str2, bmq0.w("application/json")));
            jf01 jf01VarA = ((cxc) this.d).a(new ln21(neVar));
            hzp0Var.c = 1;
            objD = d1u.D(jf01VarA, hzp0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        ry21 ry21Var = (Closeable) objD;
        try {
            ry21 ry21Var2 = ry21Var;
            int i3 = ry21Var2.d;
            if (i3 == 200) {
                s1uVar = (s1u) ((nfa0) this.b).a(ry21Var2.g.f(), s1u.Companion.serializer());
            } else {
                s1uVar = null;
            }
            e1u e1uVar = new e1u(i3, s1uVar);
            u890.p(ry21Var, (Throwable) null);
            return e1uVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(ry21Var, th);
                throw th2;
            }
        }
    }

    public void D(int i, String str) {
        Logger.d(str, new Object[0]);
        t2j0 t2j0Var = (t2j0) this.e;
        wr01 wr01VarN = RecentsDecorationErrorEvent.n();
        wr01VarN.q(str);
        wr01VarN.r("parent_decorator");
        wr01VarN.n(eqq.j(i));
        t2j0Var.a(wr01VarN.build());
    }

    public mmr0 E(String str, opj0 opj0Var, kqj0 kqj0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        npj0 npj0Var = (npj0) linkedHashMap.get(str);
        if (npj0Var != null) {
            return new mmr0(npj0Var, Boolean.FALSE);
        }
        npj0 npj0Var2 = new npj0(str, opj0Var, kqj0Var);
        linkedHashMap.put(str, npj0Var2);
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((nqj0) obj).a.equals(str)) {
                arrayList.add(obj);
            }
        }
        ((LinkedHashMap) this.d).put(str, new a6e(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LinkedHashMap) this.e).put(((nqj0) it.next()).a(), str);
        }
        return new mmr0(npj0Var2, Boolean.TRUE);
    }

    public void F(boolean z) {
        zau0 zau0Var;
        smo1.p((llm) this.d, (CancellationException) null);
        r091 r091Var = (r091) this.c;
        this.c = null;
        if (r091Var == null) {
            return;
        }
        if (z && !((Boolean) r091Var.e.b.getValue()).booleanValue() && !((Boolean) r091Var.d.e.getValue()).booleanValue() && (zau0Var = ((rtm0) this.e).g) != null && ((Boolean) zau0Var.b.getValue()).booleanValue()) {
            r091Var.c();
        }
        r091Var.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G(onm onmVar) {
        cur0 cur0Var;
        if (onmVar instanceof cur0) {
            cur0Var = (cur0) onmVar;
            int i = cur0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cur0Var.c = i - Integer.MIN_VALUE;
            } else {
                cur0Var = new cur0(this, onmVar);
            }
        } else {
            cur0Var = new cur0(this, onmVar);
        }
        Object objX = cur0Var.a;
        int i2 = cur0Var.c;
        if (i2 == 0) {
            hm5.M(objX);
            ytp0 ytp0Var = (ytp0) this.d;
            cur0Var.c = 1;
            objX = ytp0Var.x(cur0Var);
            d9n d9nVar = d9n.a;
            if (objX == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objX);
        }
        return new c200(((uhm0) objX).a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object H(onm onmVar) {
        b1o0 b1o0Var;
        if (onmVar instanceof b1o0) {
            b1o0Var = (b1o0) onmVar;
            int i = b1o0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1o0Var.c = i - Integer.MIN_VALUE;
            } else {
                b1o0Var = new b1o0(this, onmVar);
            }
        } else {
            b1o0Var = new b1o0(this, onmVar);
        }
        Object objJ = b1o0Var.a;
        int i2 = b1o0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            if (Build.VERSION.SDK_INT < 31 || !((h84) this.b).b() || ((m1o0) this.e).a) {
                return Boolean.FALSE;
            }
            Activity activityA = ((e831) this.c).a();
            j1o0 j1o0Var = activityA != null ? (j1o0) ((ux70) this.d).invoke(activityA) : null;
            Single singleB = j1o0Var != null ? j1o0Var.b() : Single.just(Boolean.FALSE);
            b1o0Var.c = 1;
            objJ = fc11.j(singleB, b1o0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object I(String str, boolean z, ijk0 ijk0Var, tv80 tv80Var, onm onmVar) {
        cck0 cck0Var;
        z9k0 z9k0Var = (z9k0) this.e;
        if (onmVar instanceof cck0) {
            cck0Var = (cck0) onmVar;
            int i = cck0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cck0Var.c = i - Integer.MIN_VALUE;
            } else {
                cck0Var = new cck0(this, onmVar);
            }
        } else {
            cck0Var = new cck0(this, onmVar);
        }
        Object obj = cck0Var.a;
        int i2 = cck0Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (ijk0Var instanceof gjk0) {
                if (((gjk0) ijk0Var).a && z) {
                    h9k0 h9k0Var = (h9k0) this.d;
                    cck0Var.c = 1;
                    Object objC = h9k0Var.c(str, z8k0.a, tv80Var, cck0Var);
                    d9n d9nVar = d9n.a;
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        boolean z2 = ((c9c0) this.b).b.current().getValue() != null;
        l0l l0lVarC = ((g0l) this.c).c();
        boolean z3 = l0lVarC != null ? !l0lVarC.l() : false;
        if (z2) {
            z9k0.a(z9k0Var, x9k0.a);
            return rih1Var;
        }
        if (z3) {
            z9k0.a(z9k0Var, v9k0.a);
        }
        return rih1Var;
    }

    public void J(int i, String str, String str2) {
        String str3;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-gen-alpha-parental-control-my-allowlisting-requests-page";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        List listSingletonList = Collections.singletonList("parental-control/my-allowlisting-requests");
        x6h1 x6h1VarC = y6h1VarA.c();
        if (i == 1) {
            str3 = "failure";
        } else {
            if (i != 2) {
                throw null;
            }
            str3 = "success";
        }
        x6h1VarC.i.add(new a7h1("cancel_request_snackbar", (String) null, (Integer) null, str, str3));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = listSingletonList;
        ((i8h1) ((idd1) this.e).getValue()).f(k7h1Var.a(), (Set) null);
        ((kt91) this.c).k(new er91((fs91) null, str2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(v0u v0uVar, s1u s1uVar, onm onmVar) {
        izp0 izp0Var;
        l370 l370VarB;
        String str;
        r8i0 r8i0VarW;
        if (onmVar instanceof izp0) {
            izp0Var = (izp0) onmVar;
            int i = izp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                izp0Var.c = i - Integer.MIN_VALUE;
            } else {
                izp0Var = new izp0(this, onmVar);
            }
        } else {
            izp0Var = new izp0(this, onmVar);
        }
        Object objD = izp0Var.a;
        int i2 = izp0Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            String str2 = s1uVar.d;
            Map map = s1uVar.f;
            if (str2 != null) {
                try {
                    k370 k370Var = new k370();
                    k370Var.f((l370) null, str2);
                    l370VarB = k370Var.b();
                } catch (IllegalArgumentException unused) {
                    l370VarB = null;
                }
                if (l370VarB != null) {
                    Iterator it = map.entrySet().iterator();
                    boolean z = false;
                    Object obj = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (!z) {
                                break;
                            }
                            break;
                        }
                        Object next = it.next();
                        if (nhc1.S((String) ((Map.Entry) next).getKey(), "Content-Type", true)) {
                            if (!z) {
                                z = true;
                                obj = next;
                            }
                        }
                        obj = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null && (str = (String) entry.getValue()) != null) {
                        se11 se11Var = r8i0.e;
                        try {
                            r8i0VarW = bmq0.w(str);
                        } catch (IllegalArgumentException unused2) {
                            r8i0VarW = null;
                        }
                        if (r8i0VarW != null) {
                            try {
                                ne neVar = new ne((byte) 9);
                                neVar.a = l370VarB;
                                for (Map.Entry entry2 : map.entrySet()) {
                                    neVar.G((String) entry2.getKey(), (String) entry2.getValue());
                                }
                                neVar.L("PUT", new rn21(r8i0VarW, v0uVar.a));
                                jf01 jf01VarA = ((cxc) this.e).a(new ln21(neVar));
                                izp0Var.c = 1;
                                objD = d1u.D(jf01VarA, izp0Var);
                                d9n d9nVar = d9n.a;
                                if (objD == d9nVar) {
                                    return d9nVar;
                                }
                            } catch (IllegalArgumentException unused3) {
                            }
                        }
                    }
                }
            }
            return f1u.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objD);
        ry21 ry21Var = (Closeable) objD;
        try {
            g1u g1uVar = new g1u(ry21Var.d);
            u890.p(ry21Var, (Throwable) null);
            return g1uVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(ry21Var, th);
                throw th2;
            }
        }
    }

    public jgb1 a(f5y0 f5y0Var) {
        return l(f5y0Var, ((g58) this.e).c());
    }

    public Object apply(Object obj) {
        int i;
        Single singleOnErrorReturnItem;
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 16:
                String str = (String) obj;
                fip0 fip0Var = (fip0) obj4;
                String str2 = (String) this.c;
                lf81 lf81Var = (lf81) obj3;
                ioc0 ioc0Var = (ioc0) obj2;
                if (((q7j0) fip0Var.g).b(str2)) {
                    i = 2;
                } else if (q7j0.c(str2)) {
                    i = 1;
                } else {
                    Set set = s4b1.f;
                    if (uic.g(str2, blc0.u1)) {
                        i = 3;
                    } else if (uic.g(str2, blc0.g1)) {
                        i = 4;
                    } else {
                        i = uic.g(str2, blc0.ka) ? 5 : 6;
                    }
                }
                int iC = l1d.C(i);
                return ((iC == 0 || iC == 1) ? ioc0Var.a(str2, str) : Observable.just(j5.a)).distinctUntilChanged().switchMap(new mgc(fip0Var, str2, i, (byte) 24)).flatMapSingle(new b8p1(lf81Var, i, str2, str, (byte) 13));
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str3 = (String) this.c;
                r3q0 r3q0Var = (r3q0) obj4;
                if (!zBooleanValue) {
                    return Single.just(Boolean.FALSE);
                }
                o3q0 o3q0Var = r3q0Var.b;
                String str4 = (String) obj3;
                Uri uri = (Uri) obj2;
                String str5 = null;
                if (uri == null) {
                    Pattern pattern = c6y.a;
                } else {
                    String[] strArrSplit = c6y.a.split(uri.toString());
                    if (strArrSplit.length > 1) {
                        str5 = strArrSplit[1];
                    }
                }
                if (str5 == null) {
                    singleOnErrorReturnItem = Single.just(Boolean.FALSE);
                    singleOnErrorReturnItem.getClass();
                } else {
                    singleOnErrorReturnItem = o3q0Var.a.a(str3, str4, str5).x(Boolean.TRUE).onErrorReturnItem(Boolean.FALSE);
                    singleOnErrorReturnItem.getClass();
                }
                return singleOnErrorReturnItem.flatMap(new rok0(r3q0Var, str3, (byte) 24)).observeOn(r3q0Var.e);
        }
    }

    public jgb1 b(f5y0 f5y0Var) {
        return l(f5y0Var, ((g58) this.e).e());
    }

    public void c(qim0 qim0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        y5p0 y5p0Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-762078219);
        int i2 = (b0kVar2.i(qim0Var) ? 4 : 2) | i | (b0kVar2.i(this) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            hfu0 hfu0Var = (hfu0) rwq.h(((b6p0) this.b).e, b0kVar2, 0).getValue();
            if (hfu0Var == null) {
                h311VarV = b0kVar2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    y5p0Var = new y5p0(this, qim0Var, i, (byte) 1);
                }
            } else {
                Object objT = b0kVar2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    m6p0 m6p0Var = new m6p0((umf0) ((mre0) this.e).b);
                    b0kVar2.s0(m6p0Var);
                    objT = m6p0Var;
                }
                m6p0 m6p0Var2 = (m6p0) objT;
                boolean zG = b0kVar2.g(hfu0Var);
                Object objT2 = b0kVar2.T();
                if (zG || objT2 == m4cVar) {
                    drj0 drj0Var = (drj0) this.c;
                    objT2 = rqt0.u(new lt20(new qsc0((mr20) drj0Var.c, drj0Var, hfu0Var, (byte) 15), new i440(3, null, (byte) 18), (byte) 0));
                    b0kVar2.s0(objT2);
                }
                ven0 ven0VarG = rwq.g((mr20) objT2, zkt0.c, (o8n) null, b0kVar2, 48, 2);
                String str = hfu0Var.a;
                boolean zI = b0kVar2.i(this) | b0kVar2.g(hfu0Var);
                Object objT3 = b0kVar2.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new j9n0(this, hfu0Var, (byte) 23);
                    b0kVar2.s0(objT3);
                }
                qxd0.i(str, (iu30) objT3, b0kVar2);
                qim0 qim0VarN = anm1.N("assisted_curation_now_playing_reference", qim0Var);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                otw.c(m6p0Var2, new l6p0(hfu0Var.a, hfu0Var.b, hfu0Var.c, hfu0Var.d, (zkt0) ven0VarG.getValue()), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                b0kVar2 = b0kVar2;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                rqo1.g(0, 0, b0kVar2, uyn1.B(qim0VarB, 0.0f, 0.0f, 0.0f, 8.0f, 7));
                b0kVar2.r(true);
            }
            h311VarV.d = y5p0Var;
        }
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            y5p0Var = new y5p0(this, qim0Var, i, (byte) 0);
            h311VarV.d = y5p0Var;
        }
    }

    public void d(xeq0 xeq0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        String str = xeq0Var.e;
        ept eptVar = xeq0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-509499412);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xeq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                ((coq) this.b).getClass();
                objT = new idq0(iu30Var);
                x340Var.s0(objT);
            }
            idq0 idq0Var = (idq0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                ((doq) this.c).getClass();
                objT2 = new rbq0(iu30Var);
                x340Var.s0(objT2);
            }
            rbq0 rbq0Var = (rbq0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                ((eoq) this.d).getClass();
                objT3 = new bgq0(iu30Var);
                x340Var.s0(objT3);
            }
            bgq0 bgq0Var = (bgq0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                ((foq) this.e).getClass();
                objT4 = new pbq0(iu30Var);
                x340Var.s0(objT4);
            }
            pbq0 pbq0Var = (pbq0) objT4;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = voo1.y(u291.d(qim0Var3, 1.0f), voo1.g);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 16.0f, 0.0f, 16.0f, 20.0f, 2);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, 2131961102), qim0VarB, cbx.d(x340Var).h, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1696);
            rqo1.g(0, 1, x340Var, (qim0) null);
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, ab80.o(qim0Var3, 20.0f, x340Var, qim0Var3, 1.0f));
            String strO0 = eptVar != null ? eptVar.a : null;
            if (strO0 == null) {
                x340Var.i0(-921111677);
                x340Var.r(false);
                strO0 = null;
            } else {
                x340Var.i0(-921111676);
                if (strO0.length() == 0) {
                    strO0 = cwl1.o0(x340Var, 2131961092);
                }
                x340Var.r(false);
            }
            if (strO0 == null) {
                strO0 = x0d.k(x340Var, 2048500308, 2131961092, x340Var, false);
            } else {
                x340Var.i0(2048496154);
                x340Var.r(false);
            }
            uwo1.e(cwl1.n0(2131961100, new Object[]{strO0}, x340Var), qim0VarZ, cbx.d(x340Var).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            uwo1.e(cwl1.o0(x340Var, 2131961091), ab80.o(qim0Var3, 8.0f, x340Var, qim0Var3, 1.0f), cbx.d(x340Var).g, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            op71.g(x340Var, u291.h(qim0Var3, 20.0f));
            wnb0 wnb0Var = new wnb0(1.0f, true);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, 88.0f, 7);
            boolean zI = x340Var.i(xeq0Var) | x340Var.i(idq0Var);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new ozp0(xeq0Var, idq0Var, (byte) 8);
                x340Var.s0(objT5);
            }
            ujo1.d(wnb0Var, (xtb0) null, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, x340Var, 0, 506);
            x340Var = x340Var;
            x340Var.r(true);
            w2g0.b(x340Var, 6);
            qim0 qim0VarF = dug.f(uyn1.B(h2c.a.a(qim0Var3, een.X), 0.0f, 0.0f, 0.0f, 40.0f, 7), cbx.a(x340Var).a.c, er31.a);
            rih1 rih1Var = rih1.a;
            otw.c(rbq0Var, rih1Var, qim0VarF, (ipb1) null, x340Var, 48, 8);
            x340Var.r(true);
            if (str == null || eptVar == null) {
                x340Var.i0(-79199914);
                x340Var.r(false);
            } else {
                x340Var.i0(-79435359);
                otw.c(bgq0Var, new agq0(str, eptVar), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
            if (xeq0Var.g) {
                x340Var.i0(-79159893);
                otw.c(pbq0Var, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-79087818);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, xeq0Var, iu30Var, qim0Var2, (byte) 19);
        }
    }

    public jgb1 e(f5y0 f5y0Var) {
        kdy0 kdy0Var = ((g58) this.e).c;
        mzy0 mzy0Var = mzy0.d;
        return l(f5y0Var, kdy0.d(kdy0Var, mzy0Var, mzy0Var, false, 16));
    }

    public jgb1 f(f5y0 f5y0Var) {
        return l(f5y0Var, kdy0.d(((g58) this.e).c, mzy0.d, mzy0.e, false, 28));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object g(onm onmVar) {
        cvr0 cvr0Var;
        if (onmVar instanceof cvr0) {
            cvr0Var = (cvr0) onmVar;
            int i = cvr0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvr0Var.c = i - Integer.MIN_VALUE;
            } else {
                cvr0Var = new cvr0(this, onmVar);
            }
        } else {
            cvr0Var = new cvr0(this, onmVar);
        }
        cvr0 cvr0Var2 = cvr0Var;
        Object objA = cvr0Var2.a;
        int i2 = cvr0Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                gza0 gza0Var = (gza0) this.c;
                rmc1 rmc1Var = (rmc1) this.d;
                String str = rmc1Var.a;
                String str2 = rmc1Var.b;
                String str3 = rmc1Var.c;
                dxr0 dxr0Var = rmc1Var.d;
                String str4 = rmc1Var.f;
                cvr0Var2.c = 1;
                objA = gza0Var.a(str, str2, str3, dxr0Var, str4, cvr0Var2);
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
            return new kvr0((String) objA);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return jvr0.a;
        }
    }

    public jgb1 h(f5y0 f5y0Var) {
        return l(f5y0Var, ((g58) this.e).d());
    }

    public jgb1 i(f5y0 f5y0Var) {
        return l(f5y0Var, ((g58) this.e).f());
    }

    public jgb1 j(f5y0 f5y0Var) {
        kdy0 kdy0Var = ((g58) this.e).c;
        mzy0 mzy0Var = mzy0.d;
        return l(f5y0Var, kdy0.d(kdy0Var, mzy0Var, mzy0Var, false, 4));
    }

    public a6e k(String str) {
        return (a6e) ((LinkedHashMap) this.d).get(str);
    }

    public jgb1 l(mr20 mr20Var, pux0 pux0Var) {
        c0g.x.getClass();
        return new jgb1("meteredAudioStreamQuality", 2131961894, (String) null, 2131961889, (sp00) null, (Integer) null, (a2i) null, mr20Var, pbo1.N0, jmo1.e(new mr20[]{((lag) this.c).h(), (mr20) ((idd1) ((jmq) this.d).c).getValue()}), new xxm0((List) pux0Var.b, (Map) pux0Var.c, new oxm0(3), new sxm0(v6n.a, eej0.O0), (mxm0) null, 16), sqg0.J(new mmr0[]{new mmr0("losslessCellularWarning", new ooj0(this, (byte) 0)), new mmr0("internalQualityCellularWarning", new ooj0(this, (byte) 1))}), 4026);
    }

    public jgb1 m(f5y0 f5y0Var) {
        return l(f5y0Var, ((g58) this.e).b());
    }

    public npj0 n(String str) {
        return (npj0) ((LinkedHashMap) this.c).get(str);
    }

    public List o() {
        return sqg0.S((LinkedHashMap) this.d);
    }

    public beg p(heg hegVar, List list) {
        return (beg) ((qoe0) this.e).invoke(new dgo0(hegVar, list));
    }

    public Observable r(Resources resources) {
        Flowable flowableH = Flowable.h((Flowable) this.d, ((x610) this.b).a.a, new x8a0(this, resources, (byte) 23));
        flowableH.getClass();
        return new ObservableFromPublisher(flowableH).observeOn((Scheduler) this.c);
    }

    public kvp0 s() {
        return (kvp0) this.b;
    }

    public boolean v(String str, Intent intent) {
        String strN;
        if (!((h0y) this.d).c(intent)) {
            String dataString = intent.getDataString();
            if (dataString != null && dataString.length() != 0 && "android.intent.action.VIEW".equals(intent.getAction())) {
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                String dataString2 = intent.getDataString();
                if (dataString2 != null) {
                    if (str == null) {
                        str = ((xap) this.c).e(intent);
                    }
                    if (!((uz71) this.b).f(dataString2) && (!intent.hasExtra("short_link") || !intent.hasExtra("shortlink_source") || !s4b1VarX.t())) {
                        if (intent.getExtras() != null) {
                            a690 parcelableExtra = intent.getParcelableExtra("FeatureIdentifier.InternalReferrer");
                            if (parcelableExtra == null) {
                                String stringExtra = intent.getStringExtra("FeatureIdentifier.InternalReferrer.Persistable");
                                parcelableExtra = stringExtra != null ? new a690(new gn10(stringExtra)) : null;
                            }
                            boolean z = parcelableExtra != null;
                            boolean zHasExtra = intent.hasExtra("extra_interaction_id");
                            boolean z2 = intent.getCategories() != null && (intent.getCategories().contains("android.intent.category.LAUNCHER") || intent.getCategories().contains("android.intent.category.INFO"));
                            if (((s4b1VarX.v() || (!intent.hasExtra("is_internal_navigation") && !nhc1.Y(dataString2, "spotify:internal:", false))) && !z && !zHasExtra && !z2) || ((strN = uic.x(intent.getDataString()).n("si")) != null && (!ihc1.y0(strN)))) {
                            }
                        }
                        Uri uri = s4b1VarX.a;
                        String queryParameter = uri != null ? uri.getQueryParameter("utm_campaign") : null;
                        if (queryParameter == null || queryParameter.length() == 0) {
                            String queryParameter2 = uri != null ? uri.getQueryParameter("utm_source") : null;
                            if (queryParameter2 == null || queryParameter2.length() == 0) {
                                String queryParameter3 = uri != null ? uri.getQueryParameter("utm_medium") : null;
                                if (queryParameter3 == null || queryParameter3.length() == 0) {
                                    String str2 = s4b1VarX.b;
                                    if (!(str2 == null || str2.length() == 0) || s4b1VarX.v() || s4b1VarX.t() || (str != null && !ihc1.y0(str))) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    eg.m("Required value was null.");
                }
            }
            return false;
        }
        return true;
    }

    public boolean x(Intent intent) {
        Bundle extras;
        return u890.j(((xap) this.c).c(), ((Context) this.e).getPackageName()) || ((extras = intent.getExtras()) != null && extras.getBoolean("extra_internal_injected")) || intent.getBooleanExtra("is_internal_navigation", false);
    }

    public poj0(ArrayList arrayList) {
        this.a = (byte) 1;
        this.b = o7h.j0(arrayList);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    public poj0(Context context, ut71 ut71Var, kly0 kly0Var) {
        this.a = (byte) 12;
        this.b = ut71Var;
        this.c = kly0Var;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = ut71Var.c(applicationContext);
    }

    public poj0(kly0 kly0Var, ced0 ced0Var) {
        this.a = (byte) 5;
        this.b = kly0Var;
        this.c = ced0Var;
        this.d = new idd1(new jcn0(this, (byte) 0));
        this.e = new idd1(new jcn0(this, (byte) 1));
    }

    public poj0(Resources resources, kt91 kt91Var, bsp bspVar) {
        this.a = (byte) 8;
        this.b = resources;
        this.c = kt91Var;
        this.d = bspVar;
        this.e = new idd1(new zem0(this, (byte) 24));
    }

    public poj0(b7n b7nVar, lag lagVar, jmq jmqVar, q3c q3cVar, g58 g58Var) {
        this.a = (byte) 0;
        this.b = b7nVar;
        this.c = lagVar;
        this.d = jmqVar;
        this.e = g58Var;
    }

    public poj0(Context context, xs80 xs80Var) {
        this.a = (byte) 18;
        this.b = context;
        this.c = xs80Var;
        this.d = new idd1(new lxp0(this, (byte) 0));
        this.e = new idd1(new lxp0(this, (byte) 1));
    }

    public poj0(ywp ywpVar, h7l0 h7l0Var) {
        this.a = (byte) 26;
        this.b = ywpVar;
        this.c = h7l0Var;
        this.d = new idd1(new ksr0(this, (byte) 1));
        this.e = new idd1(new ksr0(this, (byte) 0));
    }

    public poj0(s1c1 s1c1Var, zim0 zim0Var) {
        this.a = (byte) 13;
        this.b = s1c1Var;
        this.c = zim0Var;
        voe0 voe0Var = (voe0) s1c1Var;
        this.d = voe0Var.a(new cgo0(this, (byte) 0));
        this.e = voe0Var.a(new cgo0(this, (byte) 1));
    }

    public poj0(ConstraintLayout constraintLayout, IconVideo iconVideo, ConstraintLayout constraintLayout2, ViewStub viewStub, EncoreTextView encoreTextView) {
        this.a = (byte) 6;
        this.b = iconVideo;
        this.c = constraintLayout2;
        this.d = viewStub;
        this.e = encoreTextView;
    }

    public poj0(c9c0 c9c0Var, g0l g0lVar, h9k0 h9k0Var, b9q b9qVar) {
        this.a = (byte) 2;
        this.b = c9c0Var;
        this.c = g0lVar;
        this.d = h9k0Var;
        this.e = b9qVar.a(r6h1.c);
    }

    public /* synthetic */ poj0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public poj0(rtm0 rtm0Var, jtm0 jtm0Var, r091 r091Var) {
        this.a = (byte) 3;
        this.e = rtm0Var;
        this.b = jtm0Var;
        this.c = r091Var;
        this.d = smo1.e(flo1.l(guo1.B(), rtm0Var.b));
    }

    public poj0(bg11 bg11Var, rok0 rok0Var, drj0 drj0Var, bnj0 bnj0Var) {
        b380 b380VarP;
        this.a = (byte) 9;
        if (bg11Var != null) {
            b380VarP = b380.p(bg11Var);
        } else {
            w280 w280Var = b380.b;
            b380VarP = bg11.e;
        }
        this.b = b380VarP;
        this.c = rok0Var;
        this.d = drj0Var;
        this.e = bnj0Var;
    }
}
