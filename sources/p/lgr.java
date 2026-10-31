package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.messages.InAppBrowserEvent;
import com.spotify.podcastexperience.showpreferencesimpl.DefaultShowSortOrderPreferences$SortOrderJsonModel;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lgr implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public lgr(lzn0 lzn0Var, Activity activity, iwe0 iwe0Var) {
        this.a = (byte) 23;
        this.b = lzn0Var;
        this.c = activity;
    }

    public final void accept(Object obj) {
        xfa1 xfa1Var;
        DefaultShowSortOrderPreferences$SortOrderJsonModel defaultShowSortOrderPreferences$SortOrderJsonModel;
        p620 p620Var;
        lps kpsVar;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        Drawable[] compoundDrawablesRelative;
        gs41 gs41Var;
        tv80 tv80VarB;
        tv80 tv80VarB2;
        byte b = this.a;
        int currentItem = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                mgr mgrVar = (mgr) obj3;
                gh7 gh7Var = (gh7) obj2;
                cp31 cp31Var = mgrVar.c;
                currentItem = ((ViewPager2) cp31Var.d).getCurrentItem() < p7h.L(gh7Var.a) ? ((ViewPager2) cp31Var.d).getCurrentItem() + 1 : 0;
                ((ViewPager2) cp31Var.d).setCurrentItem(currentItem);
                mgrVar.b(currentItem, gh7Var.b);
                return;
            case 1:
                slc0 slc0Var = (slc0) obj2;
                boolean zEquals = ((tlc0) obj).equals(tlc0.b);
                j0s j0sVar = (j0s) obj3;
                lvc lvcVar = j0sVar.f;
                if (zEquals) {
                    lvcVar.f(slc0Var, "google_assistant", true, "", "", "");
                    aer aerVar = j0sVar.c;
                    gj5 gj5Var = j0sVar.a;
                    aerVar.getClass();
                    aerVar.a.k(new er91((fs91) null, gj5Var.getString(2131956332, gj5Var.getString(2131956333)), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    aerVar.b.a();
                    return;
                }
                lvcVar.f(slc0Var, "google_assistant", false, "", jup0.i(9), "Unknown");
                zq91 zq91Var = j0sVar.e;
                nxr nxrVar = new nxr(j0sVar, slc0Var, (byte) 4);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956274});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956274});
                zq91Var.a.k(new er91((fs91) null, "", 2131956274, (String) null, 2131956275, new gl61(nxrVar, (byte) 4), (cvr) null, (xq91) null, false));
                return;
            case 2:
                ((y0o) obj3).invoke(((k9r) obj2).v((sy21) obj));
                return;
            case 3:
                ((fu) obj3).invoke(((k9r) obj2).v((sy21) obj));
                return;
            case 4:
                sy21 sy21Var = (sy21) obj;
                k9r k9rVar = (k9r) obj3;
                nok nokVar = (nok) obj2;
                Object obj4 = sy21Var.b;
                boolean z = sy21Var.a.Q0;
                if (z && (obj4 instanceof kb)) {
                    nokVar.invoke(((kb) obj4).b, (Object) null);
                    return;
                }
                if (z && (obj4 instanceof zj11)) {
                    nokVar.invoke(((zj11) obj4).b, (Object) null);
                    return;
                }
                if (!z || !(obj4 instanceof tj11)) {
                    nokVar.invoke((Object) null, k9rVar.v(sy21Var));
                    return;
                }
                List list = ((tj11) obj4).a;
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    nokVar.invoke((Object) null, (Object) null);
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    nokVar.invoke((String) it.next(), (Object) null);
                }
                return;
            case 5:
                sy21 sy21Var2 = (sy21) obj;
                Object obj5 = sy21Var2.b;
                tj11 tj11Var = obj5 instanceof tj11 ? (tj11) obj5 : null;
                List list3 = tj11Var != null ? tj11Var.a : null;
                if (list3 == null) {
                    list3 = z6x.a;
                }
                ((hk2) obj3).invoke(list3, ((k9r) obj2).v(sy21Var2));
                return;
            case 6:
                f8s f8sVar = (f8s) obj3;
                l1d.B(f8sVar.d, f8sVar.b.b(f8sVar.a, (String) obj).edit(), bma1.b.n(l1d.m("device-picker-message-box-dismissed-timestamp-", ((ywi0) obj2).name())));
                return;
            case 7:
                Boolean bool = (Boolean) obj;
                dgs dgsVar = (dgs) obj3;
                dgsVar.s.onNext(Boolean.valueOf(bool.booleanValue() && dgsVar.k));
                if (bool.booleanValue() && dgsVar.l) {
                    String str = (String) obj2;
                    dgsVar.u.b(rqt0.F(dgsVar.o, new bgs(dgsVar, str, (lnm) null, (byte) 0)).doOnSuccess(new cgs(dgsVar, (byte) 0)).flatMapObservable(new hur(dgsVar, str, (byte) 13)).subscribe(new cgs(dgsVar, (byte) 1), new cgs(dgsVar, (byte) 2)));
                    return;
                }
                return;
            case 8:
                xfa1 xfa1Var2 = xfa1.a;
                kpq0 kpq0Var = (kpq0) obj;
                xfa1 xfa1Var3 = xfa1.b;
                xfa1 xfa1Var4 = xfa1.c;
                p620 p620Var2 = h620.c;
                p620 p620Var3 = h620.a;
                p620 p620Var4 = h620.b;
                efr efrVar = (efr) obj3;
                if (kpq0Var instanceof ipq0) {
                    qfs qfsVar = (qfs) efrVar.b;
                    BehaviorSubject behaviorSubject = qfsVar.e;
                    ipq0 ipq0Var = (ipq0) kpq0Var;
                    if (ipq0Var.equals(ipq0.a)) {
                        p620Var = p620Var4;
                    } else if (ipq0Var.equals(ipq0.b)) {
                        p620Var = p620Var3;
                    } else {
                        if (!ipq0Var.equals(ipq0.c)) {
                            eg.o();
                            return;
                        }
                        p620Var = p620Var2;
                    }
                    p620 p620Var5 = (p620) behaviorSubject.h();
                    if (p620Var5 == null) {
                        p620Var5 = p620Var4;
                    }
                    if (!p620Var5.equals(p620Var) && qfsVar.d.contains(p620Var)) {
                        mps mpsVar = qfsVar.b;
                        String str2 = qfsVar.c;
                        boolean zEquals2 = p620Var.equals(p620Var4);
                        y441 y441Var = mpsVar.a;
                        if (zEquals2) {
                            ywb0 ywb0VarU = y441Var.u();
                            if (ywb0VarU != null) {
                                ywb0VarU.remove(str2);
                                y441Var.B(ywb0VarU);
                            }
                        } else {
                            if (p620Var.equals(p620Var4)) {
                                kpsVar = new bps();
                            } else if (p620Var.equals(p620Var3)) {
                                kpsVar = new wos();
                            } else if (p620Var.equals(p620Var2)) {
                                kpsVar = new hps();
                            } else {
                                if (!p620Var.equals(h620.d)) {
                                    eg.o();
                                    return;
                                }
                                kpsVar = new kps();
                            }
                            ywb0 ywb0VarU2 = y441Var.u();
                            if (ywb0VarU2 != null) {
                                ywb0VarU2.remove(str2);
                                ywb0VarU2.put(str2, kpsVar);
                                y441Var.B(ywb0VarU2);
                            }
                        }
                        behaviorSubject.onNext(p620Var);
                    }
                } else {
                    if (!(kpq0Var instanceof jpq0)) {
                        eg.o();
                        return;
                    }
                    qfs qfsVar2 = (qfs) efrVar.b;
                    BehaviorSubject behaviorSubject2 = qfsVar2.g;
                    jpq0 jpq0Var = (jpq0) kpq0Var;
                    if (jpq0Var.equals(jpq0.a)) {
                        xfa1Var = xfa1Var4;
                    } else {
                        if (!jpq0Var.equals(jpq0.b)) {
                            eg.o();
                            return;
                        }
                        xfa1Var = xfa1Var3;
                    }
                    xfa1 xfa1Var5 = (xfa1) behaviorSubject2.h();
                    if (xfa1Var5 == null) {
                        xfa1Var5 = xfa1Var2;
                    }
                    if (!xfa1Var5.equals(xfa1Var) && qfsVar2.f.contains(xfa1Var)) {
                        rps rpsVar = qfsVar2.a;
                        String str3 = qfsVar2.c;
                        y441 y441Var2 = rpsVar.a;
                        if (xfa1Var.equals(xfa1Var3)) {
                            defaultShowSortOrderPreferences$SortOrderJsonModel = DefaultShowSortOrderPreferences$SortOrderJsonModel.BY_DATE_ASC;
                        } else if (xfa1Var.equals(xfa1Var4)) {
                            defaultShowSortOrderPreferences$SortOrderJsonModel = DefaultShowSortOrderPreferences$SortOrderJsonModel.BY_DATE_DESC;
                        } else {
                            if (!xfa1Var.equals(xfa1Var2)) {
                                eg.o();
                                return;
                            }
                            defaultShowSortOrderPreferences$SortOrderJsonModel = DefaultShowSortOrderPreferences$SortOrderJsonModel.BY_CONSUMPTION_ORDER;
                        }
                        ywb0 ywb0VarU3 = y441Var2.u();
                        if (ywb0VarU3 != null) {
                            ywb0VarU3.remove(str3);
                            ywb0VarU3.put(str3, defaultShowSortOrderPreferences$SortOrderJsonModel);
                            y441Var2.B(ywb0VarU3);
                        }
                        behaviorSubject2.onNext(xfa1Var);
                    }
                }
                ((gga1) obj2).invoke();
                return;
            case 9:
                urs ursVar = (urs) obj3;
                kpq0 kpq0Var2 = (kpq0) obj2;
                TextView textView = (TextView) ursVar.m1.get(kpq0Var2);
                boolean z2 = ((textView == null || (compoundDrawablesRelative = textView.getCompoundDrawablesRelative()) == null) ? null : compoundDrawablesRelative[2]) != null;
                boolean z3 = kpq0Var2 instanceof ipq0;
                b7x b7xVar = b7x.a;
                if (!z3) {
                    if (!(kpq0Var2 instanceof jpq0)) {
                        eg.o();
                        return;
                    }
                    r2a1 r2a1Var = ursVar.k1;
                    if (z2) {
                        i8h1 i8h1Var = (i8h1) r2a1Var.b;
                        x6h1 x6h1VarC = ((tdl0) r2a1Var.c).b.c();
                        x6h1VarC.i.add(new a7h1("same_sort_order_selected", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        return;
                    }
                    jpq0 jpq0Var2 = (jpq0) kpq0Var2;
                    i8h1 i8h1Var2 = (i8h1) r2a1Var.b;
                    x6h1 x6h1VarC2 = ((tdl0) r2a1Var.c).b.c();
                    x6h1VarC2.i.add(new a7h1("sort", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    if (jpq0Var2.equals(jpq0.a)) {
                        x6h1 x6h1VarC3 = y6h1VarA.c();
                        x6h1VarC3.i.add(new a7h1("new_to_old_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!jpq0Var2.equals(jpq0.b)) {
                            eg.o();
                            return;
                        }
                        x6h1 x6h1VarC4 = y6h1VarA.c();
                        x6h1VarC4.i.add(new a7h1("old_to_new_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                    }
                    i8h1Var2.m(w7h1Var, (xj61) null);
                    return;
                }
                w2z w2zVar = ursVar.j1;
                if (z2) {
                    i8h1 i8h1Var3 = (i8h1) w2zVar.b;
                    x6h1 x6h1VarC5 = ((tdl0) w2zVar.c).b.c();
                    x6h1VarC5.i.add(new a7h1("same_filter_selected", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                ipq0 ipq0Var2 = (ipq0) kpq0Var2;
                i8h1 i8h1Var4 = (i8h1) w2zVar.b;
                x6h1 x6h1VarC6 = ((tdl0) w2zVar.c).b.c();
                x6h1VarC6.i.add(new a7h1("filter", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA2 = x6h1VarC6.a();
                if (ipq0Var2.equals(ipq0.a)) {
                    x6h1 x6h1VarC7 = y6h1VarA2.c();
                    x6h1VarC7.i.add(new a7h1("all_episodes_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                } else if (ipq0Var2.equals(ipq0.b)) {
                    x6h1 x6h1VarC8 = y6h1VarA2.c();
                    x6h1VarC8.i.add(new a7h1("downloads_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!ipq0Var2.equals(ipq0.c)) {
                        eg.o();
                        return;
                    }
                    x6h1 x6h1VarC9 = y6h1VarA2.c();
                    x6h1VarC9.i.add(new a7h1("unplayed_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var4.m(w7h1Var2, (xj61) null);
                return;
            case 10:
                ((iu30) obj3).invoke(((a2w) obj2).e);
                return;
            case 11:
                ((rrr) obj3).b.invoke((p7w) obj2);
                return;
            case 12:
                a63 a63Var = (a63) obj;
                ((p811) obj3).a = a63Var;
                ((mbx) obj2).d.f(a63Var);
                return;
            case 13:
                ee3 ee3Var = (ee3) obj;
                ((p811) obj3).a = ee3Var;
                ((mbx) obj2).d.f(ee3Var);
                return;
            case 14:
                ugu0 ugu0Var = (ugu0) obj;
                ((p811) obj3).a = ugu0Var;
                ((mbx) obj2).d.f(ugu0Var);
                return;
            case 15:
                yjq yjqVar = (yjq) obj3;
                String str4 = ((g8y) obj).a;
                if (str4.length() > 0) {
                    a8y a8yVar = (a8y) yjqVar.e;
                    if (a8yVar == null) {
                        u890.C("viewBinder");
                        throw null;
                    }
                    a8yVar.f.e();
                    a8yVar.e.k(new er91((fs91) null, str4, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    jut jutVar = (jut) yjqVar.c;
                    x6h1 x6h1VarC10 = ((xok0) jutVar.b).b.c();
                    x6h1VarC10.i.add(new a7h1("engage_snackbar", (String) null, (Integer) null, (String) obj2, str4));
                    x6h1VarC10.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC10.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA3;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    ((i8h1) jutVar.c).f(k7h1Var.a(), (Set) null);
                    return;
                }
                return;
            case 16:
                ou80 ou80Var = (ou80) obj3;
                e7p0 e7p0Var = ((v7z) obj2).d;
                if (ou80Var != null) {
                    e7p0.d(e7p0Var, ou80Var);
                    return;
                } else {
                    e7p0Var.c();
                    return;
                }
            case 17:
                ((nif1) obj3).c((Long) null, "await_response_1");
                ((AtomicBoolean) obj2).set(true);
                return;
            case 18:
                Uri uri = (Uri) obj;
                p68 p68Var = (p68) obj3;
                p68Var.a();
                if (p68Var.a) {
                    List list4 = vly0.a;
                    if (u890.j(((Uri) obj2).getQueryParameter("provider"), "paypal")) {
                        currentItem = 1;
                    }
                }
                lan1 lan1Var = (lan1) p68Var.c;
                try {
                    if (currentItem != 0) {
                        lan1Var.c(uri);
                    } else {
                        ((Activity) lan1Var.b).startActivity(new Intent("android.intent.action.VIEW", uri));
                    }
                    ((fyf) p68Var.d).g();
                    return;
                } catch (ActivityNotFoundException e) {
                    Logger.e(e, "Couldn't launch external browser to handle URI %s", new Object[]{uri});
                    return;
                }
            case 19:
                Object obj6 = ((p811) obj3).a;
                if (obj6 instanceof TimeoutException) {
                    gs41Var = gs41.f;
                } else {
                    gs41Var = obj6 != null ? gs41.g : gs41.c;
                }
                ((fu) obj2).invoke(gs41Var);
                return;
            case 20:
                ((ydf0) ((n0v0) ((ur00) obj3).f).b).d((e820) obj2, (z2g0) obj);
                return;
            case 21:
                ((lzn0) obj3).e();
                if (((baw) obj).a) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956379});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    ((kt91) obj2).k(new er91((fs91) null, "", 2131956379, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return;
                }
                return;
            case 22:
                ((lzn0) obj3).e();
                ((Observer) obj2).onNext(ya50.a);
                return;
            case 23:
                ((lzn0) obj3).c();
                Activity activity = (Activity) obj2;
                activity.finish();
                Intent intent = activity.getIntent();
                String str5 = ((nfw) obj).a;
                Intent intent2 = new Intent();
                intent2.setClass(activity, LoginActivity.class);
                intent2.putExtra("intent", intent);
                intent2.putExtra("previously_logged_in", true);
                intent2.putExtra("graduation_token", str5);
                intent2.setFlags(268468224);
                activity.startActivity(intent2);
                return;
            case 24:
                dg30 dg30Var = (dg30) obj3;
                if (dg30Var.isFinishing() || dg30Var.isDestroyed()) {
                    return;
                }
                i2i1 i2i1VarA = ((pbk1) obj2).a(dg30Var, "spotify:home");
                i2i1VarA.c();
                Intent intent3 = (Intent) i2i1VarA.b;
                intent3.addFlags(268468224);
                dg30Var.startActivity(intent3);
                return;
            case 25:
                String str6 = (String) obj;
                r5z r5zVar = (r5z) obj2;
                cf50 cf50Var = (cf50) r5zVar.d;
                int iOrdinal = ((df50) obj3).ordinal();
                if (iOrdinal == 0) {
                    tv80VarB = cf50Var.b(str6);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return;
                    }
                    tv80VarB = cf50Var.c(str6);
                }
                ((xrn0) r5zVar.c).a(str6, tv80VarB);
                return;
            case 26:
                String str7 = (String) obj;
                wp20 wp20Var = (wp20) obj2;
                xe50 xe50Var = (xe50) wp20Var.c;
                int iOrdinal2 = ((df50) obj3).ordinal();
                if (iOrdinal2 == 0) {
                    tv80VarB2 = xe50Var.b(str7);
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return;
                    }
                    tv80VarB2 = xe50Var.c(str7);
                }
                ((xrn0) wp20Var.b).a(str7, tv80VarB2);
                return;
            case 27:
                sr60 sr60Var = (sr60) obj;
                twj1 twj1Var = sr60Var.b;
                VideoSurfaceView videoSurfaceView = ((tr60) obj3).k1;
                boolean z4 = sr60Var.a;
                videoSurfaceView.setVisibility((!z4 || (twj1Var instanceof rwj1)) ? 8 : 0);
                View view = (View) obj2;
                if (view != null) {
                    if (z4 && !(twj1Var instanceof rwj1)) {
                        currentItem = 8;
                    }
                    view.setVisibility(currentItem);
                    return;
                }
                return;
            case 28:
                ((o811) obj3).a = ((yqg) obj2).b();
                return;
            default:
                c580 c580Var = (c580) obj3;
                InAppBrowserActivity inAppBrowserActivity = c580Var.a;
                Toast.makeText((Context) inAppBrowserActivity, 2131963856, 0).show();
                vga0 vga0Var = new vga0();
                eqr0.K(vga0Var, "errorReason", "uri_not_supported");
                eqr0.K(vga0Var, "currentUrl", (String) obj2);
                uga0 uga0VarA = vga0Var.a();
                z480 z480VarN = InAppBrowserEvent.n();
                e4p1.u(z480VarN, 3);
                z480VarN.y(c580Var.Y.b());
                z480VarN.n(c580Var.b().b);
                z480VarN.r(ihc1.c1(4600, c580Var.b().a));
                z480VarN.q(c580Var.b().d);
                int i = c580Var.R0;
                c580Var.R0 = i + 1;
                z480VarN.v(i);
                z480VarN.u(inAppBrowserActivity.o0());
                z480VarN.w(c580Var.S0);
                e4p1.t(z480VarN, uga0VarA);
                f3o1.r(c580Var.X, z480VarN);
                return;
        }
    }

    public /* synthetic */ lgr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
