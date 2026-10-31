package com.spotify.contentagnostic.v2;

import p.bf40;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class VideoPlayback extends com.google.protobuf.h implements v2j0 {
    private static final VideoPlayback DEFAULT_INSTANCE;
    public static final int HOSTED_FIELD_NUMBER = 1;
    public static final int OFFSETS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REPORTING_URI_FIELD_NUMBER = 2;
    private Object asset_;
    private int bitField0_;
    private PlaybackOffsets offsets_;
    private int assetCase_ = 0;
    private String reportingUri_ = "";

    static {
        VideoPlayback videoPlayback = new VideoPlayback();
        DEFAULT_INSTANCE = videoPlayback;
        com.google.protobuf.h.registerDefaultInstance(VideoPlayback.class, videoPlayback);
    }

    private VideoPlayback() {
    }

    public static VideoPlayback n() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002Ȉ\u0003ဉ\u0000", new Object[]{"asset_", "assetCase_", "bitField0_", VideoHosted.class, "reportingUri_", "offsets_"});
        }
        if (iOrdinal == 3) {
            return new VideoPlayback();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (VideoPlayback.class) {
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

    public final VideoHosted o() {
        return this.assetCase_ == 1 ? (VideoHosted) this.asset_ : VideoHosted.n();
    }

    public final PlaybackOffsets p() {
        PlaybackOffsets playbackOffsets = this.offsets_;
        return playbackOffsets == null ? PlaybackOffsets.n() : playbackOffsets;
    }

    public final String q() {
        return this.reportingUri_;
    }

    public final boolean r() {
        return this.assetCase_ == 1;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
