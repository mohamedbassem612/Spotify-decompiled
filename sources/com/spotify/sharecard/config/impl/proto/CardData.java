package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bid;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class CardData extends h implements v2j0 {
    public static final int BACKGROUND_WITH_STICKER_FIELD_NUMBER = 1;
    private static final CardData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUOTE_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        CardData cardData = new CardData();
        DEFAULT_INSTANCE = cardData;
        h.registerDefaultInstance(CardData.class, cardData);
    }

    private CardData() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CardData r(byte[] bArr) {
        return (CardData) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"kind_", "kindCase_", BackgroundWithSticker.class, Quote.class, Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new CardData();
        }
        if (iOrdinal == 4) {
            return new bid(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (CardData.class) {
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

    public final BackgroundWithSticker n() {
        return this.kindCase_ == 1 ? (BackgroundWithSticker) this.kind_ : BackgroundWithSticker.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.kindCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final Quote p() {
        return this.kindCase_ == 2 ? (Quote) this.kind_ : Quote.o();
    }

    public final Timestamp q() {
        return this.kindCase_ == 3 ? (Timestamp) this.kind_ : Timestamp.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
