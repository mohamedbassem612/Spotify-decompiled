package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowShowRequest$AuxiliarySections extends h implements v2j0 {
    public static final int CONTINUE_LISTENING_FIELD_NUMBER = 1;
    private static final ShowShowRequest$AuxiliarySections DEFAULT_INSTANCE;
    public static final int NEXT_BEST_EPISODE_SECTION_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int TRAILER_SECTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowShowRequest$ContinueListeningSection continueListening_;
    private ShowShowRequest$NextBestEpisodeSection nextBestEpisodeSection_;
    private ShowShowRequest$TrailerSection trailerSection_;

    static {
        ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = new ShowShowRequest$AuxiliarySections();
        DEFAULT_INSTANCE = showShowRequest$AuxiliarySections;
        h.registerDefaultInstance(ShowShowRequest$AuxiliarySections.class, showShowRequest$AuxiliarySections);
    }

    private ShowShowRequest$AuxiliarySections() {
    }

    public static ShowShowRequest$AuxiliarySections o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\nဉ\u0002", new Object[]{"bitField0_", "continueListening_", "trailerSection_", "nextBestEpisodeSection_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$AuxiliarySections();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ShowShowRequest$AuxiliarySections.class) {
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

    public final ShowShowRequest$ContinueListeningSection n() {
        ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = this.continueListening_;
        return showShowRequest$ContinueListeningSection == null ? ShowShowRequest$ContinueListeningSection.n() : showShowRequest$ContinueListeningSection;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowShowRequest$NextBestEpisodeSection p() {
        ShowShowRequest$NextBestEpisodeSection showShowRequest$NextBestEpisodeSection = this.nextBestEpisodeSection_;
        return showShowRequest$NextBestEpisodeSection == null ? ShowShowRequest$NextBestEpisodeSection.n() : showShowRequest$NextBestEpisodeSection;
    }

    public final ShowShowRequest$TrailerSection q() {
        ShowShowRequest$TrailerSection showShowRequest$TrailerSection = this.trailerSection_;
        return showShowRequest$TrailerSection == null ? ShowShowRequest$TrailerSection.n() : showShowRequest$TrailerSection;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
