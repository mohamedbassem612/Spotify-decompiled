package p;

import android.os.HandlerThread;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class lj7 implements v0d1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ lj7(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(mj7.f(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(mj7.f(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
