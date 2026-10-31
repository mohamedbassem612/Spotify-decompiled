package com.spotify.extendedmetadata.extensions.episodetranscriptsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeTranscriptMetadata extends h implements v2j0 {
    public static final int CDN_URL_FIELD_NUMBER = 4;
    public static final int CURATED_FIELD_NUMBER = 3;
    private static final EpisodeTranscriptMetadata DEFAULT_INSTANCE;
    public static final int IS_STATIC_FIELD_NUMBER = 5;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int READ_ALONG_URL_V2_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean curated_;
    private boolean isStatic_;
    private String uri_ = "";
    private String language_ = "";
    private String cdnUrl_ = "";
    private String readAlongUrlV2_ = "";

    static {
        EpisodeTranscriptMetadata episodeTranscriptMetadata = new EpisodeTranscriptMetadata();
        DEFAULT_INSTANCE = episodeTranscriptMetadata;
        h.registerDefaultInstance(EpisodeTranscriptMetadata.class, episodeTranscriptMetadata);
    }

    private EpisodeTranscriptMetadata() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006Ȉ", new Object[]{"uri_", "language_", "curated_", "cdnUrl_", "isStatic_", "readAlongUrlV2_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeTranscriptMetadata();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (EpisodeTranscriptMetadata.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.cdnUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.curated_;
    }

    public final boolean p() {
        return this.isStatic_;
    }

    public final String q() {
        return this.readAlongUrlV2_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
