package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ShowDecorateRequest$ProtoDecorateShowItem extends h implements v2j0 {
    private static final ShowDecorateRequest$ProtoDecorateShowItem DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_OFFLINE_STATE_FIELD_NUMBER = 7;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String link_ = "";
    private ShowState$ProtoShowCollectionState showCollectionState_;
    private ShowMetadata$ProtoShowMetadata showMetadata_;
    private ShowState$ProtoShowOfflineState showOfflineState_;
    private ShowState.ProtoShowPlayState showPlayState_;

    static {
        ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem = new ShowDecorateRequest$ProtoDecorateShowItem();
        DEFAULT_INSTANCE = showDecorateRequest$ProtoDecorateShowItem;
        h.registerDefaultInstance(ShowDecorateRequest$ProtoDecorateShowItem.class, showDecorateRequest$ProtoDecorateShowItem);
    }

    private ShowDecorateRequest$ProtoDecorateShowItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "link_", "showOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new ShowDecorateRequest$ProtoDecorateShowItem();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (ShowDecorateRequest$ProtoDecorateShowItem.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final ShowState$ProtoShowCollectionState n() {
        ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState = this.showCollectionState_;
        return showState$ProtoShowCollectionState == null ? ShowState$ProtoShowCollectionState.n() : showState$ProtoShowCollectionState;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowMetadata$ProtoShowMetadata o() {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = this.showMetadata_;
        return showMetadata$ProtoShowMetadata == null ? ShowMetadata$ProtoShowMetadata.p() : showMetadata$ProtoShowMetadata;
    }

    public final ShowState$ProtoShowOfflineState p() {
        ShowState$ProtoShowOfflineState showState$ProtoShowOfflineState = this.showOfflineState_;
        return showState$ProtoShowOfflineState == null ? ShowState$ProtoShowOfflineState.n() : showState$ProtoShowOfflineState;
    }

    public final ShowState.ProtoShowPlayState q() {
        ShowState.ProtoShowPlayState protoShowPlayState = this.showPlayState_;
        return protoShowPlayState == null ? ShowState.ProtoShowPlayState.n() : protoShowPlayState;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}
