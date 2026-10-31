package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Section extends h implements v2j0 {
    public static final int CHIPS_FIELD_NUMBER = 5;
    private static final Section DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_SHELF_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAST_PERIODS_FIELD_NUMBER = 4;
    public static final int PERIOD_FIELD_NUMBER = 2;
    public static final int TILES_FIELD_NUMBER = 3;
    private int contentCase_ = 0;
    private Object content_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"content_", "contentCase_", HighlightsShelfSection.class, PeriodSection.class, TilesSection.class, PastPeriodsSection.class, ChipsSection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (Section.class) {
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

    public final ChipsSection n() {
        return this.contentCase_ == 5 ? (ChipsSection) this.content_ : ChipsSection.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.contentCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final HighlightsShelfSection p() {
        return this.contentCase_ == 1 ? (HighlightsShelfSection) this.content_ : HighlightsShelfSection.n();
    }

    public final PastPeriodsSection q() {
        return this.contentCase_ == 4 ? (PastPeriodsSection) this.content_ : PastPeriodsSection.n();
    }

    public final PeriodSection r() {
        return this.contentCase_ == 2 ? (PeriodSection) this.content_ : PeriodSection.o();
    }

    public final TilesSection s() {
        return this.contentCase_ == 3 ? (TilesSection) this.content_ : TilesSection.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
