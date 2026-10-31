package p;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uys implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ azs b;
    public final /* synthetic */ InterruptedException c;

    public /* synthetic */ uys(azs azsVar, InterruptedException interruptedException, byte b) {
        this.a = b;
        this.b = azsVar;
        this.c = interruptedException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        InterruptedException interruptedException = this.c;
        azs azsVar = this.b;
        switch (b) {
            case 0:
                azsVar.h.a(VideoFrameProcessingException.a(-9223372036854775807L, interruptedException));
                break;
            default:
                azsVar.h.a(new VideoFrameProcessingException(interruptedException));
                break;
        }
    }
}
