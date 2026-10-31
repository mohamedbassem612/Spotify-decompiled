package spotify.show_cosmos.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.ShowMetadata;
import com.spotify.cosmos.util.proto.ShowPlayState;
import p.bf40;
import p.jf40;
import p.m981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowRequest$Header extends h implements v2j0 {
    private static final ShowRequest$Header DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_OFFLINE_STATE_FIELD_NUMBER = 4;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowShowState$ShowCollectionState showCollectionState_;
    private ShowMetadata showMetadata_;
    private ShowOfflineStateOuterClass$ShowOfflineState showOfflineState_;
    private ShowPlayState showPlayState_;

    static {
        ShowRequest$Header showRequest$Header = new ShowRequest$Header();
        DEFAULT_INSTANCE = showRequest$Header;
        h.registerDefaultInstance(ShowRequest$Header.class, showRequest$Header);
    }

    private ShowRequest$Header() {
    }

    public static ShowRequest$Header n() {
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
            return new ShowRequest$Header();
        }
        if (iOrdinal == 4) {
            return new m981(DEFAULT_INSTANCE);
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
        synchronized (ShowRequest$Header.class) {
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

    public final ShowShowState$ShowCollectionState o() {
        ShowShowState$ShowCollectionState showShowState$ShowCollectionState = this.showCollectionState_;
        return showShowState$ShowCollectionState == null ? ShowShowState$ShowCollectionState.n() : showShowState$ShowCollectionState;
    }

    public final ShowMetadata p() {
        ShowMetadata showMetadata = this.showMetadata_;
        return showMetadata == null ? ShowMetadata.getDefaultInstance() : showMetadata;
    }

    public final ShowOfflineStateOuterClass$ShowOfflineState q() {
        ShowOfflineStateOuterClass$ShowOfflineState showOfflineStateOuterClass$ShowOfflineState = this.showOfflineState_;
        return showOfflineStateOuterClass$ShowOfflineState == null ? ShowOfflineStateOuterClass$ShowOfflineState.n() : showOfflineStateOuterClass$ShowOfflineState;
    }

    public final ShowPlayState r() {
        ShowPlayState showPlayState = this.showPlayState_;
        return showPlayState == null ? ShowPlayState.getDefaultInstance() : showPlayState;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
