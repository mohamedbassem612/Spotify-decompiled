package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$EqStyleCurves extends h implements v2j0 {
    private static final TransitionOuterClass$EqStyleCurves DEFAULT_INSTANCE;
    public static final int HIGH_EQ_IN_CURVES_FIELD_NUMBER = 7;
    public static final int HIGH_EQ_OUT_CURVES_FIELD_NUMBER = 4;
    public static final int LOW_EQ_IN_CURVES_FIELD_NUMBER = 5;
    public static final int LOW_EQ_OUT_CURVES_FIELD_NUMBER = 2;
    public static final int MID_EQ_IN_CURVES_FIELD_NUMBER = 6;
    public static final int MID_EQ_OUT_CURVES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves highEqInCurves_;
    private TransitionOuterClass$AutomationCurves highEqOutCurves_;
    private TransitionOuterClass$AutomationCurves lowEqInCurves_;
    private TransitionOuterClass$AutomationCurves lowEqOutCurves_;
    private TransitionOuterClass$AutomationCurves midEqInCurves_;
    private TransitionOuterClass$AutomationCurves midEqOutCurves_;
    private TransitionOuterClass$EqStyle style_;

    static {
        TransitionOuterClass$EqStyleCurves transitionOuterClass$EqStyleCurves = new TransitionOuterClass$EqStyleCurves();
        DEFAULT_INSTANCE = transitionOuterClass$EqStyleCurves;
        h.registerDefaultInstance(TransitionOuterClass$EqStyleCurves.class, transitionOuterClass$EqStyleCurves);
    }

    private TransitionOuterClass$EqStyleCurves() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "style_", "lowEqOutCurves_", "midEqOutCurves_", "highEqOutCurves_", "lowEqInCurves_", "midEqInCurves_", "highEqInCurves_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$EqStyleCurves();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (TransitionOuterClass$EqStyleCurves.class) {
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

    public final TransitionOuterClass$AutomationCurves n() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.highEqInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransitionOuterClass$AutomationCurves o() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.highEqOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves p() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.lowEqInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.lowEqOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves r() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.midEqInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.midEqOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$EqStyle t() {
        TransitionOuterClass$EqStyle transitionOuterClass$EqStyle = this.style_;
        return transitionOuterClass$EqStyle == null ? TransitionOuterClass$EqStyle.n() : transitionOuterClass$EqStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
