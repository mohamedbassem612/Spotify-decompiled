package com.spotify.watchfeedextensions.component.item.v1;

import com.google.protobuf.h;
import com.spotify.contentagnostic.v2.ColorSetContrastOptions;
import com.spotify.watchfeedextensions.component.model.v1.Image;
import com.spotify.watchfeedextensions.component.model.v1.VideoFile;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityExplorerButtonComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    private static final EntityExplorerButtonComponent DEFAULT_INSTANCE;
    public static final int EXTRACTED_COLOR_SET_FIELD_NUMBER = 8;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TOOLTIP_TEXT_FIELD_NUMBER = 4;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ColorSetContrastOptions extractedColorSet_;
    private Image thumbnailImage_;
    private VideoFile videoFile_;
    private String navigationUri_ = "";
    private String tooltipText_ = "";
    private String accessibilityText_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        EntityExplorerButtonComponent entityExplorerButtonComponent = new EntityExplorerButtonComponent();
        DEFAULT_INSTANCE = entityExplorerButtonComponent;
        h.registerDefaultInstance(EntityExplorerButtonComponent.class, entityExplorerButtonComponent);
    }

    private EntityExplorerButtonComponent() {
    }

    public static EntityExplorerButtonComponent o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0002", new Object[]{"bitField0_", "navigationUri_", "videoFile_", "thumbnailImage_", "tooltipText_", "accessibilityText_", "title_", "subtitle_", "extractedColorSet_"});
        }
        if (iOrdinal == 3) {
            return new EntityExplorerButtonComponent();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (EntityExplorerButtonComponent.class) {
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

    public final ColorSetContrastOptions p() {
        ColorSetContrastOptions colorSetContrastOptions = this.extractedColorSet_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.o() : colorSetContrastOptions;
    }

    public final String q() {
        return this.navigationUri_;
    }

    public final Image r() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.n() : image;
    }

    public final String s() {
        return this.tooltipText_;
    }

    public final VideoFile t() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}
