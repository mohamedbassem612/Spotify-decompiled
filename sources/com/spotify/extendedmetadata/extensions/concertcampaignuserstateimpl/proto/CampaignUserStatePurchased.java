package com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CampaignUserStatePurchased extends h implements v2j0 {
    private static final CampaignUserStatePurchased DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PURCHASES_FIELD_NUMBER = 1;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 2;
    private h290 purchases_ = h.emptyProtobufList();
    private int totalCount_;

    static {
        CampaignUserStatePurchased campaignUserStatePurchased = new CampaignUserStatePurchased();
        DEFAULT_INSTANCE = campaignUserStatePurchased;
        h.registerDefaultInstance(CampaignUserStatePurchased.class, campaignUserStatePurchased);
    }

    private CampaignUserStatePurchased() {
    }

    public static CampaignUserStatePurchased n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"purchases_", CampaignUserStatePurchase.class, "totalCount_"});
        }
        if (iOrdinal == 3) {
            return new CampaignUserStatePurchased();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (CampaignUserStatePurchased.class) {
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

    public final h290 o() {
        return this.purchases_;
    }

    public final int p() {
        return this.totalCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
