package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$ListSortParam extends h implements v2j0 {
    public static final int ASCENDING_FIELD_NUMBER = 2;
    private static final ResumptionProgressEsperanto$ListSortParam DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean ascending_;
    private String field_ = "";

    static {
        ResumptionProgressEsperanto$ListSortParam resumptionProgressEsperanto$ListSortParam = new ResumptionProgressEsperanto$ListSortParam();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ListSortParam;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ListSortParam.class, resumptionProgressEsperanto$ListSortParam);
    }

    private ResumptionProgressEsperanto$ListSortParam() {
    }

    public static s831 n() {
        return (s831) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"field_", "ascending_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ListSortParam();
        }
        if (iOrdinal == 4) {
            return new s831(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$ListSortParam.class) {
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
        this.ascending_ = z;
    }

    public final void p(String str) {
        this.field_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
