package com.spotify.concertsgalleryview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetGalleryPageRequest extends h implements v2j0 {
    private static final GetGalleryPageRequest DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int PAGE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String pageUri_ = "";
    private String nextPageToken_ = "";

    static {
        GetGalleryPageRequest getGalleryPageRequest = new GetGalleryPageRequest();
        DEFAULT_INSTANCE = getGalleryPageRequest;
        h.registerDefaultInstance(GetGalleryPageRequest.class, getGalleryPageRequest);
    }

    private GetGalleryPageRequest() {
    }

    public static mn40 n() {
        return (mn40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "pageUri_", "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new GetGalleryPageRequest();
        }
        if (iOrdinal == 4) {
            return new mn40(DEFAULT_INSTANCE);
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
        synchronized (GetGalleryPageRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.pageUri_ = str;
    }

    public final void setNextPageToken(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.nextPageToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
