package com.spotify.watchfeed.component.content.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.BackgroundAudioPreview;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import com.spotify.watchfeed.component.model.v1.proto.TranscriptFile;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ReadAlongContent extends h implements v2j0 {
    public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 3;
    public static final int BACKGROUND_AUDIO_PREVIEW_FIELD_NUMBER = 2;
    public static final int COVER_IMAGE_FIELD_NUMBER = 6;
    private static final ReadAlongContent DEFAULT_INSTANCE;
    public static final int HIGHLIGHTCOLOR_FIELD_NUMBER = 4;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSCRIPT_FILE_FIELD_NUMBER = 1;
    private BackgroundAudioPreview backgroundAudioPreview_;
    private int bitField0_;
    private Image coverImage_;
    private boolean increaseVolumeGradually_;
    private TranscriptFile transcriptFile_;
    private String backgroundColor_ = "";
    private String highlightColor_ = "";

    static {
        ReadAlongContent readAlongContent = new ReadAlongContent();
        DEFAULT_INSTANCE = readAlongContent;
        h.registerDefaultInstance(ReadAlongContent.class, readAlongContent);
    }

    private ReadAlongContent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ReadAlongContent s(phc phcVar) {
        return (ReadAlongContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006ဉ\u0002", new Object[]{"bitField0_", "transcriptFile_", "backgroundAudioPreview_", "backgroundColor_", "highlightColor_", "increaseVolumeGradually_", "coverImage_"});
        }
        if (iOrdinal == 3) {
            return new ReadAlongContent();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ReadAlongContent.class) {
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

    public final BackgroundAudioPreview n() {
        BackgroundAudioPreview backgroundAudioPreview = this.backgroundAudioPreview_;
        return backgroundAudioPreview == null ? BackgroundAudioPreview.o() : backgroundAudioPreview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundColor_;
    }

    public final Image p() {
        Image image = this.coverImage_;
        return image == null ? Image.n() : image;
    }

    public final String q() {
        return this.highlightColor_;
    }

    public final TranscriptFile r() {
        TranscriptFile transcriptFile = this.transcriptFile_;
        return transcriptFile == null ? TranscriptFile.n() : transcriptFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
