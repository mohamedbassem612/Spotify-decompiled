package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CampaignUserStateReserved extends h implements v2j0 {
    public static final int ALLOCATED_COUNT_FIELD_NUMBER = 1;
    private static final CampaignUserStateReserved DEFAULT_INSTANCE;
    public static final int FEW_LEFT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int RESERVATION_END_FIELD_NUMBER = 4;
    public static final int RESERVATION_START_FIELD_NUMBER = 3;
    private int allocatedCount_;
    private int bitField0_;
    private boolean fewLeft_;
    private Timestamp reservationEnd_;
    private Timestamp reservationStart_;

    static {
        CampaignUserStateReserved campaignUserStateReserved = new CampaignUserStateReserved();
        DEFAULT_INSTANCE = campaignUserStateReserved;
        h.registerDefaultInstance(CampaignUserStateReserved.class, campaignUserStateReserved);
    }

    private CampaignUserStateReserved() {
    }

    public static CampaignUserStateReserved o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u0007", new Object[]{"bitField0_", "allocatedCount_", "reservationStart_", "reservationEnd_", "fewLeft_"});
        }
        if (iOrdinal == 3) {
            return new CampaignUserStateReserved();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (CampaignUserStateReserved.class) {
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

    public final int n() {
        return this.allocatedCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.fewLeft_;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.reservationEnd_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.reservationStart_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
