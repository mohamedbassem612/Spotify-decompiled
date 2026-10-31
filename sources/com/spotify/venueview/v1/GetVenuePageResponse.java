package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetVenuePageResponse extends h implements v2j0 {
    private static final GetVenuePageResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TABS_FIELD_NUMBER = 2;
    private int bitField0_;
    private PageHeader header_;
    private h290 tabs_ = h.emptyProtobufList();

    static {
        GetVenuePageResponse getVenuePageResponse = new GetVenuePageResponse();
        DEFAULT_INSTANCE = getVenuePageResponse;
        h.registerDefaultInstance(GetVenuePageResponse.class, getVenuePageResponse);
    }

    private GetVenuePageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "header_", "tabs_", Tab.class});
        }
        if (iOrdinal == 3) {
            return new GetVenuePageResponse();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (GetVenuePageResponse.class) {
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

    public final PageHeader n() {
        PageHeader pageHeader = this.header_;
        return pageHeader == null ? PageHeader.q() : pageHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.tabs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
