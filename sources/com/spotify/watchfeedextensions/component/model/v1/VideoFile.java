package com.spotify.watchfeedextensions.component.model.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlj1;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VideoFile extends h implements v2j0 {
    private static final VideoFile DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private long endTime_;
    private long startTime_;
    private int type_;
    private String uri_ = "";

    static {
        VideoFile videoFile = new VideoFile();
        DEFAULT_INSTANCE = videoFile;
        h.registerDefaultInstance(VideoFile.class, videoFile);
    }

    private VideoFile() {
    }

    public static VideoFile n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0002", new Object[]{"uri_", "type_", "startTime_", "endTime_"});
        }
        if (iOrdinal == 3) {
            return new VideoFile();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 9);
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.endTime_;
    }

    public final long p() {
        return this.startTime_;
    }

    public final jlj1 q() {
        jlj1 jlj1Var;
        int i = this.type_;
        if (i != 0) {
            jlj1Var = i != 1 ? null : jlj1.MANIFEST_ID;
        } else {
            jlj1Var = jlj1.URL;
        }
        return jlj1Var == null ? jlj1.UNRECOGNIZED : jlj1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
