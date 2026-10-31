package com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yq51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DisplaySegment extends h implements v2j0 {
    private static final DisplaySegment DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 8;
    public static final int IS_PREVIEW_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SEEK_START_MS_FIELD_NUMBER = 4;
    public static final int SEEK_STOP_MS_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int durationMs_;
    private boolean isPreview_;
    private int seekStartMs_;
    private int seekStopMs_;
    private int type_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";

    static {
        DisplaySegment displaySegment = new DisplaySegment();
        DEFAULT_INSTANCE = displaySegment;
        h.registerDefaultInstance(DisplaySegment.class, displaySegment);
    }

    private DisplaySegment() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0004\u0005\u0004\u0006ለ\u0000\u0007ለ\u0001\bለ\u0002\tဇ\u0003", new Object[]{"bitField0_", "uri_", "type_", "durationMs_", "seekStartMs_", "seekStopMs_", "title_", "subtitle_", "imageUrl_", "isPreview_"});
        }
        if (iOrdinal == 3) {
            return new DisplaySegment();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (DisplaySegment.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final int n() {
        return this.durationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.isPreview_;
    }

    public final int p() {
        return this.seekStartMs_;
    }

    public final int q() {
        return this.seekStopMs_;
    }

    public final yq51 r() {
        yq51 yq51Var;
        int i = this.type_;
        if (i == 0) {
            yq51Var = yq51.SEGMENT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            yq51Var = i != 2 ? null : yq51.SEGMENT_TYPE_MUSIC;
        } else {
            yq51Var = yq51.SEGMENT_TYPE_TALK;
        }
        return yq51Var == null ? yq51.UNRECOGNIZED : yq51Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
