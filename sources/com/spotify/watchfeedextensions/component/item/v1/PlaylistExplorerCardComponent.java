package com.spotify.watchfeedextensions.component.item.v1;

import com.google.protobuf.h;
import com.spotify.watchfeedextensions.component.model.v1.Image;
import com.spotify.watchfeedextensions.component.model.v1.VideoFile;
import p.bf40;
import p.dzt0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PlaylistExplorerCardComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static final PlaylistExplorerCardComponent DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 4;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 5;
    private int bitField0_;
    private VideoFile videoFile_;
    private String title_ = "";
    private String subtitle_ = "";
    private String accessibilityText_ = "";
    private h290 images_ = h.emptyProtobufList();
    private String navigationUri_ = "";

    static {
        PlaylistExplorerCardComponent playlistExplorerCardComponent = new PlaylistExplorerCardComponent();
        DEFAULT_INSTANCE = playlistExplorerCardComponent;
        h.registerDefaultInstance(PlaylistExplorerCardComponent.class, playlistExplorerCardComponent);
    }

    private PlaylistExplorerCardComponent() {
    }

    public static PlaylistExplorerCardComponent o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006Ȉ", new Object[]{"bitField0_", "title_", "subtitle_", "accessibilityText_", "images_", Image.class, "videoFile_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistExplorerCardComponent();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (PlaylistExplorerCardComponent.class) {
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

    public final h290 p() {
        return this.images_;
    }

    public final String q() {
        return this.navigationUri_;
    }

    public final VideoFile r() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
