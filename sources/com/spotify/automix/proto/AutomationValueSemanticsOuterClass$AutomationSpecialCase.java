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
public final class AutomationValueSemanticsOuterClass$AutomationSpecialCase extends h implements v2j0 {
    private static final AutomationValueSemanticsOuterClass$AutomationSpecialCase DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_RANGE_FIELD_NUMBER = 2;
    public static final int RAW_VALUE_FIELD_NUMBER = 1;
    public static final int RESULT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int locationCase_ = 0;
    private Object location_;
    private AutomationValueSemanticsOuterClass$AutomationSpecialResult result_;

    static {
        AutomationValueSemanticsOuterClass$AutomationSpecialCase automationValueSemanticsOuterClass$AutomationSpecialCase = new AutomationValueSemanticsOuterClass$AutomationSpecialCase();
        DEFAULT_INSTANCE = automationValueSemanticsOuterClass$AutomationSpecialCase;
        h.registerDefaultInstance(AutomationValueSemanticsOuterClass$AutomationSpecialCase.class, automationValueSemanticsOuterClass$AutomationSpecialCase);
    }

    private AutomationValueSemanticsOuterClass$AutomationSpecialCase() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u00013\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"location_", "locationCase_", "bitField0_", AutomationValueSemanticsOuterClass$AutomationRawRange.class, "result_"});
        }
        if (iOrdinal == 3) {
            return new AutomationValueSemanticsOuterClass$AutomationSpecialCase();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (AutomationValueSemanticsOuterClass$AutomationSpecialCase.class) {
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

    public final AutomationValueSemanticsOuterClass$AutomationRawRange n() {
        return this.locationCase_ == 2 ? (AutomationValueSemanticsOuterClass$AutomationRawRange) this.location_ : AutomationValueSemanticsOuterClass$AutomationRawRange.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        if (this.locationCase_ == 1) {
            return ((Double) this.location_).doubleValue();
        }
        return 0.0d;
    }

    public final AutomationValueSemanticsOuterClass$AutomationSpecialResult p() {
        AutomationValueSemanticsOuterClass$AutomationSpecialResult automationValueSemanticsOuterClass$AutomationSpecialResult = this.result_;
        return automationValueSemanticsOuterClass$AutomationSpecialResult == null ? AutomationValueSemanticsOuterClass$AutomationSpecialResult.n() : automationValueSemanticsOuterClass$AutomationSpecialResult;
    }

    public final boolean q() {
        return this.locationCase_ == 2;
    }

    public final boolean r() {
        return this.locationCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
