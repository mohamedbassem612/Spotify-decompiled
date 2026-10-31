package p;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.spotify.adsdisplay.browser.BreadcrumbException;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.messages.InAppBrowserEvent;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c580 implements uil1, o5s {
    public final izj N0;
    public final xn0 O0;
    public long P0;
    public long Q0;
    public int R0;
    public final String S0;
    public final vku T0;
    public final PublishSubject U0;
    public a580 V0;
    public final t2j0 X;
    public final yqg Y;
    public final t8r0 Z;
    public final InAppBrowserActivity a;
    public final xil1 b;
    public final cql c;
    public final yh71 d;
    public final ClipboardManager e;
    public final a1g1 f;
    public final ilh1 g;
    public final zwz0 h;
    public final g341 i;
    public final kt91 t;

    public c580(InAppBrowserActivity inAppBrowserActivity, xil1 xil1Var, cql cqlVar, yh71 yh71Var, ClipboardManager clipboardManager, a1g1 a1g1Var, ilh1 ilh1Var, zwz0 zwz0Var, g341 g341Var, kt91 kt91Var, t2j0 t2j0Var, yqg yqgVar, t8r0 t8r0Var, iac0 iac0Var, izj izjVar, xn0 xn0Var) {
        this.a = inAppBrowserActivity;
        this.b = xil1Var;
        this.c = cqlVar;
        this.d = yh71Var;
        this.e = clipboardManager;
        this.f = a1g1Var;
        this.g = ilh1Var;
        this.h = zwz0Var;
        this.i = g341Var;
        this.t = kt91Var;
        this.X = t2j0Var;
        this.Y = yqgVar;
        this.Z = t8r0Var;
        this.N0 = izjVar;
        this.O0 = xn0Var;
        iac0Var.getLifecycle().a(this);
        xil1Var.b = this;
        this.P0 = yqgVar.b();
        this.R0 = 1;
        this.S0 = UUID.randomUUID().toString();
        this.T0 = new vku();
        this.U0 = new PublishSubject();
    }

    public final k9r a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(b().a));
        Activity activity = this.c.a;
        ResolveInfo resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null) {
            return new k9r(activity, resolveInfoResolveActivity);
        }
        return null;
    }

    public final a580 b() {
        a580 a580Var = this.V0;
        if (a580Var != null) {
            return a580Var;
        }
        u890.C("metadata");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity] */
    public final boolean c(x2i1 x2i1Var) {
        if (x2i1Var instanceof ljq0) {
            this.b.a(((ljq0) x2i1Var).a);
            return true;
        }
        if (!this.g.g(x2i1Var)) {
            return false;
        }
        ?? r0 = this.a;
        r0.finish();
        View view = r0.h1;
        if (view == null) {
            u890.C("errorView");
            throw null;
        }
        view.setVisibility(8);
        r0.H().setVisibility(8);
        d(x2i1Var.a());
        return true;
    }

    public final void d(String str) {
        vga0 vga0Var = new vga0();
        eqr0.K(vga0Var, "unsupportedUri", str);
        uga0 uga0VarA = vga0Var.a();
        z480 z480VarN = InAppBrowserEvent.n();
        e4p1.u(z480VarN, 6);
        z480VarN.n(b().b);
        z480VarN.r(ihc1.c1(4600, b().a));
        z480VarN.q(b().d);
        z480VarN.y(this.Y.b());
        int i = this.R0;
        this.R0 = i + 1;
        z480VarN.v(i);
        z480VarN.u(this.a.o0());
        z480VarN.w(this.S0);
        e4p1.t(z480VarN, uga0VarA);
        f3o1.r(this.X, z480VarN);
    }

    public final void e(String str) {
        String m231Var;
        try {
            m231Var = new URL(str).getHost();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str2 = m231Var;
        if (str2 != null) {
            str = str2;
        }
        InAppBrowserActivity inAppBrowserActivity = this.a;
        inAppBrowserActivity.p1.c(InAppBrowserActivity.t1[1], inAppBrowserActivity, str);
    }

    public final void f(String str) {
        List listF = this.f.f(str, new ft30(1, this, c580.class, "onForbiddenUri", "onForbiddenUri(Ljava/lang/String;)V", 0, (byte) 12));
        listF.toString();
        List list = listF;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c((x2i1) it.next())) {
                    return;
                }
            }
        }
        t8r0 t8r0Var = this.Z;
        this.T0.a(Observable.timer(3000L, TimeUnit.MILLISECONDS, (Scheduler) t8r0Var.a).takeUntil(this.U0).observeOn((Scheduler) t8r0Var.b).onErrorResumeNext(new ep31(new BreadcrumbException(), (byte) 1)).subscribe(new lgr(this, str, (byte) 29)));
    }

    public final void g() {
        idd1 idd1Var = this.b.c;
        ((WebView) idd1Var.getValue()).reload();
        String url = ((WebView) idd1Var.getValue()).getUrl();
        if (url == null) {
            return;
        }
        vga0 vga0Var = new vga0();
        eqr0.K(vga0Var, "currentUrl", url);
        uga0 uga0VarA = vga0Var.a();
        z480 z480VarN = InAppBrowserEvent.n();
        e4p1.u(z480VarN, 8);
        z480VarN.n(b().b);
        z480VarN.r(ihc1.c1(4600, b().a));
        z480VarN.q(b().d);
        z480VarN.y(this.Y.b());
        int i = this.R0;
        this.R0 = i + 1;
        z480VarN.v(i);
        z480VarN.u(this.a.o0());
        z480VarN.w(this.S0);
        e4p1.t(z480VarN, uga0VarA);
        f3o1.r(this.X, z480VarN);
    }

    public final boolean h(String str) {
        Object next;
        if (this.N0.c(Uri.parse(str))) {
            d(str);
            return true;
        }
        Iterator it = this.f.f(str, new ft30(1, this, c580.class, "onForbiddenUri", "onForbiddenUri(Ljava/lang/String;)V", 0, (byte) 13)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((x2i1) next) instanceof nrn0));
        x2i1 x2i1Var = (x2i1) next;
        if (x2i1Var == null) {
            return false;
        }
        return c(x2i1Var);
    }

    public final void onCreate(iac0 iac0Var) {
        vga0 vga0Var = new vga0();
        eqr0.K(vga0Var, "browserType", "webView");
        uga0 uga0VarA = vga0Var.a();
        z480 z480VarN = InAppBrowserEvent.n();
        e4p1.u(z480VarN, 4);
        z480VarN.n(b().b);
        z480VarN.r(ihc1.c1(4600, b().a));
        z480VarN.q(b().d);
        z480VarN.y(this.Y.b());
        int i = this.R0;
        this.R0 = i + 1;
        z480VarN.v(i);
        z480VarN.u(this.a.o0());
        z480VarN.w(this.S0);
        e4p1.t(z480VarN, uga0VarA);
        f3o1.r(this.X, z480VarN);
    }

    public final void onDestroy(iac0 iac0Var) {
        this.b.b = null;
        this.T0.c();
        z480 z480VarN = InAppBrowserEvent.n();
        e4p1.u(z480VarN, 1);
        z480VarN.n(b().b);
        z480VarN.r(ihc1.c1(4600, b().a));
        z480VarN.q(b().d);
        z480VarN.y(this.Y.b());
        z480VarN.x(this.Q0);
        int i = this.R0;
        this.R0 = i + 1;
        z480VarN.v(i);
        z480VarN.u(this.a.o0());
        z480VarN.w(this.S0);
        f3o1.r(this.X, z480VarN);
    }

    public final void onStart(iac0 iac0Var) {
        this.P0 = this.Y.b();
    }

    public final void onStop(iac0 iac0Var) {
        this.Q0 = (this.Y.b() - this.P0) + this.Q0;
    }
}
