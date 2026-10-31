package com.spotify.runtime_consumption.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ConsumptionRecord extends h implements v2j0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final ConsumptionRecord DEFAULT_INSTANCE;
    public static final int MS_PLAYED_FIELD_NUMBER = 2;
    public static final int MS_PLAYED_NOMINAL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 5;
    public static final int WALL_TIMESTAMP_SECONDS_FIELD_NUMBER = 4;
    private long msPlayedNominal_;
    private long msPlayed_;
    private long wallTimestampSeconds_;
    private String contentUri_ = "";
    private String streamId_ = "";

    static {
        ConsumptionRecord consumptionRecord = new ConsumptionRecord();
        DEFAULT_INSTANCE = consumptionRecord;
        h.registerDefaultInstance(ConsumptionRecord.class, consumptionRecord);
    }

    private ConsumptionRecord() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"contentUri_", "msPlayed_", "msPlayedNominal_", "wallTimestampSeconds_", "streamId_"});
        }
        if (iOrdinal == 3) {
            return new ConsumptionRecord();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (ConsumptionRecord.class) {
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
        return this.contentUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.msPlayed_;
    }

    public final long p() {
        return this.wallTimestampSeconds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
