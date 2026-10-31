package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qpa;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxTranscoderSession extends com.google.protobuf.h implements v2j0 {
    public static final int AVAILABLE_MEMORY_BYTES_AT_START_FIELD_NUMBER = 16;
    public static final int BITRATE_FIELD_NUMBER = 8;
    public static final int BYTES_TRANSFERRED_CACHE_FIELD_NUMBER = 7;
    public static final int BYTES_TRANSFERRED_NETWORK_FIELD_NUMBER = 6;
    public static final int CONNECTION_TYPE_END_FIELD_NUMBER = 13;
    public static final int CONNECTION_TYPE_START_FIELD_NUMBER = 12;
    private static final BetamaxTranscoderSession DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 14;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 15;
    public static final int MS_TRANSCODE_END_FIELD_NUMBER = 4;
    public static final int MS_TRANSCODE_REQUESTED_FIELD_NUMBER = 2;
    public static final int MS_TRANSCODE_START_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 5;
    public static final int RESOLUTION_HEIGHT_FIELD_NUMBER = 10;
    public static final int RESOLUTION_WIDTH_FIELD_NUMBER = 9;
    public static final int TOTAL_MEMORY_BYTES_FIELD_NUMBER = 17;
    public static final int TRANSCODING_ID_FIELD_NUMBER = 1;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 11;
    private long availableMemoryBytesAtStart_;
    private int bitField0_;
    private long bitrate_;
    private long bytesTransferredCache_;
    private long bytesTransferredNetwork_;
    private int errorCode_;
    private long msTranscodeEnd_;
    private long msTranscodeRequested_;
    private long msTranscodeStart_;
    private int resolutionHeight_;
    private int resolutionWidth_;
    private long totalMemoryBytes_;
    private String transcodingId_ = "";
    private String reasonEnd_ = "";
    private String videoCodec_ = "";
    private String connectionTypeStart_ = "";
    private String connectionTypeEnd_ = "";
    private String errorMessage_ = "";

    static {
        BetamaxTranscoderSession betamaxTranscoderSession = new BetamaxTranscoderSession();
        DEFAULT_INSTANCE = betamaxTranscoderSession;
        com.google.protobuf.h.registerDefaultInstance(BetamaxTranscoderSession.class, betamaxTranscoderSession);
    }

    private BetamaxTranscoderSession() {
    }

    public static qpa n() {
        return (qpa) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(int i) {
        this.bitField0_ |= 512;
        this.resolutionHeight_ = i;
    }

    public final void B(int i) {
        this.bitField0_ |= 256;
        this.resolutionWidth_ = i;
    }

    public final void C(long j) {
        this.bitField0_ |= 65536;
        this.totalMemoryBytes_ = j;
    }

    public final void D(String str) {
        this.bitField0_ |= 1;
        this.transcodingId_ = str;
    }

    public final void E(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.videoCodec_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tင\b\nင\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eင\r\u000fဈ\u000e\u0010ဂ\u000f\u0011ဂ\u0010", new Object[]{"bitField0_", "transcodingId_", "msTranscodeRequested_", "msTranscodeStart_", "msTranscodeEnd_", "reasonEnd_", "bytesTransferredNetwork_", "bytesTransferredCache_", "bitrate_", "resolutionWidth_", "resolutionHeight_", "videoCodec_", "connectionTypeStart_", "connectionTypeEnd_", "errorCode_", "errorMessage_", "availableMemoryBytesAtStart_", "totalMemoryBytes_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxTranscoderSession();
        }
        if (iOrdinal == 4) {
            return new qpa(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (BetamaxTranscoderSession.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(long j) {
        this.bitField0_ |= 32768;
        this.availableMemoryBytesAtStart_ = j;
    }

    public final void p(long j) {
        this.bitField0_ |= 128;
        this.bitrate_ = j;
    }

    public final void q(long j) {
        this.bitField0_ |= 64;
        this.bytesTransferredCache_ = j;
    }

    public final void r(long j) {
        this.bitField0_ |= 32;
        this.bytesTransferredNetwork_ = j;
    }

    public final void s(String str) {
        this.bitField0_ |= 4096;
        this.connectionTypeEnd_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 2048;
        this.connectionTypeStart_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 8192;
        this.errorCode_ = i;
    }

    public final void v(String str) {
        this.bitField0_ |= 16384;
        this.errorMessage_ = str;
    }

    public final void w(long j) {
        this.bitField0_ |= 8;
        this.msTranscodeEnd_ = j;
    }

    public final void x(long j) {
        this.bitField0_ |= 2;
        this.msTranscodeRequested_ = j;
    }

    public final void y(long j) {
        this.bitField0_ |= 4;
        this.msTranscodeStart_ = j;
    }

    public final void z(String str) {
        this.bitField0_ |= 16;
        this.reasonEnd_ = str;
    }
}
