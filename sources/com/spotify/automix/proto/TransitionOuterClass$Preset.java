package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ekg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$Preset extends h implements v2j0 {
    private static final TransitionOuterClass$Preset DEFAULT_INSTANCE;
    public static final int EQ_IN_CURVE_OVERRIDES_FIELD_NUMBER = 9;
    public static final int EQ_OUT_CURVE_OVERRIDES_FIELD_NUMBER = 8;
    public static final int EQ_STYLE_OVERRIDE_FIELD_NUMBER = 4;
    public static final int FILTER_FX_STYLE_OVERRIDE_FIELD_NUMBER = 5;
    public static final int FILTER_IN_CURVE_OVERRIDES_FIELD_NUMBER = 11;
    public static final int FILTER_OUT_CURVE_OVERRIDES_FIELD_NUMBER = 10;
    public static final int FX_IN_CURVE_OVERRIDES_FIELD_NUMBER = 14;
    public static final int FX_OUT_CURVE_OVERRIDES_FIELD_NUMBER = 13;
    public static final int FX_STYLE_OVERRIDE_FIELD_NUMBER = 12;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JOGWHEEL_STYLE_OVERRIDE_FIELD_NUMBER = 15;
    public static final int LOOPING_OUT_BLOCKS_OVERRIDE_FIELD_NUMBER = 17;
    public static final int LOOPING_STYLE_OVERRIDE_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VOLUME_IN_CURVE_OVERRIDE_FIELD_NUMBER = 7;
    public static final int VOLUME_OUT_CURVE_OVERRIDE_FIELD_NUMBER = 6;
    public static final int VOLUME_STYLE_OVERRIDE_FIELD_NUMBER = 3;
    private int bitField0_;
    private TransitionOuterClass$EqCurveOverrides eqInCurveOverrides_;
    private TransitionOuterClass$EqCurveOverrides eqOutCurveOverrides_;
    private TransitionOuterClass$EqStyle eqStyleOverride_;
    private TransitionOuterClass$FilterFxStyle filterFxStyleOverride_;
    private TransitionOuterClass$FilterCurveOverrides filterInCurveOverrides_;
    private TransitionOuterClass$FilterCurveOverrides filterOutCurveOverrides_;
    private TransitionOuterClass$FxCurveOverrides fxInCurveOverrides_;
    private TransitionOuterClass$FxCurveOverrides fxOutCurveOverrides_;
    private TransitionOuterClass$FxStyle fxStyleOverride_;
    private int id_;
    private TransitionOuterClass$JogwheelStyle jogwheelStyleOverride_;
    private TransitionOuterClass$BlockSequence loopingOutBlocksOverride_;
    private TransitionOuterClass$LoopingStyle loopingStyleOverride_;
    private int type_;
    private TransitionOuterClass$AutomationCurves volumeInCurveOverride_;
    private TransitionOuterClass$AutomationCurves volumeOutCurveOverride_;
    private TransitionOuterClass$VolumeStyle volumeStyleOverride_;

    static {
        TransitionOuterClass$Preset transitionOuterClass$Preset = new TransitionOuterClass$Preset();
        DEFAULT_INSTANCE = transitionOuterClass$Preset;
        h.registerDefaultInstance(TransitionOuterClass$Preset.class, transitionOuterClass$Preset);
    }

    private TransitionOuterClass$Preset() {
    }

    public static ekg1 T() {
        return (ekg1) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransitionOuterClass$Preset n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final TransitionOuterClass$LoopingStyle A() {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = this.loopingStyleOverride_;
        return transitionOuterClass$LoopingStyle == null ? TransitionOuterClass$LoopingStyle.n() : transitionOuterClass$LoopingStyle;
    }

    public final TransitionOuterClass$AutomationCurves B() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.volumeInCurveOverride_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$AutomationCurves C() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.volumeOutCurveOverride_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.p() : transitionOuterClass$AutomationCurves;
    }

    public final TransitionOuterClass$VolumeStyle D() {
        TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle = this.volumeStyleOverride_;
        return transitionOuterClass$VolumeStyle == null ? TransitionOuterClass$VolumeStyle.n() : transitionOuterClass$VolumeStyle;
    }

    public final boolean E() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean N() {
        return (this.bitField0_ & 4096) != 0;
    }

    public final boolean O() {
        return (this.bitField0_ & 16384) != 0;
    }

    public final boolean P() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean Q() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean R() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean S() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void U(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        this.eqInCurveOverrides_ = transitionOuterClass$EqCurveOverrides;
        this.bitField0_ |= 64;
    }

    public final void V(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        this.eqOutCurveOverrides_ = transitionOuterClass$EqCurveOverrides;
        this.bitField0_ |= 32;
    }

    public final void W(TransitionOuterClass$EqStyle transitionOuterClass$EqStyle) {
        this.eqStyleOverride_ = transitionOuterClass$EqStyle;
        this.bitField0_ |= 2;
    }

    public final void X(TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle) {
        this.filterFxStyleOverride_ = transitionOuterClass$FilterFxStyle;
        this.bitField0_ |= 4;
    }

    public final void Y(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        this.filterInCurveOverrides_ = transitionOuterClass$FilterCurveOverrides;
        this.bitField0_ |= 256;
    }

    public final void Z(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        this.filterOutCurveOverrides_ = transitionOuterClass$FilterCurveOverrides;
        this.bitField0_ |= 128;
    }

    public final void a0(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        this.fxInCurveOverrides_ = transitionOuterClass$FxCurveOverrides;
        this.bitField0_ |= 2048;
    }

    public final void b0(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        this.fxOutCurveOverrides_ = transitionOuterClass$FxCurveOverrides;
        this.bitField0_ |= 1024;
    }

    public final void c0(TransitionOuterClass$FxStyle transitionOuterClass$FxStyle) {
        this.fxStyleOverride_ = transitionOuterClass$FxStyle;
        this.bitField0_ |= 512;
    }

    public final void d0(int i) {
        this.id_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", new Object[]{"bitField0_", "id_", "type_", "volumeStyleOverride_", "eqStyleOverride_", "filterFxStyleOverride_", "volumeOutCurveOverride_", "volumeInCurveOverride_", "eqOutCurveOverrides_", "eqInCurveOverrides_", "filterOutCurveOverrides_", "filterInCurveOverrides_", "fxStyleOverride_", "fxOutCurveOverrides_", "fxInCurveOverrides_", "jogwheelStyleOverride_", "loopingStyleOverride_", "loopingOutBlocksOverride_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Preset();
        }
        if (iOrdinal == 4) {
            return new ekg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Preset.class) {
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

    public final void e0(TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle) {
        this.jogwheelStyleOverride_ = transitionOuterClass$JogwheelStyle;
        this.bitField0_ |= 4096;
    }

    public final void f0(TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence) {
        this.loopingOutBlocksOverride_ = transitionOuterClass$BlockSequence;
        this.bitField0_ |= 16384;
    }

    public final void g0(TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle) {
        this.loopingStyleOverride_ = transitionOuterClass$LoopingStyle;
        this.bitField0_ |= 8192;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void h0(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        this.volumeInCurveOverride_ = transitionOuterClass$AutomationCurves;
        this.bitField0_ |= 16;
    }

    public final void i0(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        this.volumeOutCurveOverride_ = transitionOuterClass$AutomationCurves;
        this.bitField0_ |= 8;
    }

    public final void j0(TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle) {
        this.volumeStyleOverride_ = transitionOuterClass$VolumeStyle;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransitionOuterClass$EqCurveOverrides o() {
        TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides = this.eqInCurveOverrides_;
        return transitionOuterClass$EqCurveOverrides == null ? TransitionOuterClass$EqCurveOverrides.n() : transitionOuterClass$EqCurveOverrides;
    }

    public final TransitionOuterClass$EqCurveOverrides p() {
        TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides = this.eqOutCurveOverrides_;
        return transitionOuterClass$EqCurveOverrides == null ? TransitionOuterClass$EqCurveOverrides.n() : transitionOuterClass$EqCurveOverrides;
    }

    public final TransitionOuterClass$EqStyle q() {
        TransitionOuterClass$EqStyle transitionOuterClass$EqStyle = this.eqStyleOverride_;
        return transitionOuterClass$EqStyle == null ? TransitionOuterClass$EqStyle.n() : transitionOuterClass$EqStyle;
    }

    public final TransitionOuterClass$FilterFxStyle r() {
        TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle = this.filterFxStyleOverride_;
        return transitionOuterClass$FilterFxStyle == null ? TransitionOuterClass$FilterFxStyle.n() : transitionOuterClass$FilterFxStyle;
    }

    public final TransitionOuterClass$FilterCurveOverrides s() {
        TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides = this.filterInCurveOverrides_;
        return transitionOuterClass$FilterCurveOverrides == null ? TransitionOuterClass$FilterCurveOverrides.o() : transitionOuterClass$FilterCurveOverrides;
    }

    public final TransitionOuterClass$FilterCurveOverrides t() {
        TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides = this.filterOutCurveOverrides_;
        return transitionOuterClass$FilterCurveOverrides == null ? TransitionOuterClass$FilterCurveOverrides.o() : transitionOuterClass$FilterCurveOverrides;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final TransitionOuterClass$FxCurveOverrides u() {
        TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides = this.fxInCurveOverrides_;
        return transitionOuterClass$FxCurveOverrides == null ? TransitionOuterClass$FxCurveOverrides.n() : transitionOuterClass$FxCurveOverrides;
    }

    public final TransitionOuterClass$FxCurveOverrides v() {
        TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides = this.fxOutCurveOverrides_;
        return transitionOuterClass$FxCurveOverrides == null ? TransitionOuterClass$FxCurveOverrides.n() : transitionOuterClass$FxCurveOverrides;
    }

    public final TransitionOuterClass$FxStyle w() {
        TransitionOuterClass$FxStyle transitionOuterClass$FxStyle = this.fxStyleOverride_;
        return transitionOuterClass$FxStyle == null ? TransitionOuterClass$FxStyle.n() : transitionOuterClass$FxStyle;
    }

    public final int x() {
        return this.id_;
    }

    public final TransitionOuterClass$JogwheelStyle y() {
        TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle = this.jogwheelStyleOverride_;
        return transitionOuterClass$JogwheelStyle == null ? TransitionOuterClass$JogwheelStyle.n() : transitionOuterClass$JogwheelStyle;
    }

    public final TransitionOuterClass$BlockSequence z() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.loopingOutBlocksOverride_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.p() : transitionOuterClass$BlockSequence;
    }
}
