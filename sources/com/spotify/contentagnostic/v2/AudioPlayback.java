package com.spotify.contentagnostic.v2;

import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AudioPlayback extends com.google.protobuf.h implements v2j0 {
    private static final AudioPlayback DEFAULT_INSTANCE;
    public static final int HOSTED_FIELD_NUMBER = 2;
    public static final int OFFSETS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PASS_THROUGH_FIELD_NUMBER = 1;
    public static final int REPORTING_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private AudioHosted hosted_;
    private PlaybackOffsets offsets_;
    private AudioPassThrough passThrough_;
    private String reportingUri_ = "";

    static {
        AudioPlayback audioPlayback = new AudioPlayback();
        DEFAULT_INSTANCE = audioPlayback;
        com.google.protobuf.h.registerDefaultInstance(AudioPlayback.class, audioPlayback);
    }

    private AudioPlayback() {
    }

    public static AudioPlayback n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"bitField0_", "passThrough_", "hosted_", "reportingUri_", "offsets_"});
        }
        if (iOrdinal == 3) {
            return new AudioPlayback();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (AudioPlayback.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudioHosted o() {
        AudioHosted audioHosted = this.hosted_;
        return audioHosted == null ? AudioHosted.o() : audioHosted;
    }

    public final PlaybackOffsets p() {
        PlaybackOffsets playbackOffsets = this.offsets_;
        return playbackOffsets == null ? PlaybackOffsets.n() : playbackOffsets;
    }

    public final AudioPassThrough q() {
        AudioPassThrough audioPassThrough = this.passThrough_;
        return audioPassThrough == null ? AudioPassThrough.n() : audioPassThrough;
    }

    public final String r() {
        return this.reportingUri_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
