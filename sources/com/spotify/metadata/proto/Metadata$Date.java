package com.spotify.metadata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eij0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Date extends h implements v2j0 {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Metadata$Date DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 4;
    public static final int MINUTE_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int bitField0_;
    private int day_;
    private int hour_;
    private int minute_;
    private int month_;
    private int year_;

    static {
        Metadata$Date metadata$Date = new Metadata$Date();
        DEFAULT_INSTANCE = metadata$Date;
        h.registerDefaultInstance(Metadata$Date.class, metadata$Date);
    }

    private Metadata$Date() {
    }

    public static Metadata$Date n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဏ\u0003\u0005ဏ\u0004", new Object[]{"bitField0_", "year_", "month_", "day_", "hour_", "minute_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Date();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Metadata$Date.class) {
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

    public final int getYear() {
        return this.year_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
