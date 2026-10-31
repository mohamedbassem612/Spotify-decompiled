package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.AlbumCollectionState;
import com.spotify.cosmos.util.proto.AlbumMetadata;
import com.spotify.cosmos.util.proto.AlbumSyncState;
import p.bf40;
import p.d0h;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionAlbum extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 1;
    public static final int ALBUM_COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int ALBUM_METADATA_FIELD_NUMBER = 2;
    public static final int ALBUM_SYNC_STATE_FIELD_NUMBER = 4;
    public static final int ALBUM_TYPE_FIELD_NUMBER = 6;
    public static final int DECORATED_FIELD_NUMBER = 5;
    private static final CollectionAlbum DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 7;
    private int addTime_;
    private AlbumCollectionState albumCollectionState_;
    private AlbumMetadata albumMetadata_;
    private AlbumSyncState albumSyncState_;
    private int bitField0_;
    private boolean decorated_;
    private String albumType_ = "";
    private h290 track_ = h.emptyProtobufList();
    private String link_ = "";

    static {
        CollectionAlbum collectionAlbum = new CollectionAlbum();
        DEFAULT_INSTANCE = collectionAlbum;
        h.registerDefaultInstance(CollectionAlbum.class, collectionAlbum);
    }

    private CollectionAlbum() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CollectionAlbum r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007\u0006Ȉ\u0007\u001b\u000bȈ", new Object[]{"bitField0_", "addTime_", "albumMetadata_", "albumCollectionState_", "albumSyncState_", "decorated_", "albumType_", "track_", CollectionTrack.class, "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionAlbum();
        }
        if (iOrdinal == 4) {
            return new d0h();
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
        synchronized (CollectionAlbum.class) {
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

    public final AlbumMetadata o() {
        AlbumMetadata albumMetadata = this.albumMetadata_;
        return albumMetadata == null ? AlbumMetadata.getDefaultInstance() : albumMetadata;
    }

    public final AlbumSyncState p() {
        AlbumSyncState albumSyncState = this.albumSyncState_;
        return albumSyncState == null ? AlbumSyncState.getDefaultInstance() : albumSyncState;
    }

    public final String q() {
        return this.albumType_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
