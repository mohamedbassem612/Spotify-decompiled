package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GenerateUrlResponse extends h implements v2j0 {
    private static final GenerateUrlResponse DEFAULT_INSTANCE;
    public static final int FULL_URL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHAREABLE_URL_FIELD_NUMBER = 2;
    public static final int SHARE_ID_FIELD_NUMBER = 3;
    public static final int SPOTIFY_URI_FIELD_NUMBER = 1;
    private String spotifyUri_ = "";
    private String shareableUrl_ = "";
    private String shareId_ = "";
    private String fullUrl_ = "";

    static {
        GenerateUrlResponse generateUrlResponse = new GenerateUrlResponse();
        DEFAULT_INSTANCE = generateUrlResponse;
        h.registerDefaultInstance(GenerateUrlResponse.class, generateUrlResponse);
    }

    private GenerateUrlResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"spotifyUri_", "shareableUrl_", "shareId_", "fullUrl_"});
        }
        if (iOrdinal == 3) {
            return new GenerateUrlResponse();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (GenerateUrlResponse.class) {
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

    public final String getShareId() {
        return this.shareId_;
    }

    public final String n() {
        return this.fullUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.shareableUrl_;
    }

    public final String p() {
        return this.spotifyUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
