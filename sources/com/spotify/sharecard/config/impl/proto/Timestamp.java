package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.Int64Value;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qve1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Timestamp extends h implements v2j0 {
    private static final Timestamp DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int bitField0_;
    private Int64Value timestamp_;

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        h.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    public static Timestamp n() {
        return DEFAULT_INSTANCE;
    }

    public static qve1 p() {
        return (qve1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new Timestamp();
        }
        if (iOrdinal == 4) {
            return new qve1(DEFAULT_INSTANCE);
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
        synchronized (Timestamp.class) {
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

    public final boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Int64Value o() {
        Int64Value int64Value = this.timestamp_;
        return int64Value == null ? Int64Value.n() : int64Value;
    }

    public final void q(Int64Value int64Value) {
        int64Value.getClass();
        this.timestamp_ = int64Value;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
