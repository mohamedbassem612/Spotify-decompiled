package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r831;
import p.s2j0;
import p.v2j0;
import p.y831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$ItemDetails extends h implements v2j0 {
    public static final int CURRENT_PROGRESS_FIELD_NUMBER = 3;
    private static final ResumptionProgressEsperanto$ItemDetails DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ResumptionProgressEsperanto$CurrentProgress currentProgress_;
    private String item_ = "";
    private Timestamp lastPlayedAt_;
    private int result_;
    private int state_;

    static {
        ResumptionProgressEsperanto$ItemDetails resumptionProgressEsperanto$ItemDetails = new ResumptionProgressEsperanto$ItemDetails();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemDetails;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ItemDetails.class, resumptionProgressEsperanto$ItemDetails);
    }

    private ResumptionProgressEsperanto$ItemDetails() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001", new Object[]{"bitField0_", "item_", "result_", "currentProgress_", "state_", "lastPlayedAt_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemDetails();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ResumptionProgressEsperanto$ItemDetails.class) {
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

    public final ResumptionProgressEsperanto$CurrentProgress n() {
        ResumptionProgressEsperanto$CurrentProgress resumptionProgressEsperanto$CurrentProgress = this.currentProgress_;
        return resumptionProgressEsperanto$CurrentProgress == null ? ResumptionProgressEsperanto$CurrentProgress.n() : resumptionProgressEsperanto$CurrentProgress;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.item_;
    }

    public final r831 p() {
        r831 r831VarA = r831.a(this.result_);
        return r831VarA == null ? r831.UNRECOGNIZED : r831VarA;
    }

    public final y831 q() {
        y831 y831VarA = y831.a(this.state_);
        return y831VarA == null ? y831.f : y831VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
