package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c4h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CollectionGetUnplayedEpisodesRequest extends h implements v2j0 {
    private static final CollectionGetUnplayedEpisodesRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    public static final int FILTER_FIELD_NUMBER = 5;
    public static final int GROUP_FIELD_NUMBER = 6;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SORT_FIELD_NUMBER = 4;
    public static final int START_FIELD_NUMBER = 2;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 7;
    private int bitField0_;
    private CollectionEpisodeDecorationPolicy episodePolicy_;
    private boolean group_;
    private int length_;
    private int start_;
    private int updateThrottling_;
    private String sort_ = "";
    private String filter_ = "";

    static {
        CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest = new CollectionGetUnplayedEpisodesRequest();
        DEFAULT_INSTANCE = collectionGetUnplayedEpisodesRequest;
        h.registerDefaultInstance(CollectionGetUnplayedEpisodesRequest.class, collectionGetUnplayedEpisodesRequest);
    }

    private CollectionGetUnplayedEpisodesRequest() {
    }

    public static c4h n() {
        return (c4h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007\u000b", new Object[]{"bitField0_", "episodePolicy_", "start_", "length_", "sort_", "filter_", "group_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetUnplayedEpisodesRequest();
        }
        if (iOrdinal == 4) {
            return new c4h(DEFAULT_INSTANCE);
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
        synchronized (CollectionGetUnplayedEpisodesRequest.class) {
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

    public final void o(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy) {
        this.episodePolicy_ = collectionEpisodeDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        this.filter_ = str;
    }

    public final void q(boolean z) {
        this.group_ = z;
    }

    public final void r(int i) {
        this.length_ = i;
    }

    public final void s(String str) {
        this.sort_ = str;
    }

    public final void t(int i) {
        this.start_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.updateThrottling_ = i;
    }
}
