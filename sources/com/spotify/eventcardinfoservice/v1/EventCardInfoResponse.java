package com.spotify.eventcardinfoservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EventCardInfoResponse extends h implements v2j0 {
    public static final int ARTISTCONCERTSURI_FIELD_NUMBER = 2;
    public static final int ARTWORK_FIELD_NUMBER = 1;
    private static final EventCardInfoResponse DEFAULT_INSTANCE;
    public static final int ISNEARBY_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int MULTI_EVENT_DETAILS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SINGLE_EVENT_DETAILS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object details_;
    private boolean isNearby_;
    private int detailsCase_ = 0;
    private String artwork_ = "";
    private String artistConcertsUri_ = "";
    private String location_ = "";

    static {
        EventCardInfoResponse eventCardInfoResponse = new EventCardInfoResponse();
        DEFAULT_INSTANCE = eventCardInfoResponse;
        h.registerDefaultInstance(EventCardInfoResponse.class, eventCardInfoResponse);
    }

    private EventCardInfoResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004ለ\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"details_", "detailsCase_", "bitField0_", "artwork_", "artistConcertsUri_", "isNearby_", "location_", SingleEvent.class, MultipleEvents.class});
        }
        if (iOrdinal == 3) {
            return new EventCardInfoResponse();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (EventCardInfoResponse.class) {
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
        return this.artistConcertsUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artwork_;
    }

    public final int p() {
        int i = this.detailsCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    public final boolean q() {
        return this.isNearby_;
    }

    public final String r() {
        return this.location_;
    }

    public final MultipleEvents s() {
        return this.detailsCase_ == 6 ? (MultipleEvents) this.details_ : MultipleEvents.n();
    }

    public final SingleEvent t() {
        return this.detailsCase_ == 5 ? (SingleEvent) this.details_ : SingleEvent.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return this.detailsCase_ == 5;
    }
}
