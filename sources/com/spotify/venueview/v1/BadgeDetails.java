package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class BadgeDetails extends h implements v2j0 {
    private static final BadgeDetails DEFAULT_INSTANCE;
    public static final int DESCRIPTION_HTML_FIELD_NUMBER = 3;
    public static final int HERO_IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String heroImageUrl_ = "";
    private String title_ = "";
    private String descriptionHtml_ = "";

    static {
        BadgeDetails badgeDetails = new BadgeDetails();
        DEFAULT_INSTANCE = badgeDetails;
        h.registerDefaultInstance(BadgeDetails.class, badgeDetails);
    }

    private BadgeDetails() {
    }

    public static BadgeDetails n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"heroImageUrl_", "title_", "descriptionHtml_"});
        }
        if (iOrdinal == 3) {
            return new BadgeDetails();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (BadgeDetails.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.descriptionHtml_;
    }

    public final String p() {
        return this.heroImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
