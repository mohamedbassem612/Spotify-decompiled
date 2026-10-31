package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowShowRequest$ProtoShowRequestHeader extends h implements v2j0 {
    private static final ShowShowRequest$ProtoShowRequestHeader DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_OFFLINE_STATE_FIELD_NUMBER = 4;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowState.ProtoShowCollectionState showCollectionState_;
    private ShowMetadata.ProtoShowMetadata showMetadata_;
    private ShowState.ProtoShowOfflineState showOfflineState_;
    private ShowState.ProtoShowPlayState showPlayState_;

    static {
        ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = new ShowShowRequest$ProtoShowRequestHeader();
        DEFAULT_INSTANCE = showShowRequest$ProtoShowRequestHeader;
        h.registerDefaultInstance(ShowShowRequest$ProtoShowRequestHeader.class, showShowRequest$ProtoShowRequestHeader);
    }

    private ShowShowRequest$ProtoShowRequestHeader() {
    }

    public static ShowShowRequest$ProtoShowRequestHeader n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "showOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$ProtoShowRequestHeader();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (ShowShowRequest$ProtoShowRequestHeader.class) {
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

    public final ShowState.ProtoShowCollectionState o() {
        ShowState.ProtoShowCollectionState protoShowCollectionState = this.showCollectionState_;
        return protoShowCollectionState == null ? ShowState.ProtoShowCollectionState.n() : protoShowCollectionState;
    }

    public final ShowMetadata.ProtoShowMetadata p() {
        ShowMetadata.ProtoShowMetadata protoShowMetadata = this.showMetadata_;
        return protoShowMetadata == null ? ShowMetadata.ProtoShowMetadata.p() : protoShowMetadata;
    }

    public final ShowState.ProtoShowOfflineState q() {
        ShowState.ProtoShowOfflineState protoShowOfflineState = this.showOfflineState_;
        return protoShowOfflineState == null ? ShowState.ProtoShowOfflineState.n() : protoShowOfflineState;
    }

    public final ShowState.ProtoShowPlayState r() {
        ShowState.ProtoShowPlayState protoShowPlayState = this.showPlayState_;
        return protoShowPlayState == null ? ShowState.ProtoShowPlayState.n() : protoShowPlayState;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }
}
