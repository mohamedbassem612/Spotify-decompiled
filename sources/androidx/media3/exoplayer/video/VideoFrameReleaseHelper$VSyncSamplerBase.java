package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;
import p.oon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
final class VideoFrameReleaseHelper$VSyncSamplerBase extends VideoFrameReleaseHelper$VSyncSampler implements Choreographer.FrameCallback {
    private VideoFrameReleaseHelper$VSyncSamplerBase(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
    }

    private static long getVsyncDurationNsFromDefaultDisplay(DisplayManager displayManager) {
        Display display = displayManager.getDisplay(0);
        if (display != null) {
            return (long) (1.0E9d / ((double) display.getRefreshRate()));
        }
        oon1.H("Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.sampledVsyncTimeNs = j;
        this.choreographer.removeFrameCallback(this);
        this.choreographer.postFrameCallbackDelayed(this, 500L);
        VideoFrameReleaseHelper$VSyncSamplerListener videoFrameReleaseHelper$VSyncSamplerListener = this.listener;
        if (videoFrameReleaseHelper$VSyncSamplerListener != null) {
            videoFrameReleaseHelper$VSyncSamplerListener.onVsyncSampled(this);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.choreographer.removeFrameCallback(this);
            this.choreographer.postFrameCallback(this);
            this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper$VSyncSampler
    public void register() {
        super.register();
        this.choreographer.removeFrameCallback(this);
        this.choreographer.postFrameCallback(this);
        this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper$VSyncSampler
    public void unregister() {
        super.unregister();
        this.choreographer.removeFrameCallback(this);
        this.sampledVsyncTimeNs = -9223372036854775807L;
        this.vsyncDurationNs = -9223372036854775807L;
    }
}
