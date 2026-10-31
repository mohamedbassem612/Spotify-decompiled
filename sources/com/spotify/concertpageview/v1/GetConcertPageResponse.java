package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetConcertPageResponse extends h implements v2j0 {
    private static final GetConcertPageResponse DEFAULT_INSTANCE;
    public static final int EVENT_HERO_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NOT_INTERESTED_BOTTOM_SHEET_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 2;
    public static final int TABS_FIELD_NUMBER = 3;
    private int bitField0_;
    private EventHero eventHero_;
    private PageHeader header_;
    private NotInterestedBottomSheet notInterestedBottomSheet_;
    private h290 rows_ = h.emptyProtobufList();
    private h290 tabs_ = h.emptyProtobufList();

    static {
        GetConcertPageResponse getConcertPageResponse = new GetConcertPageResponse();
        DEFAULT_INSTANCE = getConcertPageResponse;
        h.registerDefaultInstance(GetConcertPageResponse.class, getConcertPageResponse);
    }

    private GetConcertPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "header_", "rows_", Row.class, "tabs_", Tab.class, "notInterestedBottomSheet_", "eventHero_"});
        }
        if (iOrdinal == 3) {
            return new GetConcertPageResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (GetConcertPageResponse.class) {
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

    public final EventHero n() {
        EventHero eventHero = this.eventHero_;
        return eventHero == null ? EventHero.n() : eventHero;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PageHeader o() {
        PageHeader pageHeader = this.header_;
        return pageHeader == null ? PageHeader.q() : pageHeader;
    }

    public final h290 p() {
        return this.rows_;
    }

    public final h290 q() {
        return this.tabs_;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
