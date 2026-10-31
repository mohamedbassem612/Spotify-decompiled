package com.spotify.concertcampaignview.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CampaignCard extends h implements v2j0 {
    public static final int CTAS_FIELD_NUMBER = 4;
    public static final int DECORATED_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DECORATED_PRETITLE_FIELD_NUMBER = 1;
    public static final int DECORATED_TITLE_FIELD_NUMBER = 2;
    private static final CampaignCard DEFAULT_INSTANCE;
    public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_ON_SALE_COLORS_FIELD_NUMBER = 7;
    public static final int STATE_FIELD_NUMBER = 8;
    public static final int TAG_FIELD_NUMBER = 6;
    private int bitField0_;
    private CampaignCardDecoratedText decoratedDescription_;
    private CampaignCardDecoratedText decoratedPretitle_;
    private CampaignCardDecoratedText decoratedTitle_;
    private Timestamp nextRefreshTime_;
    private boolean showOnSaleColors_;
    private CampaignCardTagText tag_;
    private h290 ctas_ = h.emptyProtobufList();
    private String state_ = "";

    static {
        CampaignCard campaignCard = new CampaignCard();
        DEFAULT_INSTANCE = campaignCard;
        h.registerDefaultInstance(CampaignCard.class, campaignCard);
    }

    private CampaignCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u0007\bȈ", new Object[]{"bitField0_", "decoratedPretitle_", "decoratedTitle_", "decoratedDescription_", "ctas_", CtaType.class, "nextRefreshTime_", "tag_", "showOnSaleColors_", "state_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCard();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (CampaignCard.class) {
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

    public final boolean hasTag() {
        return (this.bitField0_ & 16) != 0;
    }

    public final h290 n() {
        return this.ctas_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CampaignCardDecoratedText o() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedDescription_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.n() : campaignCardDecoratedText;
    }

    public final CampaignCardDecoratedText p() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedPretitle_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.n() : campaignCardDecoratedText;
    }

    public final CampaignCardDecoratedText q() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedTitle_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.n() : campaignCardDecoratedText;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.nextRefreshTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean s() {
        return this.showOnSaleColors_;
    }

    public final String t() {
        return this.state_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final CampaignCardTagText u() {
        CampaignCardTagText campaignCardTagText = this.tag_;
        return campaignCardTagText == null ? CampaignCardTagText.p() : campaignCardTagText;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }
}
