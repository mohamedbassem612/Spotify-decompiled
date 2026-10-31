package p;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class kj7 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lkh0 b;

    public /* synthetic */ kj7(yjh0 yjh0Var, lkh0 lkh0Var, byte b) {
        this.a = b;
        this.b = lkh0Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        lkh0 lkh0Var = this.b;
        switch (b) {
            case 0:
                Handler handler = lkh0Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    lkh0Var.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = lkh0Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    lkh0Var.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
