package com.spotify.ondemandtrials.trialstartimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;
import p.yq40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetTrialResponse extends h implements v2j0 {
    private static final GetTrialResponse DEFAULT_INSTANCE;
    public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
    public static final int IS_ACTIVITY_STARTED_FIELD_NUMBER = 5;
    public static final int IS_CONSECUTIVE_FIELD_NUMBER = 4;
    public static final int LENGTH_DAYS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TURN_TRIAL_ON_STATUS_FIELD_NUMBER = 6;
    private int bitField0_;
    private Timestamp expirationTime_;
    private boolean isActivityStarted_;
    private boolean isConsecutive_;
    private int lengthDays_;
    private String status_ = "";
    private int turnTrialOnStatus_;

    static {
        GetTrialResponse getTrialResponse = new GetTrialResponse();
        DEFAULT_INSTANCE = getTrialResponse;
        h.registerDefaultInstance(GetTrialResponse.class, getTrialResponse);
    }

    private GetTrialResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004\u0004\u0007\u0005\u0007\u0006\f", new Object[]{"bitField0_", "status_", "expirationTime_", "lengthDays_", "isConsecutive_", "isActivityStarted_", "turnTrialOnStatus_"});
        }
        if (iOrdinal == 3) {
            return new GetTrialResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (GetTrialResponse.class) {
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

    public final Timestamp n() {
        Timestamp timestamp = this.expirationTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.lengthDays_;
    }

    public final yq40 p() {
        yq40 yq40Var;
        switch (this.turnTrialOnStatus_) {
            case 0:
                yq40Var = yq40.ACTIVE;
                break;
            case 1:
                yq40Var = yq40.EXPANDED_TRIAL_ACTIVE;
                break;
            case 2:
                yq40Var = yq40.PREMIUM_TRIAL_ACTIVE;
                break;
            case 3:
                yq40Var = yq40.TRIAL_WITH_OFFLINE_ACTIVE;
                break;
            case 4:
                yq40Var = yq40.PREMIUM_NO_OFFLINE_ACTIVE;
                break;
            case 5:
                yq40Var = yq40.NO_TRIAL_HOLDOUT;
                break;
            case 6:
                yq40Var = yq40.TRIAL_DELAY;
                break;
            default:
                yq40Var = null;
                break;
        }
        return yq40Var == null ? yq40.UNRECOGNIZED : yq40Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
