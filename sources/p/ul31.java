package p;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ul31 extends hab0 implements Function0 {
    public final /* synthetic */ MediaCodec a;
    public final /* synthetic */ int b;
    public final /* synthetic */ MediaCodec.BufferInfo c;
    public final /* synthetic */ o811 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ MediaMuxer f;
    public final /* synthetic */ n811 g;
    public final /* synthetic */ l811 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul31(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo, o811 o811Var, long j, MediaMuxer mediaMuxer, n811 n811Var, l811 l811Var) {
        super(0);
        this.a = mediaCodec;
        this.b = i;
        this.c = bufferInfo;
        this.d = o811Var;
        this.e = j;
        this.f = mediaMuxer;
        this.g = n811Var;
        this.h = l811Var;
    }

    public final Object invoke() {
        MediaCodec mediaCodec = this.a;
        int i = this.b;
        ByteBuffer byteBufferU = ejo1.u(mediaCodec, i);
        o811 o811Var = this.d;
        long j = o811Var.a;
        MediaCodec.BufferInfo bufferInfo = this.c;
        bufferInfo.presentationTimeUs = j;
        o811Var.a = j + this.e;
        this.f.writeSampleData(this.g.a, byteBufferU, bufferInfo);
        mediaCodec.releaseOutputBuffer(i, false);
        this.h.a = true;
        return rih1.a;
    }
}
