package com.spotify.assistedcuration.v1;

import com.google.protobuf.h;
import java.util.Set;
import p.bf40;
import p.h290;
import p.i111;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class RecommendationsProto$ItemSpecificRecommendationsRequest extends h implements v2j0 {
    public static final int CURATION_URI_FIELD_NUMBER = 2;
    private static final RecommendationsProto$ItemSpecificRecommendationsRequest DEFAULT_INSTANCE;
    public static final int ITEM_URI_FIELD_NUMBER = 1;
    public static final int LIMIT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SEED_URIS_FIELD_NUMBER = 4;
    public static final int SKIP_ITEM_URIS_FIELD_NUMBER = 5;
    public static final int SUGGESTED_AUDIOBOOKS_FIELD_NUMBER = 9;
    public static final int SUGGESTED_BY_GENRE_FIELD_NUMBER = 8;
    public static final int SUGGESTED_EPISODES_FIELD_NUMBER = 7;
    public static final int SUGGESTED_TRACKS_FIELD_NUMBER = 6;
    private int limit_;
    private Object type_;
    private int typeCase_ = 0;
    private String itemUri_ = "";
    private String curationUri_ = "";
    private h290 seedUris_ = h.emptyProtobufList();
    private h290 skipItemUris_ = h.emptyProtobufList();

    static {
        RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest = new RecommendationsProto$ItemSpecificRecommendationsRequest();
        DEFAULT_INSTANCE = recommendationsProto$ItemSpecificRecommendationsRequest;
        h.registerDefaultInstance(RecommendationsProto$ItemSpecificRecommendationsRequest.class, recommendationsProto$ItemSpecificRecommendationsRequest);
    }

    private RecommendationsProto$ItemSpecificRecommendationsRequest() {
    }

    public static i111 p() {
        return (i111) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ț\u0005Ț\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"type_", "typeCase_", "itemUri_", "curationUri_", "limit_", "seedUris_", "skipItemUris_", RecommendationsProto$SuggestedTracks.class, RecommendationsProto$SuggestedEpisodes.class, RecommendationsProto$SuggestedByGenre.class, RecommendationsProto$SuggestedAudiobooks.class});
        }
        if (iOrdinal == 3) {
            return new RecommendationsProto$ItemSpecificRecommendationsRequest();
        }
        if (iOrdinal == 4) {
            return new i111(DEFAULT_INSTANCE);
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
        synchronized (RecommendationsProto$ItemSpecificRecommendationsRequest.class) {
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
        h290 h290VarMutableCopy = this.seedUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.seedUris_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(Set set) {
        h290 h290VarMutableCopy = this.skipItemUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.skipItemUris_ = h290VarMutableCopy;
        }
        s8.addAll(set, h290VarMutableCopy);
    }

    public final void q(String str) {
        str.getClass();
        this.curationUri_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.itemUri_ = str;
    }

    public final void s(int i) {
        this.limit_ = i;
    }

    public final void t(RecommendationsProto$SuggestedAudiobooks recommendationsProto$SuggestedAudiobooks) {
        recommendationsProto$SuggestedAudiobooks.getClass();
        this.type_ = recommendationsProto$SuggestedAudiobooks;
        this.typeCase_ = 9;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(RecommendationsProto$SuggestedEpisodes recommendationsProto$SuggestedEpisodes) {
        recommendationsProto$SuggestedEpisodes.getClass();
        this.type_ = recommendationsProto$SuggestedEpisodes;
        this.typeCase_ = 7;
    }
}
