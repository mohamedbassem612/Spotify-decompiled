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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TitleSubtitleButtonPromoCard extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 7;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int CTA_TEXT_FIELD_NUMBER = 5;
    private static final TitleSubtitleButtonPromoCard DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Paragraph subtitle_;
    private Object tapAction_;
    private Paragraph title_;
    private int tapActionCase_ = 0;
    private String id_ = "";
    private String backgroundImageUrl_ = "";
    private String ctaText_ = "";
    private String backgroundColor_ = "";

    static {
        TitleSubtitleButtonPromoCard titleSubtitleButtonPromoCard = new TitleSubtitleButtonPromoCard();
        DEFAULT_INSTANCE = titleSubtitleButtonPromoCard;
        h.registerDefaultInstance(TitleSubtitleButtonPromoCard.class, titleSubtitleButtonPromoCard);
    }

    private TitleSubtitleButtonPromoCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TitleSubtitleButtonPromoCard q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006<\u0000\u0007Ȉ", new Object[]{"tapAction_", "tapActionCase_", "bitField0_", "id_", "title_", "subtitle_", "backgroundImageUrl_", "ctaText_", Actions.NavigateAction.class, "backgroundColor_"});
        }
        if (iOrdinal == 3) {
            return new TitleSubtitleButtonPromoCard();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (TitleSubtitleButtonPromoCard.class) {
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

    public final String p() {
        return this.ctaText_;
    }

    public final Actions.NavigateAction r() {
        return this.tapActionCase_ == 6 ? (Actions.NavigateAction) this.tapAction_ : Actions.NavigateAction.n();
    }

    public final Paragraph s() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final int t() {
        int i = this.tapActionCase_;
        if (i != 0) {
            return i != 6 ? 0 : 1;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Paragraph u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }
}
