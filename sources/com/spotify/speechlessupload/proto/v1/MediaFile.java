package com.spotify.speechlessupload.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.dnh0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class MediaFile extends h implements v2j0 {
    private static final MediaFile DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private int mediaTypeCase_ = 0;
    private Object mediaType_;

    static {
        MediaFile mediaFile = new MediaFile();
        DEFAULT_INSTANCE = mediaFile;
        h.registerDefaultInstance(MediaFile.class, mediaFile);
    }

    private MediaFile() {
    }

    public static dnh0 n() {
        return (dnh0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"mediaType_", "mediaTypeCase_", ImageMedia.class, VideoMedia.class});
        }
        if (iOrdinal == 3) {
            return new MediaFile();
        }
        if (iOrdinal == 4) {
            return new dnh0(DEFAULT_INSTANCE);
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
        synchronized (MediaFile.class) {
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

    public final void o(ImageMedia imageMedia) {
        imageMedia.getClass();
        this.mediaType_ = imageMedia;
        this.mediaTypeCase_ = 1;
    }

    public final void p(VideoMedia videoMedia) {
        videoMedia.getClass();
        this.mediaType_ = videoMedia;
        this.mediaTypeCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
