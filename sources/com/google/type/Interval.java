package com.google.type;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.f890;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Interval extends h implements v2j0 {
    private static final Interval DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp endTime_;
    private Timestamp startTime_;

    static {
        Interval interval = new Interval();
        DEFAULT_INSTANCE = interval;
        h.registerDefaultInstance(Interval.class, interval);
    }

    private Interval() {
    }

    public static Interval n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static f890 s() {
        return (f890) DEFAULT_INSTANCE.createBuilder();
    }

    public static f890 t(Interval interval) {
        return (f890) DEFAULT_INSTANCE.createBuilder(interval);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "startTime_", "endTime_"});
        }
        if (iOrdinal == 3) {
            return new Interval();
        }
        if (iOrdinal == 4) {
            return new f890(DEFAULT_INSTANCE);
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
        synchronized (Interval.class) {
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

    public final Timestamp o() {
        Timestamp timestamp = this.endTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final Timestamp p() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Timestamp timestamp) {
        timestamp.getClass();
        this.endTime_ = timestamp;
        this.bitField0_ |= 2;
    }

    public final void v(Timestamp timestamp) {
        timestamp.getClass();
        this.startTime_ = timestamp;
        this.bitField0_ |= 1;
    }
}
