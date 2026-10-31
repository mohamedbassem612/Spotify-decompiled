package com.spotify.daylistsharing.sharingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.qvd;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareCard extends h implements v2j0 {
    public static final int CARD_TYPE_FIELD_NUMBER = 3;
    private static final ShareCard DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LOG_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int cardType_;
    private String imageUrl_ = "";
    private String logId_ = "";

    static {
        ShareCard shareCard = new ShareCard();
        DEFAULT_INSTANCE = shareCard;
        h.registerDefaultInstance(ShareCard.class, shareCard);
    }

    private ShareCard() {
    }

    public static ShareCard o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"imageUrl_", "logId_", "cardType_"});
        }
        if (iOrdinal == 3) {
            return new ShareCard();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (ShareCard.class) {
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

    public final qvd n() {
        qvd qvdVar;
        int i = this.cardType_;
        if (i == 0) {
            qvdVar = qvd.UNKNOWN;
        } else if (i != 1) {
            qvdVar = i != 2 ? null : qvd.STICKER;
        } else {
            qvdVar = qvd.BACKGROUND;
        }
        return qvdVar == null ? qvd.UNRECOGNIZED : qvdVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.logId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
