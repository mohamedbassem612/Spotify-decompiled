package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.lzu0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PreviewPlaybackTrait extends h implements v2j0 {
    public static final int AUDIO_FIELD_NUMBER = 3;
    private static final PreviewPlaybackTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REPORTING_URI_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object media_;
    private int mediaCase_ = 0;
    private String uri_ = "";
    private String reportingUri_ = "";

    static {
        PreviewPlaybackTrait previewPlaybackTrait = new PreviewPlaybackTrait();
        DEFAULT_INSTANCE = previewPlaybackTrait;
        h.registerDefaultInstance(PreviewPlaybackTrait.class, previewPlaybackTrait);
    }

    private PreviewPlaybackTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PreviewPlaybackTrait s(byte[] bArr) {
        return (PreviewPlaybackTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"media_", "mediaCase_", "bitField0_", "uri_", VideoPreview.class, AudioPreview.class, "reportingUri_"});
        }
        if (iOrdinal == 3) {
            return new PreviewPlaybackTrait();
        }
        if (iOrdinal == 4) {
            return new lyv0((byte) 15);
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
        synchronized (PreviewPlaybackTrait.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudioPreview o() {
        return this.mediaCase_ == 3 ? (AudioPreview) this.media_ : AudioPreview.n();
    }

    public final int p() {
        return lzu0.b(this.mediaCase_);
    }

    public final String q() {
        return this.reportingUri_;
    }

    public final VideoPreview r() {
        return this.mediaCase_ == 2 ? (VideoPreview) this.media_ : VideoPreview.n();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
