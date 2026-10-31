package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class DenominationSection extends h implements v2j0 {
    public static final int CLICKABLE_FIELD_NUMBER = 2;
    private static final DenominationSection DEFAULT_INSTANCE;
    public static final int DESCRIPTIVE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int sectionCase_ = 0;
    private Object section_;

    static {
        DenominationSection denominationSection = new DenominationSection();
        DEFAULT_INSTANCE = denominationSection;
        h.registerDefaultInstance(DenominationSection.class, denominationSection);
    }

    private DenominationSection() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"section_", "sectionCase_", DescriptiveSection.class, ClickableSection.class});
        }
        if (iOrdinal == 3) {
            return new DenominationSection();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (DenominationSection.class) {
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

    public final ClickableSection n() {
        return this.sectionCase_ == 2 ? (ClickableSection) this.section_ : ClickableSection.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DescriptiveSection o() {
        return this.sectionCase_ == 1 ? (DescriptiveSection) this.section_ : DescriptiveSection.n();
    }

    public final int p() {
        int i = this.sectionCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
