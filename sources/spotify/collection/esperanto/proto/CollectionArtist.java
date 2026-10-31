package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.ArtistMetadata;
import com.spotify.cosmos.util.proto.ArtistSyncState;
import p.bf40;
import p.f0h;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionArtist extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int ARTIST_METADATA_FIELD_NUMBER = 1;
    public static final int ARTIST_SYNC_STATE_FIELD_NUMBER = 3;
    public static final int DECORATED_FIELD_NUMBER = 4;
    private static final CollectionArtist DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER;
    private ArtistCollectionState artistCollectionState_;
    private ArtistMetadata artistMetadata_;
    private ArtistSyncState artistSyncState_;
    private int bitField0_;
    private boolean decorated_;
    private h290 album_ = h.emptyProtobufList();
    private String link_ = "";

    static {
        CollectionArtist collectionArtist = new CollectionArtist();
        DEFAULT_INSTANCE = collectionArtist;
        h.registerDefaultInstance(CollectionArtist.class, collectionArtist);
    }

    private CollectionArtist() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CollectionArtist s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u001b\u0006Ȉ", new Object[]{"bitField0_", "artistMetadata_", "artistCollectionState_", "artistSyncState_", "decorated_", "album_", CollectionAlbum.class, "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionArtist();
        }
        if (iOrdinal == 4) {
            return new f0h();
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
        synchronized (CollectionArtist.class) {
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

    public final h290 o() {
        return this.album_;
    }

    public final ArtistCollectionState p() {
        ArtistCollectionState artistCollectionState = this.artistCollectionState_;
        return artistCollectionState == null ? ArtistCollectionState.getDefaultInstance() : artistCollectionState;
    }

    public final ArtistMetadata q() {
        ArtistMetadata artistMetadata = this.artistMetadata_;
        return artistMetadata == null ? ArtistMetadata.getDefaultInstance() : artistMetadata;
    }

    public final ArtistSyncState r() {
        ArtistSyncState artistSyncState = this.artistSyncState_;
        return artistSyncState == null ? ArtistSyncState.getDefaultInstance() : artistSyncState;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
