package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GetFeedResponse extends h implements v2j0 {
    private static final GetFeedResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private PageHeader header_;
    private h290 sections_ = h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        GetFeedResponse getFeedResponse = new GetFeedResponse();
        DEFAULT_INSTANCE = getFeedResponse;
        h.registerDefaultInstance(GetFeedResponse.class, getFeedResponse);
    }

    private GetFeedResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ለ\u0001", new Object[]{"bitField0_", "header_", "sections_", Section.class, "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (GetFeedResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    public final PageHeader n() {
        PageHeader pageHeader = this.header_;
        return pageHeader == null ? PageHeader.n() : pageHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
