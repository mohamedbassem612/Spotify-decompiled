package com.spotify.time.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsServerTime$ServerTime extends h implements v2j0 {
    public static final int CURRENTSERVERTIME_FIELD_NUMBER = 2;
    public static final int CURRENTTIMEMILLIS_FIELD_NUMBER = 1;
    private static final EsServerTime$ServerTime DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private long currentServerTime_;
    private long currentTimeMillis_;

    static {
        EsServerTime$ServerTime esServerTime$ServerTime = new EsServerTime$ServerTime();
        DEFAULT_INSTANCE = esServerTime$ServerTime;
        h.registerDefaultInstance(EsServerTime$ServerTime.class, esServerTime$ServerTime);
    }

    private EsServerTime$ServerTime() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsServerTime$ServerTime r(byte[] bArr) {
        return (EsServerTime$ServerTime) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဂ\u0000", new Object[]{"bitField0_", "currentTimeMillis_", "currentServerTime_"});
        }
        if (iOrdinal == 3) {
            return new EsServerTime$ServerTime();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 29);
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
        synchronized (EsServerTime$ServerTime.class) {
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

    public final long o() {
        return this.currentServerTime_;
    }

    public final long p() {
        return this.currentTimeMillis_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
