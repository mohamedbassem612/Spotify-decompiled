package p;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import com.spotify.base.java.logging.Logger;
import com.spotify.coremediarenderer.bridge.CmrBridge;
import com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener;
import com.spotify.coremediarenderer.videosinkimpl.NativeVideoSinkImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wtg implements AutoCloseable, PlaybackRegistrationListener {
    public qsg X;
    public volatile boolean Y;
    public boolean Z;
    public final cug a;
    public final dg8 b;
    public final eug c;
    public final lag e;
    public String g;
    public Surface h;
    public int i;
    public int t;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final LinkedHashMap f = new LinkedHashMap();
    public final lo9 N0 = new lo9(this, (byte) 17);

    public wtg(cug cugVar, dg8 dg8Var, cua cuaVar, eug eugVar, jtg jtgVar, ftg ftgVar) {
        this.a = cugVar;
        this.b = dg8Var;
        this.c = eugVar;
        this.e = new lag(jtgVar, ftgVar);
    }

    public final Surface a(String str) throws InterruptedException {
        Surface surface = this.h;
        qsg qsgVar = null;
        if (!str.equals(this.g)) {
            surface = null;
        }
        if (surface != null) {
            return surface;
        }
        qsg qsgVar2 = this.X;
        if (qsgVar2 != null) {
            return qsgVar2;
        }
        if (NativeVideoSinkImpl.nativeIsPlaceholderSurfaceSupported()) {
            int i = qsg.g;
            HandlerThread handlerThread = new HandlerThread("CmrPlaceholderSurface");
            handlerThread.start();
            p811 p811Var = new p811();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(handlerThread.getLooper()).post(new uu1(p811Var, handlerThread, countDownLatch, (byte) 6));
            countDownLatch.await();
            if (p811Var.a == null) {
                handlerThread.quitSafely();
            }
            qsgVar = (qsg) p811Var.a;
        }
        this.X = qsgVar;
        return qsgVar;
    }

    public final void c() {
        int i;
        int i2;
        for (ttg ttgVar : this.f.values()) {
            String str = ttgVar.a;
            wtg wtgVar = ttgVar.g;
            if (str.equals(wtgVar.g) && wtgVar.h != null && (i = wtgVar.i) > 0 && (i2 = wtgVar.t) > 0) {
                ((CmrBridge) wtgVar.b.b).e(str, ttgVar.b, ttgVar.c, ttgVar.d, ttgVar.e, i, i2);
            }
            ttgVar.a(a(ttgVar.a));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        cug cugVar = this.a;
        cugVar.getClass();
        xt7 xt7Var = new xt7(cugVar, false, (byte) 2);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            xt7Var.invoke();
        } else {
            cugVar.b.post(new is3(xt7Var, (byte) 3));
        }
        cug cugVar2 = this.a;
        cugVar2.getClass();
        ame ameVar = new ame(cugVar2, (Object) null, (byte) 19);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            ameVar.invoke();
        } else {
            cugVar2.b.post(new is3(ameVar, (byte) 3));
        }
        this.d.post(new s10(this, (byte) 23));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final void d() {
        boolean z;
        ttg ttgVar;
        if (this.h != null && (ttgVar = (ttg) this.f.get(this.g)) != null) {
            z = ttgVar.f;
        }
        cug cugVar = this.a;
        cugVar.getClass();
        xt7 xt7Var = new xt7(cugVar, z, (byte) 2);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            xt7Var.invoke();
        } else {
            cugVar.b.post(new is3(xt7Var, (byte) 3));
        }
    }

    public final void e() {
        boolean z;
        boolean z2 = (this.h == null || this.f.isEmpty()) ? false : true;
        eug eugVar = this.c;
        if (!z2 || this.Z) {
            if (!z2 && (z = this.Z) && z) {
                this.Z = false;
                eugVar.a();
                NativeVideoSinkImpl.nativeSetVsyncTiming(0L, 0L);
                return;
            }
            return;
        }
        this.Z = true;
        NativeVideoSinkImpl.nativeSetVsyncTiming(0L, 0L);
        kba kbaVar = new kba(this, (byte) 17);
        eugVar.a();
        eugVar.e = kbaVar;
        Context context = eugVar.a;
        Object systemService = context != null ? context.getSystemService("display") : null;
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        eugVar.d = displayManager;
        if (displayManager != null) {
            displayManager.registerDisplayListener(eugVar, eugVar.b);
        }
        eugVar.b();
        try {
            Choreographer choreographer = Choreographer.getInstance();
            choreographer.postFrameCallback(eugVar);
            eugVar.c = choreographer;
        } catch (RuntimeException e) {
            Logger.l(e, "Vsync sampling disabled", new Object[0]);
            eugVar.a();
        }
    }

    @Override // com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener
    public final void onActiveSubtitleChanged(String str, String str2, boolean z) {
        this.d.post(new jg0(this, str, str2, z, (byte) 1));
    }

    @Override // com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener
    public final void onDisplaySleepPreventionActiveChanged(String str, boolean z) {
        this.d.post(new n1d(this, str, z, (byte) 1));
    }

    @Override // com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener
    public final void onPlaybackRegistered(String str, String str2, String str3, String str4, String str5) {
        this.d.post(new vtg(this, str, str2, str3, str4, str5));
    }

    @Override // com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener
    public final void onPlaybackUnregistered(String str) {
        this.d.post(new xwn1(this, str, (byte) 10));
    }

    @Override // com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener
    public final void onSubtitleCueChanged(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int i, double d, int i2, double d2, double d3) {
        this.d.post(new utg(this, str, str2, iArr, iArr2, strArr, i, d, i2, d2, d3));
    }

    @Override // com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener
    public final void onSubtitleTracksAvailable(String str, String[] strArr, int[] iArr) {
        this.d.post(new hw9(this, str, strArr, iArr, (byte) 3));
    }
}
