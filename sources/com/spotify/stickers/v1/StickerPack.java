package com.spotify.stickers.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StickerPack extends h implements v2j0 {
    private static final StickerPack DEFAULT_INSTANCE;
    public static final int PACK_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STICKERS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String packId_ = "";
    private String title_ = "";
    private h290 stickers_ = h.emptyProtobufList();

    static {
        StickerPack stickerPack = new StickerPack();
        DEFAULT_INSTANCE = stickerPack;
        h.registerDefaultInstance(StickerPack.class, stickerPack);
    }

    private StickerPack() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"packId_", "title_", "stickers_", Sticker.class});
        }
        if (iOrdinal == 3) {
            return new StickerPack();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (StickerPack.class) {
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

    public final String n() {
        return this.packId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.stickers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
