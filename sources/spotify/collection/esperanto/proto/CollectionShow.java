package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import com.spotify.cosmos.util.proto.ShowPlayState;
import p.b7h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionShow extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 4;
    private static final CollectionShow DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int addTime_;
    private int bitField0_;
    private String link_ = "";
    private ShowCollectionState showCollectionState_;
    private ShowMetadata showMetadata_;
    private ShowPlayState showPlayState_;

    static {
        CollectionShow collectionShow = new CollectionShow();
        DEFAULT_INSTANCE = collectionShow;
        h.registerDefaultInstance(CollectionShow.class, collectionShow);
    }

    private CollectionShow() {
    }

    public static CollectionShow o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005Ȉ", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "addTime_", "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionShow();
        }
        if (iOrdinal == 4) {
            return new b7h();
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
        synchronized (CollectionShow.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowCollectionState p() {
        ShowCollectionState showCollectionState = this.showCollectionState_;
        return showCollectionState == null ? ShowCollectionState.getDefaultInstance() : showCollectionState;
    }

    public final ShowMetadata q() {
        ShowMetadata showMetadata = this.showMetadata_;
        return showMetadata == null ? ShowMetadata.getDefaultInstance() : showMetadata;
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
