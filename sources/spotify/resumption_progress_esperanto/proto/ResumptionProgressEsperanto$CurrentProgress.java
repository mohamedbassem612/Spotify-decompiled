package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$CurrentProgress extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$CurrentProgress DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_PERCENTAGE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 5;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    public static final int TIME_PLAYED_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration duration_;
    private int positionPercentage_;
    private int state_;
    private Duration timeLeft_;
    private Duration timePlayed_;

    static {
        ResumptionProgressEsperanto$CurrentProgress resumptionProgressEsperanto$CurrentProgress = new ResumptionProgressEsperanto$CurrentProgress();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$CurrentProgress;
        h.registerDefaultInstance(ResumptionProgressEsperanto$CurrentProgress.class, resumptionProgressEsperanto$CurrentProgress);
    }

    private ResumptionProgressEsperanto$CurrentProgress() {
    }

    public static ResumptionProgressEsperanto$CurrentProgress n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\f", new Object[]{"bitField0_", "timeLeft_", "timePlayed_", "duration_", "positionPercentage_", "state_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$CurrentProgress();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (ResumptionProgressEsperanto$CurrentProgress.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final y831 o() {
        y831 y831VarA = y831.a(this.state_);
        return y831VarA == null ? y831.f : y831VarA;
    }

    public final Duration p() {
        Duration duration = this.timePlayed_;
        return duration == null ? Duration.n() : duration;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
