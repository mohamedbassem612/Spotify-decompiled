package p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jzm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzm(vqv vqvVar, iu30 iu30Var, u380 u380Var, Function0 function0) {
        super(0);
        this.a = (byte) 10;
        this.b = vqvVar;
        this.c = iu30Var;
        this.e = u380Var;
        this.d = function0;
    }

    public final Object invoke() {
        ipb1 ipb1Var;
        tv80 tv80VarM;
        byte b = this.a;
        byte b2 = 11;
        b7x b7xVar = b7x.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                yym yymVar = (yym) obj4;
                yymVar.a = null;
                yymVar.b = 0L;
                l5j1 l5j1Var = yymVar.c;
                l5j1Var.a = Float.NaN;
                l5j1Var.b = false;
                o4w o4wVarB = ((gb5) obj3).b();
                if (o4wVarB != null) {
                    ((vu30) obj).invoke(o4wVarB, yoo.b);
                }
                ((Function0) obj2).invoke();
                return rih1Var;
            case 1:
                String str = ((a3o) obj3).a;
                if (((Boolean) ((ven0) obj).getValue()).booleanValue()) {
                    ((iu30) obj4).invoke(str);
                } else {
                    ((iu30) obj2).invoke(str);
                }
                return rih1Var;
            case 2:
                ((iu30) obj4).invoke(t6o.a);
                ven0 ven0Var = (ven0) obj3;
                v6o v6oVar = (v6o) obj2;
                String str2 = v6oVar.a;
                String str3 = (String) obj;
                if (str2.length() == 0) {
                    str2 = str3;
                }
                ven0Var.setValue(new jy2(str2, v6oVar.b, new hnf(ven0Var, (byte) 17)));
                return rih1Var;
            case 3:
                View viewInflate = LayoutInflater.from((Context) obj4).inflate(2131624342, (ViewGroup) obj3, false);
                int i = 2131427699;
                ImageView imageView = (ImageView) m5n1.t(viewInflate, 2131427699);
                if (imageView != null) {
                    i = 2131427864;
                    EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131427864);
                    if (encoreButtonT != null) {
                        i = 2131428111;
                        WebView webView = (WebView) m5n1.t(viewInflate, 2131428111);
                        if (webView != null) {
                            i = 2131428112;
                            ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131428112);
                            if (constraintLayoutT != null) {
                                i = 2131428113;
                                ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131428113);
                                if (constraintLayoutT2 != null) {
                                    i = 2131428728;
                                    if (((TextView) m5n1.t(viewInflate, 2131428728)) != null) {
                                        i = 2131428732;
                                        if (((TextView) m5n1.t(viewInflate, 2131428732)) != null) {
                                            i = 2131430528;
                                            if (((ProgressBar) m5n1.t(viewInflate, 2131430528)) != null) {
                                                i = 2131431681;
                                                if (((LinearLayout) m5n1.t(viewInflate, 2131431681)) != null) {
                                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                    osg osgVar = new osg(linearLayout, imageView, encoreButtonT, webView, constraintLayoutT, constraintLayoutT2);
                                                    iu30 iu30Var = (iu30) obj2;
                                                    imageView.setOnClickListener(new o0s(iu30Var, (byte) 14));
                                                    WeakHashMap weakHashMap = b8k1.a;
                                                    linearLayout.requestApplyInsets();
                                                    r7k1.c(linearLayout, l9x0.X0);
                                                    WebView.setWebContentsDebuggingEnabled(false);
                                                    webView.getSettings().setJavaScriptEnabled(true);
                                                    webView.getSettings().setDomStorageEnabled(true);
                                                    webView.setWebChromeClient(new o7b1(new qmr(iu30Var, (byte) 6), new lqc((byte) 6), c6s.f));
                                                    webView.setWebViewClient(new l3n((byte) 1, (j9s) obj, iu30Var));
                                                    encoreButtonT.setOnClickListener(new o0s(iu30Var, (byte) 15));
                                                    return osgVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 4:
                pus pusVar = (pus) obj4;
                String str4 = (String) obj3;
                wnw0 wnw0Var = (wnw0) obj;
                pusVar.b = (mus) obj2;
                SingleSubject singleSubject = (SingleSubject) pusVar.a().d.a.remove(str4);
                if (singleSubject != null) {
                    singleSubject.onSuccess(new r981(str4));
                }
                pusVar.a().b.b.onNext(new fzi0("TOOLTIP_HANDLER_ID", str4, wnw0Var));
                return rih1Var;
            case 5:
                kb61 kb61Var = (kb61) obj4;
                ui8 ui8VarC = kb61Var.d().c();
                z2t z2tVar = (z2t) ((kly0) obj3).get();
                return new q2t(new zm41((dn41) obj2, new m3n(ui8VarC, z2tVar, kb61Var, (byte) 14), d0t.S0, new won(ui8VarC, z2tVar, kb61Var, (byte) 19), new s3t(ui8VarC, z2tVar, kb61Var, (byte) 0), new s3t(ui8VarC, z2tVar, kb61Var, (byte) 1), Collections.singletonMap("scope_trigger", (String) obj)));
            case 6:
                t6t t6tVar = (t6t) obj4;
                i8h1 i8h1Var = t6tVar.a;
                x6h1 x6h1VarC = ((uvk0) obj3).a.c();
                x6h1VarC.i.add(new a7h1("delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_chat", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q(t6tVar.c), t6tVar.i, 0, new hxn((s6t) obj, t6tVar, (String) obj2, (lnm) null, (byte) 18), 2);
                return rih1Var;
            case 7:
                ivu ivuVar = (ivu) obj2;
                iu30 iu30Var2 = (iu30) obj;
                n8h1 n8h1VarC = mno1.C((op80) ((u601) obj4).getValue());
                r6h1 r6h1VarB = n8h1VarC != null ? n8h1VarC.b() : null;
                ArrayList arrayList = ivuVar.b;
                ((ovu) obj3).getClass();
                if (!ovu.g(arrayList)) {
                    h2v h2vVar = ivuVar.a;
                    if (h2vVar.equals(f2v.a)) {
                        iu30Var2.invoke(new zuu(r6h1VarB));
                    } else if (h2vVar.equals(c2v.a)) {
                        iu30Var2.invoke(new avu(r6h1VarB));
                    } else if ((h2vVar instanceof e2v) || h2vVar.equals(g2v.a)) {
                        iu30Var2.invoke(yuu.a);
                    } else if (!h2vVar.equals(d2v.a)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            case 8:
                ((iu30) obj4).invoke(new bav(((z9v) obj3).b, ((q220) obj2).b));
                ((ven0) obj).setValue(Boolean.FALSE);
                return rih1Var;
            case 9:
                vpv vpvVar = (vpv) obj4;
                kcp kcpVar = vpvVar.g;
                c9c c9cVar = vpvVar.h;
                cir0 cir0Var = (cir0) obj3;
                m3n m3nVar = new m3n((c9n) obj2, (ven0) obj, vpvVar, (byte) 20);
                tnm tnmVar = (tnm) kcpVar.a.c;
                ypv ypvVar = (ypv) tnmVar.b;
                q8n q8nVar = (q8n) ypvVar.a.get();
                c8o.l(q8nVar);
                iyc0 iyc0Var = (iyc0) ypvVar.g.get();
                c8o.l(iyc0Var);
                s6z0 s6z0Var = new s6z0(iyc0Var, (byte) 11);
                ol61 ol61Var = (ol61) ypvVar.m.get();
                c8o.l(ol61Var);
                xq81 xq81Var = new xq81(ol61Var, (byte) 22);
                lcp lcpVar = (lcp) ((jly0) tnmVar.e).get();
                mxr mxrVarG = tnmVar.g();
                Activity activity = (Activity) ypvVar.c.a;
                c8o.l(activity);
                bnw bnwVar = new bnw(q8nVar, s6z0Var, xq81Var, lcpVar, new ke71(mxrVarG, new dms0(activity), (byte) 9));
                mcp mcpVar = (mcp) ((jly0) tnmVar.f).get();
                q8n q8nVar2 = (q8n) ((ypv) tnmVar.b).a.get();
                c8o.l(q8nVar2);
                return new iee(bnwVar, mcpVar, q8nVar2, cir0Var, m3nVar, c9cVar);
            case 10:
                jut jutVar = ((vqv) obj4).c;
                i8h1 i8h1Var2 = (i8h1) jutVar.c;
                x6h1 x6h1VarC2 = ((txk0) jutVar.b).b.c();
                x6h1VarC2.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("move_to_bottom_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj3).invoke(new nsv((String) null, (u380) obj));
                ((Function0) obj2).invoke();
                return rih1Var;
            case 11:
                jut jutVar2 = (jut) obj3;
                tdl0 tdl0Var = (tdl0) jutVar2.c;
                ynb0 ynb0Var = (ynb0) jutVar2.b;
                job1 job1Var = ((m3w) obj4).c;
                if ((job1Var instanceof bmb1) || (job1Var instanceof amb1)) {
                    i8h1 i8h1Var3 = (i8h1) ynb0Var.get();
                    x6h1 x6h1VarC4 = tdl0Var.b.c();
                    x6h1VarC4.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var4 = (i8h1) ynb0Var.get();
                    x6h1 x6h1VarC6 = tdl0Var.b.c();
                    x6h1VarC6.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                b6t b6tVar = (k6a1) obj2;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((iu30) obj).invoke(a3w.a);
                return rih1Var;
            case 12:
                sqw sqwVar = (sqw) obj4;
                sqwVar.i = true;
                try {
                    return sqwVar.a.a().d(obj3, obj2, (op80) obj);
                } catch (Exception e) {
                    sqwVar.c.invoke(e);
                    throw null;
                }
            case 13:
                dtw dtwVar = (dtw) obj4;
                hoa0 hoa0Var = (koa0) obj2;
                dts dtsVar = hoa0Var.a;
                Object obj5 = hoa0Var.b;
                vu30 vu30Var = (vu30) obj;
                if (vu30Var != null && (ipb1Var = (ipb1) vu30Var.invoke(obj3, dtsVar)) != null) {
                    return ipb1Var;
                }
                laa laaVar = dtwVar.a;
                return laaVar.getBehavior().b(laaVar.getBehavior().d(obj3), dtsVar, String.valueOf(obj5));
            case 14:
                d9z d9zVar = (d9z) obj4;
                d0r d0rVar = (d0r) obj2;
                t3x t3xVar = new t3x(d9zVar, d0rVar, (byte) 12);
                lik1 lik1Var = d9zVar.a;
                yzc0 yzc0Var = d9zVar.b;
                tu11 tu11Var = d9zVar.e;
                c21 c21Var = (c21) d9zVar.f.a.c;
                yzc0 yzc0Var2 = ((fl90) c21Var.b).a;
                lik1 lik1VarG = ((qop) c21Var.c).g();
                nzp nzpVar = (nzp) c21Var.d;
                teq teqVar = nzpVar.b;
                aas aasVar = (aas) teqVar.z4.get();
                c8o.l(aasVar);
                daq daqVar = nzpVar.a;
                q8n q8nVar3 = (q8n) daqVar.V2.get();
                c8o.l(q8nVar3);
                vu1 vu1Var = (vu1) teqVar.a1.get();
                c8o.l(vu1Var);
                pep pepVar = (pep) ((jly0) c21Var.g).get();
                b7r0 b7r0Var = (b7r0) daqVar.p7.get();
                c8o.l(b7r0Var);
                fc8 fc8Var = new fc8(new e8z(yzc0Var2, lik1VarG, aasVar, q8nVar3, vu1Var, pepVar, b7r0Var, c21Var.a(), t3xVar), tu11Var);
                pux0 pux0Var = new pux0(d9zVar.j, tu11Var, (byte) 27);
                boolean zT = bzn1.t(d9zVar.l);
                o3r o3rVar = d9zVar.q;
                np4 np4Var = d9zVar.m;
                o3r o3rVar2 = np4Var.a() ? o3rVar : null;
                o3r o3rVar3 = np4Var.a() ? d9zVar.r : null;
                hyy0 hyy0Var = (hyy0) obj3;
                kpg0 kpg0Var = ((i5y0) hyy0Var.c).f() ? new kpg0((d511) hyy0Var.b, ss11.d1) : null;
                qlb qlbVar = new qlb(d0rVar, new xzq(d9zVar.d, i7z.V0), hap1.t(d9zVar.g));
                yzu yzuVar = (yzu) obj;
                bhh1 bhh1Var = igu.b;
                yzu yzuVar2 = (yzu) yzuVar.b;
                xzq xzqVar = new xzq(new hho(bhh1Var, d0rVar), i7z.R0);
                xzq xzqVar2 = new xzq(t1p.b((t1p) yzuVar2.b, d0rVar, bhh1Var, 1), i7z.S0);
                s1p s1pVar = (s1p) yzuVar2.a;
                fns fnsVar = igu.a;
                xzq xzqVar3 = new xzq(s1pVar.a(fnsVar, d0rVar), i7z.U0);
                xzq xzqVar4 = new xzq(((d2q) yzuVar2.c).a(fnsVar, d0rVar), new va8(lik1Var, t3xVar, (byte) 1));
                zs11 zs11Var = (zs11) yzuVar.a;
                o3r o3rVarA = n39.a((n39) yzuVar.c, false, 6);
                ds11 ds11Var = new ds11(xzqVar);
                ds11 ds11Var2 = new ds11(xzqVar2);
                ds11 ds11Var3 = new ds11(xzqVar3);
                ds11 ds11Var4 = new ds11(xzqVar4);
                hvy hvyVar = new hvy(new xzq(((zwp) yzuVar2.d).a(d0rVar, new ult0(yzc0Var)), i7z.T0), (byte) 2);
                a9z a9zVar = new a9z(qlbVar, (byte) 0);
                bt11 bt11Var = new bt11(true);
                ya8 ya8Var = new ya8(kpg0Var, (byte) 6);
                eb8 eb8Var = (eb8) yzuVar.d;
                return new wqw(new xzq(zs11Var.a(d0rVar, new ls11(ds11Var, ds11Var2, ds11Var3, ds11Var4, hvyVar, a9zVar, (qrk) null, ya8Var, new ya8(eb8Var.a.c ? new qlb(d0rVar, new xzq(eb8Var.b.a(d0rVar), f9z.i), w3p1.n(new l4r(hvm.a, 2, f9z.e, new j4r(new nty(eb8Var, (byte) 14)), f9z.f), new l4r(jd0.m, 2, f9z.g, new j4r(f9z.t), f9z.h), new hzw(eb8Var, (byte) 14))) : null, (byte) 7), fc8Var, pux0Var, 1, (o27) null, (gye1) null, kpc1.a, qb2.a, (rru) null, zT, w3p1.o(new l4r(pwc0.d, 2, b4r.b, new j4r(b4r.f), b4r.d), b4r.h), x3p1.o(), o3rVar2, o3rVar3, o3rVarA, (o3r) null, (cv11) null, (y5z) null, (bnw0) null, bt11Var, 0, (o3r) null, 470462528, 503), (nu11) null), new nty(d9zVar, (byte) 12)));
            case 15:
                if (((lk10) obj4).b()) {
                    ((az20) obj3).b(true);
                    b6t b6tVar2 = (k6a1) obj2;
                    if (b6tVar2 != null) {
                        b6tVar2.a();
                    }
                    ((iu30) obj).invoke(tj10.a);
                }
                return rih1Var;
            case 16:
                ((scx) obj4).a();
                ((Function0) obj2).invoke();
                ((ven0) obj).setValue((ct10) obj3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ViewParent parent = ((View) obj4).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                ((ven0) obj3).setValue((Object) null);
                kaa0.j(0L, (ven0) obj2);
                ((ven0) obj).setValue((Object) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30 iu30Var3 = (iu30) obj2;
                e730 e730Var = (e730) obj4;
                if (!e730Var.c) {
                    ((View) obj).performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                    iu30Var3.invoke(z630.a);
                } else if (e730Var.e) {
                    ((gu8) obj3).a(e730Var.a, ny00.b1, new y720(iu30Var3, (byte) 22));
                } else {
                    iu30Var3.invoke(a730.a);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                g2z g2zVar = (g2z) obj4;
                kt91 kt91Var = (kt91) g2zVar.a;
                String string = ((dg30) g2zVar.b).getString(2131951665, (String) obj3);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, string, (Integer) null, (String) null, 2131951664, new un30((String) obj, g2zVar, (byte) 0), (cvr) null, (xq91) null, false));
                ((Function0) obj2).invoke();
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                lc20 lc20Var = (lc20) obj4;
                lik1 lik1Var2 = (lik1) obj3;
                lik1 lik1Var3 = (lik1) obj2;
                xep xepVar = (xep) lc20Var.b;
                String str5 = lik1Var3.a;
                if (lik1Var2.equals(nik1.d4)) {
                    i8h1 i8h1Var5 = (i8h1) xepVar.get();
                    x6h1 x6h1VarC8 = ((h4l0) lc20Var.d).b.c();
                    x6h1VarC8.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA = x6h1VarC8.a();
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str5 == null) {
                        str5 = "";
                    }
                    tv80VarM = i8h1Var5.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (!lik1Var2.equals(nik1.c4)) {
                        hhg1.g(lik1Var2, "Unsupported uri for graduation acknowledgement logging: ");
                        return null;
                    }
                    i8h1 i8h1Var6 = (i8h1) xepVar.get();
                    ksk0 ksk0Var = (ksk0) lc20Var.c;
                    x6h1 x6h1VarC9 = ksk0Var.c.c();
                    x6h1VarC9.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC9.a();
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str5 == null) {
                        str5 = "";
                    }
                    tv80VarM = i8h1Var6.m(new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), y6h1VarA2, ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                }
                ((lzn0) obj).a(lik1Var3.a, tv80VarM, (Bundle) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new iv70((u0i) obj4, (lzn0) obj3, (vgm) obj2, new au70(), (gw70) ((ug3) obj).c);
            case 22:
                o0i o0iVar = (o0i) obj4;
                fn31.T(o0iVar.a, (o8n) null, 0, new z290((sh40) obj3, o0iVar, (x9b0) obj2, (ven0) obj, (lnm) null, (byte) 4), 3);
                return rih1Var;
            case 23:
                ven0 ven0Var2 = (ven0) obj4;
                if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                    wel0 wel0Var = (wel0) obj2;
                    wel0Var.getClass();
                    ((i8h1) obj3).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), wel0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    ((tbr0) obj).a(l231.a);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                jyb0 jyb0Var = (jyb0) obj4;
                i8h1 i8h1Var7 = jyb0Var.a;
                x6h1 x6h1VarC10 = ((uvk0) obj3).a.c();
                x6h1VarC10.i.add(new a7h1("leave_chat_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q(jyb0Var.c), jyb0Var.i, 0, new xtz(jyb0Var, (String) obj2, (String) obj, null, (byte) 19), 2);
                return rih1Var;
            case 25:
                ((AtomicBoolean) obj4).set(false);
                ((AtomicBoolean) obj3).set(false);
                ((vnc0) obj2).a.h((tnc0) obj);
                return rih1Var;
            case 26:
                ykd0 ykd0Var = (ykd0) obj;
                if (!((tq4) ((kly0) obj4).get()).a()) {
                    return new huz((Object) null, (byte) 10);
                }
                vbm[] vbmVarArr = q601.a;
                return new b8d0(rqt0.u(new x010(hu20.e(rqt0.u(new dy20(new kge((Flowable) obj3), (byte) 6)), new zz90(lnmVar, ykd0Var, b2)), ((cqd0) obj2).b, new vv70(3, (lnm) null, (byte) 14), (byte) 1)), ykd0Var, (byte) 6);
            case 27:
                q6e0 q6e0Var = (q6e0) obj3;
                k241 k241VarB = ((q7e0) obj4).a.b(q6e0Var, new v7r0(2, xio1.p((q7r0) obj2)));
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    q6e0Var.a(bundle);
                }
                return k241VarB;
            case 28:
                jgf0 jgf0Var = (jgf0) obj4;
                if (!jgf0Var.d || jgf0Var.e) {
                    cgf0 cgf0Var = (cgf0) obj;
                    ((apf0) obj2).b.a(new yof0(cgf0Var.b, cgf0Var.c, cgf0Var.d), (String) null);
                } else {
                    ((iu30) obj3).invoke(fgf0.a);
                }
                return rih1Var;
            default:
                tqw tqwVar = (tqw) obj2;
                ((byg0) obj4).a.d((String) obj3, tqwVar != null ? n3o1.y(tqwVar) : null, (Bundle) null);
                dg30 dg30Var = (dg30) obj;
                if (dg30Var != null) {
                    dg30Var.finish();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzm(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzm(scx scxVar, Function0 function0, ct10 ct10Var, ven0 ven0Var) {
        super(0);
        this.a = (byte) 16;
        this.b = scxVar;
        this.d = function0;
        this.c = ct10Var;
        this.e = ven0Var;
    }
}
