package com.spotify.savetospotify.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class HttpUpdateEpisodeRequest extends h implements v2j0 {
    private static final HttpUpdateEpisodeRequest DEFAULT_INSTANCE;
    public static final int IMAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String summary_ = "";
    private String imageToken_ = "";

    static {
        HttpUpdateEpisodeRequest httpUpdateEpisodeRequest = new HttpUpdateEpisodeRequest();
        DEFAULT_INSTANCE = httpUpdateEpisodeRequest;
        h.registerDefaultInstance(HttpUpdateEpisodeRequest.class, httpUpdateEpisodeRequest);
    }

    private HttpUpdateEpisodeRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "summary_", "imageToken_"});
        }
        if (iOrdinal == 3) {
            return new HttpUpdateEpisodeRequest();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (HttpUpdateEpisodeRequest.class) {
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
