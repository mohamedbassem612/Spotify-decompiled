package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.eu21;
import p.jf40;
import p.q831;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$GetResumePointResponse extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$GetResumePointResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int RESUME_POINTS_FIELD_NUMBER = 2;
    private int result_;
    private qng0 resumePoints_ = qng0.b;

    static {
        ResumptionProgressEsperanto$GetResumePointResponse resumptionProgressEsperanto$GetResumePointResponse = new ResumptionProgressEsperanto$GetResumePointResponse();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetResumePointResponse;
        h.registerDefaultInstance(ResumptionProgressEsperanto$GetResumePointResponse.class, resumptionProgressEsperanto$GetResumePointResponse);
    }

    private ResumptionProgressEsperanto$GetResumePointResponse() {
    }

    public static ResumptionProgressEsperanto$GetResumePointResponse p(byte[] bArr) {
        return (ResumptionProgressEsperanto$GetResumePointResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u00022", new Object[]{"result_", "resumePoints_", q831.a});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetResumePointResponse();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ResumptionProgressEsperanto$GetResumePointResponse.class) {
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

    public final w831 n() {
        w831 w831VarA = w831.a(this.result_);
        return w831VarA == null ? w831.X : w831VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.resumePoints_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
