package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetConcertsAtVenueNextPageResponse extends h implements v2j0 {
    private static final GetConcertsAtVenueNextPageResponse DEFAULT_INSTANCE;
    public static final int PAGINATION_TOKEN_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 rows_ = h.emptyProtobufList();
    private String paginationToken_ = "";

    static {
        GetConcertsAtVenueNextPageResponse getConcertsAtVenueNextPageResponse = new GetConcertsAtVenueNextPageResponse();
        DEFAULT_INSTANCE = getConcertsAtVenueNextPageResponse;
        h.registerDefaultInstance(GetConcertsAtVenueNextPageResponse.class, getConcertsAtVenueNextPageResponse);
    }

    private GetConcertsAtVenueNextPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000", new Object[]{"bitField0_", "rows_", ContentRow.class, "paginationToken_"});
        }
        if (iOrdinal == 3) {
            return new GetConcertsAtVenueNextPageResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (GetConcertsAtVenueNextPageResponse.class) {
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
        return this.paginationToken_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.rows_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
