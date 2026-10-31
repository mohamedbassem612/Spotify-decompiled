package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CuepointsOuterClass$Cuepoints extends h implements v2j0 {
    public static final int BEST_FADE_IN_CUEPOINT_FIELD_NUMBER = 1;
    public static final int BEST_FADE_OUT_CUEPOINT_FIELD_NUMBER = 2;
    private static final CuepointsOuterClass$Cuepoints DEFAULT_INSTANCE;
    public static final int FADE_IN_CUEPOINTS_FIELD_NUMBER = 3;
    public static final int FADE_OUT_CUEPOINTS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private CuepointsOuterClass$Cuepoint bestFadeInCuepoint_;
    private CuepointsOuterClass$Cuepoint bestFadeOutCuepoint_;
    private int bitField0_;
    private h290 fadeInCuepoints_ = h.emptyProtobufList();
    private h290 fadeOutCuepoints_ = h.emptyProtobufList();

    static {
        CuepointsOuterClass$Cuepoints cuepointsOuterClass$Cuepoints = new CuepointsOuterClass$Cuepoints();
        DEFAULT_INSTANCE = cuepointsOuterClass$Cuepoints;
        h.registerDefaultInstance(CuepointsOuterClass$Cuepoints.class, cuepointsOuterClass$Cuepoints);
    }

    private CuepointsOuterClass$Cuepoints() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CuepointsOuterClass$Cuepoints t(byte[] bArr) {
        return (CuepointsOuterClass$Cuepoints) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b", new Object[]{"bitField0_", "bestFadeInCuepoint_", "bestFadeOutCuepoint_", "fadeInCuepoints_", CuepointsOuterClass$Cuepoint.class, "fadeOutCuepoints_", CuepointsOuterClass$Cuepoint.class});
        }
        if (iOrdinal == 3) {
            return new CuepointsOuterClass$Cuepoints();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (CuepointsOuterClass$Cuepoints.class) {
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

    public final CuepointsOuterClass$Cuepoint n() {
        CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint = this.bestFadeInCuepoint_;
        return cuepointsOuterClass$Cuepoint == null ? CuepointsOuterClass$Cuepoint.o() : cuepointsOuterClass$Cuepoint;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CuepointsOuterClass$Cuepoint o() {
        CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint = this.bestFadeOutCuepoint_;
        return cuepointsOuterClass$Cuepoint == null ? CuepointsOuterClass$Cuepoint.o() : cuepointsOuterClass$Cuepoint;
    }

    public final h290 p() {
        return this.fadeInCuepoints_;
    }

    public final h290 q() {
        return this.fadeOutCuepoints_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
