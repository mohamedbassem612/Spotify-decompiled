package com.spotify.concertsgalleryview.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.em40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GetGalleryPageResponse extends h implements v2j0 {
    private static final GetGalleryPageResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Header header_;
    private h290 items_ = h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        GetGalleryPageResponse getGalleryPageResponse = new GetGalleryPageResponse();
        DEFAULT_INSTANCE = getGalleryPageResponse;
        h.registerDefaultInstance(GetGalleryPageResponse.class, getGalleryPageResponse);
    }

    private GetGalleryPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ለ\u0001", new Object[]{"bitField0_", "header_", "items_", ContentItem.class, "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new GetGalleryPageResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (GetGalleryPageResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    public final Header n() {
        Header header = this.header_;
        return header == null ? Header.n() : header;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
