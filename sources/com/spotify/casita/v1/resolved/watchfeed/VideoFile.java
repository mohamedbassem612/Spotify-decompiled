package com.spotify.casita.v1.resolved.watchfeed;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.flj1;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class VideoFile extends h implements v2j0 {
    private static final VideoFile DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration endTime_;
    private Duration startTime_;
    private int type_;
    private String uri_ = "";

    static {
        VideoFile videoFile = new VideoFile();
        DEFAULT_INSTANCE = videoFile;
        h.registerDefaultInstance(VideoFile.class, videoFile);
    }

    private VideoFile() {
    }

    public static VideoFile o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "uri_", "type_", "startTime_", "endTime_"});
        }
        if (iOrdinal == 3) {
            return new VideoFile();
        }
        if (iOrdinal == 4) {
            return new ofj1((byte) 5);
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
        synchronized (VideoFile.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Duration p() {
        Duration duration = this.endTime_;
        return duration == null ? Duration.n() : duration;
    }

    public final Duration q() {
        Duration duration = this.startTime_;
        return duration == null ? Duration.n() : duration;
    }

    public final flj1 r() {
        flj1 flj1Var;
        int i = this.type_;
        if (i == 0) {
            flj1Var = flj1.UNKNOWN;
        } else if (i != 1) {
            flj1Var = i != 2 ? null : flj1.MANIFEST_ID;
        } else {
            flj1Var = flj1.URL;
        }
        return flj1Var == null ? flj1.UNRECOGNIZED : flj1Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
