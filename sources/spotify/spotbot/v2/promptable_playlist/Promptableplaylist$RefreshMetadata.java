package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l1y0;
import p.m1y0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Promptableplaylist$RefreshMetadata extends h implements v2j0 {
    public static final int CADENCE_FIELD_NUMBER = 1;
    private static final Promptableplaylist$RefreshMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int WEEKLY_DAY_FIELD_NUMBER = 2;
    private int cadence_;
    private int weeklyDay_;

    static {
        Promptableplaylist$RefreshMetadata promptableplaylist$RefreshMetadata = new Promptableplaylist$RefreshMetadata();
        DEFAULT_INSTANCE = promptableplaylist$RefreshMetadata;
        h.registerDefaultInstance(Promptableplaylist$RefreshMetadata.class, promptableplaylist$RefreshMetadata);
    }

    private Promptableplaylist$RefreshMetadata() {
    }

    public static m1y0 n() {
        return (m1y0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"cadence_", "weeklyDay_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$RefreshMetadata();
        }
        if (iOrdinal == 4) {
            return new m1y0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$RefreshMetadata.class) {
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

    public final void o(l1y0 l1y0Var) {
        this.cadence_ = l1y0Var.getNumber();
    }

    public final void p(int i) {
        this.weeklyDay_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
