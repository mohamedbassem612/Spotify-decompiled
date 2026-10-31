package androidx.media3.exoplayer.video;

import android.view.Surface;
import p.oon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
final class VideoFrameReleaseHelper$Api30 {
    private VideoFrameReleaseHelper$Api30() {
    }

    public static void setSurfaceFrameRate(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            oon1.w("Failed to call Surface.setFrameRate", e);
        }
    }
}
