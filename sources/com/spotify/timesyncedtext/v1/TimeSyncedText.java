package com.spotify.timesyncedtext.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class TimeSyncedText extends h implements v2j0 {
    private static final TimeSyncedText DEFAULT_INSTANCE;
    public static final int END_TIME_MS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 5;
    public static final int START_TIME_MS_FIELD_NUMBER = 2;
    public static final int WORD_FIELD_NUMBER = 1;
    private int endTimeMs_;
    private int segmentId_;
    private int startTimeMs_;
    private String word_ = "";

    static {
        TimeSyncedText timeSyncedText = new TimeSyncedText();
        DEFAULT_INSTANCE = timeSyncedText;
        h.registerDefaultInstance(TimeSyncedText.class, timeSyncedText);
    }

    private TimeSyncedText() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0005\u0004", new Object[]{"word_", "startTimeMs_", "endTimeMs_", "segmentId_"});
        }
        if (iOrdinal == 3) {
            return new TimeSyncedText();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (TimeSyncedText.class) {
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

    public final int n() {
        return this.endTimeMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.startTimeMs_;
    }

    public final String p() {
        return this.word_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
