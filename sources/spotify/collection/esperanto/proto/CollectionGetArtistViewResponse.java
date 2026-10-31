package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.collection_cosmos.proto.StatusOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CollectionGetArtistViewResponse extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final CollectionGetArtistViewResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private CollectionArtist artist_;
    private int bitField0_;
    private StatusOuterClass.Status status_;

    static {
        CollectionGetArtistViewResponse collectionGetArtistViewResponse = new CollectionGetArtistViewResponse();
        DEFAULT_INSTANCE = collectionGetArtistViewResponse;
        h.registerDefaultInstance(CollectionGetArtistViewResponse.class, collectionGetArtistViewResponse);
    }

    private CollectionGetArtistViewResponse() {
    }

    public static CollectionGetArtistViewResponse o(byte[] bArr) {
        return (CollectionGetArtistViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "artist_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetArtistViewResponse();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (CollectionGetArtistViewResponse.class) {
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

    public final CollectionArtist n() {
        CollectionArtist collectionArtist = this.artist_;
        return collectionArtist == null ? CollectionArtist.s() : collectionArtist;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
