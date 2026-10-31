package com.spotify.watchfeedextensions.component.item.v1;

import com.google.protobuf.h;
import com.spotify.watchfeedentrypoints.common.v1.VideoFile;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class WatchFeedVideoCardComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 10;
    public static final int DECISION_ID_FIELD_NUMBER = 12;
    private static final WatchFeedVideoCardComponent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 8;
    public static final int IS_19PLUS_FIELD_NUMBER = 7;
    public static final int IS_ANIMATED_FIELD_NUMBER = 6;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 5;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    public static final int OVERLINE_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PORTRAIT_HORIZONTAL_FOCUS_CENTER_PERCENTAGE_FIELD_NUMBER = 13;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int THUMBNAIL_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 9;
    private int bitField0_;
    private boolean is19Plus_;
    private boolean isAnimated_;
    private boolean isExplicit_;
    private double portraitHorizontalFocusCenterPercentage_;
    private VideoFile videoFile_;
    private String title_ = "";
    private String subtitle_ = "";
    private String thumbnailImageUrl_ = "";
    private String navigateUri_ = "";
    private String entityUri_ = "";
    private String accessibilityText_ = "";
    private String overline_ = "";
    private String decisionId_ = "";

    static {
        WatchFeedVideoCardComponent watchFeedVideoCardComponent = new WatchFeedVideoCardComponent();
        DEFAULT_INSTANCE = watchFeedVideoCardComponent;
        h.registerDefaultInstance(WatchFeedVideoCardComponent.class, watchFeedVideoCardComponent);
    }

    private WatchFeedVideoCardComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WatchFeedVideoCardComponent w(phc phcVar) {
        return (WatchFeedVideoCardComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0007\u0007\u0007\bȈ\tဉ\u0000\nȈ\u000bȈ\fȈ\rက\u0001", new Object[]{"bitField0_", "title_", "subtitle_", "thumbnailImageUrl_", "navigateUri_", "isExplicit_", "isAnimated_", "is19Plus_", "entityUri_", "videoFile_", "accessibilityText_", "overline_", "decisionId_", "portraitHorizontalFocusCenterPercentage_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedVideoCardComponent();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (WatchFeedVideoCardComponent.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.decisionId_;
    }

    public final boolean p() {
        return this.is19Plus_;
    }

    public final String q() {
        return this.navigateUri_;
    }

    public final String r() {
        return this.overline_;
    }

    public final double s() {
        return this.portraitHorizontalFocusCenterPercentage_;
    }

    public final String t() {
        return this.thumbnailImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final VideoFile u() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}
