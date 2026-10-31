package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MarketComparisonItem extends h implements v2j0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 3;
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    private static final MarketComparisonItem DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIME_LISTENED_FIELD_NUMBER = 2;
    public static final int TOTAL_TIME_LISTENED_FIELD_NUMBER = 4;
    private int totalTimeListened_;
    private String name_ = "";
    private String timeListened_ = "";
    private String accentColor_ = "";
    private String accessibilityDescription_ = "";

    static {
        MarketComparisonItem marketComparisonItem = new MarketComparisonItem();
        DEFAULT_INSTANCE = marketComparisonItem;
        h.registerDefaultInstance(MarketComparisonItem.class, marketComparisonItem);
    }

    private MarketComparisonItem() {
    }

    public static MarketComparisonItem p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005Ȉ", new Object[]{"name_", "timeListened_", "accentColor_", "totalTimeListened_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new MarketComparisonItem();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (MarketComparisonItem.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.accentColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibilityDescription_;
    }

    public final String q() {
        return this.timeListened_;
    }

    public final int r() {
        return this.totalTimeListened_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
