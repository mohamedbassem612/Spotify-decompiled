package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.spotify.ads.esperanto.proto.SubInStreamRequest;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dh30 implements Function, lw40, h5a, l381, HttpConnectionFactory, e670, czh1, djy0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public dh30(th30 th30Var) {
        this.a = (byte) 0;
        this.b = th30Var;
        this.c = new CopyOnWriteArrayList();
    }

    public void A(zf30 zf30Var, boolean z) {
        th30 th30Var = (th30) this.b;
        Context context = th30Var.x.e;
        zf30 zf30Var2 = th30Var.z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.A(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void B(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.B(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void C(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.C(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.k(zf30Var);
            }
        }
    }

    public void D(zf30 zf30Var, Bundle bundle, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.D(zf30Var, bundle, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void E(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.E(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.l(zf30Var);
            }
        }
    }

    public void F(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.F(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.m(zf30Var);
            }
        }
    }

    public void G(zf30 zf30Var, View view, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.G(zf30Var, view, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void H(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.H(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(sdh sdhVar, onm onmVar) {
        pq80 pq80Var;
        m231 m231Var;
        String str;
        if (onmVar instanceof pq80) {
            pq80Var = (pq80) onmVar;
            int i = pq80Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq80Var.d = i - Integer.MIN_VALUE;
            } else {
                pq80Var = new pq80(this, onmVar);
            }
        } else {
            pq80Var = new pq80(this, onmVar);
        }
        Object obj = pq80Var.b;
        int i2 = pq80Var.d;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                tjq tjqVar = (tjq) this.b;
                pq80Var.a = sdhVar;
                pq80Var.d = 1;
                Object objO = tjqVar.o(sdhVar, pq80Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sdhVar = pq80Var.a;
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            ae5 ae5Var = (ae5) this.c;
            if (sdhVar instanceof ldh) {
                str = "play";
            } else if (sdhVar instanceof ndh) {
                str = "resume";
            } else if (sdhVar instanceof kdh) {
                str = "pause";
            } else if (sdhVar instanceof odh) {
                str = "shuffle_play";
            } else if (sdhVar instanceof pdh) {
                str = "skip_ahead_to";
            } else {
                if (!(sdhVar instanceof qdh)) {
                    eg.o();
                    return null;
                }
                str = "toggle_shuffle";
            }
            ou80 ou80Var = sdhVar.b().a;
            String strS = nmn1.s(thA);
            t2j0 t2j0Var = ae5Var.a;
            t210 t210VarN = ExternalAccessoryRemoteError.n();
            t210VarN.n(str);
            t210VarN.r();
            t210VarN.q(strS);
            String str2 = ou80Var.a;
            if (str2 != null) {
                t210VarN.s(str2);
            }
            t2j0Var.a(t210VarN.build());
        }
        return m231Var2;
    }

    public void J(rz40 rz40Var, int i) {
        new ArrayList();
        rp5 rp5Var = (rp5) this.b;
        String[] strArr = s110.a;
        wq8 wq8Var = new wq8("805f2916c4d64f3cb684aa991527168e", 2, "https://oauth-redirect.googleusercontent.com/r/account-linking-65ff0", (xig) null, (String) null, f46.Q0(strArr), false, 3920);
        Context context = rp5Var.a;
        Intent intentAddCategory = new Intent(context, (Class<?>) AuthorizationActivity.class).setAction("com.spotify.appauthorization.sso.action.ACTIVITY").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT");
        intentAddCategory.putExtra("VERSION", "google-assistant-v1");
        n9x0.b(intentAddCategory, wq8Var);
        PendingIntent activity = PendingIntent.getActivity(context, i, intentAddCategory, 201326592);
        List listQ0 = f46.Q0(strArr);
        zod.j("serviceId cannot be null or empty", !TextUtils.isEmpty("SPOTIFY"));
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = new SaveAccountLinkingTokenRequest(activity, "auth_code", "SPOTIFY", listQ0, (String) null);
        aan1 aan1Var = (aan1) this.c;
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.e);
        String str = aan1Var.l;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.a;
        zod.j("Consent PendingIntent cannot be null", pendingIntent != null);
        String str2 = saveAccountLinkingTokenRequest.b;
        zod.j("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.c;
        zod.j("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        List list = saveAccountLinkingTokenRequest.d;
        zod.j("scopes cannot be null", list != null);
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, list, str);
        asd1 asd1VarB = asd1.b();
        asd1VarB.a = new pl10[]{eth.g};
        asd1VarB.d = new ltf1(aan1Var, saveAccountLinkingTokenRequest2);
        asd1VarB.b = false;
        asd1VarB.c = (char) 1535;
        aan1Var.e(0, asd1VarB.a()).n(new sw9((Object) rz40Var, i, (byte) 10));
    }

    public void K(uap1 uap1Var, boolean z) {
        ((CopyOnWriteArrayList) this.c).add(new ch30(uap1Var, z));
    }

    public void L(String str) {
        this.c = str;
        TextView textView = (TextView) this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void M(uap1 uap1Var) {
        synchronized (((CopyOnWriteArrayList) this.c)) {
            int size = ((CopyOnWriteArrayList) this.c).size();
            for (int i = 0; i < size; i++) {
                if (((ch30) ((CopyOnWriteArrayList) this.c).get(i)).a == uap1Var) {
                    ((CopyOnWriteArrayList) this.c).remove(i);
                    break;
                }
            }
        }
    }

    public String a() {
        return ((g71) this.b).a();
    }

    public Object apply(Object obj) {
        jhm jhmVarL;
        switch (this.a) {
            case 2:
                kk3 kk3Var = (kk3) obj;
                wp20 wp20Var = (wp20) this.b;
                qm30 qm30Var = (qm30) this.c;
                String str = (String) wp20Var.a;
                String str2 = qm30Var.a;
                String str3 = qm30Var.c;
                String str4 = qm30Var.b;
                igm igmVar = new igm(str2, new wfm(Uri.parse(qm30Var.e), ggm.c), f0o1.t(p7h.M(new String[]{str4, qm30Var.d})));
                smc0 smc0VarN = k4p1.n();
                ib3 ib3VarA = ((tsf1) wp20Var.b).a(str, new lik1(str));
                lik1 lik1Var = (lik1) ib3VarA.I;
                String str5 = (String) ib3VarA.u;
                zwg zwgVarA = ((y4q) wp20Var.c).a(new lik1(str));
                if (!qm30Var.f && (jhmVarL = zwgVarA.l(str, str, kk3Var)) != null) {
                    smc0VarN.add(jhmVarL);
                }
                smc0VarN.add(((kr60) ib3VarA.n).e(lik1Var, str5, str, true));
                smc0VarN.add(ib3VarA.e((String) wp20Var.a, (String) null, qm30Var.g, true, false));
                if (!ihc1.y0(str3)) {
                    smc0VarN.add(((i6c) ib3VarA.l).a(str3, str4));
                }
                smc0VarN.add(((f971) ib3VarA.a).a(str5, z6x.a, str));
                smc0VarN.add(((yje) ib3VarA.p).a(str5));
                if (((pm30) wp20Var.e).a) {
                    smc0VarN.add(jl21.b((jl21) ib3VarA.b, str5, lik1Var));
                }
                if (j9k1.w(str)) {
                    smc0VarN.add(((oh41) ib3VarA.e).a(str5));
                }
                return new kjm(igmVar, (List) k4p1.k(smc0VarN), 4);
            case 6:
                om40 om40Var = (om40) this.b;
                ContextTrack contextTrack = (ContextTrack) this.c;
                om40Var.getClass();
                return om40.b(contextTrack, (f7h) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return rca.C((rca) ((n381) this.b).b, new hgd(((ct60) obj).b), (fq21) null, 2, (Object) null).map(new pt60((nfa0) this.c, (byte) 0)).onErrorReturn(qs10.f).toObservable();
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String str6 = (String) obj;
                np21 np21Var = (np21) this.b;
                List list = np21Var.a;
                if (list == null || list.isEmpty()) {
                    ps60 ps60Var = new ps60(str6, null, null);
                    List list2 = np21Var.a;
                    List list3 = list2;
                    Single singleJust = Single.just(new gu60((list3 == null || list3.isEmpty()) ? is60.a : new ls60(ps60Var, new ks60(ut60.d(list2, null)))));
                    singleJust.getClass();
                    return singleJust;
                }
                List list4 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kgs0) it.next()).a);
                }
                Single map = ((v5n) this.c).d(o7h.O0(str6, arrayList)).map(ud20.f).firstOrError().onErrorReturn(a020.f).map(new ro30((Object) str6, (Object) np21Var, (byte) 16));
                map.getClass();
                return map;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                mmr0 mmr0Var = (mmr0) obj;
                ps60 ps60Var2 = (ps60) mmr0Var.a;
                ps60 ps60Var3 = (ps60) mmr0Var.b;
                sjq0 sjq0Var = (sjq0) this.b;
                wb0 wb0Var = (wb0) this.c;
                return new ju60(new ns60(ps60Var2, ps60Var3, sjq0Var.A0(wb0Var.b), wb0Var.c, wb0Var.e));
            default:
                wj7 wj7Var = (xj7) obj;
                boolean z = wj7Var instanceof wj7;
                atx0 atx0Var = atx0.a;
                if (!z) {
                    if (!(wj7Var instanceof vj7)) {
                        eg.o();
                        return null;
                    }
                    Observable observableJust = Observable.just(atx0Var);
                    observableJust.getClass();
                    return observableJust;
                }
                phi0 phi0Var = (phi0) ((zd1) this.b).c;
                String str7 = ((kqx0) this.c).a;
                String str8 = wj7Var.a;
                String strC = mka.c(str7);
                mwm1 mwm1Var = (mwm1) phi0Var.e;
                ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
                ssm1VarQ.q(strC);
                Observable map2 = mwm1Var.a(ssm1VarQ.build()).flatMapObservable(new k811(phi0Var, str8, strC, (byte) 1)).onErrorReturnItem(atx0Var).map(new ouz(wj7Var, (byte) 15));
                map2.getClass();
                return map2;
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public mr20 c() {
        return rqt0.u(new x010(((hce1) this.b).c(), new ht20(new lt20(new y080(z4p1.F((mr20) this.c, 1), (byte) 0), new bz0(3, null, (byte) 13), (byte) 0), new pk50(2, (lnm) null, (byte) 1)), new vv70(3, (lnm) null, (byte) 1), (byte) 1));
    }

    public HttpConnectionDelegate createDelegate() {
        return new o270((azp0) this.b, (v4g1) this.c);
    }

    public int e() {
        return 2;
    }

    public boolean f() {
        return false;
    }

    public af5 g(x340 x340Var) {
        x340Var.i0(-321469349);
        af5 af5VarA = ((q350) this.b).a(2131956307, (hrd0) this.c, x340Var);
        x340Var.r(false);
        return af5VarA;
    }

    public String getClientId() {
        return ((g71) this.b).getClientId();
    }

    public String getState() {
        return ((g71) this.b).getState();
    }

    public int h(y570 y570Var) {
        int iH = ((e4b1) this.b).h(y570Var);
        h5a1 h5a1Var = (h5a1) this.c;
        if (iH != 0) {
            ((hp91) h5a1Var.b).o("Using fallback binder for category " + y570Var.h().b(), y570Var);
        }
        return iH;
    }

    public String i() {
        return ((g71) this.b).i();
    }

    public String j() {
        return ((g71) this.b).j();
    }

    public xig k() {
        return ((g71) this.b).k();
    }

    public void l(LayoutInflater layoutInflater, ScrollView scrollView) {
        TextView textView = (TextView) layoutInflater.inflate(2131625019, (ViewGroup) scrollView, true).findViewById(2131427729);
        this.b = textView;
        textView.setText((String) this.c);
    }

    public String m() {
        return ((g71) this.b).m();
    }

    public int o() {
        return (int) Math.ceil(Math.abs(((TextView) this.b).getPaint().getFontMetrics().descent));
    }

    public mr20 p() {
        return o4p1.r(new huz(new ry50(((d780) this.b).callStream("spotify.ads.esperanto.proto.InStream", "SubInStream", SubInStreamRequest.o()), (byte) 10), (byte) 15), (q8n) this.c);
    }

    public String[] q() {
        String[] stringArrayExtra = ((Intent) this.c).getStringArrayExtra("SCOPE");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    public String r() {
        return ((g71) this.b).r();
    }

    public jhm s(String str) {
        if (!((xrk) this.c).m) {
            return null;
        }
        String strConcat = str.concat(":concerts");
        return new jhm("go_to_artist_concerts", (hux) bnx.c, (fhm) null, (Integer) 2131956258, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(vc40.V0, new ry40(strConcat, (byte) 0)), new zf10(this, strConcat, (byte) 28)), 244);
    }

    public boolean t(Object obj) {
        return ((wmu0) ((ih60) this.c).f).a(((qxc0) obj).t);
    }

    public void u(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.u(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void v(zf30 zf30Var, boolean z) {
        th30 th30Var = (th30) this.b;
        Context context = th30Var.x.e;
        zf30 zf30Var2 = th30Var.z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.v(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void w(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.w(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void x(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.x(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.j(zf30Var);
            }
        }
    }

    public void y(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.y(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public void z(zf30 zf30Var, boolean z) {
        zf30 zf30Var2 = ((th30) this.b).z;
        if (zf30Var2 != null) {
            zf30Var2.j0().p.z(zf30Var, true);
        }
        for (ch30 ch30Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ch30Var.b) {
                ch30Var.a.getClass();
            }
        }
    }

    public dh30() {
        this.a = (byte) 7;
    }

    public dh30(t2b t2bVar, jma jmaVar, zwz0 zwz0Var, Activity activity) {
        this.a = (byte) 29;
        this.b = zwz0Var;
        this.c = activity;
    }

    public /* synthetic */ dh30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public dh30(ConstraintLayout constraintLayout, ComposeView composeView, Barrier barrier, ConstraintLayout constraintLayout2) {
        this.a = (byte) 23;
        this.b = composeView;
        this.c = barrier;
    }

    public dh30(ih60 ih60Var) {
        this.a = (byte) 16;
        this.c = ih60Var;
        this.b = ih60Var.d;
    }
}
