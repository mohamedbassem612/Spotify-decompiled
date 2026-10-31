package com.spotify.addonconsideration.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowcaseHeader extends h implements v2j0 {
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 1;
    public static final int CTA_FIELD_NUMBER = 7;
    private static final ShowcaseHeader DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int HEADER_DISCLAIMER_FIELD_NUMBER = 9;
    public static final int ICON_URI_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int SUPERSCRIPT_COLOR_FIELD_NUMBER = 5;
    public static final int SUPERSCRIPT_FIELD_NUMBER = 4;
    public static final int TITLE_COLOR_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Cta cta_;
    private String backgroundImage_ = "";
    private String title_ = "";
    private String titleColor_ = "";
    private String superscript_ = "";
    private String superscriptColor_ = "";
    private String description_ = "";
    private String iconUri_ = "";
    private String headerDisclaimer_ = "";

    static {
        ShowcaseHeader showcaseHeader = new ShowcaseHeader();
        DEFAULT_INSTANCE = showcaseHeader;
        h.registerDefaultInstance(ShowcaseHeader.class, showcaseHeader);
    }

    private ShowcaseHeader() {
    }

    public static ShowcaseHeader p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004Ȉ\u0005ለ\u0001\u0006Ȉ\u0007ဉ\u0002\bለ\u0003\tለ\u0004", new Object[]{"bitField0_", "backgroundImage_", "title_", "titleColor_", "superscript_", "superscriptColor_", "description_", "cta_", "iconUri_", "headerDisclaimer_"});
        }
        if (iOrdinal == 3) {
            return new ShowcaseHeader();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ShowcaseHeader.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.backgroundImage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Cta o() {
        Cta cta = this.cta_;
        return cta == null ? Cta.o() : cta;
    }

    public final String q() {
        return this.headerDisclaimer_;
    }

    public final String r() {
        return this.iconUri_;
    }

    public final String s() {
        return this.superscript_;
    }

    public final String t() {
        return this.superscriptColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.titleColor_;
    }
}
