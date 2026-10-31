package com.spotify.musicplaybackspeed.speedcontrolbottomsheet.proto;

import com.google.protobuf.h;
import p.axa1;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class SpeedPayload extends h implements v2j0 {
    public static final int BPM_FIELD_NUMBER = 2;
    private static final SpeedPayload DEFAULT_INSTANCE;
    public static final int MULTIPLIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PITCH_FACTOR_FIELD_NUMBER = 4;
    public static final int PITCH_PRESERVED_FIELD_NUMBER = 3;
    private double pitchFactor_;
    private boolean pitchPreserved_;
    private int speedCase_ = 0;
    private Object speed_;

    static {
        SpeedPayload speedPayload = new SpeedPayload();
        DEFAULT_INSTANCE = speedPayload;
        h.registerDefaultInstance(SpeedPayload.class, speedPayload);
    }

    private SpeedPayload() {
    }

    public static axa1 n() {
        return (axa1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00013\u0000\u00023\u0000\u0003\u0007\u0004\u0000", new Object[]{"speed_", "speedCase_", "pitchPreserved_", "pitchFactor_"});
        }
        if (iOrdinal == 3) {
            return new SpeedPayload();
        }
        if (iOrdinal == 4) {
            return new axa1(DEFAULT_INSTANCE);
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
        synchronized (SpeedPayload.class) {
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

    public final void o(double d) {
        this.speedCase_ = 1;
        this.speed_ = Double.valueOf(d);
    }

    public final void p() {
        this.pitchFactor_ = 1.0d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
