package com.spotify.artistconcertspageview.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class BannerRow extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_HEX_FIELD_NUMBER = 3;
    public static final int BANNER_MESSAGE_FIELD_NUMBER = 1;
    public static final int CTA_FIELD_NUMBER = 4;
    public static final int CTA_URI_FIELD_NUMBER = 5;
    private static final BannerRow DEFAULT_INSTANCE;
    public static final int IMAGEURL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String bannerMessage_ = "";
    private String imageUrl_ = "";
    private String backgroundColorHex_ = "";
    private String cta_ = "";
    private String ctaUri_ = "";

    static {
        BannerRow bannerRow = new BannerRow();
        DEFAULT_INSTANCE = bannerRow;
        h.registerDefaultInstance(BannerRow.class, bannerRow);
    }

    private BannerRow() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BannerRow r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bannerMessage_", "imageUrl_", "backgroundColorHex_", "cta_", "ctaUri_"});
        }
        if (iOrdinal == 3) {
            return new BannerRow();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (BannerRow.class) {
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

    public final String n() {
        return this.backgroundColorHex_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.bannerMessage_;
    }

    public final String p() {
        return this.cta_;
    }

    public final String q() {
        return this.ctaUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
