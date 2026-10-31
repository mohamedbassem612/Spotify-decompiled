package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ShowDecorateRequest$ProtoDecorateEpisodeItem extends h implements v2j0 {
    private static final ShowDecorateRequest$ProtoDecorateEpisodeItem DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EpisodeState.ProtoEpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata_;
    private EpisodeState$ProtoEpisodeOfflineState episodeOfflineState_;
    private EpisodeState.ProtoEpisodePlayState episodePlayState_;
    private String link_ = "";

    static {
        ShowDecorateRequest$ProtoDecorateEpisodeItem showDecorateRequest$ProtoDecorateEpisodeItem = new ShowDecorateRequest$ProtoDecorateEpisodeItem();
        DEFAULT_INSTANCE = showDecorateRequest$ProtoDecorateEpisodeItem;
        h.registerDefaultInstance(ShowDecorateRequest$ProtoDecorateEpisodeItem.class, showDecorateRequest$ProtoDecorateEpisodeItem);
    }

    private ShowDecorateRequest$ProtoDecorateEpisodeItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_", "link_"});
        }
        if (iOrdinal == 3) {
            return new ShowDecorateRequest$ProtoDecorateEpisodeItem();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ShowDecorateRequest$ProtoDecorateEpisodeItem.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final EpisodeState.ProtoEpisodeCollectionState n() {
        EpisodeState.ProtoEpisodeCollectionState protoEpisodeCollectionState = this.episodeCollectionState_;
        return protoEpisodeCollectionState == null ? EpisodeState.ProtoEpisodeCollectionState.n() : protoEpisodeCollectionState;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeMetadata$ProtoEpisodeMetadata o() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.episodeMetadata_;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.o() : episodeMetadata$ProtoEpisodeMetadata;
    }

    public final EpisodeState$ProtoEpisodeOfflineState p() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.episodeOfflineState_;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.n() : episodeState$ProtoEpisodeOfflineState;
    }

    public final EpisodeState.ProtoEpisodePlayState q() {
        EpisodeState.ProtoEpisodePlayState protoEpisodePlayState = this.episodePlayState_;
        return protoEpisodePlayState == null ? EpisodeState.ProtoEpisodePlayState.n() : protoEpisodePlayState;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }
}
