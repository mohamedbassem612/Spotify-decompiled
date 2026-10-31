package com.spotify.casita.v1.resolved.watchfeed;

import com.google.protobuf.h;
import com.spotify.contentagnostic.v2.ColorSetContrastOptions;
import p.bf40;
import p.g7r;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class DecoratedEntrypointMetadata extends h implements v2j0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 9;
    public static final int COLOR_SET_CONTRAST_OPTIONS_FIELD_NUMBER = 14;
    public static final int COVER_IMAGE_FIELD_NUMBER = 10;
    public static final int DECISION_ID_FIELD_NUMBER = 11;
    private static final DecoratedEntrypointMetadata DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
    public static final int LOGO_IMAGE_FIELD_NUMBER = 13;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 8;
    public static final int OVERLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PORTRAIT_HORIZONTAL_FOCUS_CENTER_PERCENTAGE_FIELD_NUMBER = 12;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 7;
    private int bitField0_;
    private ColorSetContrastOptions colorSetContrastOptions_;
    private Image coverImage_;
    private Image logoImage_;
    private double portraitHorizontalFocusCenterPercentage_;
    private Image thumbnailImage_;
    private VideoFile videoFile_;
    private String uri_ = "";
    private String firstItemUri_ = "";
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private String accessibility_ = "";
    private String decisionId_ = "";

    static {
        DecoratedEntrypointMetadata decoratedEntrypointMetadata = new DecoratedEntrypointMetadata();
        DEFAULT_INSTANCE = decoratedEntrypointMetadata;
        h.registerDefaultInstance(DecoratedEntrypointMetadata.class, decoratedEntrypointMetadata);
    }

    private DecoratedEntrypointMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static DecoratedEntrypointMetadata s() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007ဉ\u0001\bȈ\tȈ\nဉ\u0002\u000bȈ\fက\u0003\rဉ\u0004\u000eဉ\u0005", new Object[]{"bitField0_", "uri_", "firstItemUri_", "overline_", "title_", "subtitle_", "thumbnailImage_", "videoFile_", "navigationUri_", "accessibility_", "coverImage_", "decisionId_", "portraitHorizontalFocusCenterPercentage_", "logoImage_", "colorSetContrastOptions_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedEntrypointMetadata();
        }
        if (iOrdinal == 4) {
            return new g7r((byte) 11);
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
        synchronized (DecoratedEntrypointMetadata.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibility_;
    }

    public final ColorSetContrastOptions p() {
        ColorSetContrastOptions colorSetContrastOptions = this.colorSetContrastOptions_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.o() : colorSetContrastOptions;
    }

    public final Image q() {
        Image image = this.coverImage_;
        return image == null ? Image.o() : image;
    }

    public final String r() {
        return this.decisionId_;
    }

    public final String t() {
        return this.firstItemUri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.navigationUri_;
    }

    public final String v() {
        return this.overline_;
    }

    public final double w() {
        return this.portraitHorizontalFocusCenterPercentage_;
    }

    public final Image x() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.o() : image;
    }

    public final VideoFile y() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.o() : videoFile;
    }

    public final boolean z() {
        return (this.bitField0_ & 32) != 0;
    }
}
