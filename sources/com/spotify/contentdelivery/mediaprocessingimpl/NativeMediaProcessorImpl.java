package com.spotify.contentdelivery.mediaprocessingimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096 ¢\u0006\u0004\b\u000e\u0010\u000fJ`\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096 ¢\u0006\u0004\b\u001c\u0010\u0003R$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/spotify/contentdelivery/mediaprocessingimpl/NativeMediaProcessorImpl;", "Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessor;", "<init>", "()V", "", "context", "", "setContext", "([B)Z", "Ljava/nio/ByteBuffer;", "buffer", "", "startOffset", "size", "process", "(Ljava/nio/ByteBuffer;II)Z", "sampleOffset", "segmentCount", "", "skipByteCounts", "processByteCounts", "processBlockCount", "skipBlockCount", "resetContextPerSegment", "processPartialFinalUnit", "processSample", "(Ljava/nio/ByteBuffer;II[I[III[BZZ)I", "Lp/rih1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "src_main_java_com_spotify_contentdelivery_mediaprocessingimpl-mediaprocessingimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NativeMediaProcessorImpl implements NativeMediaProcessor {
    private long nThis;

    private NativeMediaProcessorImpl() {
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor
    public native void destroy();

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor
    public long getNThis() {
        return this.nThis;
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor
    public native boolean process(ByteBuffer buffer, int startOffset, int size);

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor
    public native int processSample(ByteBuffer buffer, int sampleOffset, int segmentCount, int[] skipByteCounts, int[] processByteCounts, int processBlockCount, int skipBlockCount, byte[] context, boolean resetContextPerSegment, boolean processPartialFinalUnit);

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor
    public native boolean setContext(byte[] context);
}
