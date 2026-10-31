package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Heading extends h implements v2j0 {
    private static final Heading DEFAULT_INSTANCE;
    public static final int DESCRIPTION_ONLY_FIELD_NUMBER = 3;
    public static final int HEADING_WITH_DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RICH_TEXT_HEADING_FIELD_NUMBER = 4;
    public static final int SIMPLE_HEADING_FIELD_NUMBER = 1;
    private int headingTypeCase_ = 0;
    private Object headingType_;

    static {
        Heading heading = new Heading();
        DEFAULT_INSTANCE = heading;
        h.registerDefaultInstance(Heading.class, heading);
    }

    private Heading() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"headingType_", "headingTypeCase_", SimpleHeading.class, HeadingWithDescription.class, DescriptionOnly.class, RichTextHeading.class});
        }
        if (iOrdinal == 3) {
            return new Heading();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 23);
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
