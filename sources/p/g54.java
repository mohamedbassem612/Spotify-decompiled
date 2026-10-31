package p;

import android.R;
import android.os.Process;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.search.ui.BackKeyEditText;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import com.spotify.authentication.credentials.UnencryptedCredentials;
import com.spotify.authentication.oauthsetupimpl.NativeOAuthSetupImpl;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.pubsubsetupv2impl.NativePubSubSetupV2Impl;
import com.spotify.connectivity.trafficsetupimpl.NativeTrafficSetupImpl;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.fileaccess.fileio.NativeFileIO;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g54 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ g54(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        yrd1 yrd1VarB;
        long jNanoTime;
        switch (this.a) {
            case 0:
                h54 h54Var = (h54) this.b;
                ynb0 ynb0Var = h54Var.b;
                t57 t57Var = (t57) ynb0Var.get();
                ((File) t57Var.a.get()).mkdirs();
                Iterator it = t57Var.b.entrySet().iterator();
                while (it.hasNext()) {
                    q57 q57Var = (q57) ((Map.Entry) it.next()).getValue();
                    if (y520.I((File) t57Var.a.get(), q57Var.a).exists()) {
                        t57Var.c.put(q57Var.a, i67.c);
                    }
                }
                Iterator it2 = o7h.l1(((t57) ynb0Var.get()).b.values()).iterator();
                while (it2.hasNext()) {
                }
                h54Var.d.countDown();
                return;
            case 1:
                krw0 krw0Var = krw0.i;
                tac0 tac0Var = u7n0.w().f;
                vo5 vo5Var = (vo5) this.b;
                tac0Var.a(vo5Var);
                vo5Var.d.post(new s10(vo5Var, (byte) 8));
                return;
            case 2:
                gjb gjbVar = (gjb) this.b;
                if (gjbVar.h) {
                    gjbVar.h = false;
                    gjbVar.b();
                    return;
                }
                return;
            case 3:
                ((Function0) this.b).invoke();
                return;
            case 4:
                ncl nclVar = (ncl) this.b;
                xln0 xln0Var = NativeAuthenticatedScope.Companion;
                NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = nclVar.a.a;
                NativeRouter nativeRouter = nclVar.b.getNativeRouter();
                NativeApplicationScope nativeApplicationScopeA = nclVar.c.a();
                NativeSession nativeSessionA = nclVar.f.a();
                NativePubSubSetupV2Impl nativePubSubSetupV2Impl = nclVar.g.e;
                if (nativePubSubSetupV2Impl == null) {
                    u890.C("nativePubSubSetup");
                    throw null;
                }
                AnalyticsDelegate analyticsDelegate = nclVar.d;
                AuthenticatedScopeConfiguration authenticatedScopeConfiguration = nclVar.e;
                NativeFileIO nativeFileIO = nclVar.i.a;
                xln0Var.getClass();
                nclVar.t = NativeAuthenticatedScope.create(nativeTimerManagerThreadImpl, nativeRouter, nativeApplicationScopeA, nativeSessionA, nativePubSubSetupV2Impl, analyticsDelegate, authenticatedScopeConfiguration, nativeFileIO);
                return;
            case 5:
                d5n d5nVar = (d5n) this.b;
                d5nVar.X0 = d5nVar.b();
                return;
            case 6:
                rzq rzqVar = (rzq) this.b;
                rzqVar.s.set(false);
                rzqVar.m();
                return;
            case 7:
                ((t3x) this.b).invoke();
                return;
            case 8:
                synchronized (((ymd0) this.b).a) {
                    obj = ((ymd0) this.b).f;
                    ((ymd0) this.b).f = ymd0.X;
                    break;
                }
                ((ymd0) this.b).m(obj);
                return;
            case 9:
                LoadingView loadingView = (LoadingView) this.b;
                if (loadingView.N0 == 2) {
                    loadingView.N0 = 3;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    loadingView.i = alphaAnimation;
                    alphaAnimation.setDuration(loadingView.d);
                    loadingView.i.setInterpolator(loadingView.getContext(), R.interpolator.decelerate_quad);
                    loadingView.i.setAnimationListener(loadingView.R0);
                    loadingView.startAnimation(loadingView.i);
                    loadingView.setVisibility(0);
                    loadingView.postDelayed(loadingView.P0, loadingView.b.c());
                    return;
                }
                return;
            case 10:
                kyh0 kyh0Var = (kyh0) this.b;
                eyh0 eyh0Var = kyh0Var.i;
                if (eyh0Var == null) {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
                if (eyh0Var.o()) {
                    return;
                }
                eyh0 eyh0Var2 = kyh0Var.i;
                if (eyh0Var2 == null) {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
                eyh0Var2.y(true);
                eyh0 eyh0Var3 = kyh0Var.i;
                if (eyh0Var3 == null) {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
                hyh0 hyh0Var = kyh0Var.j;
                if (hyh0Var == null) {
                    u890.C("callback");
                    throw null;
                }
                eyh0Var3.z(hyh0Var, kyh0Var.k);
                eyh0 eyh0Var4 = kyh0Var.i;
                if (eyh0Var4 == null || eyh0Var4.e().f() == null) {
                    kyh0Var.l(r0i0.o);
                    return;
                }
                return;
            case 11:
                pmy0 pmy0Var = (pmy0) this.b;
                pmn0 pmn0Var = NativePubSubSetupV2Impl.Companion;
                c85 c85Var = pmy0Var.d;
                NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl2 = pmy0Var.a.a;
                NativeOAuthSetupImpl nativeOAuthSetupImplA = pmy0Var.b.a();
                NativeApplicationScope nativeApplicationScopeA2 = pmy0Var.c.a();
                pmn0Var.getClass();
                pmy0Var.e = NativePubSubSetupV2Impl.create(c85Var, nativeTimerManagerThreadImpl2, nativeOAuthSetupImplA, nativeApplicationScopeA2);
                return;
            case 12:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (!recyclerView.X0 || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.V0) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.a1) {
                    recyclerView.Z0 = true;
                    return;
                } else {
                    recyclerView.t();
                    return;
                }
            case 13:
                ph61 ph61Var = (ph61) this.b;
                di8 di8Var = ph61Var.f.a;
                UnencryptedCredentials unencryptedCredentials = new UnencryptedCredentials(di8Var.a, di8Var.c.b);
                rmn0 rmn0Var = NativeSession.Companion;
                NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl3 = ph61Var.b.a;
                NativeApplicationScope nativeApplicationScopeA3 = ph61Var.c.a();
                NativeOAuthSetupImpl nativeOAuthSetupImplA2 = ph61Var.e.a();
                Map map = ph61Var.a;
                String str = ((zym0) ph61Var.d).b;
                rmn0Var.getClass();
                ph61Var.g = NativeSession.createNativeSessionWithoutAp(nativeTimerManagerThreadImpl3, nativeApplicationScopeA3, unencryptedCredentials, nativeOAuthSetupImplA2, map, str);
                return;
            case 14:
                vl61 vl61Var = (vl61) this.b;
                vl61Var.c.a(vl61Var.f);
                return;
            case 15:
                ((il91) this.b).i.i(w8c0.b);
                return;
            case 16:
                isd1 isd1Var = (isd1) this.b;
                synchronized (isd1Var) {
                    isd1Var.g++;
                    yrd1VarB = isd1Var.b();
                }
                if (yrd1VarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    yrd1 yrd1Var = yrd1VarB;
                    try {
                        threadCurrentThread.setName(yrd1Var.a);
                        Logger logger = ((isd1) this.b).b;
                        hsd1 hsd1Var = yrd1Var.c;
                        hsd1Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            o0p1.j(logger, yrd1Var, hsd1Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = yrd1Var.a();
                            if (zIsLoggable) {
                                o0p1.j(logger, yrd1Var, hsd1Var, "finished run in " + o0p1.m(System.nanoTime() - jNanoTime));
                            }
                            isd1 isd1Var2 = (isd1) this.b;
                            synchronized (isd1Var2) {
                                isd1Var2.a(yrd1Var, jA, true);
                                yrd1VarB = isd1Var2.b();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                o0p1.j(logger, yrd1Var, hsd1Var, "failed a run in " + o0p1.m(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            isd1 isd1Var3 = (isd1) this.b;
                            synchronized (isd1Var3) {
                                isd1Var3.a(yrd1Var, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (yrd1VarB != null);
                threadCurrentThread.setName(name);
                return;
            case 17:
                e4g1 e4g1Var = (e4g1) this.b;
                NativeTrafficSetupImpl.Companion.getClass();
                e4g1Var.b = NativeTrafficSetupImpl.create();
                return;
            case 18:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.b;
                if (videoSurfaceView.e) {
                    return;
                }
                videoSurfaceView.i(videoSurfaceView.getUseSurfaceView());
                return;
            case 19:
                xap1.z((BackKeyEditText) this.b);
                return;
            case 20:
                Process.setThreadPriority(0);
                ((Runnable) this.b).run();
                return;
            case 21:
                s4l1.d((s4l1) this.b);
                return;
            case 22:
                ytn1 ytn1Var = (ytn1) this.b;
                ytn1Var.getClass();
                ksn1 ksn1Var = new ksn1(ytn1Var);
                wf61 wf61Var = ytn1Var.f;
                zod.s(wf61Var);
                wf61Var.a(ksn1Var);
                return;
            default:
                ((fvo1) this.b).a("Service disconnected");
                return;
        }
    }
}
