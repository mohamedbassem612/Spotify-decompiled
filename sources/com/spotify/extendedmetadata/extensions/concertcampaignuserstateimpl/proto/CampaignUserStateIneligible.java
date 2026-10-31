package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.g7d;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CampaignUserStateIneligible extends h implements v2j0 {
    private static final CampaignUserStateIneligible DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;

    static {
        CampaignUserStateIneligible campaignUserStateIneligible = new CampaignUserStateIneligible();
        DEFAULT_INSTANCE = campaignUserStateIneligible;
        h.registerDefaultInstance(CampaignUserStateIneligible.class, campaignUserStateIneligible);
    }

    private CampaignUserStateIneligible() {
    }

    public static CampaignUserStateIneligible n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
        }
        if (iOrdinal == 3) {
            return new CampaignUserStateIneligible();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (CampaignUserStateIneligible.class) {
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

    public final g7d o() {
        g7d g7dVar;
        switch (this.reason_) {
            case 0:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_REASON_UNSPECIFIED;
                break;
            case 1:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_FRAUD_SUSPECTED;
                break;
            case 2:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_ACCOUNT_AGE;
                break;
            case 3:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_AGE_RESTRICTION;
                break;
            case 4:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_SOLD_OUT;
                break;
            case 5:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_CANCELLED;
                break;
            case 6:
                g7dVar = g7d.CAMPAIGN_USER_STATE_INELIGIBLE_SALE_ENDED;
                break;
            default:
                g7dVar = null;
                break;
        }
        return g7dVar == null ? g7d.UNRECOGNIZED : g7dVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
