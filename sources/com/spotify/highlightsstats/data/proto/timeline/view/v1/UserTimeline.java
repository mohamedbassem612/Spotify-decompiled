package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UserTimeline extends h implements v2j0 {
    public static final int ANALYTICS_PARAMETERS_FIELD_NUMBER = 5;
    private static final UserTimeline DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 3;
    public static final int NEXT_LOOK_BACK_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int STATS_FIELD_NUMBER = 2;
    public static final int TIMELINE_DATE_FIELD_NUMBER = 1;
    private PageAnalyticsParameters analyticsParameters_;
    private int bitField0_;
    private Highlights highlights_;
    private int nextLookBack_;
    private Stats stats_;
    private TimelineDate timelineDate_;

    static {
        UserTimeline userTimeline = new UserTimeline();
        DEFAULT_INSTANCE = userTimeline;
        h.registerDefaultInstance(UserTimeline.class, userTimeline);
    }

    private UserTimeline() {
    }

    public static UserTimeline o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static UserTimeline t(byte[] bArr) {
        return (UserTimeline) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005ဉ\u0003", new Object[]{"bitField0_", "timelineDate_", "stats_", "highlights_", "nextLookBack_", "analyticsParameters_"});
        }
        if (iOrdinal == 3) {
            return new UserTimeline();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (UserTimeline.class) {
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

    public final Highlights p() {
        Highlights highlights = this.highlights_;
        return highlights == null ? Highlights.n() : highlights;
    }

    public final int q() {
        return this.nextLookBack_;
    }

    public final Stats r() {
        Stats stats = this.stats_;
        return stats == null ? Stats.n() : stats;
    }

    public final TimelineDate s() {
        TimelineDate timelineDate = this.timelineDate_;
        return timelineDate == null ? TimelineDate.q() : timelineDate;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
