package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r831;
import p.s2j0;
import p.u831;
import p.v2j0;
import p.y831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$ProgressItem extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$ProgressItem DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int RESUME_APPLICABLE_FIELD_NUMBER = 6;
    public static final int STATE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String item_ = "";
    private Timestamp lastPlayedAt_;
    private ResumptionProgressEsperanto$Progress progress_;
    private int result_;
    private boolean resumeApplicable_;
    private int state_;

    static {
        ResumptionProgressEsperanto$ProgressItem resumptionProgressEsperanto$ProgressItem = new ResumptionProgressEsperanto$ProgressItem();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ProgressItem;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ProgressItem.class, resumptionProgressEsperanto$ProgressItem);
    }

    private ResumptionProgressEsperanto$ProgressItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဌ\u0002\u0006ဇ\u0003", new Object[]{"bitField0_", "item_", "result_", "progress_", "lastPlayedAt_", "state_", "resumeApplicable_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ProgressItem();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ResumptionProgressEsperanto$ProgressItem.class) {
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

    public final String n() {
        return this.item_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ResumptionProgressEsperanto$Progress o() {
        ResumptionProgressEsperanto$Progress resumptionProgressEsperanto$Progress = this.progress_;
        return resumptionProgressEsperanto$Progress == null ? ResumptionProgressEsperanto$Progress.n() : resumptionProgressEsperanto$Progress;
    }

    public final r831 p() {
        r831 r831VarA = r831.a(this.result_);
        return r831VarA == null ? r831.UNRECOGNIZED : r831VarA;
    }

    public final boolean q() {
        return this.resumeApplicable_;
    }

    public final y831 r() {
        y831 y831VarA = y831.a(this.state_);
        return y831VarA == null ? y831.f : y831VarA;
    }

    public final boolean s() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
