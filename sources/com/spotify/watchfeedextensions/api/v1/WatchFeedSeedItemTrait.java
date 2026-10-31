package com.spotify.watchfeedextensions.api.v1;

import com.google.protobuf.h;
import com.spotify.contentagnostic.v2.ColorSetContrastOptions;
import com.spotify.watchfeedextensions.component.model.v1.Image;
import com.spotify.watchfeedextensions.component.model.v1.VideoFile;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class WatchFeedSeedItemTrait extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int COLOR_SET_CONTRAST_OPTIONS_FIELD_NUMBER = 9;
    public static final int COVER_IMAGE_FIELD_NUMBER = 5;
    private static final WatchFeedSeedItemTrait DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 10;
    public static final int LOGO_IMAGE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PORTRAIT_HORIZONTAL_FOCUS_CENTER_PERCENTAGE_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 4;
    public static final int VIDEO_THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ColorSetContrastOptions colorSetContrastOptions_;
    private Image coverImage_;
    private Image logoImage_;
    private double portraitHorizontalFocusCenterPercentage_;
    private VideoFile videoFile_;
    private Image videoThumbnailImage_;
    private String uri_ = "";
    private String title_ = "";
    private String accessibilityText_ = "";
    private String firstItemUri_ = "";

    static {
        WatchFeedSeedItemTrait watchFeedSeedItemTrait = new WatchFeedSeedItemTrait();
        DEFAULT_INSTANCE = watchFeedSeedItemTrait;
        h.registerDefaultInstance(WatchFeedSeedItemTrait.class, watchFeedSeedItemTrait);
    }

    private WatchFeedSeedItemTrait() {
    }

    public static WatchFeedSeedItemTrait B(byte[] bArr) {
        return (WatchFeedSeedItemTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006က\u0003\u0007Ȉ\bဉ\u0004\tဉ\u0005\nȈ", new Object[]{"bitField0_", "uri_", "title_", "videoThumbnailImage_", "videoFile_", "coverImage_", "portraitHorizontalFocusCenterPercentage_", "accessibilityText_", "logoImage_", "colorSetContrastOptions_", "firstItemUri_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedSeedItemTrait();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (WatchFeedSeedItemTrait.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ColorSetContrastOptions o() {
        ColorSetContrastOptions colorSetContrastOptions = this.colorSetContrastOptions_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.o() : colorSetContrastOptions;
    }

    public final Image p() {
        Image image = this.coverImage_;
        return image == null ? Image.n() : image;
    }

    public final String q() {
        return this.firstItemUri_;
    }

    public final Image r() {
        Image image = this.logoImage_;
        return image == null ? Image.n() : image;
    }

    public final double s() {
        return this.portraitHorizontalFocusCenterPercentage_;
    }

    public final VideoFile t() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Image u() {
        Image image = this.videoThumbnailImage_;
        return image == null ? Image.n() : image;
    }

    public final boolean v() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 2) != 0;
    }
}
