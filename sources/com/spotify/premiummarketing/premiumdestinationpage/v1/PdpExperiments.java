package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j760;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PdpExperiments extends h implements v2j0 {
    private static final PdpExperiments DEFAULT_INSTANCE;
    public static final int HERO_VIDEO_EXPERIMENT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int heroVideoExperiment_;

    static {
        PdpExperiments pdpExperiments = new PdpExperiments();
        DEFAULT_INSTANCE = pdpExperiments;
        h.registerDefaultInstance(PdpExperiments.class, pdpExperiments);
    }

    private PdpExperiments() {
    }

    public static PdpExperiments n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "heroVideoExperiment_"});
        }
        if (iOrdinal == 3) {
            return new PdpExperiments();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (PdpExperiments.class) {
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

    public final j760 o() {
        j760 j760Var;
        int i = this.heroVideoExperiment_;
        if (i == 0) {
            j760Var = j760.UNKNOWN_HERO_VIDEO_EXPERIMENT;
        } else if (i == 1) {
            j760Var = j760.HERO_VIDEO_CONTROL;
        } else if (i != 2) {
            j760Var = i != 3 ? null : j760.HERO_STATIC_IMAGE;
        } else {
            j760Var = j760.HERO_VIDEO;
        }
        return j760Var == null ? j760.UNRECOGNIZED : j760Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
