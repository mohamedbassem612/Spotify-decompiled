package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PremiumFeatureCard extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_SET_FIELD_NUMBER = 7;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 8;
    private static final PremiumFeatureCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DESCRIPTION_TITLE_FIELD_NUMBER = 4;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOGGING_INFO_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String id_ = "";
    private String name_ = "";
    private String title_ = "";
    private String descriptionTitle_ = "";
    private String description_ = "";
    private String encoreIconName_ = "";
    private String backgroundColorSet_ = "";
    private String backgroundImageUrl_ = "";

    static {
        PremiumFeatureCard premiumFeatureCard = new PremiumFeatureCard();
        DEFAULT_INSTANCE = premiumFeatureCard;
        h.registerDefaultInstance(PremiumFeatureCard.class, premiumFeatureCard);
    }

    private PremiumFeatureCard() {
    }

    public static PremiumFeatureCard p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000", new Object[]{"bitField0_", "id_", "name_", "title_", "descriptionTitle_", "description_", "encoreIconName_", "backgroundColorSet_", "backgroundImageUrl_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumFeatureCard();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (PremiumFeatureCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.backgroundColorSet_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundImageUrl_;
    }

    public final String q() {
        return this.descriptionTitle_;
    }

    public final String r() {
        return this.encoreIconName_;
    }

    public final LoggingInfo s() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
