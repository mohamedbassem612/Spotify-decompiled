package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class CanvasVideo extends h implements v2j0 {
    private static final CanvasVideo DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 5;
    public static final int VIDEO_MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private int durationSeconds_;
    private int height_;
    private Object mediaFile_;
    private int width_;
    private int mediaFileCase_ = 0;
    private String mediaType_ = "";

    static {
        CanvasVideo canvasVideo = new CanvasVideo();
        DEFAULT_INSTANCE = canvasVideo;
        h.registerDefaultInstance(CanvasVideo.class, canvasVideo);
    }

    private CanvasVideo() {
    }

    public static CanvasVideo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȼ\u0000\u0006Ȼ\u0000", new Object[]{"mediaFile_", "mediaFileCase_", "mediaType_", "durationSeconds_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new CanvasVideo();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (CanvasVideo.class) {
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

    public final String getUrl() {
        return this.mediaFileCase_ == 5 ? (String) this.mediaFile_ : "";
    }

    public final boolean hasUrl() {
        return this.mediaFileCase_ == 5;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.height_;
    }

    public final String p() {
        return this.mediaType_;
    }

    public final String q() {
        return this.mediaFileCase_ == 6 ? (String) this.mediaFile_ : "";
    }

    public final int r() {
        return this.width_;
    }

    public final boolean s() {
        return this.mediaFileCase_ == 6;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
