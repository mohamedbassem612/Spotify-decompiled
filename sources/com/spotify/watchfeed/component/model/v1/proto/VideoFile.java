package com.spotify.watchfeed.component.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hlj1;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class VideoFile extends h implements v2j0 {
    private static final VideoFile DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    public static final int FEATURE_UUID_FIELD_NUMBER = 5;
    public static final int IS_EXTRACTED_SEPARATE_MEDIA_FILE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private long endTime_;
    private boolean isExtractedSeparateMediaFile_;
    private long startTime_;
    private int type_;
    private String uri_ = "";
    private String featureUuid_ = "";

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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0002\u0005Ȉ\u0006\u0007", new Object[]{"uri_", "type_", "startTime_", "endTime_", "featureUuid_", "isExtractedSeparateMediaFile_"});
        }
        if (iOrdinal == 3) {
            return new VideoFile();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 7);
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

    public final String p() {
        return this.featureUuid_;
    }

    public final boolean q() {
        return this.isExtractedSeparateMediaFile_;
    }

    public final long r() {
        return this.startTime_;
    }

    public final hlj1 s() {
        hlj1 hlj1Var;
        int i = this.type_;
        if (i != 0) {
            hlj1Var = i != 1 ? null : hlj1.MANIFEST_ID;
        } else {
            hlj1Var = hlj1.URL;
        }
        return hlj1Var == null ? hlj1.UNRECOGNIZED : hlj1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
