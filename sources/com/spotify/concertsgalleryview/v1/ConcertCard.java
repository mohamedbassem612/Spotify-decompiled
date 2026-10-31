package com.spotify.concertsgalleryview.v1;

import com.google.protobuf.h;
import com.google.type.DateTime;
import p.bf40;
import p.jf40;
import p.mek;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConcertCard extends h implements v2j0 {
    private static final ConcertCard DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TARGET_URI_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int kind_;
    private DateTime startTime_;
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";
    private String targetUri_ = "";

    static {
        ConcertCard concertCard = new ConcertCard();
        DEFAULT_INSTANCE = concertCard;
        h.registerDefaultInstance(ConcertCard.class, concertCard);
    }

    private ConcertCard() {
    }

    public static ConcertCard n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000", new Object[]{"bitField0_", "kind_", "title_", "subtitle_", "imageUrl_", "targetUri_", "startTime_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCard();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (ConcertCard.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final mek o() {
        mek mekVar;
        int i = this.kind_;
        if (i == 0) {
            mekVar = mek.CARD_KIND_UNSPECIFIED;
        } else if (i == 1) {
            mekVar = mek.CARD_KIND_ROW;
        } else if (i != 2) {
            mekVar = i != 3 ? null : mek.CARD_KIND_LARGE;
        } else {
            mekVar = mek.CARD_KIND_SMALL;
        }
        return mekVar == null ? mek.UNRECOGNIZED : mekVar;
    }

    public final DateTime p() {
        DateTime dateTime = this.startTime_;
        return dateTime == null ? DateTime.o() : dateTime;
    }

    public final String q() {
        return this.targetUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
