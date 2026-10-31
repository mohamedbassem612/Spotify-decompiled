package com.spotify.wrapped.v1.proto;

import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.dgb;
import p.evd;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CardShareConfiguration extends com.google.protobuf.h implements v2j0 {
    private static final CardShareConfiguration DEFAULT_INSTANCE;
    public static final int DISABLE_SCREENSHOT_SHARING_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CARD_ID_FIELD_NUMBER = 1;
    public static final int SHARE_DESTINATIONS_FIELD_NUMBER = 3;
    public static final int SHARE_SCHEMES_FIELD_NUMBER = 2;
    private static final c290 shareDestinations_converter_ = new dgb((byte) 1);
    private boolean disableScreenshotSharing_;
    private int shareDestinationsMemoizedSerializedSize;
    private String shareCardId_ = "";
    private h290 shareSchemes_ = com.google.protobuf.h.emptyProtobufList();
    private b290 shareDestinations_ = com.google.protobuf.h.emptyIntList();

    static {
        CardShareConfiguration cardShareConfiguration = new CardShareConfiguration();
        DEFAULT_INSTANCE = cardShareConfiguration;
        com.google.protobuf.h.registerDefaultInstance(CardShareConfiguration.class, cardShareConfiguration);
    }

    private CardShareConfiguration() {
    }

    public static CardShareConfiguration p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CardShareConfiguration u(byte[] bArr) {
        return (CardShareConfiguration) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003,\u0004\u0007", new Object[]{"shareCardId_", "shareSchemes_", "shareDestinations_", "disableScreenshotSharing_"});
        }
        if (iOrdinal == 3) {
            return new CardShareConfiguration();
        }
        if (iOrdinal == 4) {
            return new evd(DEFAULT_INSTANCE);
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
        synchronized (CardShareConfiguration.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.shareSchemes_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.shareSchemes_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o() {
        this.shareSchemes_ = com.google.protobuf.h.emptyProtobufList();
    }

    public final boolean q() {
        return this.disableScreenshotSharing_;
    }

    public final String r() {
        return this.shareCardId_;
    }

    public final d290 s() {
        return new d290(this.shareDestinations_, shareDestinations_converter_);
    }

    public final h290 t() {
        return this.shareSchemes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
