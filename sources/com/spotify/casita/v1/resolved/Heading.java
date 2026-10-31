package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kx40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Heading extends h implements v2j0 {
    private static final Heading DEFAULT_INSTANCE;
    public static final int EMPTY_HEADING_FIELD_NUMBER = 1;
    public static final int ENRICHED_HEADING_FIELD_NUMBER = 3;
    public static final int HEADING_WITH_DESCRIPTION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SPONSORED_HEADING_FIELD_NUMBER = 4;
    public static final int STATIC_ENRICHED_HEADING_FIELD_NUMBER = 6;
    public static final int TEXT_HEADING_FIELD_NUMBER = 2;
    private int headingCase_ = 0;
    private Object heading_;

    static {
        Heading heading = new Heading();
        DEFAULT_INSTANCE = heading;
        h.registerDefaultInstance(Heading.class, heading);
    }

    private Heading() {
    }

    public static Heading o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"heading_", "headingCase_", EmptyHeading.class, HeadingWithText.class, EnrichedHeading.class, SponsoredHeading.class, HeadingWithDescription.class, StaticEnrichedHeading.class});
        }
        if (iOrdinal == 3) {
            return new Heading();
        }
        if (iOrdinal == 4) {
            return new zp50((byte) 22);
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
        synchronized (Heading.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EnrichedHeading p() {
        return this.headingCase_ == 3 ? (EnrichedHeading) this.heading_ : EnrichedHeading.p();
    }

    public final int q() {
        return kx40.a(this.headingCase_);
    }

    public final HeadingWithDescription r() {
        return this.headingCase_ == 5 ? (HeadingWithDescription) this.heading_ : HeadingWithDescription.o();
    }

    public final SponsoredHeading s() {
        return this.headingCase_ == 4 ? (SponsoredHeading) this.heading_ : SponsoredHeading.o();
    }

    public final StaticEnrichedHeading t() {
        return this.headingCase_ == 6 ? (StaticEnrichedHeading) this.heading_ : StaticEnrichedHeading.o();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final HeadingWithText u() {
        return this.headingCase_ == 2 ? (HeadingWithText) this.heading_ : HeadingWithText.o();
    }
}
