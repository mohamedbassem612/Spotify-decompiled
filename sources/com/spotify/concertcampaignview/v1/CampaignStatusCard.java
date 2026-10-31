package com.spotify.concertcampaignview.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CampaignStatusCard extends h implements v2j0 {
    private static final CampaignStatusCard DEFAULT_INSTANCE;
    public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp nextRefreshTime_;
    private CampaignCardDecoratedText pretitle_;

    static {
        CampaignStatusCard campaignStatusCard = new CampaignStatusCard();
        DEFAULT_INSTANCE = campaignStatusCard;
        h.registerDefaultInstance(CampaignStatusCard.class, campaignStatusCard);
    }

    private CampaignStatusCard() {
    }

    public static CampaignStatusCard n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "pretitle_", "nextRefreshTime_"});
        }
        if (iOrdinal == 3) {
            return new CampaignStatusCard();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (CampaignStatusCard.class) {
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

    public final Timestamp o() {
        Timestamp timestamp = this.nextRefreshTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final CampaignCardDecoratedText p() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.pretitle_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.n() : campaignCardDecoratedText;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
