package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.b4h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CollectionGetArtistViewRequest extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 4;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int ARTIST_URI_FIELD_NUMBER = 1;
    private static final CollectionGetArtistViewRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_POLICY_FIELD_NUMBER = 5;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 2;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private String artistUri_ = "";
    private int bitField0_;
    private CollectionTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;

    static {
        CollectionGetArtistViewRequest collectionGetArtistViewRequest = new CollectionGetArtistViewRequest();
        DEFAULT_INSTANCE = collectionGetArtistViewRequest;
        h.registerDefaultInstance(CollectionGetArtistViewRequest.class, collectionGetArtistViewRequest);
    }

    private CollectionGetArtistViewRequest() {
    }

    public static b4h n() {
        return (b4h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "artistUri_", "updateThrottling_", "artistPolicy_", "albumPolicy_", "trackPolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetArtistViewRequest();
        }
        if (iOrdinal == 4) {
            return new b4h(DEFAULT_INSTANCE);
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
        synchronized (CollectionGetArtistViewRequest.class) {
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

    public final void o(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        collectionAlbumDecorationPolicy.getClass();
        this.albumPolicy_ = collectionAlbumDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void p(CollectionArtistDecorationPolicy collectionArtistDecorationPolicy) {
        collectionArtistDecorationPolicy.getClass();
        this.artistPolicy_ = collectionArtistDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void q(String str) {
        str.getClass();
        this.artistUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
