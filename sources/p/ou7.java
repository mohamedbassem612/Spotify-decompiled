package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.playbacknative.AudioDriverListener;
import com.spotify.playbacknative.AudioTrackAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ou7 implements AudioDriverListener {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ou7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((ru7) this.b).Y0.set(audioTrackAdapter);
                break;
        }
    }

    public final void onAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                AtomicReference atomicReference = ((ru7) this.b).Y0;
                while (!atomicReference.compareAndSet(audioTrackAdapter, null) && atomicReference.get() == audioTrackAdapter) {
                }
                break;
        }
    }

    public final void onFlushComplete(int i) {
        byte b = this.a;
    }

    public final void onFlushStart(int i) {
        byte b = this.a;
    }

    public final void onPaused(boolean z, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                if (!z) {
                    ((lxg) this.b).b("playback_started");
                }
                break;
        }
    }

    private final void a(AudioTrackAdapter audioTrackAdapter) {
    }

    private final void b(AudioTrackAdapter audioTrackAdapter) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    private final void g(int i, boolean z) {
    }
}
