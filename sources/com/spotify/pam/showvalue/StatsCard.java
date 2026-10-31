package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xqz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class StatsCard extends h implements v2j0 {
    public static final int CATEGORY_TITLE_FIELD_NUMBER = 1;
    private static final StatsCard DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RANK_DIRECTION_FIELD_NUMBER = 5;
    public static final int RANK_FIELD_NUMBER = 4;
    private int rankDirection_;
    private int rank_;
    private String categoryTitle_ = "";
    private String navigationUri_ = "";
    private String entityUri_ = "";

    static {
        StatsCard statsCard = new StatsCard();
        DEFAULT_INSTANCE = statsCard;
        h.registerDefaultInstance(StatsCard.class, statsCard);
    }

    private StatsCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\f", new Object[]{"categoryTitle_", "navigationUri_", "entityUri_", "rank_", "rankDirection_"});
        }
        if (iOrdinal == 3) {
            return new StatsCard();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (StatsCard.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String n() {
        return this.categoryTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.navigationUri_;
    }

    public final int p() {
        return this.rank_;
    }

    public final xqz0 q() {
        xqz0 xqz0Var;
        int i = this.rankDirection_;
        if (i == 0) {
            xqz0Var = xqz0.b;
        } else if (i != 1) {
            xqz0Var = i != 2 ? null : xqz0.d;
        } else {
            xqz0Var = xqz0.c;
        }
        return xqz0Var == null ? xqz0.e : xqz0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
