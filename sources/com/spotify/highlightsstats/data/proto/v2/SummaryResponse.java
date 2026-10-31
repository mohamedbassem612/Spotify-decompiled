package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usc1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SummaryResponse extends h implements v2j0 {
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 2;
    private static final SummaryResponse DEFAULT_INSTANCE;
    public static final int IS_CURRENT_PERIOD_FIELD_NUMBER = 5;
    public static final int PAGE_TITLE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private PageAnalyticsParameters analyticsParameters_;
    private int bitField0_;
    private boolean isCurrentPeriod_;
    private Timestamp timestamp_;
    private h290 sections_ = h.emptyProtobufList();
    private String pageTitle_ = "";

    static {
        SummaryResponse summaryResponse = new SummaryResponse();
        DEFAULT_INSTANCE = summaryResponse;
        h.registerDefaultInstance(SummaryResponse.class, summaryResponse);
    }

    private SummaryResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005\u0007", new Object[]{"bitField0_", "sections_", Section.class, "analyticsParameters_", "pageTitle_", "timestamp_", "isCurrentPeriod_"});
        }
        if (iOrdinal == 3) {
            return new SummaryResponse();
        }
        if (iOrdinal == 4) {
            return new usc1(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (SummaryResponse.class) {
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

    public final PageAnalyticsParameters n() {
        PageAnalyticsParameters pageAnalyticsParameters = this.analyticsParameters_;
        return pageAnalyticsParameters == null ? PageAnalyticsParameters.n() : pageAnalyticsParameters;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.isCurrentPeriod_;
    }

    public final String p() {
        return this.pageTitle_;
    }

    public final h290 q() {
        return this.sections_;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
