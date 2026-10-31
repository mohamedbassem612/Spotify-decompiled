package com.spotify.concertcampaignview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zbk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConcertCampaignPageRequest extends h implements v2j0 {
    public static final int CONCERT_CAMPAIGN_URI_FIELD_NUMBER = 1;
    private static final ConcertCampaignPageRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String concertCampaignUri_ = "";

    static {
        ConcertCampaignPageRequest concertCampaignPageRequest = new ConcertCampaignPageRequest();
        DEFAULT_INSTANCE = concertCampaignPageRequest;
        h.registerDefaultInstance(ConcertCampaignPageRequest.class, concertCampaignPageRequest);
    }

    private ConcertCampaignPageRequest() {
    }

    public static zbk o() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"concertCampaignUri_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignPageRequest();
        }
        if (iOrdinal == 4) {
            return new zbk();
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
        synchronized (ConcertCampaignPageRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.concertCampaignUri_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
