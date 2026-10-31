package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r831;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$ItemResumePoint extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$ItemResumePoint DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int RESUME_POINT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int result_;
    private ResumptionProgressEsperanto$ResumePoint resumePoint_;

    static {
        ResumptionProgressEsperanto$ItemResumePoint resumptionProgressEsperanto$ItemResumePoint = new ResumptionProgressEsperanto$ItemResumePoint();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemResumePoint;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ItemResumePoint.class, resumptionProgressEsperanto$ItemResumePoint);
    }

    private ResumptionProgressEsperanto$ItemResumePoint() {
    }

    public static ResumptionProgressEsperanto$ItemResumePoint n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "result_", "resumePoint_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemResumePoint();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ResumptionProgressEsperanto$ItemResumePoint.class) {
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

    public final r831 o() {
        r831 r831VarA = r831.a(this.result_);
        return r831VarA == null ? r831.UNRECOGNIZED : r831VarA;
    }

    public final ResumptionProgressEsperanto$ResumePoint p() {
        ResumptionProgressEsperanto$ResumePoint resumptionProgressEsperanto$ResumePoint = this.resumePoint_;
        return resumptionProgressEsperanto$ResumePoint == null ? ResumptionProgressEsperanto$ResumePoint.n() : resumptionProgressEsperanto$ResumePoint;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
