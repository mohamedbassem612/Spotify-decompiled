package com.spotify.campfire.insights.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.ml80;
import p.ntd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.usc1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TasteMatchContent extends h implements v2j0 {
    private static final TasteMatchContent DEFAULT_INSTANCE;
    public static final int MATCH_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int MATCH_TIER_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USERNAMES_FIELD_NUMBER = 1;
    private int matchPercentage_;
    private int matchTier_;
    private int type_;
    private h290 usernames_ = h.emptyProtobufList();

    static {
        TasteMatchContent tasteMatchContent = new TasteMatchContent();
        DEFAULT_INSTANCE = tasteMatchContent;
        h.registerDefaultInstance(TasteMatchContent.class, tasteMatchContent);
    }

    private TasteMatchContent() {
    }

    public static TasteMatchContent n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002\u000b\u0003\f\u0004\f", new Object[]{"usernames_", "matchPercentage_", "type_", "matchTier_"});
        }
        if (iOrdinal == 3) {
            return new TasteMatchContent();
        }
        if (iOrdinal == 4) {
            return new usc1(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (TasteMatchContent.class) {
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

    public final int getMatchPercentage() {
        return this.matchPercentage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ml80 o() {
        ml80 ml80Var;
        int i = this.matchTier_;
        if (i == 0) {
            ml80Var = ml80.INSIGHT_TASTE_MATCH_TIER_UNSPECIFIED;
        } else if (i == 1) {
            ml80Var = ml80.INSIGHT_TASTE_MATCH_TIER_VERY_LOW;
        } else if (i == 2) {
            ml80Var = ml80.INSIGHT_TASTE_MATCH_TIER_LOW;
        } else if (i == 3) {
            ml80Var = ml80.INSIGHT_TASTE_MATCH_TIER_MEDIUM;
        } else if (i != 4) {
            ml80Var = i != 5 ? null : ml80.INSIGHT_TASTE_MATCH_TIER_VERY_HIGH;
        } else {
            ml80Var = ml80.INSIGHT_TASTE_MATCH_TIER_HIGH;
        }
        return ml80Var == null ? ml80.UNRECOGNIZED : ml80Var;
    }

    public final ntd1 p() {
        ntd1 ntd1Var;
        int i = this.type_;
        if (i == 0) {
            ntd1Var = ntd1.TASTE_MATCH_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            ntd1Var = ntd1.TASTE_MATCH_TYPE_TASTE_MATCH;
        } else if (i != 2) {
            ntd1Var = i != 3 ? null : ntd1.TASTE_MATCH_TYPE_MOST_TASTE_MATCH;
        } else {
            ntd1Var = ntd1.TASTE_MATCH_TYPE_LEAST_TASTE_MATCH;
        }
        return ntd1Var == null ? ntd1.UNRECOGNIZED : ntd1Var;
    }

    public final h290 q() {
        return this.usernames_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
