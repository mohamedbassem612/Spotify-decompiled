package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.ShareConfiguration;
import p.bf40;
import p.h290;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Stats extends h implements v2j0 {
    private static final Stats DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_MESSAGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int SOCIAL_STATS_ITEMS_FIELD_NUMBER = 6;
    public static final int STATSITEMS_FIELD_NUMBER = 1;
    public static final int STATSSTATUS_FIELD_NUMBER = 2;
    public static final int STATS_AVAILABILITY_FIELD_NUMBER = 5;
    private int bitField0_;
    private ShareConfiguration shareConfiguration_;
    private StatsAvailabilityDetails statsAvailability_;
    private int statsStatus_;
    private h290 statsItems_ = h.emptyProtobufList();
    private String lastUpdatedMessage_ = "";
    private h290 socialStatsItems_ = h.emptyProtobufList();

    static {
        Stats stats = new Stats();
        DEFAULT_INSTANCE = stats;
        h.registerDefaultInstance(Stats.class, stats);
    }

    private Stats() {
    }

    public static Stats n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001b\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006\u001b", new Object[]{"bitField0_", "statsItems_", StatsItem.class, "statsStatus_", "lastUpdatedMessage_", "shareConfiguration_", "statsAvailability_", "socialStatsItems_", SocialStatsItem.class});
        }
        if (iOrdinal == 3) {
            return new Stats();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (Stats.class) {
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

    public final String o() {
        return this.lastUpdatedMessage_;
    }

    public final ShareConfiguration p() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.n() : shareConfiguration;
    }

    public final h290 q() {
        return this.socialStatsItems_;
    }

    public final StatsAvailabilityDetails r() {
        StatsAvailabilityDetails statsAvailabilityDetails = this.statsAvailability_;
        return statsAvailabilityDetails == null ? StatsAvailabilityDetails.n() : statsAvailabilityDetails;
    }

    public final h290 s() {
        return this.statsItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
