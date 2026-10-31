package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.automix.proto.TransitionOuterClass$Preset;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$ComputedPreset extends h implements v2j0 {
    public static final int COMPUTED_SCORE_FIELD_NUMBER = 2;
    private static final EsAutomix$ComputedPreset DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    private int bitField0_;
    private float computedScore_;
    private TransitionOuterClass$Preset preset_;

    static {
        EsAutomix$ComputedPreset esAutomix$ComputedPreset = new EsAutomix$ComputedPreset();
        DEFAULT_INSTANCE = esAutomix$ComputedPreset;
        h.registerDefaultInstance(EsAutomix$ComputedPreset.class, esAutomix$ComputedPreset);
    }

    private EsAutomix$ComputedPreset() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0001", new Object[]{"bitField0_", "preset_", "computedScore_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$ComputedPreset();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (EsAutomix$ComputedPreset.class) {
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

    public final TransitionOuterClass$Preset n() {
        TransitionOuterClass$Preset transitionOuterClass$Preset = this.preset_;
        return transitionOuterClass$Preset == null ? TransitionOuterClass$Preset.n() : transitionOuterClass$Preset;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
