package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xma;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxDownloadSession extends com.google.protobuf.h implements v2j0 {
    public static final int BITRATE_FIELD_NUMBER = 7;
    public static final int CONNECTION_TYPE_END_FIELD_NUMBER = 9;
    public static final int CONNECTION_TYPE_START_FIELD_NUMBER = 8;
    private static final BetamaxDownloadSession DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int KBYTES_DOWNLOADED_FIELD_NUMBER = 4;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    public static final int MS_DOWNLOAD_TIME_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 10;
    private int bitField0_;
    private long bitrate_;
    private long kbytesDownloaded_;
    private long msDownloadTime_;
    private String featureIdentifier_ = "";
    private String mediaUrl_ = "";
    private String sessionId_ = "";
    private String reasonEnd_ = "";
    private String connectionTypeStart_ = "";
    private String connectionTypeEnd_ = "";
    private String videoCodec_ = "";

    static {
        BetamaxDownloadSession betamaxDownloadSession = new BetamaxDownloadSession();
        DEFAULT_INSTANCE = betamaxDownloadSession;
        com.google.protobuf.h.registerDefaultInstance(BetamaxDownloadSession.class, betamaxDownloadSession);
    }

    private BetamaxDownloadSession() {
    }

    public static xma n() {
        return (xma) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "featureIdentifier_", "mediaUrl_", "sessionId_", "kbytesDownloaded_", "msDownloadTime_", "reasonEnd_", "bitrate_", "connectionTypeStart_", "connectionTypeEnd_", "videoCodec_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxDownloadSession();
        }
        if (iOrdinal == 4) {
            return new xma(DEFAULT_INSTANCE);
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
        synchronized (BetamaxDownloadSession.class) {
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
        this.bitField0_ |= 64;
        this.bitrate_ = j;
    }

    public final void p(String str) {
        this.bitField0_ |= 256;
        this.connectionTypeEnd_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.connectionTypeStart_ = str;
    }

    public final void r() {
        this.bitField0_ |= 1;
        this.featureIdentifier_ = "offline-coordinator";
    }

    public final void s(long j) {
        this.bitField0_ |= 8;
        this.kbytesDownloaded_ = j;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediaUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 16;
        this.msDownloadTime_ = j;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.reasonEnd_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 4;
        this.sessionId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.videoCodec_ = str;
    }
}
