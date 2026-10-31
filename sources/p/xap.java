package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.tasks.Task;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutRequest;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xap implements Function, qiw, nk60, Predicate, av30, i2q0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public xap(dg30 dg30Var, FrameLayout frameLayout, s20 s20Var) {
        this.a = (byte) 12;
        this.b = s20Var;
        Context context = frameLayout.getContext();
        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar(context, frameLayout);
        dug.r(glueToolbarCreateGlueToolbar.getView());
        frameLayout.addView(glueToolbarCreateGlueToolbar.getView(), 0);
        a1s a1sVar = new a1s(dg30Var, glueToolbarCreateGlueToolbar, ((f0i) dg30Var).a, new zfs(this, (byte) 1));
        glueToolbarCreateGlueToolbar.getView().setVisibility(0);
        ((Drawable) a1sVar.d).setAlpha(0);
        ((mx40) a1sVar.b).e = true;
        String string = context.getResources().getString(2131960240);
        glueToolbarCreateGlueToolbar.setTitle(string == null ? "" : string);
    }

    public o2r a(int i) {
        return ((k2r) this.b).j();
    }

    public Object apply(Object obj) {
        Single map;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                ehr ehrVar = (ehr) obj;
                ghr ghrVar = (ghr) obj2;
                if (!(ehrVar instanceof dhr)) {
                    Single singleJust = Single.just(ea8.a);
                    singleJust.getClass();
                    return singleJust;
                }
                String str = ((dhr) ehrVar).a;
                bma1 bma1Var = ghr.k;
                e481 e481Var = ghrVar.i;
                String str2 = new y6b1(str, false).e;
                if (str2 == null) {
                    map = Single.error(new IllegalArgumentException("Invalid show URI: ".concat(str)));
                } else if (ghrVar.g.d()) {
                    map = ghrVar.d.a(new b481(str2, new o8z(0), 0, (azo1) null, e481Var.b, (Boolean) null, (Boolean) null, 131052)).map(cxo1.U0);
                } else {
                    map = ghrVar.c.a(str2, e481Var).map(qbo1.S0);
                    map.getClass();
                }
                Single map2 = g7h.b(ghrVar.e, str, new String[]{str}).map(new yjp1(str, (byte) 2));
                qhr qhrVar = ghrVar.h;
                Single singleZip = Single.zip(map, map2, qhrVar.a.map(new nfb(qhrVar, (byte) 6)), new a1q((Object) ghrVar, (Object) ehrVar, (byte) 29));
                singleZip.getClass();
                return singleZip;
            case 15:
                w891 w891Var = (y891) obj;
                zfr zfrVar = (zfr) obj2;
                if (w891Var instanceof w891) {
                    zor.i((zor) zfrVar.b, w891Var.a, 6);
                } else {
                    if (!w891Var.equals(x891.a)) {
                        eg.o();
                        return null;
                    }
                    ((h991) zfrVar.c).a();
                }
                return rih1.a;
            case 16:
                ip31 ip31Var = (ip31) obj2;
                return ((pta1) ip31Var.d).b().firstOrError().timeout(3000L, TimeUnit.MILLISECONDS, (Scheduler) ip31Var.e, Single.error(new TimeoutException())).doOnError(fcc.Y0).onErrorReturnItem(100).map(new wcr((mss) obj, (byte) 14));
            case 22:
                return apo.x((chm0) obj2);
            case 24:
                z310 z310Var = (z310) obj;
                nkv nkvVar = (nkv) obj2;
                List list = z310Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u310) it.next()).a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    String str3 = (String) obj3;
                    Set set = s4b1.f;
                    blc0 blc0Var = uic.x(str3).c;
                    nkvVar.getClass();
                    if (blc0Var == blc0.ti && !f7p1.m(str3)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2.isEmpty() ? Observable.just(z310Var) : nkvVar.a.b("EIS_playability_transformer_impl:external_integration_content_response", arrayList2, true).map(new dqu(z310Var, (byte) 3)).onErrorReturn(new wcr(z310Var, (byte) 21)).toObservable();
            case 25:
                kmw kmwVar = (kmw) obj2;
                g3b1 g3b1Var = kmwVar.b;
                amc1 amc1VarN = SubmitCheckoutRequest.n();
                amc1VarN.n(kmwVar.a.Z());
                amc1VarN.r(bmc1.c);
                amc1VarN.q(((rfw) obj).a);
                return g3b1Var.a(amc1VarN.build()).compose(new dn81((byte) 2)).map(u321.a1).onErrorReturn(uh21.b1);
            case 26:
                uww uwwVar = (uww) obj;
                return ((hr81) obj2).a(tri1.EMAIL, uwwVar.a).onErrorReturn(new dqu(uwwVar, (byte) 6)).map(new wcr(uwwVar, (byte) 24));
            default:
                b1y b1yVar = (b1y) ((vzx) obj2).i;
                return new pdm(false, false, false, true, false, ((Boolean) obj).booleanValue(), false, false, b1yVar.a.c(), b1yVar.a.e(), false, false, false, 246690);
        }
    }

    public efr b() {
        Context context = ((mnt) this.b).a;
        c8o.l(context);
        return new efr(new dr41(new oiv(context.getPackageManager(), false), (byte) 28), (byte) 7);
    }

    public String c() {
        Uri uri = ((w911) this.b).b;
        if (uri != null) {
            return uri.getAuthority();
        }
        return null;
    }

    public Single d(String str) {
        l6s l6sVar = (l6s) this.b;
        jmq jmqVar = (jmq) l6sVar.b;
        bbt bbtVar = (bbt) jmqVar.a;
        return m5n1.p(bbtVar.a, new vas((Object) bbtVar, (byte) 28)).map(uwg.X0).onErrorReturn(m9h.X0).subscribeOn((Scheduler) jmqVar.b).flatMap(new rjn((Object) l6sVar, (byte) 24)).map(new zjp1((byte) 3, this, str));
    }

    public String e(Intent intent) {
        String stringExtra;
        String string;
        String string2;
        Uri uri = (Uri) ila0.s(intent, "android.intent.extra.REFERRER", Uri.class);
        cp5 cp5Var = null;
        if (uri != null) {
            stringExtra = uri.toString();
        } else {
            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
            if (stringExtra == null || stringExtra.length() <= 0) {
                stringExtra = null;
            }
        }
        if (stringExtra == null) {
            Uri uri2 = ((w911) this.b).b;
            stringExtra = uri2 != null ? uri2.toString() : null;
        }
        Uri data = intent.getData();
        if (data != null && data.isHierarchical()) {
            Set set = dhn.a;
            if (!set.contains(cp5.class)) {
                try {
                    Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
                    if (bundleExtra != null) {
                        cp5 cp5Var2 = new cp5((byte) 0);
                        Uri data2 = intent.getData();
                        cp5Var2.b = data2;
                        if (!set.contains(cp5.class) && data2 != null) {
                            try {
                                String queryParameter = data2.getQueryParameter("al_applink_data");
                                if (queryParameter != null) {
                                    try {
                                        new JSONObject(queryParameter);
                                    } catch (JSONException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                dhn.a(cp5.class, th);
                            }
                        }
                        if (((Uri) cp5Var2.b) == null && (string2 = bundleExtra.getString("target_url")) != null) {
                            cp5Var2.b = Uri.parse(string2);
                        }
                        Bundle bundle = bundleExtra.getBundle("referer_data");
                        if (bundle != null) {
                            bundle.getString("fb_ref");
                        }
                        Bundle bundle2 = bundleExtra.getBundle("extras");
                        if (bundle2 != null && (string = bundle2.getString("deeplink_context")) != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                if (jSONObject.has("promo_code")) {
                                    jSONObject.getString("promo_code");
                                }
                            } catch (JSONException unused2) {
                                wf10 wf10Var = wf10.a;
                            }
                        }
                        cp5Var = cp5Var2;
                    }
                } catch (Throwable th2) {
                    dhn.a(cp5.class, th2);
                }
            }
            if (cp5Var != null) {
                stringExtra = "com.facebook.katana";
            }
        }
        String stringExtra2 = intent.getStringExtra("com.spotify.music.intent.extra.EXTRA_SPOTIFY_INTERNAL_REFERRER_NAME");
        return !TextUtils.isEmpty(stringExtra2) ? stringExtra2 : stringExtra;
    }

    public p410 f() {
        mnt mntVar = (mnt) this.b;
        Context context = mntVar.a;
        c8o.l(context);
        cn3 cn3Var = mntVar.f51p;
        o771 o771Var = mntVar.o;
        gya gyaVar = mntVar.s;
        gw70 gw70Var = mntVar.t;
        Context context2 = mntVar.a;
        c8o.l(context2);
        oiv oivVar = new oiv(context2.getPackageManager(), false);
        q8n q8nVar = mntVar.y;
        c8o.l(q8nVar);
        return new p410(context, cn3Var, o771Var, gyaVar, gw70Var, oivVar, q8nVar, (byte) 10);
    }

    public drj0 g() {
        mnt mntVar = (mnt) this.b;
        zg0 zg0Var = mntVar.b;
        r2a1 r2a1VarI = i();
        r7n0 r7n0Var = mntVar.c;
        gv91 gv91Var = new gv91(zg0Var, r2a1VarI, r7n0Var, mntVar.d, new ffe1(mntVar.s, mntVar.o, (byte) 14), mntVar.f51p, mntVar.j);
        olc0 olc0Var = new olc0(zg0Var, b(), f(), (byte) 2);
        Context context = mntVar.a;
        c8o.l(context);
        dg10 dg10Var = new dg10(zg0Var, context, i(), mntVar.f, mntVar.g);
        dg10 dg10Var2 = new dg10(zg0Var, r7n0Var, mntVar.h, i(), (byte) 1);
        jf10 jf10Var = new jf10(zg0Var, b(), (byte) 1);
        dg10 dg10Var3 = new dg10(zg0Var, r7n0Var, mntVar.i, i(), (byte) 0);
        Context context2 = mntVar.a;
        c8o.l(context2);
        df10 df10Var = new df10(zg0Var, new lls0(new dr41(new oiv(context2.getPackageManager(), false), (byte) 28), mntVar.e, (byte) 23));
        jf10 jf10Var2 = new jf10(zg0Var, b(), (byte) 0);
        hn80 hn80Var = new hn80(zg0Var, context, mntVar.l, new bm00(r7n0Var, (byte) 19));
        olc0 olc0Var2 = new olc0(zg0Var, b(), f(), (byte) 3);
        jf10 jf10Var3 = new jf10(zg0Var, b(), (byte) 2);
        Context context3 = mntVar.a;
        c8o.l(context3);
        fq91 fq91Var = new fq91(context3, zg0Var);
        Context context4 = mntVar.a;
        c8o.l(context4);
        j4n j4nVar = new j4n(new rm5(context4, mntVar.x));
        gw70 gw70Var = mntVar.t;
        zxa zxaVar = mntVar.u;
        q8n q8nVar = mntVar.y;
        c8o.l(q8nVar);
        zeu zeuVar = new zeu(gw70Var, zxaVar, q8nVar);
        rjn rjnVar = new rjn((Object) new n58(context, mntVar.n, mntVar.v, q8nVar), (byte) 29);
        Context context5 = mntVar.a;
        c8o.l(context5);
        jru jruVar = new jru(zeuVar, rjnVar, new rm5(context5, mntVar.x));
        Context context6 = mntVar.a;
        c8o.l(context6);
        bkm0 bkm0Var = new bkm0(context, new vnr(context6), mntVar.x);
        olc0 olc0Var3 = new olc0(zg0Var, r7n0Var, context);
        yje1 yje1Var = new yje1(zg0Var, mntVar.k, r7n0Var, i(), context);
        Context context7 = mntVar.a;
        c8o.l(context7);
        df10 df10Var2 = new df10(zg0Var, new esa1((Object) context7.getApplicationContext().getPackageName(), (Object) r7n0Var, (byte) 24));
        jf10 jf10Var4 = new jf10(zg0Var, b(), (byte) 3);
        hn80 hn80Var2 = new hn80(zg0Var, context, b(), mntVar.m);
        Context context8 = mntVar.a;
        c8o.l(context8);
        return new drj0(new e93(gv91Var, olc0Var, dg10Var, dg10Var2, jf10Var, dg10Var3, df10Var, jf10Var2, hn80Var, olc0Var2, jf10Var3, fq91Var, j4nVar, jruVar, bkm0Var, olc0Var3, yje1Var, df10Var2, jf10Var4, hn80Var2, new olc0(zg0Var, context, new ye90(r7n0Var, new dr41(new oiv(context8.getPackageManager(), false), (byte) 28), (byte) 23)), (byte) 7), new m4c((byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, Set set, onm onmVar) {
        tjs tjsVar;
        if (onmVar instanceof tjs) {
            tjsVar = (tjs) onmVar;
            int i = tjsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjsVar.c = i - Integer.MIN_VALUE;
            } else {
                tjsVar = new tjs(this, onmVar);
            }
        } else {
            tjsVar = new tjs(this, onmVar);
        }
        Object objB = tjsVar.a;
        int i2 = tjsVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            my91 my91Var = (my91) this.b;
            b7x b7xVar = b7x.a;
            u0a0 u0a0Var = new u0a0(Collections.singletonMap(new y0a0(str, b7xVar), set), b7xVar);
            tjsVar.c = 1;
            objB = my91Var.b(u0a0Var, tjsVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        e1a0 e1a0Var = (f1a0) objB;
        if (e1a0Var instanceof d1a0) {
            return e1a0Var;
        }
        if (e1a0Var instanceof e1a0) {
            return new e1a0((qo90) o7h.s0((List) e1a0Var.a));
        }
        eg.o();
        return null;
    }

    public r2a1 i() {
        mnt mntVar = (mnt) this.b;
        o771 o771Var = mntVar.o;
        nfb nfbVar = new nfb((byte) 26, false);
        Context context = mntVar.a;
        c8o.l(context);
        kp00 kp00Var = new kp00(context, mntVar.w, (byte) 13);
        t7y t7yVar = mntVar.r;
        uo5 uo5Var = mntVar.q;
        gw70 gw70Var = mntVar.t;
        gya gyaVar = mntVar.s;
        q8n q8nVar = mntVar.y;
        c8o.l(q8nVar);
        return new r2a1(new h6c1(o771Var, nfbVar, kp00Var, context, t7yVar, uo5Var, new ua91(gw70Var, gyaVar, o771Var, q8nVar), mntVar.d, mntVar.u, q8nVar), mntVar.f51p, (byte) 17);
    }

    public cik1 j() {
        cik1 cik1Var = (cik1) this.b;
        return new cik1((yfm1) ((RetrofitMaker) cik1Var.b).createWebgateService(yfm1.class, "android-campaigns-wrapped-endpoint"), (cxc) cik1Var.c, (drj0) cik1Var.d, (q8n) cik1Var.e, (byte) 10);
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public boolean test(Object obj) {
        return !u890.j(((un5) obj).a, ((oo5) this.b).a());
    }

    public void v(Object obj) {
        String str;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                oyn oynVar = (oyn) obj;
                err errVar = (err) obj2;
                ComposeView composeView = errVar.i;
                tn30 tn30Var = oynVar.g;
                boolean z = (tn30Var == null || oynVar.l.b != 1 || (str = oynVar.h) == null || str.length() == 0) ? false : true;
                composeView.setVisibility(z ? 0 : 8);
                if (!z) {
                    composeView.setContent(dii.a);
                    composeView.l();
                } else {
                    composeView.setContent(new j2i(881259148, new yqr(errVar, oynVar, tn30Var, (byte) 1), true));
                }
                break;
            case 7:
                Long l = (Long) obj;
                jnq jnqVar = (jnq) obj2;
                TextView textView = (TextView) ((g1i) jnqVar.c).f;
                l.getClass();
                textView.setText(jnqVar.b(2131820887, l.longValue()));
                break;
            case 9:
                ((ArtworkView) ((d520) ((odr) obj2).b).b).h(new t07(new g07((String) obj), false));
                break;
            case 11:
                List listSubList = (List) obj;
                kbs kbsVar = (kbs) obj2;
                listSubList.getClass();
                kqm0 kqm0Var = kbsVar.e;
                if (listSubList.size() > 3) {
                    listSubList = listSubList.subList(0, 3);
                }
                kbsVar.f.setAdapter(new an(kqm0Var.a.getContext(), listSubList, kbsVar.b));
                break;
            case 13:
                ian ianVar = (ian) obj;
                ianVar.getClass();
                nqr nqrVar = ((uhs) obj2).Y;
                nqrVar.getClass();
                nqrVar.f(ianVar);
                break;
            case 17:
                ((pkf1) obj2).setIsMediaModeVideo$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(((Boolean) obj).booleanValue());
                break;
            default:
                qws qwsVar = (qws) obj2;
                qwsVar.c.setMax((int) ((Number) obj).longValue());
                qwsVar.a();
                break;
        }
    }

    public xap(g0l g0lVar) {
        this.a = (byte) 20;
        this.b = yoi1.g(((inr) g0lVar).d().map(vrg.Y0));
    }

    public xap(w911 w911Var, twb twbVar) {
        this.a = (byte) 3;
        this.b = w911Var;
    }

    public /* synthetic */ xap(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
