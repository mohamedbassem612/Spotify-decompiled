package com.spotify.on_demand_set.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n3q0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Temporary extends h implements v2j0 {
    private static final Temporary DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VALID_FOR_IN_SECONDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String uri_ = "";
    private long validForInSeconds_;

    static {
        Temporary temporary = new Temporary();
        DEFAULT_INSTANCE = temporary;
        h.registerDefaultInstance(Temporary.class, temporary);
    }

    private Temporary() {
    }

    public static xxd1 n() {
        return (xxd1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "uri_", "validForInSeconds_"});
        }
        if (iOrdinal == 3) {
            return new Temporary();
        }
        if (iOrdinal == 4) {
            return new xxd1(DEFAULT_INSTANCE);
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
        synchronized (Temporary.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.uri_ = str;
    }

    public final void p() {
        this.bitField0_ |= 2;
        this.validForInSeconds_ = n3q0.f;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
