package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jf8;
import p.l79;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AutomationValueSemanticsOuterClass$AutomationInterpolationSegment extends h implements v2j0 {
    private static final AutomationValueSemanticsOuterClass$AutomationInterpolationSegment DEFAULT_INSTANCE;
    public static final int LINEAR_FIELD_NUMBER = 5;
    public static final int NO_EASING_FIELD_NUMBER = 7;
    public static final int OUTPUT_END_FIELD_NUMBER = 4;
    public static final int OUTPUT_MODE_FIELD_NUMBER = 10;
    public static final int OUTPUT_START_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int POWER_IN_FIELD_NUMBER = 8;
    public static final int POWER_OUT_FIELD_NUMBER = 9;
    public static final int RAW_END_FIELD_NUMBER = 2;
    public static final int RAW_START_FIELD_NUMBER = 1;
    public static final int SIGNED_GEOMETRIC_FIELD_NUMBER = 6;
    private Object easing_;
    private double outputEnd_;
    private Object outputInterpolation_;
    private int outputMode_;
    private double outputStart_;
    private double rawEnd_;
    private double rawStart_;
    private int outputInterpolationCase_ = 0;
    private int easingCase_ = 0;

    static {
        AutomationValueSemanticsOuterClass$AutomationInterpolationSegment automationValueSemanticsOuterClass$AutomationInterpolationSegment = new AutomationValueSemanticsOuterClass$AutomationInterpolationSegment();
        DEFAULT_INSTANCE = automationValueSemanticsOuterClass$AutomationInterpolationSegment;
        h.registerDefaultInstance(AutomationValueSemanticsOuterClass$AutomationInterpolationSegment.class, automationValueSemanticsOuterClass$AutomationInterpolationSegment);
    }

    private AutomationValueSemanticsOuterClass$AutomationInterpolationSegment() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0002\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0001\b<\u0001\t<\u0001\n\f", new Object[]{"outputInterpolation_", "outputInterpolationCase_", "easing_", "easingCase_", "rawStart_", "rawEnd_", "outputStart_", "outputEnd_", AutomationValueSemanticsOuterClass$AutomationLinearInterpolation.class, AutomationValueSemanticsOuterClass$AutomationSignedGeometricInterpolation.class, AutomationValueSemanticsOuterClass$AutomationLinearEasing.class, AutomationValueSemanticsOuterClass$AutomationPowerEasing.class, AutomationValueSemanticsOuterClass$AutomationPowerEasing.class, "outputMode_"});
        }
        if (iOrdinal == 3) {
            return new AutomationValueSemanticsOuterClass$AutomationInterpolationSegment();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (AutomationValueSemanticsOuterClass$AutomationInterpolationSegment.class) {
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

    public final double n() {
        return this.outputEnd_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final l79 o() {
        l79 l79Var;
        int i = this.outputMode_;
        if (i == 0) {
            l79Var = l79.AUTOMATION_VALUE_MODE_UNSPECIFIED;
        } else if (i != 1) {
            l79Var = i != 2 ? null : l79.AUTOMATION_VALUE_MODE_HIGH_PASS;
        } else {
            l79Var = l79.AUTOMATION_VALUE_MODE_LOW_PASS;
        }
        return l79Var == null ? l79.UNRECOGNIZED : l79Var;
    }

    public final double p() {
        return this.outputStart_;
    }

    public final AutomationValueSemanticsOuterClass$AutomationPowerEasing q() {
        return this.easingCase_ == 8 ? (AutomationValueSemanticsOuterClass$AutomationPowerEasing) this.easing_ : AutomationValueSemanticsOuterClass$AutomationPowerEasing.n();
    }

    public final AutomationValueSemanticsOuterClass$AutomationPowerEasing r() {
        return this.easingCase_ == 9 ? (AutomationValueSemanticsOuterClass$AutomationPowerEasing) this.easing_ : AutomationValueSemanticsOuterClass$AutomationPowerEasing.n();
    }

    public final double s() {
        return this.rawEnd_;
    }

    public final double t() {
        return this.rawStart_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.outputInterpolationCase_ == 5;
    }

    public final boolean v() {
        return this.easingCase_ == 7;
    }

    public final boolean w() {
        return this.easingCase_ == 8;
    }

    public final boolean x() {
        return this.easingCase_ == 9;
    }

    public final boolean y() {
        return this.outputInterpolationCase_ == 6;
    }
}
