package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.automix.proto.TransitionOuterClass$EqStyle;
import com.spotify.automix.proto.TransitionOuterClass$FilterFxStyle;
import com.spotify.automix.proto.TransitionOuterClass$FxStyle;
import com.spotify.automix.proto.TransitionOuterClass$JogwheelStyle;
import com.spotify.automix.proto.TransitionOuterClass$LoopingStyle;
import com.spotify.automix.proto.TransitionOuterClass$VolumeStyle;
import p.bf40;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$PresetIdStyle extends h implements v2j0 {
    private static final EsAutomix$PresetIdStyle DEFAULT_INSTANCE;
    public static final int EQ_STYLE_FIELD_NUMBER = 3;
    public static final int FILTER_FX_STYLE_FIELD_NUMBER = 4;
    public static final int FX_STYLE_FIELD_NUMBER = 5;
    public static final int JOGWHEEL_STYLE_FIELD_NUMBER = 6;
    public static final int LOOPING_STYLE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PRESET_ID_FIELD_NUMBER = 1;
    public static final int VOLUME_STYLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private TransitionOuterClass$EqStyle eqStyle_;
    private TransitionOuterClass$FilterFxStyle filterFxStyle_;
    private TransitionOuterClass$FxStyle fxStyle_;
    private TransitionOuterClass$JogwheelStyle jogwheelStyle_;
    private TransitionOuterClass$LoopingStyle loopingStyle_;
    private int presetId_;
    private TransitionOuterClass$VolumeStyle volumeStyle_;

    static {
        EsAutomix$PresetIdStyle esAutomix$PresetIdStyle = new EsAutomix$PresetIdStyle();
        DEFAULT_INSTANCE = esAutomix$PresetIdStyle;
        h.registerDefaultInstance(EsAutomix$PresetIdStyle.class, esAutomix$PresetIdStyle);
    }

    private EsAutomix$PresetIdStyle() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "presetId_", "volumeStyle_", "eqStyle_", "filterFxStyle_", "fxStyle_", "jogwheelStyle_", "loopingStyle_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$PresetIdStyle();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (EsAutomix$PresetIdStyle.class) {
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

    public final TransitionOuterClass$EqStyle n() {
        TransitionOuterClass$EqStyle transitionOuterClass$EqStyle = this.eqStyle_;
        return transitionOuterClass$EqStyle == null ? TransitionOuterClass$EqStyle.n() : transitionOuterClass$EqStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransitionOuterClass$FilterFxStyle o() {
        TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle = this.filterFxStyle_;
        return transitionOuterClass$FilterFxStyle == null ? TransitionOuterClass$FilterFxStyle.n() : transitionOuterClass$FilterFxStyle;
    }

    public final TransitionOuterClass$FxStyle p() {
        TransitionOuterClass$FxStyle transitionOuterClass$FxStyle = this.fxStyle_;
        return transitionOuterClass$FxStyle == null ? TransitionOuterClass$FxStyle.n() : transitionOuterClass$FxStyle;
    }

    public final TransitionOuterClass$JogwheelStyle q() {
        TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle = this.jogwheelStyle_;
        return transitionOuterClass$JogwheelStyle == null ? TransitionOuterClass$JogwheelStyle.n() : transitionOuterClass$JogwheelStyle;
    }

    public final TransitionOuterClass$LoopingStyle r() {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = this.loopingStyle_;
        return transitionOuterClass$LoopingStyle == null ? TransitionOuterClass$LoopingStyle.n() : transitionOuterClass$LoopingStyle;
    }

    public final TransitionOuterClass$VolumeStyle s() {
        TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle = this.volumeStyle_;
        return transitionOuterClass$VolumeStyle == null ? TransitionOuterClass$VolumeStyle.n() : transitionOuterClass$VolumeStyle;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
