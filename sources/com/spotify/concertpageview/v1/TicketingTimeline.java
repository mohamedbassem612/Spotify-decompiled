package com.spotify.concertpageview.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class TicketingTimeline extends h implements v2j0 {
    private static final TicketingTimeline DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 3;
    public static final int FOOTER_LEGAL_HTML_FIELD_NUMBER = 4;
    public static final int GENERATED_AT_FIELD_NUMBER = 1;
    public static final int NEXT_REFRESH_AT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 entries_ = h.emptyProtobufList();
    private String footerLegalHtml_ = "";
    private Timestamp generatedAt_;
    private Timestamp nextRefreshAt_;

    static {
        TicketingTimeline ticketingTimeline = new TicketingTimeline();
        DEFAULT_INSTANCE = ticketingTimeline;
        h.registerDefaultInstance(TicketingTimeline.class, ticketingTimeline);
    }

    private TicketingTimeline() {
    }

    public static TicketingTimeline n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ለ\u0002", new Object[]{"bitField0_", "generatedAt_", "nextRefreshAt_", "entries_", TimelineEntry.class, "footerLegalHtml_"});
        }
        if (iOrdinal == 3) {
            return new TicketingTimeline();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (TicketingTimeline.class) {
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

    public final int o() {
        return this.entries_.size();
    }

    public final h290 p() {
        return this.entries_;
    }

    public final String q() {
        return this.footerLegalHtml_;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.generatedAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final Timestamp s() {
        Timestamp timestamp = this.nextRefreshAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }
}
