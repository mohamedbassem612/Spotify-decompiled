package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class VideoAsset extends h implements v2j0 {
    private static final VideoAsset DEFAULT_INSTANCE;
    public static final int FLAT_FILE_FIELD_NUMBER = 1;
    public static final int HLS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int videoTypeCase_ = 0;
    private Object videoType_;

    static {
        VideoAsset videoAsset = new VideoAsset();
        DEFAULT_INSTANCE = videoAsset;
        h.registerDefaultInstance(VideoAsset.class, videoAsset);
    }

    private VideoAsset() {
    }

    public static VideoAsset o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"videoType_", "videoTypeCase_", FlatFile.class, HLSVideo.class});
        }
        if (iOrdinal == 3) {
            return new VideoAsset();
        }
        if (iOrdinal == 4) {
            return new gvi1((byte) 23);
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
        synchronized (VideoAsset.class) {
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

    public final FlatFile p() {
        return this.videoTypeCase_ == 1 ? (FlatFile) this.videoType_ : FlatFile.p();
    }

    public final HLSVideo q() {
        return this.videoTypeCase_ == 2 ? (HLSVideo) this.videoType_ : HLSVideo.o();
    }

    public final int r() {
        return xcg1.a(this.videoTypeCase_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
