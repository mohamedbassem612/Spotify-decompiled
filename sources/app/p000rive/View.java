package app.p000rive;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: renamed from: app.rive.RiveFrameRateHintKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lapp/rive/RiveFrameRate;", "frameRate", "", "active", "Lp/rih1;", "applyRequestedFrameRateHint", "(Landroid/view/View;Lapp/rive/RiveFrameRate;Z)V", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class View {
    public static final void applyRequestedFrameRateHint(android.view.View view, RiveFrameRate riveFrameRate, boolean z) {
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        float framesPerSecond = -1.0f;
        if (z && (riveFrameRate instanceof RiveFrameRate.Capped)) {
            framesPerSecond = ((RiveFrameRate.Capped) riveFrameRate).getFramesPerSecond();
        }
        view.setRequestedFrameRate(framesPerSecond);
    }
}
