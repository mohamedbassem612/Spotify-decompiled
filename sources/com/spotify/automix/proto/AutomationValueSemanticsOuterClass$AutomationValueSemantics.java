package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.jf8;
import p.k79;
import p.m79;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AutomationValueSemanticsOuterClass$AutomationValueSemantics extends h implements v2j0 {
    public static final int BASE_10_LOG_RATIO_FIELD_NUMBER = 10;
    private static final AutomationValueSemanticsOuterClass$AutomationValueSemantics DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int OUTPUT_UNIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PIECEWISE_INTERPOLATION_FIELD_NUMBER = 11;
    public static final int SPECIAL_CASES_FIELD_NUMBER = 20;
    private int kind_;
    private Object mapping_;
    private int outputUnit_;
    private int mappingCase_ = 0;
    private h290 specialCases_ = h.emptyProtobufList();

    static {
        AutomationValueSemanticsOuterClass$AutomationValueSemantics automationValueSemanticsOuterClass$AutomationValueSemantics = new AutomationValueSemanticsOuterClass$AutomationValueSemantics();
        DEFAULT_INSTANCE = automationValueSemanticsOuterClass$AutomationValueSemantics;
        h.registerDefaultInstance(AutomationValueSemanticsOuterClass$AutomationValueSemantics.class, automationValueSemanticsOuterClass$AutomationValueSemantics);
    }

    private AutomationValueSemanticsOuterClass$AutomationValueSemantics() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0014\u0005\u0000\u0001\u0000\u0001\f\u0002\f\n<\u0000\u000b<\u0000\u0014\u001b", new Object[]{"mapping_", "mappingCase_", "kind_", "outputUnit_", AutomationValueSemanticsOuterClass$AutomationBase10LogRatioMapping.class, AutomationValueSemanticsOuterClass$AutomationPiecewiseInterpolationMapping.class, "specialCases_", AutomationValueSemanticsOuterClass$AutomationSpecialCase.class});
        }
        if (iOrdinal == 3) {
            return new AutomationValueSemanticsOuterClass$AutomationValueSemantics();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (AutomationValueSemanticsOuterClass$AutomationValueSemantics.class) {
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

    public final AutomationValueSemanticsOuterClass$AutomationBase10LogRatioMapping n() {
        return this.mappingCase_ == 10 ? (AutomationValueSemanticsOuterClass$AutomationBase10LogRatioMapping) this.mapping_ : AutomationValueSemanticsOuterClass$AutomationBase10LogRatioMapping.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final k79 o() {
        k79 k79Var;
        int i = this.kind_;
        if (i == 0) {
            k79Var = k79.AUTOMATION_VALUE_KIND_UNSPECIFIED;
        } else if (i == 1) {
            k79Var = k79.AUTOMATION_VALUE_KIND_LINEAR_GAIN;
        } else if (i == 2) {
            k79Var = k79.AUTOMATION_VALUE_KIND_EQ_GAIN;
        } else if (i == 3) {
            k79Var = k79.AUTOMATION_VALUE_KIND_FILTER_CUTOFF;
        } else if (i != 4) {
            k79Var = i != 5 ? null : k79.AUTOMATION_VALUE_KIND_NOISE_COLOR;
        } else {
            k79Var = k79.AUTOMATION_VALUE_KIND_DRY_WET;
        }
        return k79Var == null ? k79.UNRECOGNIZED : k79Var;
    }

    public final m79 p() {
        m79 m79Var;
        int i = this.outputUnit_;
        if (i == 0) {
            m79Var = m79.AUTOMATION_VALUE_UNIT_UNSPECIFIED;
        } else if (i == 1) {
            m79Var = m79.AUTOMATION_VALUE_UNIT_DECIBELS;
        } else if (i != 2) {
            m79Var = i != 3 ? null : m79.AUTOMATION_VALUE_UNIT_PERCENT;
        } else {
            m79Var = m79.AUTOMATION_VALUE_UNIT_HERTZ;
        }
        return m79Var == null ? m79.UNRECOGNIZED : m79Var;
    }

    public final AutomationValueSemanticsOuterClass$AutomationPiecewiseInterpolationMapping q() {
        return this.mappingCase_ == 11 ? (AutomationValueSemanticsOuterClass$AutomationPiecewiseInterpolationMapping) this.mapping_ : AutomationValueSemanticsOuterClass$AutomationPiecewiseInterpolationMapping.n();
    }

    public final h290 r() {
        return this.specialCases_;
    }

    public final boolean s() {
        return this.mappingCase_ == 10;
    }

    public final boolean t() {
        return this.mappingCase_ == 11;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
