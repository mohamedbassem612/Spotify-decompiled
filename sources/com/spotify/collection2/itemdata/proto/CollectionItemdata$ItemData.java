package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.h;
import com.spotify.list_collection.save_source.proto.SaveSource;
import p.bf40;
import p.h4h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CollectionItemdata$ItemData extends h implements v2j0 {
    public static final int ARTISTBAN_ITEM_DATA_FIELD_NUMBER = 1003;
    public static final int BAN_INTENT_ITEM_DATA_FIELD_NUMBER = 1004;
    public static final int BAN_ITEM_DATA_FIELD_NUMBER = 1002;
    private static final CollectionItemdata$ItemData DEFAULT_INSTANCE;
    public static final int HIDDEN_FROM_HOME_ITEM_DATA_FIELD_NUMBER = 1008;
    public static final int ISBN_SCAN_ITEM_DATA_FIELD_NUMBER = 1009;
    public static final int PAGE_MATCH_ITEM_DATA_FIELD_NUMBER = 1007;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_CONTEXT_BANS_ITEM_DATA_FIELD_NUMBER = 1001;
    public static final int RATING_ITEM_DATA_FIELD_NUMBER = 1006;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 1;
    public static final int SNOOZEDRECS_ITEM_DATA_FIELD_NUMBER = 1005;
    public static final int YL_FILTER_ITEM_DATA_FIELD_NUMBER = 1011;
    private int bitField0_;
    private int dataCase_ = 0;
    private Object data_;
    private SaveSource saveSource_;

    static {
        CollectionItemdata$ItemData collectionItemdata$ItemData = new CollectionItemdata$ItemData();
        DEFAULT_INSTANCE = collectionItemdata$ItemData;
        h.registerDefaultInstance(CollectionItemdata$ItemData.class, collectionItemdata$ItemData);
    }

    private CollectionItemdata$ItemData() {
    }

    public static CollectionItemdata$ItemData o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static h4h t() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001ϳ\u000b\u0000\u0000\u0000\u0001ဉ\u0000ϩ<\u0000Ϫ<\u0000ϫ<\u0000Ϭ<\u0000ϭ<\u0000Ϯ<\u0000ϯ<\u0000ϰ<\u0000ϱ<\u0000ϳ<\u0000", new Object[]{"data_", "dataCase_", "bitField0_", "saveSource_", CollectionItemdata.PlayContextBansItemData.class, CollectionItemdata.BanItemData.class, CollectionItemdata.ArtistBanItemData.class, CollectionItemdata.BanIntentItemData.class, CollectionItemdata.SnoozedRecsItemData.class, CollectionItemdata.RatingItemData.class, CollectionItemdata.PageMatchItemData.class, CollectionItemdata.HiddenFromHomeItemData.class, CollectionItemdata.IsbnScanItemData.class, CollectionItemdata.YlFilterItemData.class});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$ItemData();
        }
        if (iOrdinal == 4) {
            return new h4h();
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
        synchronized (CollectionItemdata$ItemData.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CollectionItemdata.IsbnScanItemData p() {
        return this.dataCase_ == 1009 ? (CollectionItemdata.IsbnScanItemData) this.data_ : CollectionItemdata.IsbnScanItemData.n();
    }

    public final CollectionItemdata.PageMatchItemData q() {
        return this.dataCase_ == 1007 ? (CollectionItemdata.PageMatchItemData) this.data_ : CollectionItemdata.PageMatchItemData.n();
    }

    public final boolean r() {
        return this.dataCase_ == 1009;
    }

    public final boolean s() {
        return this.dataCase_ == 1007;
    }

    public final void setSaveSource(SaveSource saveSource) {
        saveSource.getClass();
        this.saveSource_ = saveSource;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(CollectionItemdata.PageMatchItemData pageMatchItemData) {
        pageMatchItemData.getClass();
        this.data_ = pageMatchItemData;
        this.dataCase_ = PAGE_MATCH_ITEM_DATA_FIELD_NUMBER;
    }
}
