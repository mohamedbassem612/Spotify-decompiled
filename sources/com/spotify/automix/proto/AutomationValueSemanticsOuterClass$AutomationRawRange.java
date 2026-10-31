package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AutomationValueSemanticsOuterClass$AutomationRawRange extends h implements v2j0 {
    private static final AutomationValueSemanticsOuterClass$AutomationRawRange DEFAULT_INSTANCE;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private double maximum_;
    private double minimum_;

    static {
        AutomationValueSemanticsOuterClass$AutomationRawRange automationValueSemanticsOuterClass$AutomationRawRange = new AutomationValueSemanticsOuterClass$AutomationRawRange();
        DEFAULT_INSTANCE = automationValueSemanticsOuterClass$AutomationRawRange;
        h.registerDefaultInstance(AutomationValueSemanticsOuterClass$AutomationRawRange.class, automationValueSemanticsOuterClass$AutomationRawRange);
    }

    private AutomationValueSemanticsOuterClass$AutomationRawRange() {
    }

    public static AutomationValueSemanticsOuterClass$AutomationRawRange n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"minimum_", "maximum_"});
        }
        if (iOrdinal == 3) {
            return new AutomationValueSemanticsOuterClass$AutomationRawRange();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (AutomationValueSemanticsOuterClass$AutomationRawRange.class) {
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

    public final double o() {
        return this.maximum_;
    }

    public final double p() {
        return this.minimum_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
