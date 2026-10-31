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
public final class TransitionOuterClass$FxStyleCurves extends h implements v2j0 {
    private static final TransitionOuterClass$FxStyleCurves DEFAULT_INSTANCE;
    public static final int DELAY_DRY_WET_IN_CURVES_FIELD_NUMBER = 7;
    public static final int DELAY_DRY_WET_OUT_CURVES_FIELD_NUMBER = 6;
    public static final int ECHO_DRY_WET_IN_CURVES_FIELD_NUMBER = 3;
    public static final int ECHO_DRY_WET_OUT_CURVES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REVERB_DRY_WET_IN_CURVES_FIELD_NUMBER = 5;
    public static final int REVERB_DRY_WET_OUT_CURVES_FIELD_NUMBER = 4;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves delayDryWetInCurves_;
    private TransitionOuterClass$AutomationCurves delayDryWetOutCurves_;
    private TransitionOuterClass$AutomationCurves echoDryWetInCurves_;
    private TransitionOuterClass$AutomationCurves echoDryWetOutCurves_;
    private TransitionOuterClass$AutomationCurves reverbDryWetInCurves_;
    private TransitionOuterClass$AutomationCurves reverbDryWetOutCurves_;
    private TransitionOuterClass$FxStyle style_;

    static {
        TransitionOuterClass$FxStyleCurves transitionOuterClass$FxStyleCurves = new TransitionOuterClass$FxStyleCurves();
        DEFAULT_INSTANCE = transitionOuterClass$FxStyleCurves;
        h.registerDefaultInstance(TransitionOuterClass$FxStyleCurves.class, transitionOuterClass$FxStyleCurves);
    }

    private TransitionOuterClass$FxStyleCurves() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "style_", "echoDryWetOutCurves_", "echoDryWetInCurves_", "reverbDryWetOutCurves_", "reverbDryWetInCurves_", "delayDryWetOutCurves_", "delayDryWetInCurves_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$FxStyleCurves();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (TransitionOuterClass$FxStyleCurves.class) {
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
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.delayDryWetInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransitionOuterClass$AutomationCurves o() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.delayDryWetOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves p() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.echoDryWetInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.echoDryWetOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves r() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.reverbDryWetInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.reverbDryWetOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$FxStyle t() {
        TransitionOuterClass$FxStyle transitionOuterClass$FxStyle = this.style_;
        return transitionOuterClass$FxStyle == null ? TransitionOuterClass$FxStyle.n() : transitionOuterClass$FxStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
