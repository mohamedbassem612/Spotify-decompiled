package p;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vl31 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl31(int i, oce1 oce1Var, long j, ven0 ven0Var, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 2;
        this.c = i;
        this.b = oce1Var;
        this.f = j;
        this.d = ven0Var;
        this.e = ss50Var;
        this.g = xtb0Var;
        this.h = ven0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        long j = this.f;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                MediaCodec mediaCodec = (MediaCodec) obj;
                ByteBuffer byteBufferU = ejo1.u(mediaCodec, i);
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj5;
                o811 o811Var = (o811) obj4;
                long j2 = o811Var.a;
                bufferInfo.presentationTimeUs = j2;
                o811Var.a = j2 + j;
                ((MediaMuxer) obj3).writeSampleData(((n811) obj2).a, byteBufferU, bufferInfo);
                mediaCodec.releaseOutputBuffer(i, false);
                break;
            case 1:
                MediaCodec mediaCodec2 = (MediaCodec) obj;
                ByteBuffer byteBufferU2 = ejo1.u(mediaCodec2, i);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) obj5;
                o811 o811Var2 = (o811) obj4;
                long j3 = o811Var2.a;
                bufferInfo2.presentationTimeUs = j3;
                o811Var2.a = j3 + j;
                ((MediaMuxer) obj3).writeSampleData(((n811) obj2).a, byteBufferU2, bufferInfo2);
                mediaCodec2.releaseOutputBuffer(i, false);
                break;
            default:
                oce1 oce1Var = (oce1) obj;
                bs51.d((ven0) obj5, (ss50) obj4, (xtb0) obj3, (ven0) obj2, new n00(this.c, oce1Var.b - oce1Var.a, this.f));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl31(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo, o811 o811Var, long j, MediaMuxer mediaMuxer, n811 n811Var, byte b) {
        super(0);
        this.a = b;
        this.b = mediaCodec;
        this.c = i;
        this.d = bufferInfo;
        this.e = o811Var;
        this.f = j;
        this.g = mediaMuxer;
        this.h = n811Var;
    }
}
