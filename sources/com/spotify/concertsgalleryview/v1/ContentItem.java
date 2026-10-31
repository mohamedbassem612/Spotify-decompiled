package com.spotify.concertsgalleryview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ContentItem extends h implements v2j0 {
    public static final int CONCERT_CARD_FIELD_NUMBER = 2;
    private static final ContentItem DEFAULT_INSTANCE;
    public static final int EMPTY_STATE_ROW_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_ROW_FIELD_NUMBER = 1;
    public static final int VENUE_CARD_FIELD_NUMBER = 4;
    private int contentCase_ = 0;
    private Object content_;

    static {
        ContentItem contentItem = new ContentItem();
        DEFAULT_INSTANCE = contentItem;
        h.registerDefaultInstance(ContentItem.class, contentItem);
    }

    private ContentItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"content_", "contentCase_", TitleRow.class, ConcertCard.class, EmptyStateRow.class, VenueCard.class});
        }
        if (iOrdinal == 3) {
            return new ContentItem();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ContentItem.class) {
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

    public final ConcertCard n() {
        return this.contentCase_ == 2 ? (ConcertCard) this.content_ : ConcertCard.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.contentCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final EmptyStateRow p() {
        return this.contentCase_ == 3 ? (EmptyStateRow) this.content_ : EmptyStateRow.p();
    }

    public final TitleRow q() {
        return this.contentCase_ == 1 ? (TitleRow) this.content_ : TitleRow.n();
    }

    public final VenueCard r() {
        return this.contentCase_ == 4 ? (VenueCard) this.content_ : VenueCard.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
