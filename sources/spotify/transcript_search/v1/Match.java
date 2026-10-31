package spotify.transcript_search.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Match extends h implements v2j0 {
    public static final int BOUNDARIES_FIELD_NUMBER = 6;
    public static final int CHAPTER_INFO_FIELD_NUMBER = 8;
    public static final int DEBUG_INFO_FIELD_NUMBER = 99;
    private static final Match DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 2;
    public static final int HIGHLIGHT_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 3;
    public static final int TRANSCRIPT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private MatchBoundaries boundaries_;
    private ChapterInfo chapterInfo_;
    private DebugInfo debugInfo_;
    private Highlight highlight_;
    private String transcriptId_ = "";
    private String episodeUri_ = "";
    private String showUri_ = "";

    static {
        Match match = new Match();
        DEFAULT_INSTANCE = match;
        h.registerDefaultInstance(Match.class, match);
    }

    private Match() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Match q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001c\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0006ဉ\u0000\bဉ\u0001\tဉ\u0002cဉ\u0003", new Object[]{"bitField0_", "transcriptId_", "episodeUri_", "showUri_", "boundaries_", "chapterInfo_", "highlight_", "debugInfo_"});
        }
        if (iOrdinal == 3) {
            return new Match();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Match.class) {
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

    public final MatchBoundaries n() {
        MatchBoundaries matchBoundaries = this.boundaries_;
        return matchBoundaries == null ? MatchBoundaries.n() : matchBoundaries;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ChapterInfo o() {
        ChapterInfo chapterInfo = this.chapterInfo_;
        return chapterInfo == null ? ChapterInfo.o() : chapterInfo;
    }

    public final DebugInfo p() {
        DebugInfo debugInfo = this.debugInfo_;
        return debugInfo == null ? DebugInfo.n() : debugInfo;
    }

    public final String r() {
        return this.episodeUri_;
    }

    public final Highlight s() {
        Highlight highlight = this.highlight_;
        return highlight == null ? Highlight.n() : highlight;
    }

    public final String t() {
        return this.showUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.transcriptId_;
    }

    public final boolean v() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 4) != 0;
    }
}
