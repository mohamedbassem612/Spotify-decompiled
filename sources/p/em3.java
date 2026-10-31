package p;

import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.ThirdPartyAppAttributionClientNonAuth;
import com.spotify.metadata.proto.Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class em3 implements Function, kvn0, SingleOnSubscribe, drd1, bdr0, nyc {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public em3(ko20 ko20Var, SparseArray sparseArray) {
        this.a = (byte) 3;
        this.b = ko20Var;
        SparseBooleanArray sparseBooleanArray = ko20Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iB = ko20Var.b(i);
            tz3 tz3Var = (tz3) sparseArray.get(iB);
            tz3Var.getClass();
            sparseArray2.append(iB, tz3Var);
        }
        this.c = sparseArray2;
    }

    public String A() {
        return (String) this.c;
    }

    public void a(String str, tv80 tv80Var, Bundle bundle) {
        lzn0 lzn0Var = (lzn0) this.b;
        if (tv80Var != null) {
            lzn0Var.a(str, tv80Var, bundle);
        } else if (bundle != null) {
            lzn0Var.g(bundle, str);
        } else {
            lzn0Var.h(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        byte b = 14;
        int i = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 1:
                Object obj2 = ((e331) obj).a;
                hu3 hu3Var = ((om3) this.b).d;
                gm3 gm3Var = (gm3) this.c;
                if (e331.a(obj2) == null) {
                    hu3Var.a(ysq0.c);
                    return new um3((wub1) obj2);
                }
                hu3Var.a(ysq0.b);
                return new tm3(gm3Var);
            case 4:
                z310 z310Var = (z310) obj;
                y310 y310Var = (y310) this.b;
                String str = (String) this.c;
                if (y310Var == null) {
                    if (!u890.j(str, "com.spotify.androidauto.home") && !u890.j(str, "com.spotify.browse")) {
                        return z310Var;
                    }
                    y310Var = new y310(Collections.singletonList(new p710(28, (Integer) null, "TAB", str, (String) null, (String) null)));
                }
                List list = z310Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (Object obj3 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    u310 u310Var = (u310) obj3;
                    y310 y310Var2 = u310Var.w;
                    ArrayList arrayListN0 = o7h.N0(y310Var2 != null ? y310Var2.a : Collections.singletonList(new p710(18, Integer.valueOf(i), "ITEM", (String) null, u310Var.a, (String) null)), y310Var.a);
                    y310 y310Var3 = new y310(arrayListN0);
                    int i3 = u310Var.G;
                    String str2 = u310Var.a;
                    if (i3 == 2) {
                        str2 = str2 + "?ubi=" + arrayListN0.hashCode();
                    }
                    arrayList.add(u310.b(u310Var, str2, null, null, 0, null, null, 0, y310Var3, null, null, null, null, -67108866, 15));
                    i = i2;
                }
                return z310.a(z310Var, arrayList, (f410) null, 14);
            case 5:
                return ((nba) ((b74) this.b)).d.b((List) obj, (String) this.c, b74.A);
            case 7:
                ys4 ys4Var = (ys4) this.b;
                if (!((th61) obj).b) {
                    return Flowable.I(new t0i0((PlayerState) null, (Integer) null, (ktl) null, (pgl1) null));
                }
                Flowable flowable = ys4Var.c;
                mr20 mr20Var = ys4Var.x;
                Flowable flowable2 = t3k1.n((pta1) ((x610) this.c).c().l.getValue()).toFlowable(BackpressureStrategy.b);
                jge jgeVarE = hu20.e(rqt0.u(new u70(mr20Var, (byte) 19)), new zr4((lnm) null, ys4Var, (byte) 4));
                o6x o6xVar = o6x.a;
                return Flowable.g(flowable, flowable2, yoi1.h(jgeVarE, o6xVar), yoi1.h(new ht20(hu20.e(rqt0.u(new c64(mr20Var, ys4Var, (byte) 4)), new zr4((lnm) null, ys4Var, (byte) 5)), new sd0(2, (lnm) null, (byte) 11)), o6xVar), new t4d1(ys4Var, (byte) 15)).x(vgp1.f).J(zp8.h);
            case 13:
                feh fehVar = (feh) obj;
                tc6 tc6Var = (tc6) this.b;
                if (!(fehVar instanceof ceh) && !tc6.e(fehVar)) {
                    return Single.just(fehVar);
                }
                Flowable flowable3 = tc6Var.d;
                return x0d.j(flowable3, flowable3).filter(new vdn1((String) this.c, (byte) 1)).firstOrError().map(new a42(fehVar, (byte) 23));
            case 15:
                return ((yr6) this.b).d((Metadata.Artist) obj, (String) this.c);
            case 16:
                String str3 = (String) obj;
                em3 em3Var = (em3) this.b;
                return ((sjj0) em3Var.b).b(str3).map(ns80.X).map(new zr6((Set) this.c)).flatMap(new ow3(em3Var, str3, b));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((Boolean) obj).booleanValue() ? c77.w((c77) this.b, (String) this.c) : CompletableEmpty.a;
            default:
                y87 y87Var = (y87) this.b;
                djo djoVar = y87Var.g;
                Observable observable = djoVar.c().toObservable();
                String strH = djoVar.h();
                rg7 rg7Var = y87Var.c;
                vc7 vc7Var = vc7.d;
                rg7Var.getClass();
                String strC = rg7.c(td6.q(3), strH);
                return observable.doOnSubscribe(new a21(rg7Var, strC, (byte) 12)).doOnNext(new qg7((Object) rg7Var, (Object) strC, (Object) vc7Var, (byte) (objArr == true ? 1 : 0))).switchMap(new ow3((s87) this.c, y87Var, (byte) 16));
        }
    }

    public cdr0 c(zob1 zob1Var, y2r0 y2r0Var) {
        u9p u9pVar = (u9p) ((n9p) this.c).a.c;
        l1o l1oVar = (l1o) u9pVar.D;
        Set setW = u9pVar.w();
        sjq0 sjq0VarR = u9pVar.r();
        i1o i1oVar = (i1o) u9pVar.C;
        lko lkoVar = (lko) i1oVar.c1.get();
        c8o.l(lkoVar);
        byu byuVar = (byu) i1oVar.r.get();
        c8o.l(byuVar);
        pyu pyuVar = (pyu) i1oVar.s.get();
        c8o.l(pyuVar);
        pix0 pix0Var = (pix0) i1oVar.t.get();
        c8o.l(pix0Var);
        peq peqVar = (peq) i1oVar.C.get();
        c8o.l(peqVar);
        qeq qeqVar = (qeq) i1oVar.D.get();
        c8o.l(qeqVar);
        sbq sbqVar = (sbq) i1oVar.G.get();
        c8o.l(sbqVar);
        return new em0(l1oVar, setW, sjq0VarR, lkoVar, byuVar, pyuVar, pix0Var, peqVar, qeqVar, sbqVar, u9pVar.p(), y2r0Var, zob1Var);
    }

    public Set d(y2r0 y2r0Var) {
        return dm61.y0(((sjq0) this.b).t0(y2r0Var), f46.S0(new yp21[]{new yp21(mdz.class), new yp21(bku.class), new yp21(w281.class)}));
    }

    public void e(oq70 oq70Var) {
        ni7 ni7Var = (ni7) this.c;
        ni7Var.m(new ki7(oq70Var != null ? b2p1.u(oq70Var, ((zy70) this.b).a, ni7Var.Q0) : null));
    }

    public void h(String str) {
        ((ks3) ((hs3) this.c)).d("back");
    }

    public void i() {
        synchronized (this) {
            try {
                nen0 nen0Var = (nen0) this.b;
                if (nen0Var != null) {
                    nen0Var.a();
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(int i) {
        return ((ko20) this.b).a.get(i);
    }

    public void k(jf01 jf01Var, IOException iOException) {
        Logger.d("Failed to call accounts for preflight authorization %s", new Object[]{iOException});
        ((SingleEmitter) this.b).onError(iOException);
    }

    public void l(far farVar) {
        synchronized (farVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new n38(this, farVar, (byte) 0));
        }
    }

    public tz3 m(int i) {
        tz3 tz3Var = (tz3) ((SparseArray) this.c).get(i);
        tz3Var.getClass();
        return tz3Var;
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        String str = (String) this.c;
        SingleEmitter singleEmitter = (SingleEmitter) this.b;
        if (ry21Var.R0) {
            String strC = ry21Var.f.c("location");
            if (strC == null) {
                strC = null;
            }
            singleEmitter.onSuccess(azo1.o(strC, str));
            return;
        }
        String str2 = "Unexpected response from accounts. Response code: " + ry21Var.d + ". Url: " + ry21Var.a.a;
        Logger.d(str2, new Object[0]);
        try {
            ry21Var.g.close();
        } catch (Throwable unused) {
        }
        singleEmitter.onSuccess(new dr8(nhz.Y, str2, str));
    }

    public Boolean o() {
        int[] appWidgetIds;
        AppWidgetManager appWidgetManager = (AppWidgetManager) this.c;
        boolean z = false;
        if (appWidgetManager != null && (appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName((Context) this.b, "com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider"))) != null) {
            if (!(appWidgetIds.length == 0)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public void p(String str, String str2, String str3) {
        t2j0 t2j0Var = (t2j0) this.b;
        pfe1 pfe1VarN = ThirdPartyAppAttributionClientNonAuth.n();
        jqt jqtVar = (jqt) this.c;
        pfe1VarN.q(jqtVar.b());
        pfe1VarN.u(jqtVar.a());
        pfe1VarN.t();
        pfe1VarN.r(str3);
        if (str.length() > 0) {
            pfe1VarN.s(str);
        }
        if (str2.length() > 0) {
            pfe1VarN.n(str2);
        }
        t2j0Var.a(pfe1VarN.build());
    }

    public tv80 q(int i, String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((bqk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("result", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, str2, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str), new mmr0("item_to_be_added", str2)})), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void r(String str, String str2) {
        p(str, str2, "send_branch_registration_event");
    }

    public tv80 s(sj1 sj1Var) {
        y6h1 y6h1Var = ((bqk0) this.c).b;
        ewo ewoVar = (ewo) this.b;
        boolean z = sj1Var instanceof yt80;
        b7x b7xVar = b7x.a;
        if (z) {
            i8h1 i8h1Var = (i8h1) ewoVar.get();
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("change_location", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            String str = ((yt80) sj1Var).i;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (sj1Var instanceof ku80) {
            i8h1 i8h1Var2 = (i8h1) ewoVar.get();
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", ((ku80) sj1Var).i), new mmr0("share_id", "share-artist-tour-page-id")})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (!(sj1Var instanceof zt80)) {
            if (!(sj1Var instanceof hu80)) {
                eg.o();
                return null;
            }
            i8h1 i8h1Var3 = (i8h1) ewoVar.get();
            String str2 = ((hu80) sj1Var).i;
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("promotion_row", (String) null, (Integer) null, str2, (String) null));
            x6h1VarC3.j = false;
            return i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        i8h1 i8h1Var4 = (i8h1) ewoVar.get();
        zt80 zt80Var = (zt80) sj1Var;
        String str3 = zt80Var.i;
        x6h1 x6h1VarC4 = y6h1Var.c();
        x6h1VarC4.i.add(new a7h1("empty_state_row", (String) null, (Integer) null, str3, (String) null));
        x6h1VarC4.j = true;
        x6h1 x6h1VarC5 = x6h1VarC4.a().c();
        x6h1VarC5.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC5.j = false;
        y6h1 y6h1VarA2 = x6h1VarC5.a();
        String str4 = zt80Var.i;
        return i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.b;
        c84 c84Var = new c84(singleEmitter, bluetoothAdapter);
        int profileConnectionState = bluetoothAdapter.getProfileConnectionState(22);
        if (profileConnectionState == 2 || profileConnectionState == 1) {
            bluetoothAdapter.getProfileProxy((Context) this.c, c84Var, 22);
        } else {
            singleEmitter.onSuccess(z6x.a);
        }
    }

    public ou80 t(int i, String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((bqk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("result", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, str, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
    }

    public void u(int i, String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((bqk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("result", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, str, (String) null));
        x6h1VarC2.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 v(int i, String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((bqk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("result", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, str, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public boolean w(o60 o60Var, Menu menu) {
        return ((ua91) this.b).O(o60Var, menu);
    }

    public void x(o60 o60Var) {
        ua91 ua91Var = (ua91) this.b;
        ((ActionMode.Callback) ua91Var.b).onDestroyActionMode(ua91Var.B(o60Var));
        yj5 yj5Var = (yj5) this.c;
        if (yj5Var.V0 != null) {
            yj5Var.Y.getDecorView().removeCallbacks(yj5Var.W0);
        }
        if (yj5Var.U0 != null) {
            oek1 oek1Var = yj5Var.X0;
            if (oek1Var != null) {
                oek1Var.c();
            }
            oek1 oek1VarC = b8k1.c(yj5Var.U0);
            oek1VarC.a(0.0f);
            yj5Var.X0 = oek1VarC;
            oek1VarC.f(new tj5(this, (byte) 2));
        }
        yj5Var.T0 = null;
        ViewGroup viewGroup = yj5Var.Z0;
        WeakHashMap weakHashMap = b8k1.a;
        viewGroup.requestApplyInsets();
        yj5Var.G();
    }

    public boolean y(o60 o60Var, Menu menu) {
        ViewGroup viewGroup = ((yj5) this.c).Z0;
        WeakHashMap weakHashMap = b8k1.a;
        viewGroup.requestApplyInsets();
        ua91 ua91Var = (ua91) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) ua91Var.b;
        y0d1 y0d1VarB = ua91Var.B(o60Var);
        jv81 jv81Var = (jv81) ua91Var.e;
        tti0 tti0Var = (Menu) jv81Var.get(menu);
        if (tti0Var == null) {
            tti0Var = new tti0((Context) ua91Var.c, (msi0) menu);
            jv81Var.put(menu, tti0Var);
        }
        return callback.onPrepareActionMode(y0d1VarB, tti0Var);
    }

    public ozn1 z() {
        return (ozn1) this.b;
    }

    public void b(oq70 oq70Var) {
    }

    public void f(oq70 oq70Var) {
    }

    public /* synthetic */ em3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public em3(b74 b74Var, y310 y310Var, String str) {
        this.a = (byte) 4;
        this.b = y310Var;
        this.c = str;
    }

    public em3(String str, ozn1 ozn1Var, ytw0 ytw0Var) {
        this.a = (byte) 9;
        this.c = str;
        this.b = ozn1Var;
    }

    public em3(ev6 ev6Var) {
        this.a = (byte) 18;
        this.b = ev6Var;
    }

    public em3(sjq0 sjq0Var, pyu pyuVar, n9p n9pVar) {
        this.a = (byte) 28;
        this.b = sjq0Var;
        this.c = n9pVar;
    }

    public em3(yj5 yj5Var, ua91 ua91Var) {
        this.a = (byte) 10;
        this.c = yj5Var;
        this.b = ua91Var;
    }
}
