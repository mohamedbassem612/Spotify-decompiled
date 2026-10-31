package p;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pyf extends ijl1 {
    public final lpd V1;
    public Scheduler W1;
    public izj X1;
    public g341 Y1;
    public hik1 Z1;
    public dma1 a2;
    public q7b1 b2;
    public Disposable c2;
    public tyf d2;
    public b2r0 e2;
    public gik1 f2;
    public dsk0 g2;
    public dik1 h2;
    public uyf i2;
    public kp00 j2;
    public final e821 k2;
    public final idd1 l2;
    public static final /* synthetic */ mma0[] n2 = {new een0(pyf.class, "firstInitialUrlLoad", "getFirstInitialUrlLoad()Z", 0)};
    public static final lhc m2 = new lhc((byte) 1);
    public static final bma1 o2 = bma1.b.q("webview_debug_fail_first_initial_url");

    public pyf(lpd lpdVar) {
        this.V1 = lpdVar;
        nyf nyfVar = nyf.b;
        ae41 ae41Var = ae41.b;
        kl1 kl1Var = ae41Var.a;
        jd11 jd11Var = rc11.a;
        this.k2 = fdg1.W(this, wmo1.s(kl1Var, jd11Var.m(jd11Var.b(Boolean.TYPE), Collections.EMPTY_LIST, false)), ae41Var, nyfVar);
        this.l2 = new idd1(new myf(this, (byte) 0));
    }

    public final void I0(View view, Bundle bundle) {
        int i = 2131427810;
        ImageView imageView = (ImageView) m5n1.t(view, 2131427810);
        if (imageView != null) {
            i = 2131431529;
            TextView textView = (TextView) m5n1.t(view, 2131431529);
            if (textView != null) {
                this.j2 = new kp00((LinearLayout) view, imageView, textView, (byte) 19);
                if (this.d2 == null) {
                    wyf wyfVar = (wyf) m1(wyf.class);
                    tyf tyfVar = wyfVar != null ? wyfVar.a : null;
                    if (tyfVar == null) {
                        hhg1.n("Required value was null.");
                        return;
                    }
                    this.d2 = tyfVar;
                    b2r0 b2r0Var = (b2r0) tyfVar.a.get();
                    this.e2 = b2r0Var;
                    hik1 hik1Var = this.Z1;
                    if (hik1Var == null) {
                        u890.C("viewUbiImpressionLoggerFactory");
                        throw null;
                    }
                    this.f2 = hik1Var.a(this, b2r0Var);
                }
                yyf yyfVar = (yyf) m1(yyf.class);
                uyf uyfVar = yyfVar != null ? yyfVar.a : null;
                if (uyfVar == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                this.i2 = uyfVar;
                if (this.f2 == null) {
                    u890.C("viewUbiImpressionLogger");
                    throw null;
                }
                gik1.b(view);
                gik1 gik1Var = this.f2;
                if (gik1Var == null) {
                    u890.C("viewUbiImpressionLogger");
                    throw null;
                }
                gik1Var.a(view, new myf(this, (byte) 2));
                kp00 kp00Var = this.j2;
                if (kp00Var != null) {
                    ((ImageView) kp00Var.b).setOnClickListener(new c20(this, (byte) 15));
                }
                kyf kyfVar = ((lyf) this.l2.getValue()).b;
                if (kyfVar instanceof iyf) {
                    kp00 kp00Var2 = this.j2;
                    if (kp00Var2 != null) {
                        ((TextView) kp00Var2.c).setVisibility(4);
                        return;
                    }
                    return;
                }
                if (kyfVar instanceof gyf) {
                    kp00 kp00Var3 = this.j2;
                    if (kp00Var3 != null) {
                        ((TextView) kp00Var3.c).setText(((gyf) kyfVar).a);
                        return;
                    }
                    return;
                }
                if (kyfVar instanceof hyf) {
                    kp00 kp00Var4 = this.j2;
                    if (kp00Var4 != null) {
                        ((TextView) kp00Var4.c).setText(l0(2131953825));
                        return;
                    }
                    return;
                }
                if (!(kyfVar instanceof jyf)) {
                    eg.o();
                    return;
                }
                kp00 kp00Var5 = this.j2;
                if (kp00Var5 != null) {
                    ((TextView) kp00Var5.c).setText(((jyf) kyfVar).a);
                    return;
                }
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public final int Z0() {
        return 2131624661;
    }

    public final boolean b1(Uri uri) {
        izj izjVar = this.X1;
        if (izjVar != null) {
            return izjVar.c(uri);
        }
        u890.C("uriInterceptor");
        throw null;
    }

    public final void c1() {
        Disposable disposable = this.c2;
        if (disposable != null) {
            disposable.dispose();
        }
        mma0[] mma0VarArr = n2;
        mma0 mma0Var = mma0VarArr[0];
        e821 e821Var = this.k2;
        if (((Boolean) e821Var.m(this, mma0Var)).booleanValue()) {
            e821Var.v(mma0VarArr[0], this, Boolean.FALSE);
            dma1 dma1Var = this.a2;
            if (dma1Var == null) {
                u890.C("preferences");
                throw null;
            }
            if (dma1Var.h(o2, false)) {
                return;
            }
        }
        q7b1 q7b1Var = this.b2;
        if (q7b1Var == null) {
            u890.C("webViewCookies");
            throw null;
        }
        CompletableToSingle completableToSingleX = q7b1Var.a().x(rih1.a);
        g341 g341Var = this.Y1;
        if (g341Var == null) {
            u890.C("rxWebToken");
            throw null;
        }
        Single singleZip = Single.zip(completableToSingleX, g341Var.c(((lyf) this.l2.getValue()).c), drm0.O0);
        Scheduler scheduler = this.W1;
        if (scheduler != null) {
            this.c2 = singleZip.observeOn(scheduler).subscribe(new mba(this, (byte) 19), fcc.X);
        } else {
            u890.C("mainScheduler");
            throw null;
        }
    }

    public final void e1(String str) {
        boolean zIsTerminated;
        ExecutorService executorService = this.h2;
        if (executorService != null) {
            if (executorService instanceof AutoCloseable) {
                executorService.close();
            } else {
                if (!(executorService instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = executorService;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        WebView webView = ((ijl1) this).H1;
        if (webView != null) {
            gik1 gik1Var = this.f2;
            if (gik1Var != null) {
                this.h2 = gik1Var.a(webView, new oyf(this, str, (byte) 0));
            } else {
                u890.C("viewUbiImpressionLogger");
                throw null;
            }
        }
    }

    public final void f1(String str) {
        boolean zIsTerminated;
        ExecutorService executorService = this.h2;
        if (executorService != null) {
            if (executorService instanceof AutoCloseable) {
                executorService.close();
            } else {
                if (!(executorService instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = executorService;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        WebView webView = ((ijl1) this).H1;
        if (webView != null) {
            gik1 gik1Var = this.f2;
            if (gik1Var != null) {
                this.h2 = gik1Var.a(webView, new oyf(this, str, (byte) 1));
            } else {
                u890.C("viewUbiImpressionLogger");
                throw null;
            }
        }
    }

    public final void g1(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean zIsTerminated;
        ExecutorService executorService = this.h2;
        if (executorService != null) {
            if (executorService instanceof AutoCloseable) {
                executorService.close();
            } else {
                if (!(executorService instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = executorService;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        ViewGroup viewGroup = ((ijl1) this).J1;
        if (viewGroup != null) {
            gik1 gik1Var = this.f2;
            if (gik1Var != null) {
                this.h2 = gik1Var.a(viewGroup, new d1c(this, webResourceError, webResourceRequest, (byte) 15));
            } else {
                u890.C("viewUbiImpressionLogger");
                throw null;
            }
        }
    }

    public final void h1(SslError sslError) {
        boolean zIsTerminated;
        ExecutorService executorService = this.h2;
        if (executorService != null) {
            if (executorService instanceof AutoCloseable) {
                executorService.close();
            } else {
                if (!(executorService instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = executorService;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        ViewGroup viewGroup = ((ijl1) this).J1;
        if (viewGroup != null) {
            gik1 gik1Var = this.f2;
            if (gik1Var != null) {
                this.h2 = gik1Var.a(viewGroup, new ame(this, sslError, (byte) 10));
            } else {
                u890.C("viewUbiImpressionLogger");
                throw null;
            }
        }
    }

    public final void i1(String str) {
        kp00 kp00Var;
        if (!(((lyf) this.l2.getValue()).b instanceof jyf) || (kp00Var = this.j2) == null) {
            return;
        }
        ((TextView) kp00Var.c).setText(str);
    }

    public final void j1() {
        uba ubaVar = this.e2;
        if (ubaVar == null) {
            u890.C("ubiLogger");
            throw null;
        }
        dsk0 dsk0Var = this.g2;
        if (dsk0Var == null) {
            u890.C("webviewEventsFact");
            throw null;
        }
        x6h1 x6h1VarC = dsk0Var.b.c();
        x6h1VarC.i.add(new a7h1("page_error", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("reload_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        uba ubaVar2 = ubaVar;
        ubaVar2.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void k1() {
        boolean zIsTerminated;
        ExecutorService executorService = this.h2;
        if (executorService != null) {
            if (executorService instanceof AutoCloseable) {
                executorService.close();
            } else {
                if (!(executorService instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = executorService;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        ViewGroup viewGroup = ((ijl1) this).J1;
        if (viewGroup != null) {
            gik1 gik1Var = this.f2;
            if (gik1Var != null) {
                this.h2 = gik1Var.a(viewGroup, new myf(this, (byte) 1));
            } else {
                u890.C("viewUbiImpressionLogger");
                throw null;
            }
        }
    }

    public final dbr0 m1(Class cls) {
        try {
            View view = ((zf30) this).j1;
            if (view == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dbr0 dbr0VarA = hap1.m(view).b0(cls).a();
            if (dbr0VarA != null) {
                return dbr0VarA;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.zf30*/.v0(context);
        this.g2 = new dsk0(((lyf) this.l2.getValue()).a.a, (byte) 8);
    }

    public final void z0() {
        super.z0();
        this.j2 = null;
        Disposable disposable = this.c2;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
