package app.p000rive;

import android.graphics.Bitmap;
import app.p000rive.core.RiveSurface;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\rJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lapp/rive/HardwareFrameSource;", "", "Lapp/rive/HardwareFrameSource$Listener;", "listener", "Lp/rih1;", "setListener", "(Lapp/rive/HardwareFrameSource$Listener;)V", "stop", "()V", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "surface", "Listener", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HardwareFrameSource {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lapp/rive/HardwareFrameSource$Listener;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lp/rih1;", "onFrame", "(Landroid/graphics/Bitmap;)V", "", "failure", "onFailure", "(Ljava/lang/Throwable;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onFailure(Throwable failure);

        void onFrame(Bitmap bitmap);
    }

    RiveSurface getSurface();

    void setListener(Listener listener);

    void stop();
}
