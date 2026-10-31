package p;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import com.spotify.coremediarenderer.videosinkimpl.NativeVideoSinkImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eug implements Choreographer.FrameCallback, DisplayManager.DisplayListener {
    public final Context a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public Choreographer c;
    public DisplayManager d;
    public kba e;
    public long f;

    public eug(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a() {
        Choreographer choreographer = this.c;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this);
        }
        this.c = null;
        DisplayManager displayManager = this.d;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this);
        }
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public final void b() {
        Display display;
        DisplayManager displayManager = this.d;
        float refreshRate = (displayManager == null || (display = displayManager.getDisplay(0)) == null) ? 0.0f : display.getRefreshRate();
        this.f = refreshRate > 0.0f ? jch0.a0(1.0E9f / refreshRate) : 0L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        kba kbaVar;
        long j2 = this.f;
        if (j2 > 0 && (kbaVar = this.e) != null && !((wtg) kbaVar.b).Y) {
            dg8 dg8Var = ((wtg) kbaVar.b).b;
            NativeVideoSinkImpl.nativeSetVsyncTiming(j, j2);
        }
        Choreographer choreographer = this.c;
        if (choreographer != null) {
            choreographer.postFrameCallbackDelayed(this, 500L);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            b();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
