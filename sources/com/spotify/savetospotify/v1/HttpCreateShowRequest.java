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
public final class HttpCreateShowRequest extends h implements v2j0 {
    public static final int AUTO_FOLLOW_FIELD_NUMBER = 6;
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 4;
    private static final HttpCreateShowRequest DEFAULT_INSTANCE;
    public static final int IMAGE_TOKEN_FIELD_NUMBER = 5;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean autoFollow_;
    private int bitField0_;
    private String title_ = "";
    private String summary_ = "";
    private String language_ = "";
    private String coverImageUrl_ = "";
    private String imageToken_ = "";

    static {
        HttpCreateShowRequest httpCreateShowRequest = new HttpCreateShowRequest();
        DEFAULT_INSTANCE = httpCreateShowRequest;
        h.registerDefaultInstance(HttpCreateShowRequest.class, httpCreateShowRequest);
    }

    private HttpCreateShowRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဇ\u0000", new Object[]{"bitField0_", "title_", "summary_", "language_", "coverImageUrl_", "imageToken_", "autoFollow_"});
        }
        if (iOrdinal == 3) {
            return new HttpCreateShowRequest();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (HttpCreateShowRequest.class) {
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
