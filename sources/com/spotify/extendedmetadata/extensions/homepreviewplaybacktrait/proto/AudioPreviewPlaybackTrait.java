package com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.b131;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class AudioPreviewPlaybackTrait extends h implements v2j0 {
    public static final int AUDIO_FILE_URL_FIELD_NUMBER = 1;
    private static final AudioPreviewPlaybackTrait DEFAULT_INSTANCE;
    public static final int DURATION_FROM_ORIGINAL_FIELD_NUMBER = 10;
    public static final int OFFSETS_FROM_ORIGINAL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_DURATION_FIELD_NUMBER = 7;
    public static final int PREVIEW_RESTRICTION_FIELD_NUMBER = 9;
    public static final int PREVIEW_STREAM_REPORTING_URI_FIELD_NUMBER = 8;
    public static final int TRANSCRIPT_URL_FIELD_NUMBER = 2;
    public static final int VIDEO_FILE_ID_FIELD_NUMBER = 4;
    public static final int VIDEO_PLACEHOLDER_IMAGE_URL_FIELD_NUMBER = 6;
    private int bitField0_;
    private Duration durationFromOriginal_;
    private Offsets offsetsFromOriginal_;
    private Duration previewDuration_;
    private int previewRestriction_;
    private String audioFileUrl_ = "";
    private String transcriptUrl_ = "";
    private String videoFileId_ = "";
    private String videoPlaceholderImageUrl_ = "";
    private String previewStreamReportingUri_ = "";

    static {
        AudioPreviewPlaybackTrait audioPreviewPlaybackTrait = new AudioPreviewPlaybackTrait();
        DEFAULT_INSTANCE = audioPreviewPlaybackTrait;
        h.registerDefaultInstance(AudioPreviewPlaybackTrait.class, audioPreviewPlaybackTrait);
    }

    private AudioPreviewPlaybackTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AudioPreviewPlaybackTrait x(byte[] bArr) {
        return (AudioPreviewPlaybackTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ\u0007ဉ\u0001\bȈ\t\f\nဉ\u0002", new Object[]{"bitField0_", "audioFileUrl_", "transcriptUrl_", "videoFileId_", "offsetsFromOriginal_", "videoPlaceholderImageUrl_", "previewDuration_", "previewStreamReportingUri_", "previewRestriction_", "durationFromOriginal_"});
        }
        if (iOrdinal == 3) {
            return new AudioPreviewPlaybackTrait();
        }
        if (iOrdinal == 4) {
            return new hw7((byte) 5);
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
        synchronized (AudioPreviewPlaybackTrait.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.audioFileUrl_;
    }

    public final Duration p() {
        Duration duration = this.durationFromOriginal_;
        return duration == null ? Duration.n() : duration;
    }

    public final Offsets q() {
        Offsets offsets = this.offsetsFromOriginal_;
        return offsets == null ? Offsets.o() : offsets;
    }

    public final Duration r() {
        Duration duration = this.previewDuration_;
        return duration == null ? Duration.n() : duration;
    }

    public final b131 s() {
        b131 b131VarA = b131.a(this.previewRestriction_);
        return b131VarA == null ? b131.e : b131VarA;
    }

    public final String t() {
        return this.previewStreamReportingUri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.transcriptUrl_;
    }

    public final String v() {
        return this.videoFileId_;
    }

    public final String w() {
        return this.videoPlaceholderImageUrl_;
    }
}
