package com.spotify.device_context.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pm21;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ReportedAttributes extends h implements v2j0 {
    private static final ReportedAttributes DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
    public static final int IS_PARTNER_EXPLICIT_CONTENT_FILTERING_ENABLED_FIELD_NUMBER = 4;
    public static final int IS_PLAYLIST_V2_URI_SUPPORTED_FIELD_NUMBER = 5;
    public static final int IS_VOICE_ENABLED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUPPORTED_CONTENT_TYPES_FIELD_NUMBER = 3;
    public static final int TIME_STRETCHING_ALGORITHM_SUPPORTED_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean isPartnerExplicitContentFilteringEnabled_;
    private boolean isPlaylistV2UriSupported_;
    private boolean isVoiceEnabled_;
    private int timeStretchingAlgorithmSupported_;
    private String deviceType_ = "";
    private String supportedContentTypes_ = "";

    static {
        ReportedAttributes reportedAttributes = new ReportedAttributes();
        DEFAULT_INSTANCE = reportedAttributes;
        h.registerDefaultInstance(ReportedAttributes.class, reportedAttributes);
    }

    private ReportedAttributes() {
    }

    public static pm21 n() {
        return (pm21) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005", new Object[]{"bitField0_", "deviceType_", "isVoiceEnabled_", "supportedContentTypes_", "isPartnerExplicitContentFilteringEnabled_", "isPlaylistV2UriSupported_", "timeStretchingAlgorithmSupported_"});
        }
        if (iOrdinal == 3) {
            return new ReportedAttributes();
        }
        if (iOrdinal == 4) {
            return new pm21(DEFAULT_INSTANCE);
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
        synchronized (ReportedAttributes.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.deviceType_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
