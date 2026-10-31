package p;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p7u0 implements v1k1 {
    public final /* synthetic */ u7u0 b;

    public p7u0(u7u0 u7u0Var) {
        this.b = u7u0Var;
    }

    @Override // p.v1k1
    public final void a() {
        for (r7u0 r7u0Var : this.b.h) {
            r7u0Var.i.execute(new q7u0(r7u0Var.h, (byte) 2));
        }
    }

    @Override // p.v1k1
    public final void b(z1k1 z1k1Var) {
        for (r7u0 r7u0Var : this.b.h) {
            r7u0Var.i.execute(new zyh0(r7u0Var.h, z1k1Var, (byte) 14));
        }
    }

    @Override // p.v1k1
    public final void c(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        for (r7u0 r7u0Var : this.b.h) {
            VideoFrameProcessingException videoFrameProcessingExceptionA = VideoFrameProcessingException.a(-9223372036854775807L, videoSink$VideoSinkException);
            r7u0Var.i.execute(new vqh0(r7u0Var, r7u0Var.h, videoFrameProcessingExceptionA, (byte) 9));
        }
    }

    @Override // p.v1k1
    public final void d() {
        for (r7u0 r7u0Var : this.b.h) {
            r7u0Var.i.execute(new q7u0(r7u0Var.h, (byte) 1));
        }
    }
}
