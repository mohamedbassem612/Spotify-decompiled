package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zeo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CuepointsOuterClass$Cuepoint extends h implements v2j0 {
    public static final int CONFIDENCE_FIELD_NUMBER = 4;
    private static final CuepointsOuterClass$Cuepoint DEFAULT_INSTANCE;
    public static final int ORIGIN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_MS_FIELD_NUMBER = 1;
    public static final int TEMPO_BPM_FIELD_NUMBER = 2;
    private double confidence_;
    private int origin_;
    private long positionMs_;
    private float tempoBpm_;

    static {
        CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint = new CuepointsOuterClass$Cuepoint();
        DEFAULT_INSTANCE = cuepointsOuterClass$Cuepoint;
        h.registerDefaultInstance(CuepointsOuterClass$Cuepoint.class, cuepointsOuterClass$Cuepoint);
    }

    private CuepointsOuterClass$Cuepoint() {
    }

    public static CuepointsOuterClass$Cuepoint o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0001\u0003\f\u0004\u0000", new Object[]{"positionMs_", "tempoBpm_", "origin_", "confidence_"});
        }
        if (iOrdinal == 3) {
            return new CuepointsOuterClass$Cuepoint();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (CuepointsOuterClass$Cuepoint.class) {
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
        return this.confidence_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final zeo p() {
        zeo zeoVar;
        int i = this.origin_;
        if (i != 0) {
            zeoVar = i != 1 ? null : zeo.ML;
        } else {
            zeoVar = zeo.HUMAN;
        }
        return zeoVar == null ? zeo.UNRECOGNIZED : zeoVar;
    }

    public final long q() {
        return this.positionMs_;
    }

    public final float r() {
        return this.tempoBpm_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
