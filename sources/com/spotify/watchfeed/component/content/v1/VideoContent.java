package com.spotify.watchfeed.component.content.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import com.spotify.watchfeed.component.model.v1.proto.PlaybackControlsConfig;
import com.spotify.watchfeed.component.model.v1.proto.TranscriptFile;
import com.spotify.watchfeed.component.model.v1.proto.VideoFile;
import p.bf40;
import p.jf40;
import p.ofj1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class VideoContent extends h implements v2j0 {
    public static final int DECISION_ID_FIELD_NUMBER = 5;
    private static final VideoContent DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 12;
    public static final int HIDE_GRADIENT_FIELD_NUMBER = 7;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROLS_CONFIG_FIELD_NUMBER = 10;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 4;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 8;
    public static final int TRANSCRIPT_FILE_FIELD_NUMBER = 11;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    public static final int VIDEO_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean hideGradient_;
    private boolean increaseVolumeGradually_;
    private PlaybackControlsConfig playbackControlsConfig_;
    private boolean shouldLoop_;
    private Image thumbnailImage_;
    private TranscriptFile transcriptFile_;
    private VideoFile videoFile_;
    private String videoUri_ = "";
    private String decisionId_ = "";
    private String title_ = "";
    private String entrypointUri_ = "";

    static {
        VideoContent videoContent = new VideoContent();
        DEFAULT_INSTANCE = videoContent;
        h.registerDefaultInstance(VideoContent.class, videoContent);
    }

    private VideoContent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VideoContent z(phc phcVar) {
        return (VideoContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005Ȉ\u0006\u0007\u0007\u0007\bȈ\nဉ\u0002\u000bဉ\u0003\fȈ", new Object[]{"bitField0_", "videoUri_", "videoFile_", "thumbnailImage_", "shouldLoop_", "decisionId_", "increaseVolumeGradually_", "hideGradient_", "title_", "playbackControlsConfig_", "transcriptFile_", "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new VideoContent();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (VideoContent.class) {
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

    public final String n() {
        return this.decisionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.entrypointUri_;
    }

    public final boolean p() {
        return this.hideGradient_;
    }

    public final boolean q() {
        return this.increaseVolumeGradually_;
    }

    public final PlaybackControlsConfig r() {
        PlaybackControlsConfig playbackControlsConfig = this.playbackControlsConfig_;
        return playbackControlsConfig == null ? PlaybackControlsConfig.n() : playbackControlsConfig;
    }

    public final boolean s() {
        return this.shouldLoop_;
    }

    public final Image t() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.n() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final TranscriptFile u() {
        TranscriptFile transcriptFile = this.transcriptFile_;
        return transcriptFile == null ? TranscriptFile.n() : transcriptFile;
    }

    public final VideoFile v() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final String w() {
        return this.videoUri_;
    }

    public final boolean x() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 8) != 0;
    }
}
