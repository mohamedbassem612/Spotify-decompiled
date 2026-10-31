package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import p.lkh0;
import p.oon1;
import p.zoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
abstract class VideoFrameReleaseHelper$VSyncSampler implements DisplayManager.DisplayListener {
    final Choreographer choreographer;
    final DisplayManager displayManager;
    VideoFrameReleaseHelper$VSyncSamplerListener listener;
    volatile long sampledVsyncTimeNs;
    volatile long vsyncDurationNs;

    private VideoFrameReleaseHelper$VSyncSampler(Choreographer choreographer, DisplayManager displayManager) {
        this.choreographer = choreographer;
        this.displayManager = displayManager;
        this.sampledVsyncTimeNs = -9223372036854775807L;
        this.vsyncDurationNs = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VideoFrameReleaseHelper$VSyncSampler maybeBuildInstance(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        VideoFrameReleaseHelper$1 videoFrameReleaseHelper$1 = null;
        if (displayManager == null) {
            return null;
        }
        try {
            Choreographer choreographer = Choreographer.getInstance();
            return Build.VERSION.SDK_INT >= 33 ? new VideoFrameReleaseHelper$VSyncSamplerV33(choreographer, displayManager) : new VideoFrameReleaseHelper$VSyncSamplerBase(choreographer, displayManager);
        } catch (RuntimeException e) {
            oon1.I("Vsync sampling disabled due to platform error", e);
            return null;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public void register() {
        this.displayManager.registerDisplayListener(this, zoi1.r((lkh0) null));
    }

    public void unregister() {
        this.displayManager.unregisterDisplayListener(this);
    }
}
