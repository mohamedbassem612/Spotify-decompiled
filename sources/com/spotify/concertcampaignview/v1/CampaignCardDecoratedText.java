package com.spotify.concertcampaignview.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.coc;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CampaignCardDecoratedText extends h implements v2j0 {
    private static final CampaignCardDecoratedText DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREFERRED_RGB_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private String text_ = "";
    private h290 values_ = h.emptyProtobufList();
    private String preferredRgb_ = "";

    static {
        CampaignCardDecoratedText campaignCardDecoratedText = new CampaignCardDecoratedText();
        DEFAULT_INSTANCE = campaignCardDecoratedText;
        h.registerDefaultInstance(CampaignCardDecoratedText.class, campaignCardDecoratedText);
    }

    private CampaignCardDecoratedText() {
    }

    public static CampaignCardDecoratedText n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ለ\u0000", new Object[]{"bitField0_", "text_", "values_", CampaignCardPlaceholderValue.class, "preferredRgb_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCardDecoratedText();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (CampaignCardDecoratedText.class) {
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

    public final String o() {
        return this.preferredRgb_;
    }

    public final String p() {
        return this.text_;
    }

    public final List q() {
        return this.values_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
