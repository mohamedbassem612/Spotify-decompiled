package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class TitlePromoCard extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 5;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    private static final TitlePromoCard DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object tapAction_;
    private Paragraph title_;
    private int tapActionCase_ = 0;
    private String id_ = "";
    private String backgroundImageUrl_ = "";
    private String backgroundColor_ = "";

    static {
        TitlePromoCard titlePromoCard = new TitlePromoCard();
        DEFAULT_INSTANCE = titlePromoCard;
        h.registerDefaultInstance(TitlePromoCard.class, titlePromoCard);
    }

    private TitlePromoCard() {
    }

    public static TitlePromoCard p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004<\u0000\u0005Ȉ", new Object[]{"tapAction_", "tapActionCase_", "bitField0_", "id_", "title_", "backgroundImageUrl_", Actions$NavigateAction.class, "backgroundColor_"});
        }
        if (iOrdinal == 3) {
            return new TitlePromoCard();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (TitlePromoCard.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundImageUrl_;
    }

    public final Actions$NavigateAction q() {
        return this.tapActionCase_ == 4 ? (Actions$NavigateAction) this.tapAction_ : Actions$NavigateAction.n();
    }

    public final int r() {
        int i = this.tapActionCase_;
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
