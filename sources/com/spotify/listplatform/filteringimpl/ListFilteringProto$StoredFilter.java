package com.spotify.listplatform.filteringimpl;

import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ListFilteringProto$StoredFilter extends h implements v2j0 {
    public static final int AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER = 15;
    private static final ListFilteringProto$StoredFilter DEFAULT_INSTANCE;
    public static final int DESCRIPTOR_TAG_FIELD_NUMBER = 8;
    public static final int EXCLUDE_BANNED_FIELD_NUMBER = 6;
    public static final int EXCLUDE_EPISODES_FIELD_NUMBER = 10;
    public static final int EXCLUDE_EPISODE_TRAILERS_FIELD_NUMBER = 16;
    public static final int EXCLUDE_EXPLICIT_FIELD_NUMBER = 11;
    public static final int EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER = 19;
    public static final int EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER = 18;
    public static final int EXCLUDE_UNAVAILABLE_FIELD_NUMBER = 13;
    public static final int EXCLUDE_VIDEOS_FIELD_NUMBER = 5;
    public static final int FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER = 20;
    public static final int FULLY_PLAYED_ONLY_FIELD_NUMBER = 12;
    public static final int IN_PROGRESS_ONLY_FIELD_NUMBER = 9;
    public static final int NOT_FULLY_PLAYED_ONLY_FIELD_NUMBER = 14;
    public static final int NOT_FULLY_PLAYED_OR_IN_PROGRESS_ONLY_FIELD_NUMBER = 22;
    public static final int NOT_LOCAL_TRACK_FIELD_NUMBER = 7;
    public static final int ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER = 17;
    private static volatile qzr0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 2;
    public static final int TAG_IDS_FIELD_NUMBER = 21;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int UNPLAYED_ONLY_FIELD_NUMBER = 4;
    public static final int VIDEOS_ONLY_FIELD_NUMBER = 3;
    public static final int VIDEO_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER = 23;
    public static final int VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER = 24;
    private int filterCase_ = 0;
    private Object filter_;

    static {
        ListFilteringProto$StoredFilter listFilteringProto$StoredFilter = new ListFilteringProto$StoredFilter();
        DEFAULT_INSTANCE = listFilteringProto$StoredFilter;
        h.registerDefaultInstance(ListFilteringProto$StoredFilter.class, listFilteringProto$StoredFilter);
    }

    private ListFilteringProto$StoredFilter() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0018\u0001\u0000\u0001\u0018\u0018\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000\u0006:\u0000\u0007:\u0000\bȻ\u0000\t:\u0000\n:\u0000\u000b:\u0000\f:\u0000\r:\u0000\u000e:\u0000\u000f:\u0000\u0010:\u0000\u0011:\u0000\u0012:\u0000\u0013:\u0000\u0014<\u0000\u0015<\u0000\u0016:\u0000\u0017:\u0000\u0018:\u0000", new Object[]{"filter_", "filterCase_", ListFilteringProto$FormatListAttributeKeysValue.class, ListFilteringProto$IntList.class});
        }
        if (iOrdinal == 3) {
            return new ListFilteringProto$StoredFilter();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ListFilteringProto$StoredFilter.class) {
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

    public final String n() {
        return this.filterCase_ == 8 ? (String) this.filter_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        switch (this.filterCase_) {
            case 0:
                return 25;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return 17;
            case EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return 18;
            case EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return 19;
            case FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return 20;
            case TAG_IDS_FIELD_NUMBER /* 21 */:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return 24;
            default:
                return 0;
        }
    }

    public final ListFilteringProto$FormatListAttributeKeysValue p() {
        return this.filterCase_ == 20 ? (ListFilteringProto$FormatListAttributeKeysValue) this.filter_ : ListFilteringProto$FormatListAttributeKeysValue.n();
    }

    public final String q() {
        return this.filterCase_ == 2 ? (String) this.filter_ : "";
    }

    public final ListFilteringProto$IntList r() {
        return this.filterCase_ == 21 ? (ListFilteringProto$IntList) this.filter_ : ListFilteringProto$IntList.n();
    }

    public final String s() {
        return this.filterCase_ == 1 ? (String) this.filter_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
