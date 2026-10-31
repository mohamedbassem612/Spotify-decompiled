package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ResumptionProgressEsperanto$ContentResumedEvent extends h implements v2j0 {
    public static final int CLIENT_ID_FIELD_NUMBER = 4;
    private static final ResumptionProgressEsperanto$ContentResumedEvent DEFAULT_INSTANCE;
    public static final int IS_SHUFFLED_FIELD_NUMBER = 5;
    public static final int ITEM_URI_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int clientId_;
    private boolean isShuffled_;
    private Timestamp lastPlayedAt_;
    private Duration position_;
    private String key_ = "";
    private String itemUri_ = "";

    static {
        ResumptionProgressEsperanto$ContentResumedEvent resumptionProgressEsperanto$ContentResumedEvent = new ResumptionProgressEsperanto$ContentResumedEvent();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ContentResumedEvent;
        h.registerDefaultInstance(ResumptionProgressEsperanto$ContentResumedEvent.class, resumptionProgressEsperanto$ContentResumedEvent);
    }

    private ResumptionProgressEsperanto$ContentResumedEvent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ResumptionProgressEsperanto$ContentResumedEvent r(byte[] bArr) {
        return (ResumptionProgressEsperanto$ContentResumedEvent) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\f\u0005ဇ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "key_", "itemUri_", "position_", "clientId_", "isShuffled_", "lastPlayedAt_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ContentResumedEvent();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (ResumptionProgressEsperanto$ContentResumedEvent.class) {
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

    public final String getKey() {
        return this.key_;
    }

    public final boolean hasLastPlayedAt() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean n() {
        return this.isShuffled_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.itemUri_;
    }

    public final Timestamp p() {
        Timestamp timestamp = this.lastPlayedAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
