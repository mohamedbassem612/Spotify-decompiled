package com.spotify.unboxinghub.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Section extends h implements v2j0 {
    public static final int CARD_GROUP_FIELD_NUMBER = 3;
    private static final Section DEFAULT_INSTANCE;
    public static final int GRID_FIELD_NUMBER = 2;
    public static final int HERO_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRESENTATION_FIELD_NUMBER = 4;
    public static final int PROGRESS_TRACKER_FIELD_NUMBER = 5;
    private int sectionCase_ = 0;
    private Object section_;

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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"section_", "sectionCase_", BenefitsHero.class, Grid.class, CardGroup.class, GridPresentation.class, ProgressTracker.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 12);
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

    public final CardGroup n() {
        return this.sectionCase_ == 3 ? (CardGroup) this.section_ : CardGroup.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Grid o() {
        return this.sectionCase_ == 2 ? (Grid) this.section_ : Grid.n();
    }

    public final BenefitsHero p() {
        return this.sectionCase_ == 1 ? (BenefitsHero) this.section_ : BenefitsHero.o();
    }

    public final GridPresentation q() {
        return this.sectionCase_ == 4 ? (GridPresentation) this.section_ : GridPresentation.o();
    }

    public final ProgressTracker r() {
        return this.sectionCase_ == 5 ? (ProgressTracker) this.section_ : ProgressTracker.n();
    }

    public final boolean s() {
        return this.sectionCase_ == 3;
    }

    public final boolean t() {
        return this.sectionCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.sectionCase_ == 1;
    }

    public final boolean v() {
        return this.sectionCase_ == 4;
    }

    public final boolean w() {
        return this.sectionCase_ == 5;
    }
}
