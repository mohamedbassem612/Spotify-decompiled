package com.spotify.npvcontrolsexperiment.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.fin0;
import p.jf40;
import p.pvc;
import p.q8p0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class NpvControlsExperiment extends h implements v2j0 {
    private static final NpvControlsExperiment DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    public static final int OVERRIDE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SPEED_MODE_FIELD_NUMBER = 3;
    private static final c290 override_converter_ = new pvc((byte) 17);
    private int mode_;
    private int overrideMemoizedSerializedSize;
    private b290 override_ = h.emptyIntList();
    private int speedMode_;

    static {
        NpvControlsExperiment npvControlsExperiment = new NpvControlsExperiment();
        DEFAULT_INSTANCE = npvControlsExperiment;
        h.registerDefaultInstance(NpvControlsExperiment.class, npvControlsExperiment);
    }

    private NpvControlsExperiment() {
    }

    public static NpvControlsExperiment p(byte[] bArr) {
        return (NpvControlsExperiment) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002,\u0003\f", new Object[]{"mode_", "override_", "speedMode_"});
        }
        if (iOrdinal == 3) {
            return new NpvControlsExperiment();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (NpvControlsExperiment.class) {
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

    public final q8p0 n() {
        q8p0 q8p0Var;
        int i = this.mode_;
        if (i == 0) {
            q8p0Var = q8p0.CONTROLS_MODE_UNSPECIFIED;
        } else if (i != 1) {
            q8p0Var = i != 2 ? null : q8p0.CONTROLS_MODE_TALK;
        } else {
            q8p0Var = q8p0.CONTROLS_MODE_MUSIC;
        }
        return q8p0Var == null ? q8p0.UNRECOGNIZED : q8p0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final d290 o() {
        return new d290(this.override_, override_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
