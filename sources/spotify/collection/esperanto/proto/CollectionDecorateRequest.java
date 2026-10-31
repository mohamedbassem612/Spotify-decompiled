package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.e3h;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionDecorateRequest extends h implements v2j0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 5;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 4;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final CollectionDecorateRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_POLICY_FIELD_NUMBER = 7;
    public static final int TRACK_POLICY_FIELD_NUMBER = 6;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private CollectionEpisodeDecorationPolicy episodePolicy_;
    private CollectionShowDecorationPolicy showPolicy_;
    private CollectionTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;
    private h290 uri_ = h.emptyProtobufList();
    private String contextUri_ = "";

    static {
        CollectionDecorateRequest collectionDecorateRequest = new CollectionDecorateRequest();
        DEFAULT_INSTANCE = collectionDecorateRequest;
        h.registerDefaultInstance(CollectionDecorateRequest.class, collectionDecorateRequest);
    }

    private CollectionDecorateRequest() {
    }

    public static e3h p() {
        return (e3h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003\u000b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004", new Object[]{"bitField0_", "uri_", "contextUri_", "updateThrottling_", "artistPolicy_", "albumPolicy_", "trackPolicy_", "showPolicy_", "episodePolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionDecorateRequest();
        }
        if (iOrdinal == 4) {
            return new e3h(DEFAULT_INSTANCE);
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
        synchronized (CollectionDecorateRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.uri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uri_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.uri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uri_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(CollectionArtistDecorationPolicy collectionArtistDecorationPolicy) {
        collectionArtistDecorationPolicy.getClass();
        this.artistPolicy_ = collectionArtistDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void r(String str) {
        str.getClass();
        this.contextUri_ = str;
    }

    public final void s(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy) {
        collectionEpisodeDecorationPolicy.getClass();
        this.episodePolicy_ = collectionEpisodeDecorationPolicy;
        this.bitField0_ |= 16;
    }

    public final void t(CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        collectionShowDecorationPolicy.getClass();
        this.showPolicy_ = collectionShowDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        this.trackPolicy_ = collectionTrackDecorationPolicy;
        this.bitField0_ |= 4;
    }
}
