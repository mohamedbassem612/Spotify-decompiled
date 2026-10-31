package com.spotify.savetospotify.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class HttpCreateEpisodeRequest extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 13;
    public static final int ARTIST_FIELD_NUMBER = 12;
    public static final int CHUNK_COUNT_FIELD_NUMBER = 7;
    private static final HttpCreateEpisodeRequest DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 11;
    public static final int IMAGE_TOKEN_FIELD_NUMBER = 9;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 14;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int chunkCount_;
    private long durationMs_;
    private boolean isExplicit_;
    private int mediaType_;
    private String title_ = "";
    private String summary_ = "";
    private String language_ = "";
    private String imageToken_ = "";
    private String artist_ = "";
    private String album_ = "";

    static {
        HttpCreateEpisodeRequest httpCreateEpisodeRequest = new HttpCreateEpisodeRequest();
        DEFAULT_INSTANCE = httpCreateEpisodeRequest;
        h.registerDefaultInstance(HttpCreateEpisodeRequest.class, httpCreateEpisodeRequest);
    }

    private HttpCreateEpisodeRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000e\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0006\f\u0007\u0004\tȈ\u000b\u0002\fȈ\rȈ\u000e\u0007", new Object[]{"title_", "summary_", "language_", "mediaType_", "chunkCount_", "imageToken_", "durationMs_", "artist_", "album_", "isExplicit_"});
        }
        if (iOrdinal == 3) {
            return new HttpCreateEpisodeRequest();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (HttpCreateEpisodeRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
