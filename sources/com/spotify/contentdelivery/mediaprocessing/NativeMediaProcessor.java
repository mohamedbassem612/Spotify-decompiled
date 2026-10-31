package com.spotify.contentdelivery.mediaprocessing;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000  2\u00020\u0001:\u0001 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ_\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessor;", "", "", "context", "", "setContext", "([B)Z", "Ljava/nio/ByteBuffer;", "buffer", "", "startOffset", "size", "process", "(Ljava/nio/ByteBuffer;II)Z", "sampleOffset", "segmentCount", "", "skipByteCounts", "processByteCounts", "processBlockCount", "skipBlockCount", "resetContextPerSegment", "processPartialFinalUnit", "processSample", "(Ljava/nio/ByteBuffer;II[I[III[BZZ)I", "Lp/rih1;", "destroy", "()V", "", "getNThis", "()J", "nThis", "Companion", "src_main_java_com_spotify_contentdelivery_mediaprocessing-mediaprocessing"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface NativeMediaProcessor {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int PROCESS_SAMPLE_RESULT_CLEAR_LEAD_OUT_OF_BOUNDS = 522;
    public static final int PROCESS_SAMPLE_RESULT_GET_CONTEXT_BYTES_FAILED = 516;
    public static final int PROCESS_SAMPLE_RESULT_GET_PROCESS_BYTE_COUNTS_FAILED = 518;
    public static final int PROCESS_SAMPLE_RESULT_GET_SKIP_BYTE_COUNTS_FAILED = 517;
    public static final int PROCESS_SAMPLE_RESULT_INVALID_BUFFER_CAPACITY = 511;
    public static final int PROCESS_SAMPLE_RESULT_INVALID_CONTEXT_SIZE = 515;
    public static final int PROCESS_SAMPLE_RESULT_NEGATIVE_PROCESS_BLOCK_COUNT = 508;
    public static final int PROCESS_SAMPLE_RESULT_NEGATIVE_PROCESS_BYTE_COUNT = 521;
    public static final int PROCESS_SAMPLE_RESULT_NEGATIVE_SAMPLE_OFFSET = 506;
    public static final int PROCESS_SAMPLE_RESULT_NEGATIVE_SEGMENT_COUNT = 507;
    public static final int PROCESS_SAMPLE_RESULT_NEGATIVE_SKIP_BLOCK_COUNT = 509;
    public static final int PROCESS_SAMPLE_RESULT_NEGATIVE_SKIP_BYTE_COUNT = 520;
    public static final int PROCESS_SAMPLE_RESULT_NON_DIRECT_BUFFER = 510;
    public static final int PROCESS_SAMPLE_RESULT_NO_PROCESSOR = 501;
    public static final int PROCESS_SAMPLE_RESULT_NULL_BUFFER = 502;
    public static final int PROCESS_SAMPLE_RESULT_NULL_CONTEXT = 505;
    public static final int PROCESS_SAMPLE_RESULT_NULL_PROCESS_BYTE_COUNTS = 504;
    public static final int PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS = 503;
    public static final int PROCESS_SAMPLE_RESULT_OK = 0;
    public static final int PROCESS_SAMPLE_RESULT_PROCESS_BLOCK_FAILED = 524;
    public static final int PROCESS_SAMPLE_RESULT_PROCESS_BYTES_OUT_OF_BOUNDS = 523;
    public static final int PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT = 514;
    public static final int PROCESS_SAMPLE_RESULT_PROCESS_PARTIAL_FINAL_UNIT_FAILED = 525;
    public static final int PROCESS_SAMPLE_RESULT_RESET_CONTEXT_FAILED = 526;
    public static final int PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS = 512;
    public static final int PROCESS_SAMPLE_RESULT_SET_CONTEXT_FAILED = 519;
    public static final int PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT = 513;

    void destroy();

    long getNThis();

    boolean process(ByteBuffer buffer, int startOffset, int size);

    int processSample(ByteBuffer buffer, int sampleOffset, int segmentCount, int[] skipByteCounts, int[] processByteCounts, int processBlockCount, int skipBlockCount, byte[] context, boolean resetContextPerSegment, boolean processPartialFinalUnit);

    boolean setContext(byte[] context);
}
