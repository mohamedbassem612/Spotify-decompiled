package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class LandscapeShareImageResponse extends com.google.protobuf.h implements v2j0 {
    private static final LandscapeShareImageResponse DEFAULT_INSTANCE;
    public static final int OPEN_PAGE_SHARE_REDIRECT_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CARD_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int SHARE_META_TITLE_FIELD_NUMBER = 3;
    public static final int YEAR_FIELD_NUMBER = 4;
    private String openPageShareRedirectUrl_ = "";
    private String shareCardImageUrl_ = "";
    private String shareMetaTitle_ = "";
    private int year_;

    static {
        LandscapeShareImageResponse landscapeShareImageResponse = new LandscapeShareImageResponse();
        DEFAULT_INSTANCE = landscapeShareImageResponse;
        com.google.protobuf.h.registerDefaultInstance(LandscapeShareImageResponse.class, landscapeShareImageResponse);
    }

    private LandscapeShareImageResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"openPageShareRedirectUrl_", "shareCardImageUrl_", "shareMetaTitle_", "year_"});
        }
        if (iOrdinal == 3) {
            return new LandscapeShareImageResponse();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (LandscapeShareImageResponse.class) {
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

    public final String n() {
        return this.shareCardImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.shareMetaTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
