package com.spotify.searchview.proto;

import p.bf40;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ConcertCampaign extends com.google.protobuf.h implements v2j0 {
    private static final ConcertCampaign DEFAULT_INSTANCE;
    public static final int FEATURED_PERFORMERS_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int UBI_REASON_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int USER_STATE_FIELD_NUMBER = 5;
    private int bitField0_;
    private ConcertCampaignUserState userState_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";
    private String featuredPerformers_ = "";
    private String ubiReason_ = "";

    static {
        ConcertCampaign concertCampaign = new ConcertCampaign();
        DEFAULT_INSTANCE = concertCampaign;
        com.google.protobuf.h.registerDefaultInstance(ConcertCampaign.class, concertCampaign);
    }

    private ConcertCampaign() {
    }

    public static ConcertCampaign n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ", new Object[]{"bitField0_", "uri_", "name_", "imageUrl_", "featuredPerformers_", "userState_", "ubiReason_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaign();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (ConcertCampaign.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.featuredPerformers_;
    }

    public final String p() {
        return this.ubiReason_;
    }

    public final ConcertCampaignUserState q() {
        ConcertCampaignUserState concertCampaignUserState = this.userState_;
        return concertCampaignUserState == null ? ConcertCampaignUserState.n() : concertCampaignUserState;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
