package com.spotify.ondemandtrials.trialstartimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CheckEligibilityResponse extends h implements v2j0 {
    private static final CheckEligibilityResponse DEFAULT_INSTANCE;
    public static final int MANUAL_TRIAL_FLOW_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TRIAL_LENGTH_DAYS_FIELD_NUMBER = 2;
    public static final int VIABLE_FIELD_NUMBER = 1;
    public static final int WINDOW_END_TIME_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean manualTrialFlow_;
    private int trialLengthDays_;
    private boolean viable_;
    private Timestamp windowEndTime_;

    static {
        CheckEligibilityResponse checkEligibilityResponse = new CheckEligibilityResponse();
        DEFAULT_INSTANCE = checkEligibilityResponse;
        h.registerDefaultInstance(CheckEligibilityResponse.class, checkEligibilityResponse);
    }

    private CheckEligibilityResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002င\u0000\u0003ဉ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "viable_", "trialLengthDays_", "windowEndTime_", "manualTrialFlow_"});
        }
        if (iOrdinal == 3) {
            return new CheckEligibilityResponse();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (CheckEligibilityResponse.class) {
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

    public final boolean n() {
        return this.manualTrialFlow_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.trialLengthDays_;
    }

    public final boolean p() {
        return this.viable_;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.windowEndTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
