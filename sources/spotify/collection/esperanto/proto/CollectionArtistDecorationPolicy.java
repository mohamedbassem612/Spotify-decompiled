package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import p.bf40;
import p.jf40;
import p.l0h;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionArtistDecorationPolicy extends h implements v2j0 {
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    public static final int DECORATED_FIELD_NUMBER = 4;
    private static final CollectionArtistDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    private ArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private ArtistCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private ArtistSyncDecorationPolicy syncPolicy_;

    static {
        CollectionArtistDecorationPolicy collectionArtistDecorationPolicy = new CollectionArtistDecorationPolicy();
        DEFAULT_INSTANCE = collectionArtistDecorationPolicy;
        h.registerDefaultInstance(CollectionArtistDecorationPolicy.class, collectionArtistDecorationPolicy);
    }

    private CollectionArtistDecorationPolicy() {
    }

    public static l0h o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007", new Object[]{"bitField0_", "collectionPolicy_", "syncPolicy_", "artistPolicy_", "decorated_"});
        }
        if (iOrdinal == 3) {
            return new CollectionArtistDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new l0h();
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
        synchronized (CollectionArtistDecorationPolicy.class) {
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

    public final void p(ArtistDecorationPolicy artistDecorationPolicy) {
        artistDecorationPolicy.getClass();
        this.artistPolicy_ = artistDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void q(ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy) {
        artistCollectionDecorationPolicy.getClass();
        this.collectionPolicy_ = artistCollectionDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void r(ArtistSyncDecorationPolicy artistSyncDecorationPolicy) {
        artistSyncDecorationPolicy.getClass();
        this.syncPolicy_ = artistSyncDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
