package com.spotify.concertcampaignview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CampaignCardTagText extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int DECORATED_TEXT_FIELD_NUMBER = 1;
    private static final CampaignCardTagText DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String backgroundColor_ = "";
    private int bitField0_;
    private CampaignCardDecoratedText decoratedText_;

    static {
        CampaignCardTagText campaignCardTagText = new CampaignCardTagText();
        DEFAULT_INSTANCE = campaignCardTagText;
        h.registerDefaultInstance(CampaignCardTagText.class, campaignCardTagText);
    }

    private CampaignCardTagText() {
    }

    public static CampaignCardTagText p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "decoratedText_", "backgroundColor_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCardTagText();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (CampaignCardTagText.class) {
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
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CampaignCardDecoratedText o() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedText_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.n() : campaignCardDecoratedText;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
