package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vj51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SectionsPolicy extends h implements v2j0 {
    public static final int CONTINUE_LISTENING_FIELD_NUMBER = 1;
    private static final SectionsPolicy DEFAULT_INSTANCE;
    public static final int LATEST_UNPLAYED_EPISODE_FIELD_NUMBER = 3;
    public static final int NEXT_BEST_EPISODE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SAVED_EPISODES_FIELD_NUMBER = 5;
    public static final int TRAILER_SECTION_FIELD_NUMBER = 2;
    private boolean continueListening_;
    private boolean latestUnplayedEpisode_;
    private boolean nextBestEpisode_;
    private boolean savedEpisodes_;
    private boolean trailerSection_;

    static {
        SectionsPolicy sectionsPolicy = new SectionsPolicy();
        DEFAULT_INSTANCE = sectionsPolicy;
        h.registerDefaultInstance(SectionsPolicy.class, sectionsPolicy);
    }

    private SectionsPolicy() {
    }

    public static vj51 n() {
        return (vj51) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"continueListening_", "trailerSection_", "latestUnplayedEpisode_", "nextBestEpisode_", "savedEpisodes_"});
        }
        if (iOrdinal == 3) {
            return new SectionsPolicy();
        }
        if (iOrdinal == 4) {
            return new vj51(DEFAULT_INSTANCE);
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
        synchronized (SectionsPolicy.class) {
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

    public final void o(boolean z) {
        this.nextBestEpisode_ = z;
    }

    public final void p(boolean z) {
        this.trailerSection_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
