package com.spotify.messages;

import p.bf40;
import p.bhp0;
import p.chp0;
import p.dhp0;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ObservationEventNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int CONFIG_NAME_FIELD_NUMBER = 8;
    private static final ObservationEventNonAuth DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int OBSERVATION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SCENARIO_KEY_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 6;
    public static final int START_MONOTONIC_FIELD_NUMBER = 4;
    public static final int START_WALLCLOCK_FIELD_NUMBER = 3;
    private qng0 attributes_;
    private int bitField0_;
    private String configName_;
    private long duration_;
    private String observationId_;
    private String scenarioKey_;
    private qng0 signals_;
    private long startMonotonic_;
    private long startWallclock_;

    static {
        ObservationEventNonAuth observationEventNonAuth = new ObservationEventNonAuth();
        DEFAULT_INSTANCE = observationEventNonAuth;
        com.google.protobuf.h.registerDefaultInstance(ObservationEventNonAuth.class, observationEventNonAuth);
    }

    private ObservationEventNonAuth() {
        qng0 qng0Var = qng0.b;
        this.signals_ = qng0Var;
        this.attributes_ = qng0Var;
        this.observationId_ = "";
        this.scenarioKey_ = "";
        this.configName_ = "";
    }

    public static chp0 p() {
        return (chp0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u00062\u00072\bဈ\u0005", new Object[]{"bitField0_", "observationId_", "scenarioKey_", "startWallclock_", "startMonotonic_", "duration_", "signals_", dhp0.a, "attributes_", bhp0.a, "configName_"});
        }
        if (iOrdinal == 3) {
            return new ObservationEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new chp0(DEFAULT_INSTANCE);
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
        synchronized (ObservationEventNonAuth.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.attributes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.attributes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.signals_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.signals_ = qng0VarH;
        return qng0VarH;
    }

    public final void q(String str) {
        this.bitField0_ |= 32;
        this.configName_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 16;
        this.duration_ = j;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.observationId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.scenarioKey_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 8;
        this.startMonotonic_ = j;
    }

    public final void v(long j) {
        this.bitField0_ |= 4;
        this.startWallclock_ = j;
    }
}
