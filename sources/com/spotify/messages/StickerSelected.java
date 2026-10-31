package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uwb1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class StickerSelected extends com.google.protobuf.h implements v2j0 {
    private static final StickerSelected DEFAULT_INSTANCE;
    public static final int MARKET_FIELD_NUMBER = 5;
    public static final int PACK_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STICKER_ID_FIELD_NUMBER = 1;
    public static final int STICKER_TYPE_FIELD_NUMBER = 3;
    public static final int SURFACE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String stickerId_ = "";
    private String packId_ = "";
    private String stickerType_ = "";
    private String market_ = "";
    private String surface_ = "";

    static {
        StickerSelected stickerSelected = new StickerSelected();
        DEFAULT_INSTANCE = stickerSelected;
        com.google.protobuf.h.registerDefaultInstance(StickerSelected.class, stickerSelected);
    }

    private StickerSelected() {
    }

    public static uwb1 n() {
        return (uwb1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003", new Object[]{"bitField0_", "stickerId_", "packId_", "stickerType_", "surface_", "market_"});
        }
        if (iOrdinal == 3) {
            return new StickerSelected();
        }
        if (iOrdinal == 4) {
            return new uwb1(DEFAULT_INSTANCE);
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
        synchronized (StickerSelected.class) {
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

    public final void o(String str) {
        this.bitField0_ |= 2;
        this.packId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.stickerType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.surface_ = str;
    }

    public final void setMarket(String str) {
        this.bitField0_ |= 8;
        this.market_ = str;
    }

    public final void setStickerId(String str) {
        this.bitField0_ |= 1;
        this.stickerId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
