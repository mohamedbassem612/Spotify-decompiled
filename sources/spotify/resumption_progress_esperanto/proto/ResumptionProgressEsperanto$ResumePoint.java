package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$ResumePoint extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$ResumePoint DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int RESUME_POINT_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp lastUpdated_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ResumptionProgressEsperanto$ResumePoint resumptionProgressEsperanto$ResumePoint = new ResumptionProgressEsperanto$ResumePoint();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ResumePoint;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ResumePoint.class, resumptionProgressEsperanto$ResumePoint);
    }

    private ResumptionProgressEsperanto$ResumePoint() {
    }

    public static ResumptionProgressEsperanto$ResumePoint n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003<\u0000\u0004Ȼ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", Duration.class, "lastUpdated_", ResumptionProgressEsperanto$ItemResumePointEntry.class});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ResumePoint();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ResumptionProgressEsperanto$ResumePoint.class) {
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

    public final String getUri() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Duration o() {
        return this.valueCase_ == 1 ? (Duration) this.value_ : Duration.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
