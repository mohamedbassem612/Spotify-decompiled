package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.AlbumCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import p.bf40;
import p.e0h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionAlbumDecorationPolicy extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 7;
    public static final int ALBUM_TYPE_FIELD_NUMBER = 2;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 4;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 5;
    public static final int DECORATED_FIELD_NUMBER = 1;
    private static final CollectionAlbumDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 6;
    private AlbumDecorationPolicy albumPolicy_;
    private boolean albumType_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private CollectionArtistDecorationPolicy artistsPolicy_;
    private int bitField0_;
    private AlbumCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private AlbumSyncDecorationPolicy syncPolicy_;

    static {
        CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy = new CollectionAlbumDecorationPolicy();
        DEFAULT_INSTANCE = collectionAlbumDecorationPolicy;
        h.registerDefaultInstance(CollectionAlbumDecorationPolicy.class, collectionAlbumDecorationPolicy);
    }

    private CollectionAlbumDecorationPolicy() {
    }

    public static e0h o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "decorated_", "albumType_", "artistPolicy_", "artistsPolicy_", "collectionPolicy_", "syncPolicy_", "albumPolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionAlbumDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new e0h();
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
        synchronized (CollectionAlbumDecorationPolicy.class) {
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

    public final void p(AlbumDecorationPolicy albumDecorationPolicy) {
        albumDecorationPolicy.getClass();
        this.albumPolicy_ = albumDecorationPolicy;
        this.bitField0_ |= 16;
    }

    public final void q() {
        this.albumType_ = true;
    }

    public final void r(AlbumSyncDecorationPolicy albumSyncDecorationPolicy) {
        albumSyncDecorationPolicy.getClass();
        this.syncPolicy_ = albumSyncDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
