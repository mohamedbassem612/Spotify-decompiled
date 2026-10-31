package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wjg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$FilterCurveOverrides extends h implements v2j0 {
    public static final int CUTOFF_FIELD_NUMBER = 1;
    private static final TransitionOuterClass$FilterCurveOverrides DEFAULT_INSTANCE;
    public static final int NOISE_COLOR_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RESONANCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves cutoff_;
    private TransitionOuterClass$AutomationCurves noiseColor_;
    private TransitionOuterClass$AutomationCurves resonance_;

    static {
        TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides = new TransitionOuterClass$FilterCurveOverrides();
        DEFAULT_INSTANCE = transitionOuterClass$FilterCurveOverrides;
        h.registerDefaultInstance(TransitionOuterClass$FilterCurveOverrides.class, transitionOuterClass$FilterCurveOverrides);
    }

    private TransitionOuterClass$FilterCurveOverrides() {
    }

    public static TransitionOuterClass$FilterCurveOverrides o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static wjg1 u() {
        return (wjg1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "cutoff_", "resonance_", "noiseColor_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$FilterCurveOverrides();
        }
        if (iOrdinal == 4) {
            return new wjg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$FilterCurveOverrides.class) {
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
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.cutoff_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransitionOuterClass$AutomationCurves p() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.noiseColor_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.resonance_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void v(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        this.cutoff_ = transitionOuterClass$AutomationCurves;
        this.bitField0_ |= 1;
    }

    public final void w(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        this.noiseColor_ = transitionOuterClass$AutomationCurves;
        this.bitField0_ |= 4;
    }

    public final void x(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        this.resonance_ = transitionOuterClass$AutomationCurves;
        this.bitField0_ |= 2;
    }
}
