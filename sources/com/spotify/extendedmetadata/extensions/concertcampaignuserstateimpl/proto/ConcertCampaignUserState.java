package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ConcertCampaignUserState extends h implements v2j0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 7;
    private static final ConcertCampaignUserState DEFAULT_INSTANCE;
    public static final int FCFS_FIELD_NUMBER = 2;
    public static final int INELIGIBLE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PURCHASED_FIELD_NUMBER = 6;
    public static final int RESERVED_FIELD_NUMBER = 1;
    public static final int WAITLISTABLE_FIELD_NUMBER = 3;
    public static final int WAITLISTED_FIELD_NUMBER = 4;
    private Object state_;
    private int stateCase_ = 0;
    private String campaignUri_ = "";

    static {
        ConcertCampaignUserState concertCampaignUserState = new ConcertCampaignUserState();
        DEFAULT_INSTANCE = concertCampaignUserState;
        h.registerDefaultInstance(ConcertCampaignUserState.class, concertCampaignUserState);
    }

    private ConcertCampaignUserState() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ConcertCampaignUserState t(byte[] bArr) {
        return (ConcertCampaignUserState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ", new Object[]{"state_", "stateCase_", CampaignUserStateReserved.class, CampaignUserStateFCFS.class, CampaignUserStateWaitlistable.class, CampaignUserStateWaitlisted.class, CampaignUserStateIneligible.class, CampaignUserStatePurchased.class, "campaignUri_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignUserState();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ConcertCampaignUserState.class) {
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

    public final String n() {
        return this.campaignUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CampaignUserStateFCFS o() {
        return this.stateCase_ == 2 ? (CampaignUserStateFCFS) this.state_ : CampaignUserStateFCFS.o();
    }

    public final CampaignUserStateIneligible p() {
        return this.stateCase_ == 5 ? (CampaignUserStateIneligible) this.state_ : CampaignUserStateIneligible.n();
    }

    public final CampaignUserStatePurchased q() {
        return this.stateCase_ == 6 ? (CampaignUserStatePurchased) this.state_ : CampaignUserStatePurchased.n();
    }

    public final CampaignUserStateReserved r() {
        return this.stateCase_ == 1 ? (CampaignUserStateReserved) this.state_ : CampaignUserStateReserved.o();
    }

    public final int s() {
        switch (this.stateCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
