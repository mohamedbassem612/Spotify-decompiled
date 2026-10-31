package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lr00;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UpsellLinkExplanation extends h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CTA_FIELD_NUMBER = 3;
    private static final UpsellLinkExplanation DEFAULT_INSTANCE;
    public static final int EXPLANATION_STYLE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 4;
    private int explanationStyle_;
    private String title_ = "";
    private String body_ = "";
    private String cta_ = "";
    private String url_ = "";

    static {
        UpsellLinkExplanation upsellLinkExplanation = new UpsellLinkExplanation();
        DEFAULT_INSTANCE = upsellLinkExplanation;
        h.registerDefaultInstance(UpsellLinkExplanation.class, upsellLinkExplanation);
    }

    private UpsellLinkExplanation() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static UpsellLinkExplanation q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"title_", "body_", "cta_", "url_", "explanationStyle_"});
        }
        if (iOrdinal == 3) {
            return new UpsellLinkExplanation();
        }
        if (iOrdinal == 4) {
            return new sug1((byte) 25);
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
        synchronized (UpsellLinkExplanation.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.body_;
    }

    public final String p() {
        return this.cta_;
    }

    public final lr00 r() {
        lr00 lr00Var;
        int i = this.explanationStyle_;
        if (i == 0) {
            lr00Var = lr00.UNSPECIFIED;
        } else if (i != 1) {
            lr00Var = i != 2 ? null : lr00.PREMIUM_EXCLUSIVE_CONTENT;
        } else {
            lr00Var = lr00.ORIGINAL;
        }
        return lr00Var == null ? lr00.UNRECOGNIZED : lr00Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
