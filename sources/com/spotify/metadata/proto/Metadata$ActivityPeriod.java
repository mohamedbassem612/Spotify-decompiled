package com.spotify.metadata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$ActivityPeriod extends h implements v2j0 {
    public static final int DECADE_FIELD_NUMBER = 3;
    private static final Metadata$ActivityPeriod DEFAULT_INSTANCE;
    public static final int END_YEAR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_YEAR_FIELD_NUMBER = 1;
    private int bitField0_;
    private int decade_;
    private int endYear_;
    private int startYear_;

    static {
        Metadata$ActivityPeriod metadata$ActivityPeriod = new Metadata$ActivityPeriod();
        DEFAULT_INSTANCE = metadata$ActivityPeriod;
        h.registerDefaultInstance(Metadata$ActivityPeriod.class, metadata$ActivityPeriod);
    }

    private Metadata$ActivityPeriod() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002", new Object[]{"bitField0_", "startYear_", "endYear_", "decade_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$ActivityPeriod();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (Metadata$ActivityPeriod.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
