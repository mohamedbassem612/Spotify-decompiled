package com.spotify.watchfeed.component.content.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.AudioFile;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import com.spotify.watchfeed.component.model.v1.proto.PlaybackControlsConfig;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TrackPreviewContent extends h implements v2j0 {
    public static final int ANIMATION_URL_FIELD_NUMBER = 4;
    public static final int AUDIO_FILE_FIELD_NUMBER = 2;
    public static final int DECISION_ID_FIELD_NUMBER = 6;
    private static final TrackPreviewContent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 9;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROLS_CONFIG_FIELD_NUMBER = 8;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    private AudioFile audioFile_;
    private int bitField0_;
    private boolean increaseVolumeGradually_;
    private PlaybackControlsConfig playbackControlsConfig_;
    private boolean shouldLoop_;
    private Image thumbnailImage_;
    private String entityUri_ = "";
    private String animationUrl_ = "";
    private String decisionId_ = "";
    private String entrypointUri_ = "";

    static {
        TrackPreviewContent trackPreviewContent = new TrackPreviewContent();
        DEFAULT_INSTANCE = trackPreviewContent;
        h.registerDefaultInstance(TrackPreviewContent.class, trackPreviewContent);
    }

    private TrackPreviewContent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TrackPreviewContent w(phc phcVar) {
        return (TrackPreviewContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007\u0007\bဉ\u0002\tȈ", new Object[]{"bitField0_", "entityUri_", "audioFile_", "thumbnailImage_", "animationUrl_", "shouldLoop_", "decisionId_", "increaseVolumeGradually_", "playbackControlsConfig_", "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new TrackPreviewContent();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (TrackPreviewContent.class) {
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

    public final String n() {
        return this.animationUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudioFile o() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.o() : audioFile;
    }

    public final String p() {
        return this.decisionId_;
    }

    public final String q() {
        return this.entrypointUri_;
    }

    public final boolean r() {
        return this.increaseVolumeGradually_;
    }

    public final PlaybackControlsConfig s() {
        PlaybackControlsConfig playbackControlsConfig = this.playbackControlsConfig_;
        return playbackControlsConfig == null ? PlaybackControlsConfig.n() : playbackControlsConfig;
    }

    public final boolean t() {
        return this.shouldLoop_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Image u() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.n() : image;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }
}
