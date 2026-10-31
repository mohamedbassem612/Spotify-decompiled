package spotify.show_cosmos.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowRequest$AuxiliarySections extends h implements v2j0 {
    public static final int CONTINUE_LISTENING_FIELD_NUMBER = 1;
    private static final ShowRequest$AuxiliarySections DEFAULT_INSTANCE;
    public static final int LATEST_UNPLAYED_EPISODE_SECTION_FIELD_NUMBER = 9;
    public static final int NEXT_BEST_EPISODE_SECTION_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int SAVED_EPISODES_SECTION_FIELD_NUMBER = 11;
    public static final int TRAILER_SECTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowRequest$ContinueListeningSection continueListening_;
    private ShowRequest$LatestUnplayedEpisodeSection latestUnplayedEpisodeSection_;
    private ShowRequest$NextBestEpisodeSection nextBestEpisodeSection_;
    private ShowRequest$SavedEpisodesSection savedEpisodesSection_;
    private ShowRequest$TrailerSection trailerSection_;

    static {
        ShowRequest$AuxiliarySections showRequest$AuxiliarySections = new ShowRequest$AuxiliarySections();
        DEFAULT_INSTANCE = showRequest$AuxiliarySections;
        h.registerDefaultInstance(ShowRequest$AuxiliarySections.class, showRequest$AuxiliarySections);
    }

    private ShowRequest$AuxiliarySections() {
    }

    public static ShowRequest$AuxiliarySections o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\tဉ\u0002\nဉ\u0003\u000bဉ\u0004", new Object[]{"bitField0_", "continueListening_", "trailerSection_", "latestUnplayedEpisodeSection_", "nextBestEpisodeSection_", "savedEpisodesSection_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$AuxiliarySections();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ShowRequest$AuxiliarySections.class) {
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

    public final ShowRequest$ContinueListeningSection n() {
        ShowRequest$ContinueListeningSection showRequest$ContinueListeningSection = this.continueListening_;
        return showRequest$ContinueListeningSection == null ? ShowRequest$ContinueListeningSection.n() : showRequest$ContinueListeningSection;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowRequest$NextBestEpisodeSection p() {
        ShowRequest$NextBestEpisodeSection showRequest$NextBestEpisodeSection = this.nextBestEpisodeSection_;
        return showRequest$NextBestEpisodeSection == null ? ShowRequest$NextBestEpisodeSection.n() : showRequest$NextBestEpisodeSection;
    }

    public final ShowRequest$TrailerSection q() {
        ShowRequest$TrailerSection showRequest$TrailerSection = this.trailerSection_;
        return showRequest$TrailerSection == null ? ShowRequest$TrailerSection.n() : showRequest$TrailerSection;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
