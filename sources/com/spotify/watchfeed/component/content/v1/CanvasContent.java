package com.spotify.watchfeed.component.content.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.AudioFile;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import com.spotify.watchfeed.component.model.v1.proto.PlaybackControlsConfig;
import com.spotify.watchfeed.component.model.v1.proto.VideoFile;
import p.bf40;
import p.bid;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CanvasContent extends h implements v2j0 {
    public static final int AUDIO_FILE_FIELD_NUMBER = 3;
    public static final int DECISION_ID_FIELD_NUMBER = 6;
    private static final CanvasContent DEFAULT_INSTANCE;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROLS_CONFIG_FIELD_NUMBER = 8;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    private AudioFile audioFile_;
    private int bitField0_;
    private boolean increaseVolumeGradually_;
    private PlaybackControlsConfig playbackControlsConfig_;
    private boolean shouldLoop_;
    private Image thumbnailImage_;
    private VideoFile videoFile_;
    private String trackUri_ = "";
    private String decisionId_ = "";

    static {
        CanvasContent canvasContent = new CanvasContent();
        DEFAULT_INSTANCE = canvasContent;
        h.registerDefaultInstance(CanvasContent.class, canvasContent);
    }

    private CanvasContent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CanvasContent w(phc phcVar) {
        return (CanvasContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007\u0006Ȉ\u0007\u0007\bဉ\u0003", new Object[]{"bitField0_", "trackUri_", "videoFile_", "audioFile_", "thumbnailImage_", "shouldLoop_", "decisionId_", "increaseVolumeGradually_", "playbackControlsConfig_"});
        }
        if (iOrdinal == 3) {
            return new CanvasContent();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (CanvasContent.class) {
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

    public final AudioFile n() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.o() : audioFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.decisionId_;
    }

    public final boolean p() {
        return this.increaseVolumeGradually_;
    }

    public final PlaybackControlsConfig q() {
        PlaybackControlsConfig playbackControlsConfig = this.playbackControlsConfig_;
        return playbackControlsConfig == null ? PlaybackControlsConfig.n() : playbackControlsConfig;
    }

    public final boolean r() {
        return this.shouldLoop_;
    }

    public final Image s() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.n() : image;
    }

    public final String t() {
        return this.trackUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final VideoFile u() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.n() : videoFile;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }
}
