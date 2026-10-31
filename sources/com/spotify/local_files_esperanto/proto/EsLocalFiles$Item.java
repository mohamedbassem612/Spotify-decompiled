package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.playlist.proto.TrackCollectionState;
import p.aoz;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsLocalFiles$Item extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 1;
    public static final int COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int CONTENT_URI_FIELD_NUMBER = 5;
    private static final EsLocalFiles$Item DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 4;
    private int addTime_;
    private int bitField0_;
    private TrackCollectionState collectionState_;
    private TrackMetadata metadata_;
    private String rowId_ = "";
    private String contentUri_ = "";

    static {
        EsLocalFiles$Item esLocalFiles$Item = new EsLocalFiles$Item();
        DEFAULT_INSTANCE = esLocalFiles$Item;
        h.registerDefaultInstance(EsLocalFiles$Item.class, esLocalFiles$Item);
    }

    private EsLocalFiles$Item() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "addTime_", "metadata_", "collectionState_", "rowId_", "contentUri_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$Item();
        }
        if (iOrdinal == 4) {
            return new aoz(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$Item.class) {
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

    public final TrackMetadata n() {
        TrackMetadata trackMetadata = this.metadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
