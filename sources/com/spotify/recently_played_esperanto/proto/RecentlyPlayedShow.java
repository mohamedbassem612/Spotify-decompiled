package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import p.bf40;
import p.jf40;
import p.qp01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedShow extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 5;
    private static final RecentlyPlayedShow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_STR_FIELD_NUMBER = 6;
    private int addTime_;
    private int bitField0_;
    private ShowCollectionState showCollectionState_;
    private ShowMetadata showMetadata_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedShow recentlyPlayedShow = new RecentlyPlayedShow();
        DEFAULT_INSTANCE = recentlyPlayedShow;
        h.registerDefaultInstance(RecentlyPlayedShow.class, recentlyPlayedShow);
    }

    private RecentlyPlayedShow() {
    }

    public static RecentlyPlayedShow n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004\u000b\u0005\u000b\u0006Ȉ", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedShow();
        }
        if (iOrdinal == 4) {
            return new qp01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedShow.class) {
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

    public final ShowMetadata o() {
        ShowMetadata showMetadata = this.showMetadata_;
        return showMetadata == null ? ShowMetadata.getDefaultInstance() : showMetadata;
    }

    public final String p() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
