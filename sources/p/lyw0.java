package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.nowplayingmodes.adsmode.events.proto.AdFeedbackEvent;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lyw0 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public lyw0(mm30 mm30Var) {
        this.a = (byte) 18;
        mm30Var.getClass();
        this.b = mm30Var;
    }

    public final void accept(Object obj) {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int streamMaxVolume = 0;
        switch (this.a) {
            case 0:
                Toast.makeText((Context) ((lls0) this.b).c, 2131955714, 1).show();
                return;
            case 1:
                Logger.e((Throwable) obj, l1d.m("Failed to check canDMUser for ", ((j4x0) this.b).e), new Object[0]);
                return;
            case 2:
                Logger.e((Throwable) obj, l1d.m("Failed to check canDMUser for ", ((i4x0) this.b).e), new Object[0]);
                return;
            case 3:
                o730 o730Var = (o730) this.b;
                fn31.T(o730Var.a, (o8n) null, 0, new n730(o730Var, ((j9x0) obj).c, (lnm) null, (byte) 1), 3);
                return;
            case 4:
                ((CompletableSubject) this.b).onError((Throwable) obj);
                return;
            case 5:
                ((edx0) this.b).h((Throwable) obj);
                return;
            case 6:
                utw0 utw0Var = ike1.a;
                utw0Var.y("Profile Platform Fail");
                utw0Var.r((Throwable) obj);
                ((odx0) this.b).stop();
                return;
            case 7:
                ((sdx0) this.b).j.onNext(Boolean.FALSE);
                utw0 utw0Var2 = ike1.a;
                utw0Var2.y("ProfileSectionCoordinator");
                utw0Var2.s((Throwable) obj, "Editor detection failed, keeping non-editor layout", new Object[0]);
                return;
            case 8:
                ((cqx0) this.b).b.accept(fsx0.a);
                return;
            case 9:
                a1r0.i((a1r0) ((lry0) this.b).a.b, "spotify:internal:puffin-setup-autodetect", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((jry0) obj).e), 2);
                return;
            case 10:
                ((yaz0) this.b).h = (bbz0) obj;
                return;
            case 11:
                lgz0 lgz0Var = (lgz0) this.b;
                t45 t45Var = lgz0Var.q;
                if (t45Var != null) {
                    t45Var.g("play_something");
                }
                t45 t45Var2 = lgz0Var.q;
                if (t45Var2 != null) {
                    lgz0Var.j.b(t45Var2.e());
                }
                lgz0Var.q = null;
                return;
            case 12:
                e301 e301Var = (e301) obj;
                ((h301) this.b).c.a(e301Var.a, e301Var.b);
                return;
            case 13:
                rbg1 rbg1Var = (rbg1) obj;
                ((m801) this.b).b(rbg1Var.a, rbg1Var.b);
                return;
            case 14:
                y901 y901VarG = ((th30) this.b).G("read_along_report_issue_dialog");
                y901 y901Var = y901VarG instanceof y901 ? y901VarG : null;
                if (y901Var != null) {
                    y901Var.dismiss();
                    return;
                }
                return;
            case 15:
                ((on01) this.b).a(1, (String) null, "Failed to load recent searches. " + ((Throwable) obj).getMessage());
                return;
            case 16:
                ((no01) this.b).h.onError((Throwable) obj);
                return;
            case 17:
                wmy wmyVar = (wmy) this.b;
                a1r0 a1r0Var = (a1r0) wmyVar.e;
                if (((rqd0) obj) instanceof oqd0) {
                    if (a1r0Var.h((gj5) wmyVar.a)) {
                        a1r0Var.g();
                        return;
                    } else {
                        ((lzn0) wmyVar.d).e();
                        return;
                    }
                }
                return;
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                mm30 mm30Var = (mm30) this.b;
                mm30Var.a.f(new dwn0(mm30Var.b, "", false, false, 0, 0, true, null, null, null));
                return;
            case 19:
                j0n1 j0n1Var = (j0n1) ((n0v0) this.b).b;
                j0n1Var.c.a(j0n1Var.a.d().subscribe(new rdj1((Object) j0n1Var, (byte) 20), vrk1.Y));
                return;
            case 20:
                String str = ((fxd0) this.b).a;
                ConcurrentHashMap.KeySetView keySetView = eto0.a;
                if (str.length() > 0) {
                    eto0.a.add(str);
                    return;
                }
                return;
            case 21:
                String str2 = ((gxd0) this.b).a;
                ConcurrentHashMap.KeySetView keySetView2 = eto0.a;
                if (str2.length() > 0) {
                    eto0.a.add(str2);
                    return;
                }
                return;
            case 22:
                l3 l3Var = (l3) this.b;
                mi11 mi11Var = (mi11) l3Var.i;
                t8r0 t8r0Var = mi11Var.d;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) l3Var.h;
                ij11 ij11Var = new ij11(2131961026);
                b3j0 b3j0Var = new b3j0(false);
                zkz0 zkz0Var = new zkz0(mi11Var, (ji11) obj, (byte) 18);
                dg30 dg30Var = (dg30) t8r0Var.a;
                int i4 = TooltipContainer.P0;
                TooltipContainer tooltipContainerFindViewById = dg30Var.findViewById(2131431413);
                tooltipContainerFindViewById.getClass();
                vnd1 vnd1Var = new vnd1(tooltipContainerFindViewById, (byte) 5);
                jj11 jj11VarC = ((tz01) t8r0Var.b).c(ij11Var);
                jj11VarC.e = zkz0Var;
                vnd1Var.b = jj11VarC;
                vnd1Var.x(appCompatImageButton, b3j0Var);
                return;
            case 23:
                az11 az11Var = (az11) this.b;
                Logger.g(gvg.e(az11Var.c.b(), "Fetching RC properties and product state with ", " ms delay"), new Object[0]);
                az11Var.X.onNext(s020.a);
                return;
            case 24:
                if (dz11.a[((wte0) obj).ordinal()] == 1) {
                    ez11 ez11Var = (ez11) this.b;
                    synchronized (ez11Var) {
                        ez11Var.a.clear();
                        ez11Var.b.g();
                    }
                    return;
                }
                return;
            case 25:
                h26 h26Var = (h26) obj;
                lc00 lc00Var = (xb00) this.b;
                ArrayList arrayList = new ArrayList();
                int i5 = h26Var.j;
                if (i5 != 0 && (i3 = h26Var.i) != 0) {
                    arrayList.add(new orz0(i5, i3));
                }
                int i6 = h26Var.l;
                if (i6 != 0 && (i2 = h26Var.k) != 0) {
                    arrayList.add(new orz0(i6, i2));
                }
                int i7 = h26Var.n;
                if (i7 != 0 && (i = h26Var.m) != 0) {
                    arrayList.add(new orz0(i7, i));
                }
                uxy0 uxy0Var = new uxy0((Object) h26Var, (Object) arrayList, (byte) 21);
                lc00 lc00Var2 = lc00Var;
                synchronized (lc00Var2) {
                    try {
                        adn0 adn0VarC = lc00Var2.c();
                        adn0VarC.getClass();
                        w7x w7xVar = w7x.a;
                        adn0 adn0VarA = adn0.a(adn0VarC, (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, w7xVar, 8191);
                        adn0 adn0VarY = uxy0Var.y(adn0VarA);
                        if (adn0.a(adn0VarY, (Integer) null, false, false, false, false, false, (ArrayList) null, 0, 0, 0, 0, false, w7xVar, 8191).equals(adn0VarA)) {
                            return;
                        }
                        lc00Var2.N = adn0VarY;
                        if (adn0VarY.m.contains(zcn0.c)) {
                            List<orz0> list = adn0VarY.g;
                            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                            for (orz0 orz0Var : list) {
                                arrayList2.add(new urz0(orz0Var.a, orz0Var.b));
                            }
                            prz0 prz0Var = (prz0) lc00Var2.y.getValue();
                            synchronized (prz0Var.c) {
                                prz0Var.b = arrayList2;
                            }
                            zq4 zq4Var = prz0Var.a;
                            "Rules changed: ".concat(o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                            zq4Var.a();
                        }
                        if (lc00Var2.O) {
                            if (adn0VarY.m.contains(zcn0.b)) {
                                if (lc00Var2.v.isInitialized()) {
                                    xc00 xc00Var = (vc00) lc00Var2.v.getValue();
                                    if (!xc00Var.g.isDisposed()) {
                                        xc00Var.g.dispose();
                                    }
                                }
                                if (lc00Var2.c().h <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    ((vc00) lc00Var2.v.getValue()).b();
                                }
                            }
                            if (adn0VarY.m.contains(zcn0.a)) {
                                tks0 tks0VarB = lc00Var2.b();
                                synchronized (tks0VarB) {
                                    if (!tks0VarB.e.isDisposed()) {
                                        tks0VarB.e.dispose();
                                    }
                                    break;
                                }
                                lc00Var2.b().b();
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 26:
                ((ai21) this.b).b.h(((wh21) obj).a);
                return;
            case 27:
                Uri uri = (Uri) obj;
                lm21 lm21Var = (lm21) this.b;
                int i8 = lm21.Y1;
                WebView webView = ((ijl1) lm21Var).H1;
                if (webView != null) {
                    webView.post(new jyh0((Object) lm21Var, (Object) uri, (byte) 17));
                    return;
                }
                return;
            case 28:
                vi11 vi11Var = (vi11) this.b;
                cql cqlVar = (cql) vi11Var.e;
                g521 g521Var = new g521(vi11Var, (byte) 16);
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) obj);
                Activity activity = cqlVar.a;
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                    return;
                } else {
                    g521Var.invoke();
                    return;
                }
            default:
                mmr0 mmr0Var = (mmr0) obj;
                vp41 vp41Var = (vp41) this.b;
                l62 l62Var = (l62) mmr0Var.a;
                long jLongValue = ((Number) mmr0Var.b).longValue();
                ycc1 ycc1Var = vp41Var.b;
                uw7 uw7Var = (mw7) ycc1Var.b;
                double d = uw7Var.d();
                try {
                    streamMaxVolume = uw7Var.a.getStreamMaxVolume(3);
                    break;
                } catch (NullPointerException unused) {
                }
                sp0 sp0VarN = AdFeedbackEvent.n();
                sp0VarN.v(l62Var.i);
                sp0VarN.s(l62Var.c);
                sp0VarN.q(l62Var.X);
                sp0VarN.n(l62Var.t);
                sp0VarN.r(l62Var.b);
                sp0VarN.x(d / ((double) streamMaxVolume));
                sp0VarN.w(jLongValue);
                sp0VarN.u(l62Var.R0.a);
                sp0VarN.t("screenshot");
                ((t2j0) ycc1Var.c).a(sp0VarN.build());
                return;
        }
    }

    public /* synthetic */ lyw0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public /* synthetic */ lyw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
