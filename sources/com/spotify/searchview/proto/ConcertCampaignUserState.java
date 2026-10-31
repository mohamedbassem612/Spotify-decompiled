package com.spotify.searchview.proto;

import p.bf40;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ConcertCampaignUserState extends com.google.protobuf.h implements v2j0 {
    public static final int BEFORE_SALE_FIELD_NUMBER = 1;
    private static final ConcertCampaignUserState DEFAULT_INSTANCE;
    public static final int ON_SALE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int stateCase_ = 0;
    private Object state_;

    static {
        ConcertCampaignUserState concertCampaignUserState = new ConcertCampaignUserState();
        DEFAULT_INSTANCE = concertCampaignUserState;
        com.google.protobuf.h.registerDefaultInstance(ConcertCampaignUserState.class, concertCampaignUserState);
    }

    private ConcertCampaignUserState() {
    }

    public static ConcertCampaignUserState n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"state_", "stateCase_", CampaignUserStateBeforeSale.class, CampaignUserStateOnSale.class});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignUserState();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 14);
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CampaignUserStateOnSale o() {
        return this.stateCase_ == 2 ? (CampaignUserStateOnSale) this.state_ : CampaignUserStateOnSale.n();
    }

    public final int p() {
        int i = this.stateCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
