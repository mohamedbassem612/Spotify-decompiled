package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CampaignRoutingRow extends h implements v2j0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    public static final int CONCERT_URI_FIELD_NUMBER = 2;
    private static final CampaignRoutingRow DEFAULT_INSTANCE;
    public static final int OFFER_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private String campaignUri_ = "";
    private String concertUri_ = "";
    private String offerId_ = "";

    static {
        CampaignRoutingRow campaignRoutingRow = new CampaignRoutingRow();
        DEFAULT_INSTANCE = campaignRoutingRow;
        h.registerDefaultInstance(CampaignRoutingRow.class, campaignRoutingRow);
    }

    private CampaignRoutingRow() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"campaignUri_", "concertUri_", "offerId_"});
        }
        if (iOrdinal == 3) {
            return new CampaignRoutingRow();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (CampaignRoutingRow.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
