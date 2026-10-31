package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AudiobookPriceOuterClass$AudiobookPrice extends h implements v2j0 {
    private static final AudiobookPriceOuterClass$AudiobookPrice DEFAULT_INSTANCE;
    public static final int FINAL_LIST_PRICE_FIELD_NUMBER = 2;
    public static final int FINAL_PRICE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private AudiobookPriceOuterClass.Price finalListPrice_;
    private AudiobookPriceOuterClass.Price finalPrice_;

    static {
        AudiobookPriceOuterClass$AudiobookPrice audiobookPriceOuterClass$AudiobookPrice = new AudiobookPriceOuterClass$AudiobookPrice();
        DEFAULT_INSTANCE = audiobookPriceOuterClass$AudiobookPrice;
        h.registerDefaultInstance(AudiobookPriceOuterClass$AudiobookPrice.class, audiobookPriceOuterClass$AudiobookPrice);
    }

    private AudiobookPriceOuterClass$AudiobookPrice() {
    }

    public static AudiobookPriceOuterClass$AudiobookPrice o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "finalPrice_", "finalListPrice_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookPriceOuterClass$AudiobookPrice();
        }
        if (iOrdinal == 4) {
            return new hw7((byte) 21);
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
        synchronized (AudiobookPriceOuterClass$AudiobookPrice.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AudiobookPriceOuterClass.Price p() {
        AudiobookPriceOuterClass.Price price = this.finalListPrice_;
        return price == null ? AudiobookPriceOuterClass.Price.p() : price;
    }

    public final AudiobookPriceOuterClass.Price q() {
        AudiobookPriceOuterClass.Price price = this.finalPrice_;
        return price == null ? AudiobookPriceOuterClass.Price.p() : price;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
