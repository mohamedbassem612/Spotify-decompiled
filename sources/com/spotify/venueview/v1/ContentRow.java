package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ContentRow extends h implements v2j0 {
    public static final int ADDRESS_ROW_FIELD_NUMBER = 3;
    private static final ContentRow DEFAULT_INSTANCE;
    public static final int EVENT_ROW_FIELD_NUMBER = 5;
    public static final int MAP_ROW_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABLE_ITEM_ROW_FIELD_NUMBER = 6;
    public static final int TITLE_ROW_FIELD_NUMBER = 2;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object content_;
    private int contentCase_ = 0;
    private String ubiIdentifier_ = "";

    static {
        ContentRow contentRow = new ContentRow();
        DEFAULT_INSTANCE = contentRow;
        h.registerDefaultInstance(ContentRow.class, contentRow);
    }

    private ContentRow() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "ubiIdentifier_", TitleRow.class, AddressRow.class, MapRow.class, EventRow.class, PlayableItemRow.class});
        }
        if (iOrdinal == 3) {
            return new ContentRow();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (ContentRow.class) {
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

    public final AddressRow n() {
        return this.contentCase_ == 3 ? (AddressRow) this.content_ : AddressRow.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.contentCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    public final EventRow p() {
        return this.contentCase_ == 5 ? (EventRow) this.content_ : EventRow.n();
    }

    public final MapRow q() {
        return this.contentCase_ == 4 ? (MapRow) this.content_ : MapRow.q();
    }

    public final PlayableItemRow r() {
        return this.contentCase_ == 6 ? (PlayableItemRow) this.content_ : PlayableItemRow.n();
    }

    public final TitleRow s() {
        return this.contentCase_ == 2 ? (TitleRow) this.content_ : TitleRow.n();
    }

    public final String t() {
        return this.ubiIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
