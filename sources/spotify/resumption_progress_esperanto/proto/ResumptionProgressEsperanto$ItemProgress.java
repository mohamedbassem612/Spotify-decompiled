package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ResumptionProgressEsperanto$ItemProgress extends h implements v2j0 {
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final ResumptionProgressEsperanto$ItemProgress DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_FIELD_NUMBER = 2;
    private int current_;
    private int total_;

    static {
        ResumptionProgressEsperanto$ItemProgress resumptionProgressEsperanto$ItemProgress = new ResumptionProgressEsperanto$ItemProgress();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemProgress;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ItemProgress.class, resumptionProgressEsperanto$ItemProgress);
    }

    private ResumptionProgressEsperanto$ItemProgress() {
    }

    public static ResumptionProgressEsperanto$ItemProgress o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"current_", "total_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemProgress();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ResumptionProgressEsperanto$ItemProgress.class) {
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

    public final int n() {
        return this.current_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int p() {
        return this.total_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
