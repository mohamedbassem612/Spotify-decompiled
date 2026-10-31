package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.collection_cosmos.proto.StatusOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CollectionGetUnplayedEpisodesResponse extends h implements v2j0 {
    private static final CollectionGetUnplayedEpisodesResponse DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    public static final int LOADING_CONTENT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 3;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private h290 item_ = h.emptyProtobufList();
    private boolean loadingContent_;
    private StatusOuterClass.Status status_;
    private int unfilteredLength_;
    private int unrangedLength_;

    static {
        CollectionGetUnplayedEpisodesResponse collectionGetUnplayedEpisodesResponse = new CollectionGetUnplayedEpisodesResponse();
        DEFAULT_INSTANCE = collectionGetUnplayedEpisodesResponse;
        h.registerDefaultInstance(CollectionGetUnplayedEpisodesResponse.class, collectionGetUnplayedEpisodesResponse);
    }

    private CollectionGetUnplayedEpisodesResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CollectionGetUnplayedEpisodesResponse r(byte[] bArr) {
        return (CollectionGetUnplayedEpisodesResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u000b\u0004\u000b\u0005\u0007", new Object[]{"bitField0_", "status_", "item_", UnplayedEpisodeItem.class, "unfilteredLength_", "unrangedLength_", "loadingContent_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetUnplayedEpisodesResponse();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (CollectionGetUnplayedEpisodesResponse.class) {
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

    public final h290 n() {
        return this.item_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.loadingContent_;
    }

    public final int p() {
        return this.unfilteredLength_;
    }

    public final int q() {
        return this.unrangedLength_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
