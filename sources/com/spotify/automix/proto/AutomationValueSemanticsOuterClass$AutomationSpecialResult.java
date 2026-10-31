package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j79;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AutomationValueSemanticsOuterClass$AutomationSpecialResult extends h implements v2j0 {
    private static final AutomationValueSemanticsOuterClass$AutomationSpecialResult DEFAULT_INSTANCE;
    public static final int NUMERIC_VALUE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 1;
    private int displayValueCase_ = 0;
    private Object displayValue_;

    static {
        AutomationValueSemanticsOuterClass$AutomationSpecialResult automationValueSemanticsOuterClass$AutomationSpecialResult = new AutomationValueSemanticsOuterClass$AutomationSpecialResult();
        DEFAULT_INSTANCE = automationValueSemanticsOuterClass$AutomationSpecialResult;
        h.registerDefaultInstance(AutomationValueSemanticsOuterClass$AutomationSpecialResult.class, automationValueSemanticsOuterClass$AutomationSpecialResult);
    }

    private AutomationValueSemanticsOuterClass$AutomationSpecialResult() {
    }

    public static AutomationValueSemanticsOuterClass$AutomationSpecialResult n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u00023\u0000", new Object[]{"displayValue_", "displayValueCase_"});
        }
        if (iOrdinal == 3) {
            return new AutomationValueSemanticsOuterClass$AutomationSpecialResult();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (AutomationValueSemanticsOuterClass$AutomationSpecialResult.class) {
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
        if (this.displayValueCase_ == 2) {
            return ((Double) this.displayValue_).doubleValue();
        }
        return 0.0d;
    }

    public final j79 p() {
        int i = this.displayValueCase_;
        j79 j79Var = j79.AUTOMATION_SPECIAL_ROLE_UNSPECIFIED;
        if (i == 1) {
            int iIntValue = ((Integer) this.displayValue_).intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    j79Var = j79.AUTOMATION_SPECIAL_ROLE_BYPASS;
                } else if (iIntValue == 2) {
                    j79Var = j79.AUTOMATION_SPECIAL_ROLE_OFF;
                } else if (iIntValue != 3) {
                    j79Var = iIntValue != 4 ? null : j79.AUTOMATION_SPECIAL_ROLE_KILL;
                } else {
                    j79Var = j79.AUTOMATION_SPECIAL_ROLE_MUTE;
                }
            }
            if (j79Var == null) {
                return j79.UNRECOGNIZED;
            }
        }
        return j79Var;
    }

    public final boolean q() {
        return this.displayValueCase_ == 2;
    }

    public final boolean r() {
        return this.displayValueCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
