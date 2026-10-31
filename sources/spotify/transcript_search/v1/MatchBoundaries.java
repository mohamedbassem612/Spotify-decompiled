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
public final class MatchBoundaries extends h implements v2j0 {
    private static final MatchBoundaries DEFAULT_INSTANCE;
    public static final int END_TIME_MS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_MS_FIELD_NUMBER = 1;
    private long endTimeMs_;
    private long startTimeMs_;

    static {
        MatchBoundaries matchBoundaries = new MatchBoundaries();
        DEFAULT_INSTANCE = matchBoundaries;
        h.registerDefaultInstance(MatchBoundaries.class, matchBoundaries);
    }

    private MatchBoundaries() {
    }

    public static MatchBoundaries n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"startTimeMs_", "endTimeMs_"});
        }
        if (iOrdinal == 3) {
            return new MatchBoundaries();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (MatchBoundaries.class) {
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

    public final long o() {
        return this.endTimeMs_;
    }

    public final long p() {
        return this.startTimeMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
