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
public final class Sticker extends h implements v2j0 {
    private static final Sticker DEFAULT_INSTANCE;
    public static final int FILTER_TAG_IDS_FIELD_NUMBER = 4;
    public static final int GRAPHIC_STICKER_FIELD_NUMBER = 6;
    public static final int IMAGE_ALT_TEXT_FIELD_NUMBER = 3;
    public static final int IMAGE_URI_FIELD_NUMBER = 2;
    public static final int LYRICS_STICKER_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SEARCH_TAGS_FIELD_NUMBER = 7;
    public static final int STICKER_ID_FIELD_NUMBER = 1;
    private Object stickerType_;
    private int stickerTypeCase_ = 0;
    private String stickerId_ = "";
    private String imageUri_ = "";
    private String imageAltText_ = "";
    private h290 filterTagIds_ = h.emptyProtobufList();
    private h290 searchTags_ = h.emptyProtobufList();

    static {
        Sticker sticker = new Sticker();
        DEFAULT_INSTANCE = sticker;
        h.registerDefaultInstance(Sticker.class, sticker);
    }

    private Sticker() {
    }

    public static Sticker n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005<\u0000\u0006<\u0000\u0007Ț", new Object[]{"stickerType_", "stickerTypeCase_", "stickerId_", "imageUri_", "imageAltText_", "filterTagIds_", LyricsSticker.class, GraphicSticker.class, "searchTags_"});
        }
        if (iOrdinal == 3) {
            return new Sticker();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Sticker.class) {
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

    public final String getStickerId() {
        return this.stickerId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.filterTagIds_;
    }

    public final String p() {
        return this.imageAltText_;
    }

    public final String q() {
        return this.imageUri_;
    }

    public final LyricsSticker r() {
        return this.stickerTypeCase_ == 5 ? (LyricsSticker) this.stickerType_ : LyricsSticker.n();
    }

    public final h290 s() {
        return this.searchTags_;
    }

    public final int t() {
        int i = this.stickerTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
