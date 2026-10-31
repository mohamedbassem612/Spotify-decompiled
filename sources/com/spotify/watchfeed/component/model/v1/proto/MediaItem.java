package com.spotify.watchfeed.component.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.gw61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MediaItem extends h implements v2j0 {
    private static final MediaItem DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHAPE_FIELD_NUMBER = 3;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Image image_;
    private int shape_;
    private VideoFile videoFile_;

    static {
        MediaItem mediaItem = new MediaItem();
        DEFAULT_INSTANCE = mediaItem;
        h.registerDefaultInstance(MediaItem.class, mediaItem);
    }

    private MediaItem() {
    }

    public static MediaItem n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "image_", "videoFile_", "shape_"});
        }
        if (iOrdinal == 3) {
            return new MediaItem();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (MediaItem.class) {
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

    public final Image o() {
        Image image = this.image_;
        return image == null ? Image.n() : image;
    }

    public final gw61 p() {
        gw61 gw61Var;
        int i = this.shape_;
        if (i == 0) {
            gw61Var = gw61.ROUND;
        } else if (i == 1) {
            gw61Var = gw61.SQUARE;
        } else if (i != 2) {
            gw61Var = i != 3 ? null : gw61.SIXTEEN_TO_NINE;
        } else {
            gw61Var = gw61.NINE_TO_SIXTEEN;
        }
        return gw61Var == null ? gw61.UNRECOGNIZED : gw61Var;
    }

    public final VideoFile q() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
