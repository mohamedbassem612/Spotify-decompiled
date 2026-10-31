package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ShowStatus extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 2;
    private static final ShowStatus DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 6;
    public static final int GENERATION_PROGRESS_FIELD_NUMBER = 4;
    public static final int LAST_UPDATED_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EpisodeStatus episode_;
    private GenerationProgress generationProgress_;
    private Timestamp lastUpdated_;
    private String title_ = "";
    private String artwork_ = "";
    private String showUri_ = "";

    static {
        ShowStatus showStatus = new ShowStatus();
        DEFAULT_INSTANCE = showStatus;
        h.registerDefaultInstance(ShowStatus.class, showStatus);
    }

    private ShowStatus() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "title_", "artwork_", "showUri_", "generationProgress_", "lastUpdated_", "episode_"});
        }
        if (iOrdinal == 3) {
            return new ShowStatus();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (ShowStatus.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.artwork_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeStatus o() {
        EpisodeStatus episodeStatus = this.episode_;
        return episodeStatus == null ? EpisodeStatus.n() : episodeStatus;
    }

    public final GenerationProgress p() {
        GenerationProgress generationProgress = this.generationProgress_;
        return generationProgress == null ? GenerationProgress.n() : generationProgress;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String r() {
        return this.showUri_;
    }

    public final boolean s() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
